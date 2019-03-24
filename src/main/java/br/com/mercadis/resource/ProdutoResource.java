package br.com.mercadis.resource;

import br.com.mercadis.domain.Produto;
import br.com.mercadis.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listAll(){
        return produtoRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Produto findOne(@PathVariable int id){
        return produtoRepository.findById(id).get();
    }

    @PostMapping
    public Produto save(@Valid @RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
