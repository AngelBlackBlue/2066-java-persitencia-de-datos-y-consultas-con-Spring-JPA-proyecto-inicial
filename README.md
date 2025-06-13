# Persistencia de Datos y Consultas con Spring JPA

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Framework](https://img.shields.io/badge/Spring%20Framework-6.0.0-brightgreen?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.9.5-orange?logo=apache-maven)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.2.0-yellow?logo=spring)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-darkgreen?logo=hibernate)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql)
![Google Gemini](https://img.shields.io/badge/Google%20Gemini-API-lightblue?logo=google)

Este proyecto es una aplicación Java basada en Spring Boot que utiliza Spring Data JPA, Hibernate y PostgreSQL para la persistencia de datos y consultas sobre información de series y episodios. Además, integra la API de Google Gemini para traducción automática de sinopsis. Permite realizar búsquedas, filtrados y consultas avanzadas sobre una base de datos relacional.

## Características

- Persistencia de datos de series y episodios usando Spring Data JPA y Hibernate.
- Uso de la interfaz `JpaRepository` para consultas personalizadas.
- Modelado y mapeo de clases y relaciones entre entidades con ORM.
- Consultas a la base de datos utilizando JPA, JPQL, SQL nativo y métodos derivados de query.
- Variables de entorno para una configuración segura.
- Integración con la API de Google Gemini para traducción automática de sinopsis.
- Código estructurado para facilitar el aprendizaje de JPA, Hibernate y consultas en Spring.

## Estructura del Proyecto

- `src/main/java/com/aluracursos/screenmatch/`  
  Código fuente principal de la aplicación.
- `src/main/resources/application.properties`  
  Configuración de la base de datos y parámetros de la aplicación.

## Requisitos

- Java 17
- Maven 3.9.5+
- PostgreSQL

## Instalación y Ejecución

1. Clona el repositorio.
2. Configura las variables de entorno para la base de datos PostgreSQL y la API de Google Gemini.
