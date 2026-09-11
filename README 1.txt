Rudy Enrique Pineda Azúcar 20220181 
Roberth Eduardo Martínez Rodríguez 20250396




• ¿Por qué ArrayList o LinkedList NO son aceptables?
Evalúe la complejidad temporal de buscar o validar un username duplicado (O(n)).
1 Array list sigue estructura contigua en memoria el que es útil para listas de índice  y este penaliza las inserciones en las primeras posiciones debido a como funciona
su desplazamiento de memoria. 2 LinkedList tiene estructuras que cambian constantemente de tamaño en sus extremos o donde realizas muchas inserciones y eliminaciones 







• ¿Por qué HashSet NO resuelve el problema por sí solo?
Analice por qué guardar solo un conjunto de elementos no permite asociar una clave con 
información adicional (como la contraseña para validación).

R/ El HashSet si bien funciona para Denegar Datos Duplicados este mismo tiene una limitante  no garantiza un orden si bien 
sirve para comprobar si un elemento es existe en el conjunto de datos este mismo requiere que un SET detecte
y valide que  los datos duplicados correctamente si se trabaja con objetos personalizados estos deben tener equals() y hashcode en esa clase
lo cual  para el AUTHSECURE nos dice DETALLADAMENTE que  no se 
permite el uso de múltiples listas, mapas paralelos ni colecciones auxiliares dentro del servicio."





• ¿Por qué TreeMap NO es la opción ideal?
Analice la complejidad de búsqueda y ordenamiento (=(log n)) versus la necesidad real del 
problema.

/R El TreeMap  implementa la interfaz NavigableMap utilizando un árbol Red-Black  para ordenar automáticamente las claves según su orden natural (Alfabéticamente o numéricamente) 
o mediante la implementacion de un comparador perzonalizado lo cual como se Detalla No se 
permite el uso de múltiples listas, mapas paralelos ni colecciones auxiliares dentro del servicio."





• ¿Cuál es la ÚNICA estructura basada en hashing que resuelve todas las operaciones en 
tiempo promedio constante 0(1)?

R/  La estructura es HASHMAP  porque se usa esta Este se compone de una Clave única asociada a un Valor en el cual no pueden haber
Claves duplicadas por lo cual no requiere un SET  tampoco requiere un equals() ni tampoco un hashCode para hacer esta validacion de datos 
duplicados El HashMap Almacena los elementos en una tabla hash este no garantiza un orden en particular sus claves este ofrece el mejor rendimiento 
para operaciones básica de inserción y búsqueda y eliminación HashMap es excelente porque  cumple con la petición del programa Inserción de datos(Registrar Nuevo Usuario) 
Búsqueda (Verificar disponibilidad de UserName y Inicio de sesión  ) y eliminación(Eliminar Cuenta de Usuario) también este posee mejor rendimiento. 




Partes Trabajadas por Roberth Eduardo Martínez Rodríguez 20250396
Main.java AUTHSERIVICE.java  Push Github  Pregunta 1 

Partes Trabajadas por Rudy Enrique Pineda Azúcar 20220181 
Pregunta 2 , Pregunta 3 , Pregunta 4 , Usuario.java

 


