import java.util.Map;
import java.util.HashMap;
import java.lang.Runnable;
public class Reto6 {
    public static void main(String[] args) {
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }
    public static void ejecutarComando(String comando) {
        Map<String,Runnable> comandosFragmento2 = fragmento2();

        switch (comando){
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                Runnable mensaje = comandosFragmento2.get(comando);
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
}