## static keyword

Se comporta como uma variavel compartilhada dentre os objetos a serem criados. Nao ira precisar ser instanciada, ja que eh compartilhada entre todos.

```java
public class Account {

  public static final double ENTRY_TAX = 25.0;
  public static double revenueMonthTax = 0.011;

  private int id;
  private String holder;
  private double balance;

}

public Foo {

  public static void main(String[] args) {
    Account.revenueMonthTax = 2;
  }
}
```

## Aplicação - evitando variavel magica

package `util`:

```java
public class ServiceConstraints {

  public static final int INDEX_FIX = 1;
  public static final int LIMIT = 2000;

}
```

## Aplicacao - Biblioteca Math

```java
double potencia = Math.pow(2, 2); // 4
double parte_inteira = Math.floor(3.2); // 3
```

## Aplicacao - Criando classe de menu

```java
public class EnderecoMenu {

  static Scanner scanner = new Scanner(System.in);

  public static Endereco novo() {
    System.out.println("Digite sua rua:");
    String rua = scanner.nextLine();
    return new Endereco(rua);
  }
}

public class EnderecoService {

  public void cadastrarNovoContato() {
    Contato novoContato = ContatoMenu.novo();
    Endereco endereco = EnderecoMenu.novo();
    novoContato.setEndereco(endereco);

    boolean isAlreadyRegistered = contatos
      .stream()
      .anyMatch(contato -> contato.equals(novoContato));

    if(!isAlreadyRegistered) {
      contatos.add(contato);
    }
  }

}
```

## Padrão Camadas

1,pedro,21,rj,rio de janeiro,202020
1,pedro,21,rj,rio de janeiro,202020
1,pedro,21,rj,rio de janeiro,202020
1,pedro,21,rj,rio de janeiro,202020
1,pedro,21,rj,rio de janeiro,202020
1,pedro,21,rj,rio de janeiro,202020

- Repository: Acesso a base de dados de cada entidade

- Model/Entity/Domain: Ficam as nossas entidades da solucao

- Service: Isola as regras de negocio

- Utils: Classes utilitarias

## Classes Abstratas

Sao classes que nao podem ser instanciadas, apenas continuadas.
