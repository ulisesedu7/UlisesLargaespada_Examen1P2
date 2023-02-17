public class PC_Escritorio extends PC {
  private String capRam;
  private String capAlmacenamiento;
  private String tipoAlacenamiento;
  private boolean hasGraphic;

  public PC_Escritorio() {
  }

  public PC_Escritorio(String capRam, String capAlmacenamiento, String tipoAlacenamiento, boolean hasGraphic) {
    this.capRam = capRam;
    this.capAlmacenamiento = capAlmacenamiento;
    this.tipoAlacenamiento = tipoAlacenamiento;
    this.hasGraphic = hasGraphic;
  }

  public PC_Escritorio(String capRam, String capAlmacenamiento, String tipoAlacenamiento, boolean hasGraphic, String IP, String mascaraRed, String hostname) {
    super(IP, mascaraRed, hostname);
    this.capRam = capRam;
    this.capAlmacenamiento = capAlmacenamiento;
    this.tipoAlacenamiento = tipoAlacenamiento;
    this.hasGraphic = hasGraphic;
  }

  public String getCapRam() {
    return capRam;
  }

  public void setCapRam(String capRam) {
    this.capRam = capRam;
  }

  public String getCapAlmacenamiento() {
    return capAlmacenamiento;
  }

  public void setCapAlmacenamiento(String capAlmacenamiento) {
    this.capAlmacenamiento = capAlmacenamiento;
  }

  public String getTipoAlacenamiento() {
    return tipoAlacenamiento;
  }

  public void setTipoAlacenamiento(String tipoAlacenamiento) {
    this.tipoAlacenamiento = tipoAlacenamiento;
  }

  public boolean isHasGraphic() {
    return hasGraphic;
  }

  public void setHasGraphic(boolean hasGraphic) {
    this.hasGraphic = hasGraphic;
  }

  @Override
  public String toString() {
    return "PC_Escritorio{" + "capRam=" + capRam + ", capAlmacenamiento=" + capAlmacenamiento + ", tipoAlacenamiento=" + tipoAlacenamiento + ", hasGraphic=" + hasGraphic + '}';
  }
}
