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



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS2.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS3.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS4.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS5.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS6.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS7.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS8.PNG)

### Creación de la Función Lambda



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS9.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS10.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS11.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS12.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS13.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS14.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS15.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS16.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS17.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS18.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS19.png)

### Creación de la API REST



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS19.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS20.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS21.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS22.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS23.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS24.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS25.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS26.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS27.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS28.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS29.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS30.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS31.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS32.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS33.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS34.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS35.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS36.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS37.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS38.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS39.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS40.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS41.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS42.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS43.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS44.png)



![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWS45.PNG)

----------

### Docker

Para verificar que en la aplicación Docker se hayan desplegado con éxito los contenedores en sus respectivos puertos, se abre la aplicación de Docker de escritorio y se hace la verificación que todos los contenedores estén corriendo en sus respectivos puertos. Como se ve en la siguiente imagen, todos los contenedores están corriendo satisfactoriamente.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/Docker1.PNG)

Para comprobar que la página web ha sido desplegada con éxito de manera local utilizando Docker, se ingresa en el navegador la siguiente URL: https://localhost:8000/. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente de manera local utilizando Docker.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/Docker2.PNG)

Luego de haber ingresado el valor en Fahrenheit (que para este caso se ha ingresado 41 grados Fahrenheit para realizar la prueba de la página web), se realiza clic en el botón **Convertir**. Luego de realizar clic en el botón **Convertir**, se muestra que se despliega en otra pestaña el resultado, que es **5 grados Celsuis**, y al ver la URL de la nueva pestaña, se ve que es la URL de la API que ha sido creada desde AWS, por lo que el programa está haciendo el uso respectivo de esta API, dándo como resultado que el programa está funcionando correctamente.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/Docker3.PNG)

----------

### AWS
Para realizar las pruebas correspondientes de la ejecución del programa en AWS, y que el contenedor se encuentra activo desde la máquina virtual, ingresamos en el navegador la siguiente URL: http://ec2-54-175-128-206.compute-1.amazonaws.com:8000/inputdata. Como se puede observar, el contenedor ha sido desplegado satisfactoriamente desde la máquina virtual montada en AWS.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWSS1.PNG)

Luego de haber ingresado el valor en Fahrenheit (que para este caso se ha ingresado 41 grados Fahrenheit para realizar la prueba de la página web), se realiza clic en el botón **Convertir**. Luego de realizar clic en el botón **Convertir**, se muestra que se despliega en otra pestaña el resultado, que es **5 grados Celsuis**, y al ver la URL de la nueva pestaña, se ve que es la URL de la API que ha sido creada desde AWS, por lo que el programa está haciendo el uso respectivo de esta API, dándo como resultado que el programa está funcionando correctamente.

![img](https://github.com/Skullzo/AREP-Lab7/blob/main/img/AWSS2.PNG)

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
