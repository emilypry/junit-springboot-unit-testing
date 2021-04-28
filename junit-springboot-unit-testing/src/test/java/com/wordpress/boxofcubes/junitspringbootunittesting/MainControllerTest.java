package com.wordpress.boxofcubes.junitspringbootunittesting;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainControllerTest {
    private MainController controller = new MainController();

    @Test
    public void checkHomeReturnsIndex(){
        assertEquals("index", controller.home());
        assertNotEquals("home", controller.home());
    }

}
