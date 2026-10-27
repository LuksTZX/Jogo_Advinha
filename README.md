# 🎯 Jogo de Adivinhação

Jogo de console em Java: o computador sorteia um número secreto e você tenta descobrir qual é, com dicas de "Maior!" ou "Menor!" a cada palpite.

## Como funciona

1. Escolha a dificuldade.
2. O computador sorteia um número dentro do intervalo.
3. Dê seus palpites. Você tem até **10 tentativas**.
4. A cada erro, o jogo diz se o número secreto é maior ou menor.
5. No final, escolha se quer jogar de novo.

## Dificuldades

| Nível   | Intervalo |
|---------|-----------|
| Fácil   | 1 a 50    |
| Médio   | 1 a 100   |
| Difícil | 1 a 1000  |

## Tratamentos incluídos

- Letras no lugar de números não derrubam o programa.
- Palpites fora do intervalo geram um aviso e **não gastam tentativa**.
- Opção de dificuldade inválida usa o nível médio.
- Ao perder, o número secreto é revelado.

## Exemplo de execução

```
Escolha o nivel da dificuldade:
1 - Facil (1 a 50), 2 - Medio (1 a 100), 3 - Dificil (1 a 1000)
2
Adivinhe o número de 1 a 100!
Tentativa 1 de 10. Qual seu palpite:
50
Maior!
Tentativa 2 de 10. Qual seu palpite:
75
Voce acertou em 2 tentativas!
```

## Conceitos praticados

- `Random` e a fórmula `nextInt(limite) + 1`
- Métodos com retorno (`int`, `boolean`)
- Laço `while` com contador manual e `continue`
- Constantes com `static final`
- Tratamento de entrada inválida com `try/catch`
