# 📝 README - Proyecto de Gestión de Estudiantes
#Autor: Nilson Eduardo Carvajal Parada

 Descripción del Proyecto
Este proyecto Java implementa un sistema de gestión de estudiantes utilizando estructuras de datos List. El programa permite:

Registrar estudiantes

Mostrar la lista completa

Ordenar alfabéticamente (A-Z)

Buscar estudiantes específicos

Salir del sistema

🛠️ Requisitos Técnicos

JDK 17 o superior

Git (opcional para clonar el repositorio)

Cualquier IDE Java (IntelliJ, Eclipse, VSCode) o terminal

⚙️ Instalación y Ejecución

Clonar el repositorio (si está alojado en GitHub):
git clone https://github.com/[tu-usuario]/GestionEstudiantes.git

Compilar el proyecto:

bash
Copy
javac com/gestion_estudiantes/GestorEstudiantes.java
Ejecutar el programa:

bash
Copy
java com.gestion_estudiantes.GestorEstudiantes
🖥️ Funcionalidades Principales
1. Registro de Estudiantes
Solicita el número de estudiantes a registrar

Valida que la entrada sea numérica

Permite ingresar nombres de estudiantes (con validación)

2. Menú Interactivo
Copy
=================================
  MENÚ PRINCIPAL - GESTOR 
=================================

1. Mostrar lista completa
2. Ordenar alfabéticamente (A-Z)
3. Buscar estudiante
4. Salir

Elija una opción:
3. Operaciones Disponibles
Mostrar lista completa: Visualiza todos los estudiantes registrados

Ordenar A-Z: Organiza y muestra la lista alfabéticamente

Buscar estudiante: Permite buscar por nombre con múltiples búsquedas

Salir: Finaliza la ejecución del programa

📊 Ejemplo de Uso
plaintext
Copy
=== GESTOR DE ESTUDIANTE ===

Ingrese la cantidad de estudiantes a registrar: 3
Nombre del estudiante #1: Ana
Nombre del estudiante #2: Carlos
Nombre del estudiante #3: Beatriz

=================================
  MENÚ PRINCIPAL - GESTOR 
=================================

1. Mostrar lista completa
2. Ordenar alfabéticamente (A-Z)
3. Buscar estudiante
4. Salir

Elija una opción: 2

ESTUDIANTES ORDENADOS (A-Z):
| Ana
| Beatriz
| Carlos
✅ Validaciones Implementadas
Entrada numérica para cantidad de estudiantes

Validación de nombres (no acepta números)

Control de opciones del menú

Manejo de búsquedas múltiples

📌 Características Técnicas
Uso de List<String> para almacenamiento

Método Collections.sort() para ordenamiento

Búsqueda con contains()

Validación de entradas con Scanner

Estructura de control do-while para menú principal

📜 Estado del Proyecto
✅ Completado y funcional
🔄 Posibles mejoras futuras:

Persistencia en archivo

Interfaz gráfica

Manejo de más datos por estudiante

👨‍💻 Autor
Nilson Eduardo Carvajal Parada
📧 [Tu correo electrónico]
🔗 [Tu perfil de GitHub/LinkedIn si aplica]