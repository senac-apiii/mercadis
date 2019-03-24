package br.com.mercadis.repository;

import br.com.mercadis.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends
        JpaRepository<Produto, Integer> {

}
