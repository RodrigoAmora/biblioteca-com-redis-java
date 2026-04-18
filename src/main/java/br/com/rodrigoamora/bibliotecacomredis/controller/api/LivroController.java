package br.com.rodrigoamora.bibliotecacomredis.controller.api;

import br.com.rodrigoamora.bibliotecacomredis.controller.api.doc.LivroControllerDoc;
import br.com.rodrigoamora.bibliotecacomredis.dto.LivroDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livro")
public class LivroController implements LivroControllerDoc {

    @GetMapping("/{id}")
    public ResponseEntity<LivroDto> buscarLivroPeloId(Long id) {
        return null;
    }
    
}
