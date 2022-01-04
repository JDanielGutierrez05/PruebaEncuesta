#Prueba Tecnica Robinfood

utilizando el framework de spring boot (java) se debe realizar una API Rest que cumpla con los siguientes requerimientos.

Un restaurante requiere un sistema que permita listar una encuesta a sus clientes para recibir el feedback de sus servicios; la encuesta tiene debe de tener un listado de preguntas de tipo abiertas y selección múltiple con sus respectivas respuestas.

Criterios de aceptación
- Se debe exponer un servicio que permita listar una encuesta con sus respectivas preguntas.
- Se debe exponer un servicio que permita registrar la encuesta.
- Implementar test unitarios.
- Las encuesta puede tener una o varias preguntas de tipo abierta o selección múltiple.
- (No implementar ningún tipo de seguridad)

#Implementacion BD

La BD se monto en Memoria por medio de h2.

```
- url de acceso: http://localhost:8080/h2-console
- JDBC Url: jdbc:h2:mem:test
- UserName: test
- Password: test
```

#Creacion de tablas
Como la BD es en memoria, se genera script para que al subir la instancia de Java se ejecute el script y cree la respectiva BD, adicional se desactiva esta opcion para JPA.
el script esta en la ruta

```
src/main/resources/schema.sql
```
Adicional tambien luego de crear la BD insertamos algunos datos en BD para tener al consumir el servicio de obtener la encuesta, el script esta en al ruta

```
src/main/resources/data.sql
```

#Servicios
los servicios expuestos son:

```
GET -> localhost:8080/polls/
```
```
POST -> localhost:8080/polls/

para este servicio se debe enviar el body de la siguiente forma:

[
    {
        "questionId": 1,
        "answer": "Bueno"
    },
    {
        "questionId": 2,
        "answer": "Comentario de prueba"
    }
]
```

#Diagrama entidad relacion
esta en la ruta 

```
docs/Diagrama entidad Relacion.png
```

#Pruebas unitarias y cobertura
Las pruebas se deben de correr con el comando 
```
gradle test
```
o si se desea correr el comando 
```
gradle test jacocoTestReport
```

para ejecutar las pruebas y generar el archivo de coverage el cual se encuentra en la ruta
```
build/reports/jacoco/test/html/index.html
```