package br.com.rodrigoamora.bibliotecacomredis.dto;

public record LivroDto (
        Long id,
        String nome,
        String autor,
        String genero,
        Integer qtdPaginas
) {}
