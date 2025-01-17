# Tarea Reina Ajedrez
## Profesor: Andrés Rubio del Río
## Alumno: José Miguel López Gómez

La tarea va a consistir en modelar el movimiento de una reina de ajedrez por el tablero de dicho juego.
Ilustración que muestra la posición inicial de las reinasIlustración que muestra el movimiento de la reina en el tablero del ajedrez

<div align="center">
<p>
<img alt="Posición inicial de las reinas en el tablero del ajedrez" src="src/main/resources/imgs/posicionInicialReinas.png" />
<img alt="Movimiento de la reina en un tablero del ajedrez" src="src/main/resources/imgs/movimientoReina.png" />
</p>
<p style="text-size: xx-small">Imágenes obtenidas de la web: <a href="https://www.123ajedrez.com/reglas-basicas/la-dama">123ajedrez.com</a> (Enrique Moreno)</p>
</div>

En la primera imagen puedes observar cuál es el posicionamiento inicial válido para las reinas dependiendo de su color.

En la segunda imagen puedes apreciar cuáles son los movimientos válidos para una reina: horizontalmente, verticalmente y en diagonal

En este repositorio GitHub hay un esqueleto de proyecto gradle que ya lleva incluidos todos los test necesarios que el programa debe pasar y las dependencias, entre ellas la de la librería entrada. 

Para ello te pongo un diagrama de clases para el mismo y poco a poco te iré explicando los diferentes pasos a seguir:

<div align="center"><img alt="Diagrama de clases para reina de ajedrez" src="src/main/resources/imgs/diagramaClases.png" />
</div>

#### Primeros Pasos

1. Lo primero que debes hacer es un fork de este repositorio.
2. Clona tu repositorio remoto recién copiado en **GitHub** a un repositorio local que será donde irás realizando lo que a continuación se te pide. Modifica el archivo `README.md` para que incluya tu nombre en el apartado "Alumno". Realiza tu primer commit.

#### Enumerado `Direccion`

1. Crea un enumerado llamado `Direccion` que contenga los literales: `NORTE`, `NORESTE`, `ESTE`, `SURESTE`, `SUR`, `SUROESTE`, `OESTE`, `NOROESTE`. Realiza un commit.

#### Enumerado `Color`

1. Crea un enumerado llamado `Color` que contenga los literales: `BLANCO` y `NEGRO`. Los literales estarán parametrizados y a cada uno le pasaremos la representación en cadena de los mismos: Blanco o Negro. Realiza un commit.
2. Crea el atributo `cadenaAMostrar` (String). Realiza un commit.
3. Crea el **constructor** con la visibilidad adecuada, que almacenará en el atributo anterior la cadena que se le pase por parámetro.  Realiza un commit.
4. Crea el método `toString` que devolverá la representación en forma de cadena del literal. Realiza un commit.

#### Clase `Posicion`

1. Crea la clase `Posicion`. Crea los atributos `fila` (int) y `columna` (char) con la visibilidad adecuada. Realiza un commit.
2. Crea los métodos `get` y `set` para los atributos. Recuerda que para el método `set` se debe tener en cuenta que los valores indicados sean correctos (las filas van del 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambas inclusive-) y si no se lance una excepción del tipo `IllegalArgumentException` con el mensaje adecuado. En caso de que la posición no sea la correcta no deben modificarse los atributos. Realiza un commit.
3. Crea un **constructor** para esta clase que acepte como parámetros la `fila` y la `columna` y que los asigne a los atributos si son correctos. Si no son correctos debe lanzar una excepción del tipo `IllegalArgumentException` con el mensaje adecuado. Para ello utiliza los métodos `set` anteriormente creados. Realiza un commit.
4. Crea el **constructor** copia para esta clase. Realiza un commit.
5. Crea los métodos `equals` y `hashCode` para esta clase. Realiza un commit.
6. Crea el método `toString` que devolverá un String y será la representación de la fila y la columna de forma adecuada **fila=valorFila, columna=valorColumna**. Realiza un commit.

#### Clase `Reina`

1. Crea la clase `Reina` cuyos atributos serán un `color` (del tipo enumerado `Color`) y `posicion` (de la clase `Posicion`), con la visibilidad adecuada. Realiza un commit.
2. Crea los métodos `get` y `set` para cada atributo con la visibilidad adecuada. Los métodos `set` siempre comprobarán la validez de los parámetros pasados y si no son correctos deberá lanzar la excepción adecuada con el mensaje adecuado. Realiza un commit.
3. Crea un **constructor** por defecto para esta clase que cree una reina blanca en la posición '1d'. Realiza un commit.
4. Crea un **constructor** para la clase que acepte como parámetro el `color` y que creará una reina de dicho color cuya posición será '1d' si es blanca o '8b' si es negra. Realiza un commit.
5. Crea el método `mover` que acepte como parámetro una `Direccion` y la cantidad de `pasos` a mover en dicha dirección. Los pasos deben estar comprendidos entre 1 y 7 (ambos inclusive) y la dirección no puede ser nula o de lo contrario debe lanzar una excepción adecuada (`NullPointerException` o `IllegalArgumentException`) con el mensaje adecuado. Si no puede realizar dicho movimiento, debido a que la reina se sale del tablero, se debe lanzar una excepción del tipo OperationNotSupportedException con un mensaje adecuado y no modificará la posición de la reina. Realiza un commit.
6. Crea el método `toString` que devuelva un `String` que será la representación de dicho objeto (color y posición). Realiza un commit.

#### Clase `Consola`

1. Crea la clase de utilidades `Consola`. Realiza un commit.
2. Crea el **constructor** para esta clase con su visibilidad adecuada, teniendo en cuenta que será una clase de utilidades que sólo contendrá métodos estáticos. Realiza un commit.
3. Crea el método `mostrarMenu` que mostrará el menú con las opciones de nuestra aplicación: crear reina por defecto, crear reina eligiendo el color, mover y salir. Realiza un commit.
4. Crea el método `elegirOpcionMenu` que mostrará un mensaje para que elijamos una opción del menú anteriormente creado y nos pedirá que introduzcamos por teclado la opción hasta que ésta sea valida. Devolverá la opción elegida. Realiza un commit.
5. Crea el método `elegirOpcion` que nos pedirá que elijamos un color mientras éste no sea válido y dependiendo de la opción elegida devolverá un color u otro. Realiza un commit.
