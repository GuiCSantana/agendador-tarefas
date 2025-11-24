# Agendador de Tarefas

Aplicação Java + Spring Boot para cadastro, gerenciamento e atualização de tarefas associadas a usuários.  
O projeto foi desenvolvido com foco em arquitetura limpa, segurança e escalabilidade, utilizando autenticação JWT e integração com serviço externo de usuários.

---

## Funcionalidades

- Cadastro, atualização e exclusão de tarefas  
- Autenticação e autorização via JWT  
- API REST estruturada em camadas  
- Persistência com Spring Data JPA  
- Comunicação com serviço de usuários (HTTP Client)  
- Conversão de dados com DTOs e Converters  
- Tratamento de exceções customizadas  
- Controle de status de notificações via Enum  

---

## Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot** (Web, Data JPA, Security)  
- **JWT (JSON Web Token)**  
- **Gradle**  
- **PostgreSQL**  
- **GitHub Actions** (CI/CD)  
- **Docker** (opcional)  

---

## Estrutura do Projeto

src/main/java/com/seuprojeto ├── controller/        # Endpoints REST ├── business/          # Regras de negócio │   ├── dto/           # Data Transfer Objects │   └── mapper/        # Conversão Entity ↔ DTO ├── infrastructure/
│   ├── entity/        # Entidades JPA │   ├── repository/    # Acesso ao banco de dados │   ├── security/      # Configuração JWT + filtros │   ├── client/        # Comunicação com serviço externo │   └── exceptions/    # Exceções customizadas └── resources/ └── application.properties

---

## Como Executar

1. Acesse a pasta do projeto:
```bash
cd agendador-tarefas

2. Execute com Gradle:



./gradlew bootRun

3. Acesse a API:



http://localhost:8080


---

Endpoints Principais

Método	Endpoint	Descrição

POST	/login	Autenticação e geração do JWT
GET	/tarefas	Lista todas as tarefas
POST	/tarefas	Cria uma nova tarefa
PUT	/tarefas/{id}	Atualiza tarefa
DELETE	/tarefas/{id}	Remove tarefa

---

👤 Autor

Guilherme Santorini
Desenvolvedor Java | Spring | SQL
Imperatriz – MA
