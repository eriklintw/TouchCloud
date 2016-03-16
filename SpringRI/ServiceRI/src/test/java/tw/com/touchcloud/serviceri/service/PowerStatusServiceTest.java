/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.serviceri.service;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tw.com.touchcloud.serviceri.entity.PowerStatus;

/**
 *
 * @author ErikLin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class PowerStatusServiceTest {
    
    @Autowired
    private PowerStatusService service;


    //@Test
    public void testAddSignal() {
        System.out.println("addSignal");

        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        List<PowerStatus> list = service.findAll();
        System.out.println(list.size());
    }


    
}
