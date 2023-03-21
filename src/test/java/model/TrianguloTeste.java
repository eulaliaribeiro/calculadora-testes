package model;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTeste {

    Triangulo triangulo = new Triangulo();
    Triangulo triangulo1 = new Triangulo();
    Triangulo triangulo2 = new Triangulo();


    @Test
    public void trianguloDeMenorAreaDeveTerAreaMenorQueDoTriangulo2() {
        triangulo1.setBase(3);
        triangulo1.setAltura(4);
        triangulo2.setBase(6);
        triangulo2.setAltura(8);

        Triangulo resultado = triangulo.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertTrue(resultado.calcularAreaTriangulo() < triangulo2.calcularAreaTriangulo());

    }

    @Test
    public void trianguloDeMenorAreaDeveTerAreaMenorQueDoTriangulo1() {
        triangulo1.setBase(6);
        triangulo1.setAltura(8);
        triangulo2.setBase(3);
        triangulo2.setAltura(4);

        Triangulo resultado = triangulo.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertFalse(resultado.calcularAreaTriangulo() > triangulo2.calcularAreaTriangulo());

    }

    @Test
    public void deveRetornarNuloQuandoAsAreasDosTriangulosSaoIguais() {
        triangulo1.setBase(3);
        triangulo1.setAltura(4);
        triangulo2.setBase(3);
        triangulo2.setAltura(4);

        Triangulo resultado = triangulo.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertEquals(null, resultado);

    }





}
