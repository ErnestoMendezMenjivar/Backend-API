# Backend-API
Este proyecto es una API REST sensilla desarrollada con Spring Boot, diseñada para gestionar clientes y sus datos relacionados. 
## Funcionalidades principales

- **Gestión de clientes:** 
  - Crear, leer, actualizar y eliminar información de clientes.
  - Operaciones con validación de datos.
  
- **Paginación:**
  - Listado de clientes con paginación para manejar grandes volúmenes de datos.

- **Subida de imágenes:**
  - Permite subir imágenes asociadas a cada cliente.
  - Validación de tipo de archivo para garantizar que sean imágenes.
  - Eliminación automática de imágenes antiguas al actualizar.

- **Regiones:**
  - Consulta de todas las regiones disponibles para asignar a un cliente.

## Endpoints

### Clientes
- `GET /api/clientes`  
  Devuelve la lista de todos los clientes.

- `GET /api/clientes/page/{page}`  
  Devuelve la lista de clientes paginada.

- `GET /api/clientes/{id}`  
  Devuelve la información de un cliente específico por su ID.

- `POST /api/clientes`  
  Crea un nuevo cliente.

- `PUT /api/clientes/{id}`  
  Actualiza un cliente existente por su ID.

- `DELETE /api/clientes/{id}`  
  Elimina un cliente por su ID.

### Subida de Imágenes
- `POST /api/clientes/upload`  
  Sube una imagen para un cliente.

- `GET /uploads/img/{nombreFoto}`  
  Devuelve una imagen por su nombre.

### Regiones
- `GET /api/clientes/regiones`  
  Devuelve la lista de regiones disponibles.

## Tecnologías utilizadas

- **Spring Boot**: Framework principal para el desarrollo del backend.
- **Hibernate**: ORM para la gestión de la base de datos.
- **MySQL**: Base de datos utilizada para almacenar información.
- **Jakarta Validation**: Validación de datos de entrada.
- **Manejo de archivos**: Subida, almacenamiento y eliminación de imágenes.

## Requisitos

- **Java 17+** (versión compatible con Spring Boot 3).
- **MySQL** para la base de datos.
- **Maven** para la gestión de dependencias.

