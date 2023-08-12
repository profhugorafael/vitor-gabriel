# Relacionamentos

## Herança

- Fortalece o Reuso

```java
public class Personagem {
  private String nome;
  private double velocidade;
  private double forca;
  private double defesa;
}

public class Arqueiro extends Personagem {
  private double precisao;
  private double agilidade;
}

public class Guerreiro extends Personagem {
  private double resistencia;
  private double agressividade;
}
```

## Composição

- Fortalece o Reuso
- Single responsability principle

### tem um

```java
public class Arqueiro {
  private AtributosBase atributosBase;
}
```

### tem varios
