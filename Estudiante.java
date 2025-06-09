class Estudiante extends Personas {
    private String matricula;
    private String carrera;
    private double promedio;
  public Estudiante(String nombre, String apellido, String numeroIdentificacion,
                    int edad, String direccion, String telefono, String matricula, String carrera, double promedio) {
      super(nombre,apellido,numeroIdentificacion,edad,direccion,telefono);
      this.matricula=matricula;
      this.carrera=carrera;
      this.promedio=promedio;
  }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

public void setPromedio(double promedio){
      if (promedio >= 0.0 && promedio<=10.0){
          this.promedio=promedio;
      }else{
          throw new IllegalArgumentException("El promedio debe ser entre 0.0 y 10.0");
      }
}
public void estudiar (){
      System.out.println("El estudiante " + getNombre() + " " + getApellido() + "está estudiando " + carrera + ".");
}
@Override
    public void mostrarInformacion(){
      super.mostrarInformacion();
    System.out.println("Informacion academica ");
    System.out.println("Matricula" + matricula);
    System.out.println("Promedio: " + promedio);
}





}

