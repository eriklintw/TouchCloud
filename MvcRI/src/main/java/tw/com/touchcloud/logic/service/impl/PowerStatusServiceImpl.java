/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.logic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.touchcloud.logic.service.PowerStatusService;
import tw.com.touchcloud.logic.dao.PowerStatusDao;
import tw.com.touchcloud.entity.PowerStatus;

/**
 *
 * @author ErikLin
 */
@Service
public class PowerStatusServiceImpl implements PowerStatusService{

    @Autowired
    private PowerStatusDao dao;
    
    @Transactional
    public List<PowerStatus> findAll() {
        return this.dao.getAll();
    }

    public void addSignal(String content) {
        PowerStatus s = new PowerStatus();
        s.setContent(content);
        s.setUuid(System.currentTimeMillis());
        this.dao.saveOrUpdate(s);
    }
     
}
