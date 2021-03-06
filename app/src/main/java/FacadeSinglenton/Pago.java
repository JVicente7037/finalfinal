package FacadeSinglenton;

public class Pago {
    String Id;
    String Nombre;
    int Pago;
    String Fecha;
    String Concepto;

    public Pago(String nombre, String id) {
        this.Nombre = nombre;
        this.Id = id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    @Override
    public String toString() {
        return "Pago{" + "Id=" + Id + ", Nombre=" + Nombre + ", Pago=" + Pago + ", Fecha=" + Fecha + ", Concepto=" + Concepto + '}';
    }

}
