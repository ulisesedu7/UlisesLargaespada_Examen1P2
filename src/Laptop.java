public class Laptop extends PC {
  private String marca;
  private String defPantalla;
  private boolean hasRGB;  

  public Laptop() {
  }

  public Laptop(String marca, String defPantalla, boolean hasRGB) {
    this.marca = marca;
    this.defPantalla = defPantalla;
    this.hasRGB = hasRGB;
  }

  public Laptop(String marca, String defPantalla, boolean hasRGB, String IP, String mascaraRed, String hostname) {
    super(IP, mascaraRed, hostname);
    this.marca = marca;
    this.defPantalla = defPantalla;
    this.hasRGB = hasRGB;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getDefPantalla() {
    return defPantalla;
  }

  public void setDefPantalla(String defPantalla) {
    this.defPantalla = defPantalla;
  }

  public boolean isHasRGB() {
    return hasRGB;
  }

  public void setHasRGB(boolean hasRGB) {
    this.hasRGB = hasRGB;
  }

  @Override
  public String toString() {
    return ("Laptop\n" + "Marca -> " + marca + "\n" + "Resolucion de pantalla -> " + defPantalla + "\n" + "Tiene RGB en el teclado -> " + hasRGB + "\n" + super.toString());
  }
}
