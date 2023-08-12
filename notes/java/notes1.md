# Introdução a POO

## Motivação

```java
int quantidade = 1000 + 1; // input
String[] numeros = new String[quantidade];
String[] nomes = new String[quantidade];
int[] idades = new int[quantidade];
double[] notas = new double[quantidade];
```

### Como trocar dois numeros

```java
int a = 2, b = 3;
var aux = b;
b = a;
a = aux;
```

### Voltando ao problema

- Problema identificado: Se tentassemos trocar dois alunos de lugar seria muito problematico

## POO para resolver

- classe: molde, classificao
- objeto: fruto do molde, especificao

- **Ex classe**: Carro, Pessoa
- **Ex objeto:**

```json
{
  "nome": "Vitor",
  "idade": 22
}
```

### Criando classe:

- Uma classe por arquivo
- Evitar classes aninhadas (Single Responsability Principle)

```java
// molde - novo tipo de variavel
public class Person {

  // tem - atributos
  public String name;
  public int age;
  public double height;

  // constructor
  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  // faz - metodos
  public void sayHello() {
    System.out.println("Hello");
  }

  public void birthday() {
    age++;
  }

}
```

```java
public class Application {
  public static void main(String[] args) {

    // inapropriado - permite estado inseguro
    // Person person = new Person();

    Person person = new Person("John", 23, 1.8);
    int[] numeros = new int[10];

    conta.depositar(x);

    // exemplo de NullPointer
    // String firstName = person.name.split(" ")[0];

    // stack heap
  }
}
```
