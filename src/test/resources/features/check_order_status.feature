# language: es
Característica: check order status
  Como usuario web
  Quiero consultar el estado del pedido
  Para saber cuando se va a entregar

  Escenario: Consultar el estado de un pedido por número de factura o tiquete
    Cuando "Rogelio" quiere consultar el estado del pedido con factura "elpedido123"
    Entonces debe buscar el estado por factura "elpedido123"

  Escenario: Consultar el estado de un pedido por número de pedido
    Cuando "Rogelio" quiere consultar el estado del pedido con número "1979"
    Entonces debe buscar el estado por número de pedido "1979"