# Spring Lifecycle

Projeto em Spring Boot de demonstração do ciclo de vida e alguns conceitos da arquitetura do framework.

## Dependency Injection

### Constructor based

É o recomendado pelo Spring e não precisa da annotação de @AutoWired (apesar de ser recomendado!). Facilita nos testes unitários e impede que a classe seja instanciada sem suas dependências.

### Setter based

É recomendado para dependencias não obrigatórias.

### Property based

Não é recomendado.
