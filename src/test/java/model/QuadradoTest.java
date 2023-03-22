package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuadradoTest {

    Quadrado resultado;
    Quadrado quadrado1;
    Quadrado quadrado2;

    @Before
    public void before() {
        resultado = new Quadrado();
        quadrado1 = new Quadrado();
        quadrado2 = new Quadrado();
    }

    @Test
    public void quadradoDeMenorAreaDeveTerLadoDoQuadrado1() {
        quadrado1.setLado(3);
        quadrado2.setLado(4);

        resultado = resultado.quadradoDeMenorArea(quadrado1,quadrado2);

        Assert.assertTrue(resultado.getLado() == quadrado1.getLado());

    }

    @Test
    public void quadradoDeMenorAreaDeveTerLadoDoQuadrado2() {
        quadrado1.setLado(4);
        quadrado2.setLado(3);

        resultado = resultado.quadradoDeMenorArea(quadrado1,quadrado2);

        Assert.assertFalse(resultado.getLado()!= quadrado2.getLado());

    }

    @Test
    public void quadradoDeMenorAreaDeveTerLadoMenorQueDoQuadrado2() {
        quadrado1.setLado(3);
        quadrado2.setLado(4);

        resultado = resultado.quadradoDeMenorArea(quadrado1,quadrado2);

        Assert.assertTrue(resultado.getLado() < quadrado2.getLado());

    }

    @Test
    public void quadradoDeMenorAreaDeveTerLadoMenorQueDoQuadrado1() {
        quadrado1.setLado(4);
        quadrado2.setLado(3);

        resultado = resultado.quadradoDeMenorArea(quadrado1,quadrado2);

        Assert.assertFalse(resultado.getLado() > quadrado1.getLado());

    }

    @Test
    public void deveRetornarNuloQuandoAsAreasDosQuadradosSaoIguais() {
        quadrado1.setLado(3);
        quadrado2.setLado(3);

        resultado = resultado.quadradoDeMenorArea(quadrado1,quadrado2);

        Assert.assertEquals(null, resultado);

    }


}
