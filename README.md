NeoLider






NeoLider é uma aplicação de gerenciamento de usuários e itens desenvolvida em Java puro, aplicando conceitos de arquitetura em camadas (Model, Repository, Service e Controller). Este projeto simula funcionalidades de um sistema de gestão, organizado para facilitar manutenção e evolução.

🛠 Estrutura do Projeto
br.com.neolider
│
├── model         # Entidades do sistema (ex: User, Item)
├── repository    # Responsável pelo armazenamento de dados
├── service       # Regras de negócio e validações
├── controller    # Controle do fluxo da aplicação
└── Main.java     # Classe principal para execução
⚙ Funcionalidades

Adicionar, listar e gerenciar usuários

Adicionar e controlar itens

Simulação de login e permissões de acesso

Lógica de negócio separada da persistência de dados

💡 Atualmente, os dados são armazenados em memória usando listas Java (ArrayList), mas podem ser facilmente adaptados para banco de dados.

📌 Tecnologias

Java SE 17+

Programação Orientada a Objetos (POO)

Arquitetura em camadas (Model, Repository, Service, Controller)

🚀 Como Executar

Clone o repositório:

git clone https://github.com/igor27oliver-tech/neo-lider-version-2.git

Abra o projeto no IntelliJ IDEA ou outro IDE de sua preferência.

Execute a classe Main.java.

Interaja com o sistema via console.

📚 Próximos Passos

Implementar persistência em banco de dados ou arquivo

Criar interface gráfica (GUI)

Adicionar relatórios e exportação de dados

Testes unitários e validação avançada

📝 Sobre o Autor

Desenvolvido por Igor Ribeiro Cardoso de Oliveira, estudante de Análise e Desenvolvimento de Sistemas, com foco em backend Java e boas práticas de arquitetura.
