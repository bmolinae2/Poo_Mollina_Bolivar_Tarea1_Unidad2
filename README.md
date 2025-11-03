# Sistema de Contenidos Audiovisuales – Unidad 2 (POO)

Proyecto Java basado en herencia y relaciones entre clases para **Pelicula**, **SerieDeTV**, **Documental**, **Anime** y **ConciertosEnVivo**, con clases de apoyo **Actor**, **Temporada** e **Investigador**.

##  Objetivos y propósito
- Aplicar **herencia**, **polimorfismo** y **encapsulamiento**.
- Modelar **agregación** (`Pelicula`–`Actor`), **composición** (`SerieDeTV`–`Temporada`) y **asociación** (`Documental`–`Investigador`).
- Entregar un sistema **funcional** que cree y manipule objetos de todas las clases.

##  Clases y funcionalidades nuevas
- **Actor** (agregación con `Pelicula`): gestión de elenco.
- **Temporada** (composición con `SerieDeTV`): episodios por temporada.
- **Investigador** (asociación con `Documental`): equipo de investigación.
- **Anime** (subclase de `ContenidoAudiovisual`): estudio, público objetivo, idiomas, opening.
- **ConciertosEnVivo** (subclase de `ContenidoAudiovisual`): artista, lugar, fecha, canciones, asistentes.

##  Requisitos
- JDK 11+ (recomendado 17)
- Eclipse/IntelliJ o Maven (opcional)

##  Cómo clonar y ejecutar
```bash
git clone https://github.com/<bmolinae2>/<Molina_Bolivar_U2_T1>.git
cd <Molina_Bolivar_U2_T1>

# Compilación/ejecución sencilla (Eclipse): importar como proyecto Java y ejecutar 'poo.PruebaAudioVisual'

# Si usas Maven y tienes pom.xml, podrías ejecutar:
# mvn -q -DskipTests exec:java -Dexec.mainClass="poo.PruebaAudioVisual"
```

La clase **`poo.PruebaAudioVisual`** instancia y muestra los detalles de todas las clases, ejercitando las relaciones.

##  Diagrama UML
- Archivo PlantUML: [`docs/diagrama_unidad2.puml`](docs/diagrama_unidad2.puml)
- Imagen: ![Diagrama UML](docs/diagrama_unidad2.svg)

##  Contenido mínimo en GitHub
- Código fuente en `src/`
- `README.md` (este archivo)
- Carpeta `docs/` con el diagrama UML (`.puml` y `.svg`)
- Al menos **3 commits** significativos

##  Mejoras opcionales
- Pruebas unitarias con JUnit
- Validaciones adicionales en constructores y setters
- Documentación Javadoc

##  Autor
- Estudiante: <Molina Espinoza Bolivar Rafael >
- Universidad Politécnica Salesiana
- Fecha: 2025-11-02

---

