package br.com.rodrigoamora.bibliotecacomredis.repository;

import br.com.rodrigoamora.bibliotecacomredis.model.Livro;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LivroRepository extends JpaRepository<Livro, Long> {
    

}
