
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * 
 * @version (a version number or a date)
 */


public class Estudiante {
    private String codigoEstudiante;
    private String documentoEstudiante;
    private String nombreEstudiante;
    private Fecha fechaNacimientoEstudiante;
    private String estratoEstudiante;
    private String emailEstudiante;
    private String info;
    TipoDocumento tipoDocumentoEstudiante;
    Ayuda ayudaEstudiante;
 
    public Estudiante() {
    }

    public Estudiante(String codigoEstudiante, String documentoEstudiante, String nombreEstudiante, Fecha fechaNacimientoEstudiante, String estratoEstudiante, String emailEstudiante, TipoDocumento tipoDocumentoEstudiante, Ayuda ayudaEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
        this.documentoEstudiante = documentoEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
        this.estratoEstudiante = estratoEstudiante;
        this.emailEstudiante = emailEstudiante;
        this.tipoDocumentoEstudiante = tipoDocumentoEstudiante;
        this.ayudaEstudiante = ayudaEstudiante;
    }

    public Estudiante(String info) {
        this.info = info;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setFechaNacimientoEstudiante(Fecha fechaNacimientoEstudiante) {
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
    }

    public void setEstratoEstudiante(String estratoEstudiante) {
        this.estratoEstudiante = estratoEstudiante;
    }

    public void setEmailEstudiante(String emailEstudiante) {
        this.emailEstudiante = emailEstudiante;
    }

    public void setTipoDocumentoEstudiante(TipoDocumento tipoDocumentoEstudiante) {
        this.tipoDocumentoEstudiante = tipoDocumentoEstudiante;
    }

    public void setAyudaEstudiante(Ayuda ayudaEstudiante) {
        this.ayudaEstudiante = ayudaEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
    

    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public Fecha getFechaNacimientoEstudiante() {
        return fechaNacimientoEstudiante;
    }

    public String getEstratoEstudiante() {
        return estratoEstudiante;
    }

    public String getEmailEstudiante() {
        return emailEstudiante;
    }

    public TipoDocumento getTipoDocumentoEstudiante() {
        return tipoDocumentoEstudiante;
    }

    public Ayuda getAyudaEstudiante() {
        return ayudaEstudiante;
    }

    public String mostrarInfoEstudiante()
{
    String informacion = "";
            informacion = "codigo del estudiante: " + codigoEstudiante + "\n" + "el nombre del estudiante es: "+nombreEstudiante+ "\n";
            informacion = informacion +"el documento del estudiante es: "+ documentoEstudiante + "\n" + "el tipo de documento del estudiante es: " + tipoDocumentoEstudiante +"\n" ;
            informacion = informacion + "su ayuda es: " + ayudaEstudiante;
    return informacion;
}


   
}



    

