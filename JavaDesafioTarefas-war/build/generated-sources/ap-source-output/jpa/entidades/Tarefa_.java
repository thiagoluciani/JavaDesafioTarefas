package jpa.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-17T21:50:18")
@StaticMetamodel(Tarefa.class)
public class Tarefa_ { 

    public static volatile SingularAttribute<Tarefa, Date> dataremocao;
    public static volatile SingularAttribute<Tarefa, Date> datacriacao;
    public static volatile SingularAttribute<Tarefa, String> titulo;
    public static volatile SingularAttribute<Tarefa, Integer> idtarefa;
    public static volatile SingularAttribute<Tarefa, Short> status;
    public static volatile SingularAttribute<Tarefa, String> descricao;
    public static volatile SingularAttribute<Tarefa, Date> dataedicao;
    public static volatile SingularAttribute<Tarefa, Date> dataconclusao;

}