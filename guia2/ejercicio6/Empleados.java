package ejercicio6;


public class Empleados {
    //atributos
    private String nombre;
    private String dni;
    private Integer hs_trab;
    private Integer valor_hs_trab;
    public Empleados(String nombre, String dni, Integer hs_trab, Integer valor_hs_trab){
        this.nombre= nombre;
        this.dni=dni;
        this.hs_trab= hs_trab;
        this.valor_hs_trab= valor_hs_trab; 
    }
    //metodos 
    public String getNombre(){ //el metodo de acceso son los geters
        return nombre; 
    }
    public void setNombre(String nombre){ //metodo de modificacion son los setters(no son necesarios en el ejercicio los agrege para practicar)
        this.nombre= nombre;
    }
    public String getDni(){
        return dni; 
    }
    public void setDni(String dni){
        this.dni= dni;
    }
    public Integer getHs_trab(){
        return hs_trab; 
    }
    public void setHs_trab(Integer hs_trab){
        this.hs_trab= hs_trab;
    }
    public Integer getValor_hs_trab(){
        return valor_hs_trab; 
    }
    public void setValor_hs_trab(Integer valor_hs_trab){
        this.valor_hs_trab= valor_hs_trab;
    }

    @ Override 
    public String toString() {
    return "nombre: " +nombre +"| dni: "+dni;
    }  

}
