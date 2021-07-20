# oauth2

Projeto com Spring Boot, e OAuth2

Após a importação do projeto, e start do mesmo, testar pelo Postman;

1 - Endpoint para geração do Token => http://localhost:8080/oauth/token
=> Na aba "Body", as Keys:
   grant_type = password
   username = ewerton (application.properties)
   password = 123456  (application.properties)
   
   "SEND"
   
   *Copiar o "access_token" 
   
   
2 - Para buscar a lista dos clientes:
=> Criar um novo Endpoint => http://localhost:8080/clientes
=> Na aba "Authorization", escolher a opção "Bearer Token", e colar o "access_token", copiado anteriormente;
   "SEND"
   
   *Será carregada a lista de clientes em memórua (BD H2);