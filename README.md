# ControlId
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Daniel-BS-Dev/bootcamp-devsuperior/blob/main/LICENSE)

# Sobre o projeto

 ControlId é um aplicação back end construida durante o **Santander Bootcamp FullStack Developer**, curso organizado pela [Digital Innovation One]
(https://digitalinnovation.one "Site da Digital Innovation One").

Este projeto foi um desafio proposto aos alunos da Digital Innovation One. Onde consiste no Desenvolvimento de uma API Rest para controle de ponto e acesso dos usuários de uma empresa. Utilizando os 
metodos Get, Post, Put e Delete
   
# Modelo Conceitual
![i (3)](https://user-images.githubusercontent.com/81425846/126915122-98d6e8b3-ef54-4fc4-89d7-33bcedef3298.png)

# Tecnologias Utilizadas
   - Java
   - Spring Boot
   - Hibernate
   - Maven
   - Lombok
   - Swagger
   
# Como executar o projeto

Pré-requisitos : Java 11

* Importação do projeto

     Fazer um simples clone do projeto no Github, importar e executar no STS

* Testes manuais no Postman, você deverá ter as requisições Postman abaixo:
    
 ```java
   # Buscar todas as jornadas de trabalho
     GET 
        /working
    
   # Busca da jornada de trabalho por Id
     GET 
        /working/1
     
   # Inserção de nova jornada de trabalho
     POST 
        /Working
       {
           "description": "pj"
       }
     
    # Atualização de uma jornada de trabalho
     PUT 
         /working
      {
             "id" : "1",
             "description": "remoto"
             
      }
      
     # Deleção de uma jornada de trabalho
       DELETE
         /working/1
  ``````````
  


# Autor 

Daniel Benedito da Silva

Email: danielbenedito263@gmail.com


