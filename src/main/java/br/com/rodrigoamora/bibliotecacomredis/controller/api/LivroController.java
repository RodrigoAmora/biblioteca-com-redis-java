package br.com.rodrigoamora.bibliotecacomredis.controller.api;

import br.com.rodrigoamora.bibliotecacomredis.dto.LivroDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "API de Livro")
@RestController
@RequestMapping("/api/livro")
public class LivroController {


    @Operation(summary = "Busca de livro")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Buscar livro pelo id",
                    content = @Content(schema = @Schema(implementation = LivroDto.class))
            ),
    })
    @GetMapping("/{id}")
    public ResponseEntity<LivroDto> buscarLivroPeloId(Long id) {
        return null;
    }


}
