/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Blithe
 */
@Entity
@Table(name = "tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t")
    , @NamedQuery(name = "Tarefa.findByIdtarefa", query = "SELECT t FROM Tarefa t WHERE t.idtarefa = :idtarefa")
    , @NamedQuery(name = "Tarefa.findByTitulo", query = "SELECT t FROM Tarefa t WHERE t.titulo = :titulo")
    , @NamedQuery(name = "Tarefa.findByStatus", query = "SELECT t FROM Tarefa t WHERE t.status = :status")
    , @NamedQuery(name = "Tarefa.findByDescricao", query = "SELECT t FROM Tarefa t WHERE t.descricao = :descricao")
    , @NamedQuery(name = "Tarefa.findByDatacriacao", query = "SELECT t FROM Tarefa t WHERE t.datacriacao = :datacriacao")
    , @NamedQuery(name = "Tarefa.findByDataedicao", query = "SELECT t FROM Tarefa t WHERE t.dataedicao = :dataedicao")
    , @NamedQuery(name = "Tarefa.findByDataremocao", query = "SELECT t FROM Tarefa t WHERE t.dataremocao = :dataremocao")
    , @NamedQuery(name = "Tarefa.findByDataconclusao", query = "SELECT t FROM Tarefa t WHERE t.dataconclusao = :dataconclusao")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtarefa")
    private Integer idtarefa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Size(max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "datacriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacriacao;
    @Column(name = "dataedicao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataedicao;
    @Column(name = "dataremocao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataremocao;
    @Column(name = "dataconclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataconclusao;

    public Tarefa() {
    }

    public Tarefa(Integer idtarefa) {
        this.idtarefa = idtarefa;
    }

    public Tarefa(Integer idtarefa, String titulo, short status) {
        this.idtarefa = idtarefa;
        this.titulo = titulo;
        this.status = status;
    }

    public Integer getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(Integer idtarefa) {
        this.idtarefa = idtarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getStatus() {
        return (this.status == 1);
    }

    public void setStatus(boolean status) {
        this.status = (status) ? (short)1 : (short)0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    public Date getDataedicao() {
        return dataedicao;
    }

    public void setDataedicao(Date dataedicao) {
        this.dataedicao = dataedicao;
    }

    public Date getDataremocao() {
        return dataremocao;
    }

    public void setDataremocao(Date dataremocao) {
        this.dataremocao = dataremocao;
    }

    public Date getDataconclusao() {
        return dataconclusao;
    }

    public void setDataconclusao(Date dataconclusao) {
        this.dataconclusao = dataconclusao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarefa != null ? idtarefa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.idtarefa == null && other.idtarefa != null) || (this.idtarefa != null && !this.idtarefa.equals(other.idtarefa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entidades.Tarefa[ idtarefa=" + idtarefa + " ]";
    }
    
}
