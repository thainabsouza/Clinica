package com.clinica.projeto.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="tab_user")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String descricao;

    @Column(length = 500, nullable = false)
    private String foto;

    @Column(length = 200, nullable = false)
    private String categoria;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private boolean disponivel;

    public Cliente(Integer id, String nome, String descricao, String foto, String categoria, LocalDate dataNascimento, boolean disponivel) {
        this.id = id;
        this.name = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.categoria = categoria;
        this.dataNascimento = dataNascimento;
        this.disponivel = disponivel;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", foto='" + foto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", disponivel=" + disponivel +
                '}';
    }
}
