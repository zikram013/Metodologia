/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author d.amora
 */
@RunWith(Suite.class)
@SuiteClasses({PenalizacionTest.class,
               ProfesorTest.class,
               AdminTest.class,
               EstudianteTest.class})
public class AllTest {
    
}
