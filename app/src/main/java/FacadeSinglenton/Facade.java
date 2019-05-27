package FacadeSinglenton;

import java.util.ArrayList;

import Adapter.Usuario;
import Composite.Component;
import Composite.ReunionGrupos;
import Composite.Transporte;
import Decorator.DecPlaca;
import Decorator.DecPuestos;

public class Facade {
    private static Facade instanciaUnica;
    PagoGrupo P1 = new PagoGrupo();
    ReservaGrupo R1 = new ReservaGrupo();
    private Component componente;
    DecPlaca DPlaca = new DecPlaca(componente);
    DecPuestos DPuestos = new DecPuestos(componente);
    String nombre;
    String nom;
    String tipo;
    ReunionGrupos compositeReunion = new ReunionGrupos(nombre);
    Transporte hojaTransporte = new Transporte(nom,tipo);
    ArrayList<PagoGrupo> pagogrupo = new ArrayList<PagoGrupo>();
    ArrayList<ReservaGrupo> reservagrupo = new ArrayList<ReservaGrupo>();
    ArrayList<Usuario> reservas = new ArrayList<Usuario>();
    Usuario u;
    public static Facade getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Facade();
        }

        return instanciaUnica;
    }

    public  boolean ingresar(String login, String pass) {
        if(u.ingresar(login, pass)== true) {
            return true;

        }
        else {
            return false;
        }
    }

    public void setRegistro(String correo,String password,String tipo) {
        u.setLogin(correo);
        u.setPassword(password);
        u.SetTipoUsuario(tipo);

    }
    public Facade() {
    }

    public void CrearReserva() {
        Reserva reserva = new Reserva("","");

    }

    public void AñadirReserva(Reserva res) {
        R1.AñadirGrupo(res);

    }

    public void EliminarReservaGrupo(Reserva res) {
        R1.EliminarGrupo(res);
    }

    public void ModificarLugarReserva(String id, String Lugar) {
        R1.ModificarLugar(id, Lugar);
    }

    public String LeerReserva(String id) {
        return R1.LeerReserva(id);
    }

    public void CrearPago(String pago, String id) {
        Pago pago1 = new Pago(pago, id);

    }

    public void AñadirPago(Pago res) {
        P1.AñadirGrupo(res);
    }

    public void EliminarPago(Pago res) {
        P1.EliminarGrupo(res);
    }

    public String LeerPago(String id) {
        return P1.LeerPago(id);
    }

    public void Modificar_ConceptoPAgo(String id , String Concepto){
        P1.ModificarConcepto(id, Concepto);
    }

    public String LeerTodasreservas(){
        return R1.LeerTodasreserva();
    }

    public String LeerTodoPago(){
        return P1.LeerTodoPago();
    }

    public String consultaReunionGrupos(String nombre){
        return compositeReunion.consulta(nombre);
    }
    public void addRGrupos(Component a){
        compositeReunion.add(a);
    }
    public void deleteRGrupos(Component d){
        compositeReunion.delete(d);
    }
    public void modificarRGrupos(String buscador, String nuevo){
        compositeReunion.modificar(buscador,nuevo);
    }

    public String consultaTransporte(String n){
        return hojaTransporte.consulta(n);
    }
    public void modificarTransporte(String busca,String nuevo){
        hojaTransporte.modificar(busca, nuevo);
    }
    public String showDPacla(){
        return DPlaca.showMedioTransporte();
    }
    public void DPlacaModificar(String buscador, String nuevo){
        DPlaca.modificar(buscador, nuevo);
    }
    public String consultaDPlaca(String nombrePlaca){
        return DPlaca.consulta(nombrePlaca);
    }
    public String showDPuesto(){
        return DPuestos.showMedioTransporte();
    }
    public void DPuestoModificar(String buscador, String nuevo){
        DPuestos.modificar(buscador, nuevo);
    }
    public String consultaDPuesto(String nombrePlaca){
        return DPuestos.consulta(nombrePlaca);
    }

}

