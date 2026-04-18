package br.com.rodrigoamora.bibliotecacomredis.controller.api.doc;

import br.com.rodrigoamora.bibliotecacomredis.dto.LivroDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "API de Livro")
public interface LivroControllerDoc {

    @Operation(summary = "Busca de livro")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Buscar livro pelo id",
                    content = @Content(schema = @Schema(implementation = LivroDto.class))
            ),
    })
    ResponseEntity<LivroDto> buscarLivroPeloId(Long id);

}
