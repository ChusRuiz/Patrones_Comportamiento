# Patrones_Comportamiento
Chain of Responsibility, Command, Iterator, Mediator, Memento

# Chain of Responsibility
Chain of Responsibility es un patrón de diseño de comportamiento que te permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.

# Comand
Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación te permite parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.

# Iterator
Iterator es un patrón de diseño de comportamiento que permite el recorrido secuencial por una estructura de datos compleja sin exponer sus detalles internos. Gracias al patrón Iterator, los clientes pueden recorrer elementos de colecciones diferentes de un modo similar, utilizando una única interfaz iteradora.


# Mediator
Mediator es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.

# Memento
Memento es un patrón de diseño de comportamiento que permite tomar instantáneas del estado de un objeto y restaurarlo en el futuro.
El patrón Memento no compromete la estructura interna del objeto con el que trabaja, ni la información que se encuentra dentro de las instantáneas.
