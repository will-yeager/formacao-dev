# language: pt

Funcionalidade: Propondo lances

Cenario: Propondo um unico lance valido
    Dado um lance valido
    Quando propoe ao leilao
    Entao o lance eh aceito

Cenario: Propondo um unico lance valido
    Dado um lance de 10.0 reais do usuario "fulano"
    E um lance de 15.0 reais do usuario "beltrano"
    Quando propoe varios lances ao leilao
    Entao os lances sao aceito

Esquema do Cenario: Propondo um unico lance invalido
    Dado um lance de <valor> reais e do usuario '<nomeUsuario>'
    Quando propoe ao leilao
    Entao o lance nao eh aceito

    Exemplos:
        | valor |   nomeUsuario |
        |   0.0   |   beltrano    |
        |   -1.0  |   fulano      |

Cenario: Propondo uma sequencia de lances
    Dado dois lances
        | valor |   nomeUsuario |
        |  10.0 |  beltrano     |
        |  15.0 |   beltrano    |
    Quando propoe varios lances ao leilao
    Entao o segundo lance nao eh aceito


