# 📚ArrayList

- O arrayList é uma classe do Java que permite criar uma classe dinamica.  
- Ele permite que eu remova e adicione itens sem eu precisar declarar antes o tamanho que a lista vai ter.  
- Para usar o ArrayList e preciso importar: ```import java.util.ArrayList;```  
- Para acessar um item especifico da lista é só dar um: ``nomeDaVariavel.get(posiçãoDoItem)``
## Importante!
- O Array List não aceita tipos primitivos, ele trabalha apenas com objetos.
### objetos que ele usa:
- Byte
- Short
- Integer
- Long
- Float
- Double
- Character
- Boolean

### Principais metodos do ArrayList

| Método            | Função                        |
| ----------------- | ----------------------------- |
| `add(obj)`        | Adiciona um elemento          |
| `get(index)`      | Retorna o elemento na posição |
| `set(index, obj)` | Substitui elemento            |
| `remove(index)`   | Remove o elemento             |
| `size()`          | Quantidade de itens           |
| `isEmpty()`       | Verifica se está vazio        |
| `clear()`         | Remove tudo                   |

## Exemplo de uso

import java.util.ArrayList;

public class Main {
```public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joaquim");
        nomes.add("Yasmin");

        System.out.println(nomes.get(0)); // Joaquim
        System.out.println(nomes.size()); // 2
    }
}
