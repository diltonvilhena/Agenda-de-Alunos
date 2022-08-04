# Agenda Alunos

Projeto Android que simula uma agenda de contatos de alunos e alunas

## 🔨 Funcionalidades do projeto

O projeto é capaz de cadastrar contatos com nome, telefone e e-mail e faz a listagem dos mesmo apresentando apenas o nome:

![agenda-sample](https://user-images.githubusercontent.com/8989346/136827565-a6278e24-19bb-480b-b34e-0740b8455e6f.gif)

## ✔️ Técnicas e tecnologias utilizadas

O App foi desenvolvido no Android Studio com a API 28 e foi atualizado para a API 30 do Android. Segue abaixo as técnicas e tecnologias utilizadas:

- `Activities`: componente do Android para representar cada tela
- `RelativeLayout`: ViewGroup para criar a lista de alunos
- `LinearLayout`: ViewGroup para criar a tela de formulário de contato 
- `Views do Android`: componentes visuais do Android para apresentar na tela:
    - `TextView`: apresentar o conteúdo em texto
    - `ListView`: criação e apresentação de uma lista dinâmica
    - `FloatingActionButton`: botão flutuante para acessar a tela de formulário
    - `EditText`: campo para receber entrada do usuário
    - `Button`: botão para cadastrar novos contatos
- `DAO`: padrão de projeto para armazenar e buscar dados
