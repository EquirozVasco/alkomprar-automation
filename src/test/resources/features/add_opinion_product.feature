# language: es
Característica: Add opinion
  Como usuario web
  Quiero agregar una opinión a un producto
  Para darla a conocer a otros posibles clientes

  Escenario: agregar una opinion a un producto
    Cuando "Messi" quiere agregar un comentario al producto "iphone11". Con "4" estrellas, la frase "me gusta", la opinion "buen producto", si lo recomienda como "Sí" y correo "elcorreo@correo.com"
    Entonces debe buscar el producto y agregar los datos