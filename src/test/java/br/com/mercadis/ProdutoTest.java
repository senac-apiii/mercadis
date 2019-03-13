package br.com.mercadis;

import br.com.mercadis.domain.Produto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoTest {

    @Test
    public void testaNomeProduto(){
        Produto p = new Produto();
        p.setNome("Meh");
        p.setReferencia(22);
        Produto pp = new Produto();
        pp.setNome("Meh");
        pp.setReferencia(33);
        assertThat(p,is(equalTo(pp)));
    }
}
