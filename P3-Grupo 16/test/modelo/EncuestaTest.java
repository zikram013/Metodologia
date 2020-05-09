/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author d.amora
 */
public class EncuestaTest {
    
    public EncuestaTest() {
    }

    /**
     * Test of getRespuestas method, of class Encuesta.
     */
    @Test
    public void testGetRespuestas() {
        List<String> respuestas = new ArrayList<String>();
        respuestas.add("Hay que aprobar");
        Encuesta encuesta = new Encuesta(respuestas);
        assertEquals(respuestas, encuesta.getRespuestas());
    }

    /**
     * Test of setRespuestas method, of class Encuesta.
     */
    @Test
    public void testSetRespuestas() {
        List<String> respuestas = new ArrayList<String>();
        respuestas.add("Hay que aprobar");
        Encuesta encuesta = new Encuesta();
        encuesta.setRespuestas(respuestas);
        assertEquals(respuestas, encuesta.getRespuestas());
    }
    
}
