# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina


## Resolução
## Diagramação das Classes e Interfaces do iPhone

Este documento descreve a diagramação das classes e interfaces que representam os papéis do iPhone: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Reprodutor Musical

O Reprodutor Musical é responsável por reproduzir músicas armazenadas no dispositivo ou transmitidas pela Internet.

**Interfaces:**

- `Playable`: Define métodos para reprodução, pausa e controle de música.

**Classes:**

- `Song`: Representa uma música com propriedades como título, artista e duração.
- `Album`: Representa um álbum contendo várias músicas.
- `MusicPlayer`: Implementa a interface `Playable` e gerencia a reprodução de músicas e controle.

### Aparelho Telefônico

O Aparelho Telefônico lida com as funções de chamadas telefônicas e mensagens.

**Interfaces:**

- `CallInterface`: Define métodos relacionados a chamadas telefônicas.
- `MessageInterface`: Define métodos relacionados ao envio e recebimento de mensagens.

**Classes:**

- `Contact`: Representa um contato na lista telefônica com detalhes como nome e número.
- `Call`: Representa uma chamada telefônica com informações de duração e contato envolvido.
- `Message`: Representa uma mensagem com remetente, destinatário e conteúdo.
- `Phone`: Implementa as interfaces `CallInterface` e `MessageInterface`, gerencia chamadas e mensagens.

### Navegador na Internet

O Navegador na Internet permite a navegação por páginas da web.

**Interfaces:**

- `BrowserInterface`: Define métodos para navegar por páginas e interagir com o conteúdo.

**Classes:**

- `WebPage`: Representa uma página da web com URL e conteúdo.
- `Browser`: Implementa a interface `BrowserInterface` para abrir, fechar e interagir com páginas da web.