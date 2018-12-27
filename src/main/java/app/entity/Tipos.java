package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TIPOS
 * @generated
 */
@Entity
@Table(name = "\"TIPOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipos")
public class Tipos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "Palavra", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String palavra;

  /**
  * @generated
  */
  @Column(name = "Numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer numero;

  /**
  * @generated
  */
  @Column(name = "Valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "Data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "Hora", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "DataHora", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataHora;

  /**
  * @generated
  */
  @Column(name = "Ativo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean ativo;

  /**
   * Construtor
   * @generated
   */
  public Tipos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Tipos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém palavra
   * return palavra
   * @generated
   */
  
  public java.lang.String getPalavra(){
    return this.palavra;
  }

  /**
   * Define palavra
   * @param palavra palavra
   * @generated
   */
  public Tipos setPalavra(java.lang.String palavra){
    this.palavra = palavra;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.Integer getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Tipos setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Tipos setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Tipos setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém hora
   * return hora
   * @generated
   */
  
  public java.util.Date getHora(){
    return this.hora;
  }

  /**
   * Define hora
   * @param hora hora
   * @generated
   */
  public Tipos setHora(java.util.Date hora){
    this.hora = hora;
    return this;
  }

  /**
   * Obtém dataHora
   * return dataHora
   * @generated
   */
  
  public java.util.Date getDataHora(){
    return this.dataHora;
  }

  /**
   * Define dataHora
   * @param dataHora dataHora
   * @generated
   */
  public Tipos setDataHora(java.util.Date dataHora){
    this.dataHora = dataHora;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.Boolean getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public Tipos setAtivo(java.lang.Boolean ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Tipos object = (Tipos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
