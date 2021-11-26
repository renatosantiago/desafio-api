# API Spring Boot Restfull que retornará dados da API online SWAPI
https://swapi.dev/

# Database
Banco de dados em memória h2.
Contém um arquivo que popula o banco de dados com 2 usuários para teste assim que a api é iniciada :
    
    email: maria@gmail.com 
    senha: 123456

ou

    email: alex@gmail.com
    senha:123456
    
# Login
para fazer login acesse a url abaixo

    localhost:8080/oauth/token
    
corpo json para login método POST

    {
       "email": "maria@gmail.com"
       "password: 123456
    }
    
# Cadastrar Usuário
url

    localhost:8080/usuarios
    
corpo json para cadastrar usuarios método POST

    {
       "email": "jose@gmail.com"
       "password: 123456
    }
    
# Atualizar Usuario
passar o ID do usuário a ser atualizado no final da url método PUT

    localhost:8080/usuarios/2    
    
corpo json

     {
       "email": "jose@gmail.com"
       "password: 123456
     }
     
# Buscar filmes
retorna um film com o id passado GET

    localhost:8080/filmes/3
    
retorna todos os filmes GET

    localhost:8080/filmes
    
corpo resposta das requisições

    {
      "url": "https://swapi.dev/api/films/1/",
      "titulo": "A New Hope",
      "id_episodio": 4,
      "introducao": "It is a period of civil war.\r\nRebel spaceships, striking\r\nfrom a hidden base, have won\r\ntheir first victory against\r\nthe evil Galactic Empire.\r\n\r\nDuring the battle, Rebel\r\nspies managed to steal secret\r\nplans to the Empire's\r\nultimate weapon, the DEATH\r\nSTAR, an armored space\r\nstation with enough power\r\nto destroy an entire planet.\r\n\r\nPursued by the Empire's\r\nsinister agents, Princess\r\nLeia races home aboard her\r\nstarship, custodian of the\r\nstolen plans that can save her\r\npeople and restore\r\nfreedom to the galaxy....",
      "diretor": "George Lucas",
      "produtor": "Gary Kurtz, Rick McCallum",
      "data_criacao": "2014-12-10T14:23:31.880000Z",
      "data_edicao": "2014-12-20T19:49:45.256000Z",
      "data_lancamento": "1977-05-25",
      "especies": [
          "https://swapi.dev/api/species/5/",
          "https://swapi.dev/api/species/4/",
          "https://swapi.dev/api/species/3/",
          "https://swapi.dev/api/species/2/",
          "https://swapi.dev/api/species/1/"
      ],
      "naves": [
          "https://swapi.dev/api/starships/2/",
          "https://swapi.dev/api/starships/13/",
          "https://swapi.dev/api/starships/3/",
          "https://swapi.dev/api/starships/11/",
          "https://swapi.dev/api/starships/12/",
          "https://swapi.dev/api/starships/5/",
          "https://swapi.dev/api/starships/9/",
          "https://swapi.dev/api/starships/10/"
      ],
      "veiculos": [
          "https://swapi.dev/api/vehicles/4/",
          "https://swapi.dev/api/vehicles/8/",
          "https://swapi.dev/api/vehicles/7/",
          "https://swapi.dev/api/vehicles/6/"
      ],
      "planetas": [
          "https://swapi.dev/api/planets/3/",
          "https://swapi.dev/api/planets/2/",
          "https://swapi.dev/api/planets/1/"
      ]
    }
    
# Buscar pessoas
retorna uma pessoa com o id passado GET

    localhost:8080/pessoas/2
    
retorna todos as pessoas GET

    localhost:8080/pessoas
    
corpo resposta das requisições

    {
      "url": "https://swapi.dev/api/people/11/",
      "nome": "Anakin Skywalker",
      "ano_nascimento": "41.9BBY",
      "cor_olho": "blue",
      "genero": "male",
      "cor_cabelo": "blond",
      "altura": "188",
      "peso": "84",
      "cor_pele": "fair",
      "planeta_natal": "https://swapi.dev/api/planets/1/",
      "data_criacao": "2014-12-10T16:20:44.310000Z",
      "data_edicao": "2014-12-20T21:17:50.327000Z",
      "filmes": [
          "https://swapi.dev/api/films/6/",
          "https://swapi.dev/api/films/5/",
          "https://swapi.dev/api/films/4/"
      ],
      "especies": [],
      "naves": [
          "https://swapi.dev/api/starships/39/",
          "https://swapi.dev/api/starships/59/",
          "https://swapi.dev/api/starships/65/"
      ],
      "veiculos": [
          "https://swapi.dev/api/vehicles/44/",
          "https://swapi.dev/api/vehicles/46/"
      ]
    }
    
# Buscar planetas
retorna um planeta com o id passado GET

    localhost:8080/planetas/2
    
retorna todos os planetas GET

    localhost:8080/planetas
    
corpo resposta das requisições

    {
      "url": "https://swapi.dev/api/planets/7/",
      "nome": "Endor",
      "diametro": "4900",
      "periodo_rotacao": "18",
      "periodo_orbita": "402",
      "gravidade": "0.85 standard",
      "populacao": "30000000",
      "clima": "temperate",
      "terreno": "forests, mountains, lakes",
      "superfice_aqutica": "8",
      "data_criacao": "2014-12-10T11:50:29.349000Z",
      "data_edicao": "2014-12-20T20:58:18.429000Z",
      "filmes": [
          "https://swapi.dev/api/films/3/"
      ],
      "residentes": [
          "https://swapi.dev/api/people/30/"
      ]
    }
    

    
