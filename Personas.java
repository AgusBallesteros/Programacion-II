public class Personas {
    String nombre;
    String apellido;
    int edad;
    String numeroIdentificacion;
    String direccion;
    String telefono;

 public Personas() {
    this.nombre="";
    this.apellido="";
    this.numeroIdentificacion="";
    this.edad=0;
    this.direccion="";
    this.telefono="";
 }

public Personas(String nombre, String apellido, String numeroIdentificacion,
               int edad, String direccion, String telefono) {
    this.setNombre(nombre);
    this.setApellido(apellido);
    this.setnumeroIdentificacion(numeroIdentificacion);
    this.setEdad (edad);
    this.setDireccion(direccion);
    this.setTelefono(telefono);
}
public String getNombre(){return nombre;}
public String getApellido(){return apellido;}
public String getnumeroIdentificacion(){return numeroIdentificacion;}
public int getEdad(){return edad;}
public String getDireccion(){return direccion;}
public String getTelefono(){return telefono;}

public void setNombre(String nombre){
    if (nombre != null && !nombre.trim().isEmpty()) {
    this.nombre = nombre;
    }else{
        System.out.println("Error: Debe ingresar un nombre.");
        this.nombre="";
    }

    }
public void setApellido(String apellido){
    if (apellido != null && !apellido.trim().isEmpty()) {
        this.apellido = apellido;
    }else{
        System.out.println("Error: Debe ingresar un Apellido.");
        this.apellido="";
    }

}
public void setnumeroIdentificacion(String numeroIdentificacion){
    if (numeroIdentificacion != null && !numeroIdentificacion.trim().isEmpty()) {
        this.numeroIdentificacion = numeroIdentificacion;
    }else{
        System.out.println("Error: Debe ingresar un Numero de Identificacion.");
        this.numeroIdentificacion="";
    }

}

public void setEdad(int edad){
    if (edad > 0 && edad < 90){
        this.edad=edad;
    }else{
        System.out.println("Error: ingrese correctamente su edad");
        this.edad=0;
    }
}
public void setDireccion(String direccion){
    if (direccion != null && !direccion.trim().isEmpty()) {
        this.direccion = direccion;
    }else{
        System.out.println("Error: Debe ingresar un Numero de Identificacion.");
        this.direccion="";}
}
public void setTelefono(String telefono){
    if (telefono != null && !telefono.trim().isEmpty()) {
        this.telefono = telefono;
    }else{
        System.out.println("Error: Debe ingresar un Numero de Identificacion.");
        this.direccion="";
 }
}

public String getNombrecompleto(){return nombre + " " + apellido;}
public String getInformacioncompleta(){return "Nombre: " + nombre + " " + "Apellido: " + apellido +  " " + "Numero de Identificacion: " + numeroIdentificacion + " " + "Edad: " + edad +  " "+ "Dirección: " + direccion + " "+ "Teléfono: " + telefono; }
public void mostrarInformacion() {
     System.out.println("Nombre: " + this.getNombre());
    System.out.println("Apellido: " + this.getApellido());
    System.out.println("Numero de Identificación: " + this.getnumeroIdentificacion());
    System.out.println("Edad: " + this.getEdad());
    System.out.println("Dirección: " + this.getDireccion());
    System.out.println("Telefono: " + this.getTelefono());
}
public void saludar(){
    System.out.println("Hola mi nombre" + nombre + " " + apellido);
}}