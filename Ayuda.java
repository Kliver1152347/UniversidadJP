
/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda {
   
    private TipoAyuda tipoAyuda;
    private Estado estadoAyuda;
    private Fecha fechaAsignacionAyuda;
    private Fecha fechaEntregaAyuda;

    public Ayuda() {
    }

    public Ayuda(TipoAyuda tipoAyuda, Estado estadoAyuda, Fecha fechaAsignacionAyuda, Fecha fechaEntregaAyuda) {
        this.tipoAyuda = tipoAyuda;
        this.estadoAyuda = estadoAyuda;
        this.fechaAsignacionAyuda = fechaAsignacionAyuda;
        this.fechaEntregaAyuda = fechaEntregaAyuda;
    }

    public Ayuda(TipoAyuda tipoAyuda, Estado estadoAyuda) {
        this.tipoAyuda = tipoAyuda;
        this.estadoAyuda = estadoAyuda;
    }
    

    public TipoAyuda getTipoAyuda() {
        return tipoAyuda;
    }

    public Estado getEstadoAyuda() {
        return estadoAyuda;
    }

    public Fecha getFechaAsignacionAyuda() {
        return fechaAsignacionAyuda;
    }

    public Fecha getFechaEntregaAyuda() {
        return fechaEntregaAyuda;
    }

    public void setTipoAyuda(TipoAyuda tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
    }

    public void setEstadoAyuda(Estado estadoAyuda) {
        this.estadoAyuda = estadoAyuda;
    }

    public void setFechaAsignacionAyuda(Fecha fechaAsignacionAyuda) {
        this.fechaAsignacionAyuda = fechaAsignacionAyuda;
    }

    public void setFechaEntregaAyuda(Fecha fechaEntregaAyuda) {
        this.fechaEntregaAyuda = fechaEntregaAyuda;
    }

    public String imprimirAyudas()
    {
        String informacion;
        informacion = tipoAyuda + ", " + estadoAyuda  + ", " + fechaAsignacionAyuda.obtenerFecha() + ", " + fechaEntregaAyuda.obtenerFecha()  ;
        return informacion;
    }
   public String imprimirNoAyudas(){
        String informacion;
        informacion = tipoAyuda + ", " + estadoAyuda;
        return informacion;
   }
    public String imprimirAyuda()
    {
        String informacion;
        informacion = tipoAyuda + ", " + estadoAyuda ;
        return informacion;
    }
}
