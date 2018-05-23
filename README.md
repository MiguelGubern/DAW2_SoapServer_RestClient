# DAW2_SoapServer_RestClient
Cliente java que conecta con un servidor Soap para una transformación y enviarla a otro servidor Rest (drupal)

# DAW2 Práctica 3 (Soap & Rest Services)

### JavaClient
- Pide un integer, que será el id del Post a modificar.
- Obtenemos el título de dicho Post mediante una petición Get.
- Llamamos al servidor Soap para que ponga en mayúsculas dicho título.
- Enviamos a Drupal mediante una petición Rest Put para que actualice el título.

### SoapServer
- Ofrece el servicio p1 con la operación llamada concat.
- Concat recibe dos string pero sólamente pasamos a UpperCase el primer parámetro.
- Devuelve dicha modificación.

### Realizado por: Alejandro y Miguel - Grupo 7

