HISTORIA_VERSIONAMIENTO.md
# Historia de Versionamiento del Proyecto JavaJDBC

Este documento presenta la evidencia del uso de herramientas de versionamiento (Git y GitHub) durante la creación y gestión del proyecto **JavaJDBC**. Se detallan los comandos utilizados, el flujo de trabajo y el historial del repositorio.

## 1. Navegación y posicionamiento en el proyecto

Para entrar a la carpeta del proyecto, se utilizó: cd '/c/Users/Samy Mendez/OneDrive/Escritorio/JavaJDBC'

## 2. Inicialización del repositorio Git

Se inició el repositorio local con: git init

Git creó la carpeta oculta `.git` para almacenar el historial del proyecto.

## 3. Agregar archivos al área de preparación (Staging Area)

Se agregaron todos los archivos del proyecto: git add .

## 4. Crear el primer commit

git commit -m "Todos los documentos se agregaron por primera vez"

Este commit incluyó archivos del proyecto como:

- TEST.jpg  
- mysql-connector  
- login_db.sql  
- src/conexion  
- src/modelo  
- src/login  
- nbproject (archivos de NetBeans)  
- build.xml  
- manifest.mf  

## 5. Agregar repositorio remoto (GitHub)

Se enlazó el repositorio local con GitHub: git remote add origin https://github.com/samyzmendez-glitch/JavaJDBC.git

## 6. Cambio de rama principal a "main"

git branch -m main

## 7. Subir los archivos al repositorio remoto

git push -u origin main

Con esto, todos los archivos y commits fueron enviados correctamente a GitHub.

## 8. Verificación del estado del repositorio

git status

Git confirmó que la rama está limpia y sincronizada con GitHub.

## 9. Evidencia del historial real (Git Log)

$ git log --oneline --graph --decorate --all
* 8931d0b (HEAD -> main, origin/main) Todos los documentos se agregaron por primera vez

