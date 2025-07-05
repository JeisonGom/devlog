# 📘 devlog — Bitácora de Aprendizaje Técnico

Una aplicación backend desarrollada en Java con Spring Boot para llevar un registro diario de tu evolución como desarrollador. Guarda aprendizajes, desafíos, sesiones de pomodoro y objetivos técnicos en una sola bitácora evolutiva.

---

## 🚀 Características principales

- Registro diario de reflexiones técnicas y personales
- Módulo Pomodoro: registra sesiones de concentración profunda
- Seguimiento de objetivos por prioridad y categoría
- Arquitectura limpia inspirada en el modelo hexagonal
- API REST lista para consumir desde Postman o aplicaciones frontend

---

## 🧱 Tecnologías utilizadas

- Java 21  
- Spring Boot 3.5.x  
- Spring Web, Spring Data JPA  
- SQLite (`sqlite-jdbc`)  
- Lombok  
- Maven  
- IntelliJ IDEA  

---

## 📂 Estructura base

src/main/java/com/jeison/devlog/bitacora/
├── diario/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   └── model/
├── pomodoro/
├── objetivos/
├── core/
└── BitacoraApplication.java



---

## ⚙️ Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/jeison/devlog.git
Abre el proyecto en IntelliJ IDEA

Asegúrate de tener instalado el plugin de Lombok y habilitado el "Annotation Processor"

Crea o ajusta src/main/resources/application.properties con:

properties
spring.datasource.url=jdbc:sqlite:devlog.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=org.hibernate.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
Ejecuta la clase BitacoraApplication.java 

📝 Licencia
Este proyecto está licenciado bajo la MIT License.
