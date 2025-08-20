# Projeto: Exemplos de Design Patterns em Java

Este projeto tem como objetivo **demonstrar a aplicação prática dos principais Design Patterns** em Java, separados por suas categorias: **Criação, Estruturais e Comportamentais**.  

Cada padrão é implementado com exemplos claros e comentados, servindo como material de estudo e referência para desenvolvedores que desejam aplicar boas práticas de arquitetura de software.  

---

## 📂 Estrutura do Projeto

```
src/
 ├── criacao/
 │    ├── factorymethod/
 │    ├── builder/
 │    └── abstractfactory/
 │
 ├── estrutural/
 │    └── proxy/
 │
 └── comportamental/
      └── observer/
```

---

## 🏗 Categorias e Exemplos

### 🔹 1. Padrões de Criação
Os padrões de criação lidam com **a forma de instanciar objetos**, encapsulando o processo e dando mais flexibilidade ao código.

#### ✅ Factory Method
- **Ideia:** Define uma interface para criar objetos, mas deixa as subclasses decidirem qual classe instanciar.  
- **Exemplo no projeto:**  
  - Interface `Transporte`  
  - Implementações `Carro` e `Moto`  
  - Classe `TransporteFactory` responsável por instanciar os objetos.  

#### ✅ Builder
- **Ideia:** Permite criar objetos complexos passo a passo, sem necessidade de um construtor gigante.  
- **Exemplo no projeto:**  
  - Classe `Casa` com vários atributos (paredes, portas, janelas).  
  - `CasaBuilder` constrói a casa de forma flexível.  
  - `Diretor` orquestra o processo de construção.  

#### ✅ Abstract Factory
- **Ideia:** Fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.  
- **Exemplo no projeto:**  
  - Interface `GUIFactory`  
  - Implementações `WindowsFactory` e `MacFactory`  
  - Criação de elementos `Botao` e `Checkbox` de acordo com o sistema operacional.  

---

### 🔹 2. Padrões Estruturais
Os padrões estruturais lidam com **a composição de classes e objetos**, facilitando a construção de estruturas mais robustas.

#### ✅ Proxy
- **Ideia:** Fornece um substituto ou representante de outro objeto para controlar o acesso a ele.  
- **Exemplo no projeto:**  
  - Interface `Servico`  
  - Classe `ServicoReal` que executa operações pesadas.  
  - Classe `ServicoProxy` que controla o acesso, adicionando cache e logs antes de delegar ao `ServicoReal`.  

---

### 🔹 3. Padrões Comportamentais
Os padrões comportamentais lidam com a **comunicação e responsabilidade entre objetos**.

#### ✅ Observer
- **Ideia:** Permite que um objeto (sujeito) notifique automaticamente múltiplos observadores quando seu estado mudar.  
- **Exemplo no projeto:**  
  - Interface `Observador`  
  - Classe `Usuario` implementa observadores.  
  - Classe `Canal` atua como sujeito, notificando todos os inscritos quando há uma nova atualização.  

---

## 🚀 Tecnologias Utilizadas
- **Java 17+**  
- **Maven/Gradle** (dependendo da configuração)  
- **JUnit 5** para testes unitários  

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/design-patterns-java.git
   cd design-patterns-java
   ```

2. Compile e execute:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="Main"
   ```

3. Cada exemplo pode ser rodado individualmente executando a classe principal de cada pacote.  

---

## 📖 Referências
- *Design Patterns: Elements of Reusable Object-Oriented Software* – Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides (Gang of Four)  
- [Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns)  
