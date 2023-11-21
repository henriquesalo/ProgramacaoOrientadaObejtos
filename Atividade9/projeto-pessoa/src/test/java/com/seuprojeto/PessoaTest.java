package com.seuprojeto;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Olá!", pessoa.dizerOla());
    }
}