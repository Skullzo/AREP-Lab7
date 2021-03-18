# Amazon Gateway y Lambda
## Descripción
En el taller **Amazon Gateway y Lambda** se desarrolló una aplicación capaz de .
*Terminar*

## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [Docker](https://www.docker.com/). Programa encargado de crear contenedores ligeros y portables para las aplicaciones software que puedan ejecutarse en cualquier máquina con Docker instalado, independientemente del sistema operativo que la máquina tenga por debajo, facilitando así también los despliegues.
Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

```
mvn -version
git --version
java -version
docker version
```

## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio, ejecutando la siguiente línea de comando en GIT.

```
git clone https://github.com/Skullzo/AREP-Lab7.git
```

## Ejecución
Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn package
```
## Pruebas
Para realizar las pruebas correspondientes del proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn test
```

A continuación se muestran las pruebas compiladas correctamente para el código fuente.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/Prueba.PNG)

----------

### Creación de un Rol en Identity and Access Management (IAM)

Para iniciar con el procedimiento de la creación de la función Lambda con su respectiva API, primero se debe crear un rol en Identity and Access Management (IAM). Para crear este rol, primero se accede al Dashboard de AWS, y se selecciona la opción IAM.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS1.png)

----------

### Docker

Para verificar que en la aplicación Docker se hayan desplegado con éxito los contenedores en sus respectivos puertos, se abre la aplicación de Docker de escritorio y se hace la verificación que todos los contenedores estén corriendo en sus respectivos puertos. Como se ve en la siguiente imagen, todos los contenedores están corriendo satisfactoriamente.

![img](https://github.com/Skullzo/AREP-Lab6/blob/main/img/Docker1.PNG)

*Cambiar Imagen y agregar cosas*

Para comprobar que la página web ha sido desplegada con éxito de manera local utilizando Docker, se ingresa en el navegador la siguiente URL: https://localhost:8000/. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente de manera local utilizando Docker.

![img](https://github.com/Skullzo/AREP-Lab6/blob/main/img/Docker2.png)

*Cambiar Imagen y agregar cosas*

----------

### AWS
Para realizar las pruebas correspondientes de la ejecución del programa en AWS, y que el contenedor se encuentra activo desde la máquina virtual, ingresamos en el navegador la siguiente URL: https://ec2-3-95-67-168.compute-1.amazonaws.com:8000. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente desde la máquina virtual montada en AWS.

![img](https://github.com/Skullzo/AREP-Lab6/blob/main/img/AWS1.png)

*Cambiar Imagen y agregar cosas*

## Construido con
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [JUnit](https://junit.org/junit5/). Framework de Java que permite la realización de la ejecución de clases de manera controlada, para poder comprobar que los métodos realizan su cometido de forma correcta.
* [NetBeans](https://netbeans.apache.org/). Entorno de desarrollo integrado libre, orientado principalmente al desarrollo de aplicaciones Java. La plataforma NetBeans permite el desarrollo de aplicaciones estructuradas mediante un conjunto de componentes denominados “módulos”. Cada uno de estos módulos sería un archivo Java conteniendo un conjunto de clases que interactarán con las APIs de NetBeans. El objetivo de esta arquitectura es favorecer el desarrollo de funcionalidades de forma independiente y la reutilización de componentes.
* [Java](https://www.oracle.com/java/). Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.
* [Docker](https://www.docker.com/). Programa encargado de crear contenedores ligeros y portables para las aplicaciones software que puedan ejecutarse en cualquier máquina con Docker instalado, independientemente del sistema operativo que la máquina tenga por debajo, facilitando así también los despliegues.
* [AWS](https://aws.amazon.com/es/). Conjunto de herramientas y servicios de cloud computing de Amazon, que engloba una gran cantidad de servicios para poder realizar distintos tipos de actividades en la nube. Desde almacenamiento a la gestión de instancias, imágenes virtuales, desarrollo de aplicaciones móviles, etc.
* [CircleCI](https://circleci.com/). Plataforma moderna de integración continua y entrega continua (CI / CD) que se encarga de automatizar la construcción, pruebas e implementación de software.

     [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Skullzo/AREP-Lab7)

## Autor
[Alejandro Toro Daza](https://github.com/Skullzo)
## Licencia & Derechos de Autor
**©** Alejandro Toro Daza, Estudiante de Ingeniería de Sistemas de la [Escuela Colombiana de Ingeniería Julio Garavito](https://www.escuelaing.edu.co/es/).

Licencia bajo la [GNU General Public License](https://github.com/Skullzo/AREP-Lab7/blob/main/LICENSE).
