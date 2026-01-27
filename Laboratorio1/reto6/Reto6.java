import java.util.Map;
import java.util.HashMap;
import java.lang.Runnable;
public class Reto6 {
    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("DESPEDIR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
    }
    public static void ejecutarComando(String comando) {
        Map<String,Runnable> comandosFragmento1 = fragmento1();

        switch (comando){
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                Runnable mensaje = comandosFragmento1.get(comando);
                mensaje.run();
                break;
            default:
                System.out.println("Comando desconocido");
        }
    }

    private static Map<String,Runnable> fragmento1(){
        Map<String,Runnable> comandos = new HashMap<>();
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.”));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101”));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.”));
        return comandos;
    }
}