package FacadeSinglenton;

import java.util.ArrayList;

public class PagoGrupo {
    private ArrayList<Pago> componentes;



    public PagoGrupo() {
        this.componentes = new ArrayList<>(); ;
    }

    public void AñadirGrupo(Pago res){
        this.componentes.add(res);
    }

    public void EliminarGrupo(Pago res){
        this.componentes.remove(res);
    }

    public void ModificarConcepto(String id, String Concepto){
        for (int i = 0; i < this.componentes.size(); i++) {
            if(id.compareTo(this.componentes.get(i).getId())==0 ){
                this.componentes.get(i).setConcepto(Concepto);
            }

        }
    }

    public String LeerPago(String id) {
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            if (id.compareTo(this.componentes.get(i).getId()) == 0) {
                nombre = this.componentes.get(i).getNombre();
                nombre = nombre + this.componentes.get(i).getConcepto();
            }

        }
        return nombre;
    }

    public String LeerTodoPago() {
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {

            nombre = nombre + this.componentes.get(i).getNombre();

        }
        return nombre;
    }
}
