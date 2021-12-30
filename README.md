# Prueba Encuesta Robinfood

La BD se monto en Memoria por medio de h2.

```
- url de acceso: http://localhost:8080/h2-console
- JDBC Url: jdbc:h2:mem:test
- UserName: test
- Password: test
```

# Creacion de BD
Como la BD es en memoria, se genera script para que al subir la instancia de Java se ejecute el script y cree la respectiva BD, adicional se desactiva esta opcion para JPA.
el script esta en la ruta

```
src/main/resources/schema.sql
```
Adicional tambien luego de crear la BD insertamos algunos datos en BD para tener al consumir el servicio de obtener la encuesta, el script esta en al ruta

```
src/main/resources/data.sql
```

# Servicios
los servicios expuestos son:

```
GET -> localhost:8080/polls/
POST -> localhost:8080/polls/
```

# Diagrama entidad relacion
esta en la ruta 

```
docs/Diagrama entidad Relacion.png
```