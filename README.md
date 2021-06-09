

## Matéria

Projeto para avaliação final da disciplina **Java Platform** com o professor **RAFAEL TSUJI MATSUYAMA** turma 41SCJ. 

## Alunos

Esse bot foi desenvolvido pelo **grupo 2**, membros:\
**Emerson - 341060\
Marco Antonio - 341785**\
**Caio 341245**\
Alan Coimbra 341622**

## Comandos

Foi desenvolvido um chatbot usando o telegram. O chatbot possui os seguintes comandos:\
**/sobre** - Retorna informações sobre o chatbot\
**/datahora** - Retorna informações sobre a data e hora\
**/climatempo** - Retorna informações sobre o clima na cidade de São Paulo\
**/ajuda** - Retorna informações sobre os comandos disponíveis no chatbot. 

## Como interagir com o bot

Para acessar o bot é necessário ter o telegram. Para interagir com ele só acessar a url [Bot](t.me/JavaGroup2Bot)

**Stack utilizada**
Para esse bot foi utilizado **Java 8** , Spring boot versão **3.0.2.RELEASE**, a API de bots do Telegram e o Maven. 

## Configurações para rodar o bot

Para utilizar o bot na sua máquina é necessário incluir o seu token. O mesmo pode ser gerado através do BotFather no telegram, caso queira mais informações de como gerar [clique aqui](https://core.telegram.org/bots#6-botfather)
Após gerar o token edite o arquivo **config.properties** na pasta resources colando o token no campo **telegram.bot.token**.
Para utilizar os recursos de previsão do tempo é necessário se cadastrar na plataforma da clima tempo, para informações de como gerar o token, [clique aqui.](https://advisor.climatempo.com.br/) 
Após gerar o token edite o arquivo **config.properties** na pasta resources colando o token no campo **climatempo.token**
