class EmpleadoAministrativo extends Personas{
    private String cargo;
    private String horarioTrabajo;
    private double salario;

    public EmpleadoAministrativo (String nombre, String apellido, String numeroIdentificacion,
                                  int edad, String direccion, String telefono, String cargo, String horarioTrabajo, double salario){

        super(nombre, apellido, numeroIdentificacion,edad,direccion,telefono);
        this.cargo=cargo;
        this.horarioTrabajo=horarioTrabajo;
        this.salario=salario;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public double getSalario(){
        return salario;

    }
    public void setSalario(double salario){
        if(salario>0){
            this.salario=salario;
        }else{
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
        }
    }

public void administrar(){
    System.out.println("El Empleado: " + getNombre() + " " + getApellido() + "está realizando tareas administrativas");
}
@Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
    System.out.println("Información Laboral: ");
    System.out.println("Cargo: " + cargo);
    System.out.println("Horario: " + horarioTrabajo);
    System.out.println("Salario: $"+ salario);
}







}
