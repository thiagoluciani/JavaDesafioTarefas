# JavaDesafioTarefas

Este projeto é para um desafio de 24 horas onde o objetivo é construir uma aplicação web em Java EE com o banco de dados MySQL.

Requisitos:
O usuário deve poder:

Adicionar novas tarefas; (Concluído)
Marcar e desmarcar o status de concluído; (Concluído)
Editar o conteúdo da task; (Concluído)
Deletar uma task; (Concluído)
Versionamento com Git; (Não Concluído. Apenas recentemente conheci o Git/GitHub, não sei como fazer este requesito)
Obs.: uma task deve conter ao menos: título e status, podendo conter adicionalmente descrição, datas de criação, edição, remoção e conclusão. (Concluído, porém faltou implementar as regras de negócio para preenchimento automático das datas, etc.)

Serão considerados diferenciais:
Camada de frontend independente do backend (API REST + frontend); (Parcialmente concluído, feita a parte frontend utilizando JSF, porém não deu tempo para implementar um serviço backend REST com JaxRS)
Utilização de frameworks ou bibliotecas de frontend (ex: jQuery, Angular, Bootstrap); (Não concluído, no momento ainda não tenho nenhum conhecimento em jQuery ou AngularJS, tenho um pouco em Bootstrap porém não houve tempo para implementar)
Utilização de JavaEE para o backend ex:(JSF, Spring, EJB); (Concluído, implementação feita utilizando JSF, faltou implementar regras de negócio na camada dos EJBs)
Utilização de framework de persistência de dados; (Concluído)
Bons padrões de desenvolvimento e código limpo; (-)
Documentação no código; (-)
Estilização básica do frontend, responsividade e usabilidade (drag’n’drop); (-, Não houve tempo para estilizar a aplicação)

Tentarei hospedar a aplicação em um dos dois domínios abaixo:
"http://thiagowl.ddns.net:8000/JavaDesafioTarefas-war/" ou "http://desafiojava.ddns.net:8085/JavaDesafioTarefas-war/".

Scripts utilizados:
CREATE SCHEMA `mydb` ;

CREATE TABLE `mydb`.`tarefa` (
             `idtarefa` INT NOT NULL AUTO_INCREMENT,
             `titulo` VARCHAR(45) NOT NULL,
             `status` TINYINT NOT NULL,
             `descricao` VARCHAR(200) NULL,
             `datacriacao` DATETIME NULL,
             `dataedicao` DATETIME NULL,
             `dataremocao` DATETIME NULL,
             `dataconclusao` DATETIME NULL,
           PRIMARY KEY (`idtarefa`));
