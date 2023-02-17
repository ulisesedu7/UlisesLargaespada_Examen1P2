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
    return "PC{" + "IP=" + IP + ", mascaraRed=" + mascaraRed + ", hostname=" + hostname + '}';
  }
}
