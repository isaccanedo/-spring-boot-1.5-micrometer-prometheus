# O que é o Prometheus?
Conforme descrito no próprio github da ferramenta, o Prometheus é um sistema de monitoramento para serviços e aplicações. Ele coleta as métricas de seus alvos em determinados intervalos, avalia expressões de regras, exibe os resultados e também pode acionar alertas se alguma condição for observada como verdadeira.

## Dentre muitas, estas são principais características do Prometheus:
- É um modelo de dados multi-dimensional (time series).
- Possui uma linguagem própria(PromQL) para queries de dados em formato time series.
- Totalmente autônomo, sem dependência de armazenamento externo.
- A coleta das métricas ocorre com um modelo pull e via HTTP.
- Também é possível enviar métricas através de um gateway intermediário.
- A definição dos serviços a serem monitorados pode ser feita através de uma configuração estática ou através de descoberta.
- Possui vários modos de suporte a gráficos e painéis.

# Como executar o Spring Boot Micrometer com Prometheus

- `http://localhost:8091/rest/hello`, `http://localhost:8091/rest/hello2`,`http://localhost:8091/rest/hello3`, `http://localhost:8091/rest/hello4` - Diferentes pontos de extremidade REST que são coletados pelo micrômetro para Prometheus
- `http://localhost:8091/prometheus` - Endpoint onde as métricas do Prometheus podem ser acessadas.
