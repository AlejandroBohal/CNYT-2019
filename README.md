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
     
      

### ¿Cómo usar?

Descargar el repositorio de 
https://github.com/AlejandroBohal/CNYT-2019.git
para verificar el correcto funcionamiento de las librerias es recomendable ejecutar las pruebas presentes en estos, se pueden ejecutar desde el IDE de preferencia o desde comandos MVN tales como
      
      mvntest:surefire

