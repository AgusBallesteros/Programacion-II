class Profesor extends Personas{
    private String departamento;
    private double salario;
    private int añosExperiencia;

    public Profesor(String nombre, String apellido, String numeroIdentificacion,
                      int edad, String direccion, String telefono, String departamento, double salario, int añosExperiencia) {
        super(nombre,apellido,numeroIdentificacion,edad,direccion,telefono);
        this.departamento=departamento;
        this.salario=salario;
        this.añosExperiencia=añosExperiencia;
}
public String getDepartamento(){
        return departamento;
}
public void setDepartamento(String departamento){
        this.departamento=departamento;
}
public double getSalario(){
        return salario;
}
public void setSalario(double salario){
        if (salario > 0){
            this.salario=salario;
        }else{
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
        }
}
public int getAñosExperiencia(){
        return añosExperiencia;
}
public void setAñosExperiencia(int añosExperiencia) {
    if (añosExperiencia >= 0) {
        this.añosExperiencia = añosExperiencia;
    } else {
        throw new IllegalArgumentException("Los años de experiencia no deben ser negativos");
    }
}
public void enseñar(){
        System.out.println("El Profesor " + getNombre() + " "+ getApellido()+ "enseña en el departamento de: " + departamento+".");
    }

@Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
    System.out.println("Informacion Personal: ");
    System.out.println("Departamento: " + departamento);
    System.out.println("Salario: $" + salario );
    System.out.println("Años de experiencia: " + añosExperiencia);
}
}

