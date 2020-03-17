# Libreria de numeros complejos 

### Descripción 
La libreria de complejos es una herramienta muy útil para la operación entre números complejos, los números complejos son la base de la computación cuántica y de muchas otras ramas de lo cuántico, en esta librería encontraras una utilidad para realizar operaciones básicas de la introducción a la computación cuantica.

### Principales funcionalidades
- Suma
- Producto
- Resta
- División
- Módulo
- Conjugado
- Conversión entre representaciones polar y cartesiano
- Retornar la fase de un número complejo.

### Operaciones entre espacios vectoriales complejos
- División de vectores complejos.
- Inversa de vectores complejos.
- Multiplicación escalar de vectores complejos.
- Adición de matrices complejos.
- Inversa de matrices complejos.
- Multiplicación escalar de matrices complejas.
- Matriz transpuesta
- Matriz conjugada
- Matriz adjunta
- Función para calcular la "acción" de una matriz sobre un vector.
- Norma de matrices
- Distancia entrematrices
- Revisar si es unitaria
- Revisar si es Hermitian
- Producto tensor.

## ¿Cómo utilizar los espacios vectoriales complejos?

Entre todas las funcionalidades de la libreria podemos generar espacios vectoriales complejos y evidenciar toda la funcionalidad de esta.

     //Ejemplo de creación de matrices compleja y producto tensor
     double matriz1[][][] = {{{3,0}},{{4,0}},{{7,0}}};
     double matriz2[][][] = {{{-1,0}},{{2,0}}};
     MatrizCompleja matrizCompleja1 = new MatrizCompleja(matriz1);
     MatrizCompleja matrizCompleja2 = new MatrizCompleja(matriz2);
     MatrizCompleja resultado = matrizCompleja1.productoTensor(matrizCompleja2)
     System.out.println(resultado)
     /*
     Resultado
     [[(-3.0,0.0)]
     , [(6.0,0.0)]
     , [(-4.0,0.0)]
     , [(8.0,0.0)]
     , [(-7.0,0.0)]
     , [(14.0,0.0)]
     ]
     */
     
## ¿Cómo usar?

Descargar el repositorio de 
https://github.com/AlejandroBohal/CNYT-2019.git
para verificar el correcto funcionamiento de las librerias es recomendable ejecutar las pruebas presentes en estos, se pueden ejecutar desde el IDE de preferencia o desde comandos MVN tales como
      
      mvntest:surefire
Las pruebas implementadas reflejan las funcionalidades de la libreria, entre estas pruebas tenemos algunos retos de programación propuestos en el libro Quantum Computing for Computer Science.
![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/pruebas.png)

También se hizo uso de la libreria para crear un simulador cuántico que cuenta con bastantes funcionalidades, para más información ir a:
https://github.com/AlejandroBohal/SimulacionCuantica
## Formación de espacios complejos.
La librería cuenta con la implementación de una excepción propia que se encarga de que tanto los espacios vectoriales complejos como los operadores cuanticos se encuentren bien formados.

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/excepciones1.png)

## Extensión de la librería de complejos a librería de computación básica cuántica.

Partiendo de la base de la librería de complejos, se implementaron funcionalidades adicionales que dan solución a problemas de computación básica cuántica como simulación. Entre las funcionalidades implementadas tenemos:
- Creación de vectores ket y matrices de estado,
- Probabilidad de estado de una posición particular.
- Amplitud de transición de un vector ket a otro,
- Probabilidad de transición de un estado a otro.
- Cálculo de media, delta y varianza de un observable con respecto a un ket

Estas funcionalidades fueron probadas para un mayor entendimiento del uso de la libreria.

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba4.png)

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba5.png)

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba6.png)
![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba7.png)
![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba8.png)

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba9.png)

![](https://raw.githubusercontent.com/AlejandroBohal/CNYT-2020/master/fotosPruebas/prueba11.png)



