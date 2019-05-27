package FacadeSinglenton;

import java.util.ArrayList;

public class ReservaGrupo {
    private ArrayList<Reserva> componentes;

    public ReservaGrupo() {
        this.componentes = new ArrayList<>(); ;
    }

    public void AñadirGrupo(Reserva res){
        this.componentes.add(res);
    }

    public void EliminarGrupo(Reserva res){
        this.componentes.remove(res);
    }

    public void ModificarLugar(String id, String Nuevo_Lugar){
        for (int i = 0; i < this.componentes.size(); i++) {
            if(id.compareTo(this.componentes.get(i).getId())==0 ){
                this.componentes.get(i).setLugar(Nuevo_Lugar);
            }

        }
    }


    public String LeerReserva(String id){
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {
            if(id.compareTo(this.componentes.get(i).getId())==0 ){
                nombre = this.componentes.get(i).getNombre();
                nombre = nombre +  this.componentes.get(i).getLugar();
                System.out.print(nombre);

            }

        }
        return nombre;
    }
    public String LeerTReserva(){
        String nombre = "";
        for (int i = 0; i < this.componentes.size(); i++) {

            nombre = nombre +this.componentes.get(i).getNombre();



        }
        return nombre;
    }

    String LeerTodasreserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
