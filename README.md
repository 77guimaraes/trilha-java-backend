# ☕ Trilha Java Back-end

Repositório dedicado aos meus estudos e evolução em **Java Back-end**, reunindo desde os fundamentos da linguagem até a construção do **ScreenMatch** — uma aplicação de catálogo de filmes e séries que integra Programação Orientada a Objetos, coleções, tratamento de exceções, consumo de API externa (OMDb) e persistência em JSON.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gson](https://img.shields.io/badge/Gson-4285F4?style=for-the-badge&logo=google&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

---

## 🎯 Conceitos Aplicados

* **Fundamentos da Linguagem:** Variáveis, tipos primitivos, casting explícito, Text Blocks, estruturas condicionais (`if/else`), laços de repetição (`for`, `while`) e leitura de dados com `Scanner`.
* **Programação Orientada a Objetos (POO):** Classes, atributos, métodos, construtores, encapsulamento (`getters`/`setters`), herança (`extends`), polimorfismo, sobrescrita (`@Override`), interfaces (`Classificavel`) e `Records` (`TituloOmdb`).
* **Coleções e Ordenação:** Manipulação de listas (`ArrayList`, `LinkedList`), verificação de tipos com `instanceof` e ordenação com `Comparable`, `Comparator` e `Collections.sort()`.
* **Consumo de APIs e JSON:** Requisições HTTP com `HttpClient`, `HttpRequest` e `HttpResponse` para a **OMDb API**, além de serialização e desserialização de JSON com a biblioteca **Gson**.
* **Exceções e Arquivos:** Tratamento de erros com `try/catch`, criação de exceção personalizada (`ErroDeConversaoDeAnoException`) e gravação de dados em arquivo (`filmes.json`) com `FileWriter`.

---

## 📂 Estrutura do Repositório

```text
trilha-java-backend/
├── fundamentos/
├── Desafios/
└── poo/br/com/alura/screenmatch/
    ├── calculos/
    ├── excecao/
    ├── modelos/
    └── principal/
```

### 1. 📁 `fundamentos/`
Exercícios e pequenos projetos para consolidar a base da linguagem Java:
* **Aulas práticas:** `aulaFundamentos`, `aulaCondicionais`, `aulaLeituraDados`, `aulaLoop`, `aulaLoop2`, `exerciciosFundamentos` e `bootcamp` (menu de cafeteria).
* **Jogo de Adivinhação (`jogoDeAdivinhacao.java`):** Gera um número aleatório entre 0 e 100 (`Random`) e desafia o usuário a acertar em até 5 tentativas.
* **Desafio Bancário (`desafioBancario.java`):** Simulador de conta corrente via console com menu interativo para consultar saldo, transferir e receber valores.

### 2. 📁 `Desafios/`
* **Simulador de Cartão de Crédito (`CartaoDeCredito.java`, `Compra.java`, `main.java`):** Aplicação orientada a objetos onde o usuário define um limite, lança compras com descrição e valor, valida o saldo disponível e exibe ao final o extrato ordenado e o saldo restante.

### 3. 📁 `poo/br/com/alura/screenmatch/`
Projeto principal da trilha, estruturado em pacotes:
* **`modelos/`:**
  * `Titulo.java`: Classe base com atributos comuns, sistema de avaliações, `Comparable` e construtor para conversão a partir do DTO da OMDb.
  * `Filme.java` e `Serie.java`: Subclasses de `Titulo` com regras específicas (como cálculo de duração para maratonar séries e classificação de filmes).
  * `Episodio.java`: Representa episódios de uma série, implementando a interface `Classificavel`.
  * `TituloOmdb.java`: `Record` utilizado para mapear os dados recebidos da API OMDb (`title`, `year`, `runtime`).
* **`calculos/`:**
  * `Classificavel.java`: Interface que define o contrato `getClassificacao()`.
  * `CalculadoraDeTempo.java`: Soma a duração total de filmes e séries usando polimorfismo.
  * `FiltroRecomendacao.java`: Exibe recomendações com base na classificação do título ou episódio.
* **`excecao/`:**
  * `ErroDeConversaoDeAnoException.java`: Exceção personalizada (`RuntimeException`) lançada quando o ano retornado pela API possui formato inválido.
* **`principal/`:**
  * `principal.java`: Testes iniciais de instanciação de objetos, avaliações, calculadora de tempo e filtro de recomendação.
  * `PrincipalComListas.java`: Trabalha com listas de `Titulo`, ordenação alfabética e por ano de lançamento.
  * `PrincipalComBusca.java`: Permite buscar filmes em tempo real na **OMDb API**, converte o JSON recebido em objetos `Titulo` e exporta a lista consultada para o arquivo `filmes.json`.

---

## 🚀 Como executar o projeto localmente

1. Clone o repositório:
   ```bash
   git clone git@github.com:77guimaraes/trilha-java-backend.git
   ```
2. Abra a pasta do projeto no **IntelliJ IDEA** (ou sua IDE Java de preferência).
3. Para executar a classe `PrincipalComBusca.java`, certifique-se de adicionar a biblioteca **Gson** às dependências do projeto e utilizar uma chave válida da [OMDb API](https://www.omdbapi.com/).
4. Navegue até a classe desejada (`main`, `principal`, `PrincipalComListas`, `PrincipalComBusca`, etc.) e execute o método `main`.

---
📌 *Repositório em constante evolução conforme o avanço nos estudos de Java Back-end.*
