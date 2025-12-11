# Modificadores de Acesso

### Os modificadores de acesso determinam de onde uma classe, atributo ou método pode ser acessado dentro de um projeto Java.
### Eles são a base do encapsulamento e da organização de código.

## Existem quatro níveis de acesso:

## 🔓 1. public
### Para classes

-  classe pode ser acessada por qualquer outro pacote do projeto.

- Colocar uma classe como public significa que ela é “global”, visível para todos.

- Só pode ser usado em classes principais (top-level), ou seja, arquivos .java.

### Para métodos e atributos

- Podem ser acessados de qualquer lugar:

- Da própria classe

- De outras classes do mesmo pacote

- De classes em outros pacotes

- De subclasses em pacotes diferentes

## 🔒 2. private
### Para classes

- Não pode ser usado em classes principais (top-level).

- Pode ser usado apenas em classes internas (classes dentro de outra classe).

### Para métodos e atributos

- Só podem ser acessados dentro da própria classe.

- Nenhuma outra classe consegue ver esses membros, mesmo se estiverem no mesmo pacote.

- Usado para proteger dados, permitindo acesso apenas via getters/setters.

## 🧬 3. protected
### Para classes

- Assim como private, não pode ser usado em classes top-level.

- Apenas classes internas podem ser protected.

### Para métodos e atributos

- Acesso permitido para:

- Classes do mesmo pacote

- Subclasses (classes filhas), mesmo que estejam em outro pacote

## 📦 4. default (sem escrever nada)
### Para classes

- Se você não coloca public nem nada, a classe vira default.

- Pode ser acessada somente por classes dentro do mesmo pacote.

### Para métodos e atributos

- Podem ser usados somente por classes do mesmo pacote.

- Classes externas não conseguem acessar.