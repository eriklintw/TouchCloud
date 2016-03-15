/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.dao.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import tw.com.touchcloud.logic.dao.PowerStatusDao;
import tw.com.touchcloud.entity.PowerStatus;

/**
 *
 * @author ErikLin
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:application-context.xml")
public class PowerStatusDaoImplTest {

    @Autowired
    private PowerStatusDao dao;

    //@Test
    @Transactional
    public void test() {
        List<PowerStatus> list = dao.getAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
           String value = mapper.writeValueAsString(list.get(0));
           System.out.println(value);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PowerStatusDaoImplTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*
        {
	"address": "e2:a4:39:78:d3:76",
	"manufacturerId": 29012,
	"batteryLevel": "93%",
	"majorId": 21617,
	"minorId": 1,
	"uuid": "e2c56db5dffb48d2b060d0f5a71096e0",
	"mac": "30:E0:90:78:d3:76",
	"isBatteryLow": false
        }
        
        
        
        
        */
        
    }
}
