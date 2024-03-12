package animal;

public class AnimalConcreto extends Animal {
    public AnimalConcreto(String nombre, String tipoAlimentacion, String argumento3, String argumento4) {
        super(nombre, tipoAlimentacion, argumento3, argumento4);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de alimentación: " + getTipoAlimentacion());
        // Imprime los demás atributos del animal
    }
}