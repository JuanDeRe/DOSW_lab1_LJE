/**RETO #1: La Bienvenida
 *Para este reto debes utilizar una expresión lambda para imprimir un saludo de bienvenida
 *con los nombres de los integrantes de la pareja junto a su edad, correo y semestre.
 *Requisitos:
 * Cree el objeto Estudiante y Mensaje Bienvenida para su solución.
 * Los estudiantes deben ser almacenados en la estructura de datos List.
 * Use stream(), map() y collect().
 **/
package reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que representa a un estudiante
 */
class Student
{
    private String name;
    private int age;
    private String email;
    private int semester;

    /**
     * Contructor de la clase student
     * @param name nombre del estudiante
     * @param age edad del respectivo estudiante
     * @param email correo electronico del estudiante
     * @param semester semestre que actualmente esta cursando
     */
    public Student(String name, int age, String email,int semester)
    {
        this.name = name;
        this.age = age;
        this.email= email;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }
}

/**
 * clase que se encargara de generar el mensaje de bienvenida de los estudiantes nuevos
 */
class WelcomeMessage
{
    /**
     * Metodo que permite generar el mensaje de bienvenida de los studiantes nuevos
     * @param students Lista de estudiantes que se incluiran en el mensaje
     * @return se retorna el mensaje de bienvenida.
     */
    public static String generateMessage(List<Student> students)
    {
        String studentInformation = students.stream().map(object -> object.getName()+
                ", estudiante de "+ object.getSemester() + ".° semestre de " +
                object.getAge() + " años").collect(Collectors.joining(", y "));

        String studentEmail = students.stream().map(Student::getEmail).collect(Collectors.joining(" y "));

        return "¡ Hola, bienvenidos! Nosotros somos el grupo conformado por " + studentInformation +
                ". Nuestros correos institucionales son " + studentEmail + ".";
    }
}

/**
 * clase que se encargara de imprimir el mensaje
 */
public class Reto1
{
    public static void main(String[] args)
    {
        List<Student> groupJLE = new ArrayList<>();
        groupJLE.add(new Student("Luiza Gonzalez", 20, "luiza.gonzalez-v@mail.escuelaing.edu.co", 5));
        groupJLE.add(new Student("Juan Roa", 21, "juan.roa-h@mail.escuelaing.edu.co", 6));
        groupJLE.add(new Student("Eduardo Rico", 22, "Eduardo.rico@mail.escuelaing.edu.co", 7));

        String finalMessage = WelcomeMessage.generateMessage(groupJLE);
        System.out.println(finalMessage);
    }
}
