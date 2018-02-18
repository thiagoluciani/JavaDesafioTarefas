# JavaDesafioTarefas

Este projeto � para um desafio de 24 horas onde o objetivo � construir uma aplica��o web em Java EE com o banco de dados MySQL.

Requisitos:
O usu�rio deve poder:

Adicionar novas tarefas; (Conclu�do)
Marcar e desmarcar o status de conclu�do; (Conclu�do)
Editar o conte�do da task; (Conclu�do)
Deletar uma task; (Conclu�do)
Versionamento com Git; (N�o Conclu�do. Apenas recentemente conheci o Git/GitHub, n�o sei como fazer este requesito)
Obs.: uma task deve conter ao menos: t�tulo e status, podendo conter adicionalmente descri��o, datas de cria��o, edi��o, remo��o e conclus�o. (Conclu�do, por�m faltou implementar as regras de neg�cio para preenchimento autom�tico das datas, etc.)

Ser�o considerados diferenciais:
Camada de frontend independente do backend (API REST + frontend); (Parcialmente conclu�do, feita a parte frontend utilizando JSF, por�m n�o deu tempo para implementar um servi�o backend REST com JaxRS)
Utiliza��o de frameworks ou bibliotecas de frontend (ex: jQuery, Angular, Bootstrap); (N�o conclu�do, no momento ainda n�o tenho nenhum conhecimento em jQuery ou AngularJS, tenho um pouco em Bootstrap por�m n�o houve tempo para implementar)
Utiliza��o de JavaEE para o backend ex:(JSF, Spring, EJB); (Conclu�do, implementa��o feita utilizando JSF, faltou implementar regras de neg�cio na camada dos EJBs)
Utiliza��o de framework de persist�ncia de dados; (Conclu�do)
Bons padr�es de desenvolvimento e c�digo limpo; (-)
Documenta��o no c�digo; (-)
Estiliza��o b�sica do frontend, responsividade e usabilidade (drag�n�drop); (-, N�o houve tempo para estilizar a aplica��o)

Tentarei hospedar a aplica��o em um dos dois dom�nios abaixo:
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
