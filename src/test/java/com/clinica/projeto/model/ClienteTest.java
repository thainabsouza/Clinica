package com.clinica.projeto.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClienteConstructorAndGetters() {
        // Dados de teste
        String name = "João";
        String descricao = "Descrição do cliente";
        String foto = "http://example.com/foto.jpg";
        String categoria = "Categoria A";
        LocalDate dataNascimento = LocalDate.of(1990, 1, 1);
        boolean disponivel = true;

        // Criação do objeto Cliente
        Cliente cliente = new Cliente(name, descricao, foto, categoria, dataNascimento, disponivel);

        // Verificação dos valores
        assertEquals(name, cliente.getNome());
        assertEquals(descricao, cliente.getDescricao());
        assertEquals(foto, cliente.getFoto());
        assertEquals(categoria, cliente.getCategoria());
        assertEquals(dataNascimento, cliente.getDataNascimento());
        assertTrue(cliente.isDisponivel());
    }

    @Test
    public void testSetters() {
        // Criação do objeto Cliente
        Cliente cliente = new Cliente();

        // Dados de teste
        String name = "Maria";
        String descricao = "Descrição atualizada";
        String foto = "http://example.com/foto2.jpg";
        String categoria = "Categoria B";
        LocalDate dataNascimento = LocalDate.of(1985, 5, 15);
        boolean disponivel = false;

        // Uso dos setters
        cliente.setNome(name);
        cliente.setDescricao(descricao);
        cliente.setFoto(foto);
        cliente.setCategoria(categoria);
        cliente.setDataNascimento(dataNascimento);
        cliente.setDisponivel(disponivel);

        // Verificação dos valores
        assertEquals(name, cliente.getNome());
        assertEquals(descricao, cliente.getDescricao());
        assertEquals(foto, cliente.getFoto());
        assertEquals(categoria, cliente.getCategoria());
        assertEquals(dataNascimento, cliente.getDataNascimento());
        assertFalse(cliente.isDisponivel()); // Note que o método setDisponivel foi alterado para não definir como false fixo
    }

    @Test
    public void testToString() {
        // Dados de teste
        String name = "Ana";
        String descricao = "Descrição de Ana";
        String foto = "http://example.com/foto3.jpg";
        String categoria = "Categoria C";
        LocalDate dataNascimento = LocalDate.of(2000, 12, 31);
        boolean disponivel = true;

        // Criação do objeto Cliente
        Cliente cliente = new Cliente(name, descricao, foto, categoria, dataNascimento, disponivel);

        // Verificação da saída do método toString
        String expectedString = "Cliente{" +
                "nome='" + name + '\'' +
                ", descricao=" + descricao +
                ", URL=" + foto +
                ", Categoria='" + categoria + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", disponivel=" + disponivel +
                '}';
        assertEquals(expectedString, cliente.toString());
    }
}
