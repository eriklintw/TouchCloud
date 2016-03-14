/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.dao.impl;

import java.util.List;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class PowerStatusDaoImplTest {

    @Autowired
    private PowerStatusDao dao;

    @Test
    @Transactional
    public void test() {
        List<PowerStatus> list = dao.getAll();
        
        System.out.println(list.size());
    }
}
