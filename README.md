# 💼 Projeto: Cálculo de Impostos com Herança e Polimorfismo (Java)

## 📋 Descrição
Aplicação Java que simula o cálculo de impostos a serem pagos por contribuintes, podendo ser **pessoas físicas (Individual)** ou **jurídicas (LegalEntity)**. Utiliza **herança**, **abstração** e **polimorfismo** para representar os diferentes tipos de contribuintes e as regras de cálculo específicas de cada um.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e classes abstratas
- Polimorfismo com sobrescrita de método
- Encapsulamento
- Estrutura de listas (`ArrayList`)
- Entrada de dados com `Scanner`

---

## 🏗️ Estrutura do Projeto

- `Contributor` (classe abstrata):
  - Atributos: `name`, `annualIncome`
  - Método abstrato: `tax()`

- `Individual` (pessoa física):
  - Regra de imposto:
    - Renda < 20.000 → 15%
    - Renda ≥ 20.000 → 25%
    - Dedução: 50% dos gastos com saúde

- `LegalEntity` (empresa):
  - Regra de imposto:
    - > 10 funcionários → 14%
    - ≤ 10 funcionários → 16%

---

## 📌 Exemplo de Execução

```text
Enter the number of tax payers: 2

Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000
Health expenditures: 2000

Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000
Number of emplooyees: 25

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00

TOTAL TAXES: $ 67500.00
