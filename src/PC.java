
import java.util.*;

public class PC {

  private String IP;
  private String mascaraRed;
  private String hostname;

  public PC() {
  }

  public PC(String IP, String mascaraRed, String hostname) {
    this.IP = IP;
    this.mascaraRed = mascaraRed;
    this.hostname = hostname;
  }

  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public String getMascaraRed() {
    return mascaraRed;
  }

  public void setMascaraRed(String mascaraRed) {
    this.mascaraRed = mascaraRed;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  @Override
  public String toString() {
    return ("IP -> " + IP + "\n" + "Mascara Red -> " + mascaraRed + "\n" + hostname + "\n");
  }

  // Metodo de admin para PC
  public int ping(String ipToSearch, ArrayList<PC> computadoras) {
    int respuesta = 3;

    String ipsPc1[] = this.getIP().split(".");
    String ipsPc2[] = ipToSearch.split(".");
    String mascaraBase[] = this.getMascaraRed().split(".");

    boolean checkIfIpExists = false;

    for (PC compu : computadoras) {
      if (compu.getIP().equals(ipToSearch)) {
        checkIfIpExists = true;
        respuesta = 2;
      }
    }

    // Si existe la compu la comparo dentro de la misma red
    boolean checkIfIpsAreSame = true;

    if (checkIfIpExists) {
      // Comparar que los primeros 3 valores de IP sean iguales
      for (int i = 0; i < 3; i++) {
        if (!ipsPc1[i].equals(ipsPc2[i])) {
          checkIfIpsAreSame = false;
        }
      }
    }

    // boolean to check if are in same mask
     boolean checkIfAreInMask = true;
              
    if (checkIfIpsAreSame) {
      // Comparar los valores de la mascara
      int lastMaskDigit = Integer.parseInt(mascaraBase[3]);
      String binaryMask = Integer.toBinaryString(lastMaskDigit);

      // Contador de 1s
      int contador = 0;

      for (int i = 0; i < binaryMask.length(); i++) {
        if (binaryMask.charAt(i) == '1') {
          contador++;
        }
      }

      // transformar a binario los ultimos de las pcs
      int pc1IntBin1 = Integer.parseInt(ipsPc1[3]);
      String binaryIp1 = Integer.toBinaryString(pc1IntBin1);

      int pc1IntBin2 = Integer.parseInt(ipsPc2[3]);
      String binaryIp2 = Integer.toBinaryString(pc1IntBin2);

      
      for (int i = 0; i < contador; i++) {
        if (!(binaryIp1.charAt(i) == binaryIp2.charAt(i))) {
          checkIfAreInMask = false;
        }
      }
    }
    
    if (checkIfAreInMask) {
      respuesta = 1;
    }

    return respuesta;
  }
}
