# Maratón Git 2026-1

## Integrantes

- Juan David Roa Hernández
- Luiza Mariana González Veloza
- Eduardo Rico Duarte


## Retos completados

### Reto 1: La Bienvenida

**Reto Desarrollado por:**
- Luiza Mariana González Veloza
- Eduardo Rico Duarte
  
**Evidencia:**
  
![Captura](Screenshots/Reto1.png)

Captura de imagen

**Descripción:**
En este reto se modelaron objetos Estudiante con información personal (nombre, edad, correo y semestre), los cuales se almacenaron en una lista. Usando expresiones lambda y streams, se transformaron y recopilaron los datos para construir un mensaje de bienvenida completo. 



### Reto 2: Carrera en Paralelo

**Reto Desarrollado por:**
- Luiza Mariana González Veloza
- Juan David Roa Hernández


**Evidencia:**
![Captura](Screenshots/Reto2.png)

Captura de imagen

**Descripción:**

Este reto simuló una carrera usando ramas de Git donde cada estudiante desarrolló funciones distintas en paralelo.


### Reto 3:  El eco misterioso

**Reto Desarrollado por:**
- Eduardo Rico Duarte
- Juan David Roa Hernández 

**Evidencia:**
![Captura](Screenshots/Reto3.png)
Captura de imagen

**Descripción:**

Cada estudiante trabajó su rama cada uno con una función diferente:  StringBuilder y StringBuffer. Donde se implementaba una transformación diferente del mensaje y luego se enfrentó un conflicto al combinar ambas lógicas.


### Reto 4:  El tesoro de las llaves duplicadas

**Reto Desarrollado por:**
- Eduardo Rico Duarte
- Luiza Mariana González Veloza

**Evidencia:**
![Captura](Screenshots/Reto4.png)
Captura de imagen

**Descripción:**

Este reto se centró en el uso de HashMap y Hashtable para manejar claves duplicadas y sincronización. Cada estudiante implementó su versión y luego se combinaron los mapas priorizando los valores correctos.


### Reto 5: Batalla de Conjuntos

**Reto Desarrollado por:**
- Juan David Roa Hernández
- Luiza Mariana González Veloza

**Evidencia:**
![Captura](Screenshots/Reto5.png)
Captura de imagen

**Descripción:**

En este reto se trabajó con colecciones HashSet y TreeSet para almacenar números sin duplicados, aplicar filtros y mantener orden. Cada estudiante eliminó ciertos múltiplos y luego se unificaron los conjuntos en una estructura ordenada. 

### Reto 6: La máquina de decisiones

**Reto Desarrollado por:**
- Eduardo Rico Duarte
- Juan David Roa Hernández


**Evidencia:**
![Captura](Screenshots/Reto6.png)
Captura de imagen

**Descripción:**

En este reto se implementó una máquina que responde a comandos usando switch-case y un Map<String, Runnable> con lambdas. Cada estudiante desarrolló un conjunto de comandos distinto y luego se unificaron en una sola lógica.

## Preguntas teóricas

1. ¿Cuál es la diferencia entre git merge y git rebase?
R/ La diferencia principal es que git merge une dos ramas creando un commit adicional que combina sus historias, manteniendo el historial completo tal como ocurrió. En cambio, git rebase mueve los commits de una rama para colocarlos encima de otra, reescribiendo la historia y dejándola lineal.

2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
R/ Lo que sucede es un conflicto de fusión. Git detiene el merge porque no puede decidir qué cambio es el correcto. Entonces se debe escoger manualmente qué versión conservar, guardar los cambios con git add, git commit, git push  y luego completar el merge.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
R/ Para ver el historial de una forma más visual en la terminal de usa el comando: git log --graph --oneline --decorate --all. Este comando muestra un pequeño diagrama donde puedes identificar ramas y merges, como se puede evidenciar en la imagen siguiente.

![Captura](Screenshots/Pregunta3.png)

4. Explica la diferencia entre un commit y un push.
Un commit guarda los cambios en el repositorio local, es decir, solo en la computadora en la que se está trabajando. Un push, por otro lado, envía esos commits al repositorio remoto en nuestro caso a Git Hub . Básicamente: commit = local, push = compartirlo con los demás.

5. ¿Para qué sirven git stash y git pop?
El comando git stash sirve para guardar temporalmente cambios que aún no quieres comprometer y necesitas apartar para cambiar de rama sin perder nada. Luego, cuando quieres recuperar ese trabajo, usas git pop para volver a aplicar los cambios guardados en tu directorio de trabajo.

6. ¿Qué diferencia hay entre HashMap y HashTable?
La diferencia principal es que HashMap no es sincronizado, lo que lo hace más rápido y permite claves o valores nulos. En cambio, HashTable sí es sincronizado, por lo que es seguro para entornos con múltiples hilos, lo cual lo lleva a hacer lento. Además, HashTable no permite valores null.

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Collectors.toMap() nos permite tener código más consiso, reduciendo líneas de código y haciéndolo más fácil de leer. Además, facilita transformar claves, valores o resolver colisiones sin necesidad de escribir estructuras repetitivas como un for manual.

8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Estás realizando una operación de transformación, porque map() toma cada elemento de la lista original y lo convierte en otro tipo de dato u objeto. El resultado es un Stream con los elementos ya transformados.

9. ¿Qué hace el método stream().filter() y qué retorna?
filter() evalúa una condición lógica y solo permite pasar a los elementos que la cumplen. Lo que retorna es un Stream filtrado, que contiene únicamente los elementos que pasaron la condición.

10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
•	Verificamos que estamos en la rama de develop 
•	Luego utilizamos el comando que crea una rama git checkout -b nombre rama
Este comando como ya se va a mencionar en la siguiente pregunta te mueve directamente a esa rama, en caso de no querer realizarlo asi, utilizar el comando git branch.

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
El comando git branch nombre solo crea la rama y te mantiene en la misma rama donde estabas. En cambio, git checkout -b nombre crea la rama y además nos redirige a ella automáticamente, lo cual es más práctico cuando se está trabajando.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
Porque trabajar en una rama feature permite mantener main siempre estable y funcional, sin riesgos de romperla con cambios en desarrollo. También facilita el trabajo en equipo, ya que cada funcionalidad se desarrolla aislada, y además permite hacer revisiones más organizadas mediante pull requests antes de integrar algo en el código principal.

