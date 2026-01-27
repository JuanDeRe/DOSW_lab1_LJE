import java.util.Map;
import java.util.HashMap;
import java.lang.Runnable;
public class Reto6 {
    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("DESPEDIR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }
    public static void ejecutarComando(String comando) {
        Map<String,Runnable> comandosFragmento1 = fragmento1();
        Map<String,Runnable> comandosFragmento2 = fragmento2();
        Runnable mensaje;

        switch (comando){
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                mensaje = comandosFragmento2.get(comando);
                mensaje.run();
                break;
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                mensaje = comandosFragmento1.get(comando);
                mensaje.run();
                break;
            default:
                System.out.println("Comando desconocido");
        }
    }

    private static Map<String,Runnable> fragmento2(){
        Map<String,Runnable> comandos = new HashMap<>();
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh… los bugs están dormidos"));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!"));
        return comandos;
    }
    private static Map<String,Runnable> fragmento1(){
        Map<String,Runnable> comandos = new HashMap<>();
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
                comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
                        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
        return comandos;
    }
}