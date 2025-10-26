# Contributing to EazyJava

¡Gracias por tu interés en contribuir a EazyJava! 🎉

EazyJava es un proyecto open source que busca facilitar el desarrollo en Java. Valoramos todas las contribuciones, desde reportes de bugs hasta nuevas funcionalidades.

## Código de Conducta

Al participar en este proyecto, te comprometes a mantener un ambiente respetuoso y colaborativo para todos los participantes.

## Formas de Contribuir

### 🐛 Reportar Bugs
- Usa la plantilla de issue para bugs
- Incluye información detallada sobre el problema
- Proporciona pasos para reproducir el bug
- Incluye información del sistema (OS, versión de Java, etc.)

### 💡 Sugerir Funcionalidades
- Usa la plantilla de issue para feature requests
- Describe claramente la funcionalidad propuesta
- Explica por qué sería útil para el proyecto
- Considera alternativas y posibles implementaciones

### 🔧 Contribuir Código
- Fork el repositorio
- Crea una branch para tu feature: `git checkout -b feature/nueva-funcionalidad`
- Sigue las convenciones de código del proyecto
- Escribe tests para tu código
- Asegúrate de que todos los tests pasen
- Actualiza la documentación si es necesario

## Configuración del Entorno de Desarrollo

### Requisitos
- Java 11 o superior
- Gradle 7.0 o superior
- Git

### Configuración
```bash
# Clonar el repositorio
git clone https://github.com/dvchinx/EazyJava.git
cd EazyJava

# Ejecutar tests
./gradlew test

# Compilar el proyecto
./gradlew build
```

## Estándares de Código

### Java
- Usa 4 espacios para indentación
- Sigue las convenciones de nombres de Java (camelCase para métodos y variables, PascalCase para clases)
- Documenta métodos públicos con Javadoc
- Mantén las líneas de código bajo 120 caracteres

## Tests

- Escribe tests unitarios para toda nueva funcionalidad
- Los tests deben estar en `src/test/java`
- Usa JUnit 5 para los tests
- Mantén una cobertura de código alta
- Los tests deben ser determinísticos y no depender del orden de ejecución

### Ejecutar tests:
```bash
./gradlew test
```

## Proceso de Pull Request

1. **Fork** el repositorio
2. **Crea una branch** desde `main`:
   ```bash
   git checkout -b feature/descripcion-corta
   ```
3. **Realiza tus cambios** siguiendo los estándares de código
4. **Ejecuta los tests** y asegúrate de que pasen:
   ```bash
   ./gradlew test
   ```
5. **Commit tus cambios** con mensajes descriptivos:
   ```bash
   git commit -m "feat: añadir nueva funcionalidad X"
   ```
6. **Push tu branch**:
   ```bash
   git push origin feature/descripcion-corta
   ```
7. **Abre un Pull Request** usando la plantilla proporcionada

### Convenciones para Commits
Usamos [Conventional Commits](https://www.conventionalcommits.org/):

- `feat:` nueva funcionalidad
- `fix:` corrección de bug
- `docs:` cambios en documentación
- `style:` cambios de formato (no afectan funcionalidad)
- `refactor:` refactoring de código
- `test:` añadir o modificar tests
- `chore:` tareas de mantenimiento

## Revisión de Código

- Todos los PRs deben ser revisados por al menos un mantenedor
- Los PRs deben pasar todos los checks automáticos
- Responde constructivamente a los comentarios de revisión
- Mantén las discusiones enfocadas en el código, no en la persona

## Documentación

- Actualiza el README.md si es necesario
- Documenta nuevas funcionalidades en el código
- Incluye ejemplos de uso cuando sea apropiado
- Mantén la documentación actualizada y clara

## Versionado

Este proyecto sigue [Semantic Versioning](https://semver.org/):
- MAJOR: cambios incompatibles en la API
- MINOR: nuevas funcionalidades compatibles con versiones anteriores
- PATCH: correcciones de bugs compatibles

## Preguntas y Ayuda

- Abre un issue con la etiqueta "question" para preguntas generales
- Únete a las discusiones en los issues existentes
- Revisa issues etiquetados como "good first issue" para empezar a contribuir

## Reconocimientos

¡Todos los contribuidores serán reconocidos! Tu nombre aparecerá automáticamente en la sección de contribuidores del repositorio.

---

¡Gracias por contribuir a EazyJava! 🚀