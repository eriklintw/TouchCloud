/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.serviceri.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.touchcloud.serviceri.dao.PowerStatusDao;
import tw.com.touchcloud.serviceri.entity.PowerStatus;
import tw.com.touchcloud.serviceri.service.PowerStatusService;


/**
 *
 * @author ErikLin
 */
@Service
@Transactional
public class PowerStatusServiceImpl implements PowerStatusService {

    @Autowired
    private PowerStatusDao dao;

    public List<PowerStatus> findAll() {
        return this.dao.getAll();
    }

    public void addSignal(PowerStatus s) {
        Date now = new Date();
        s.setUid(now.getTime());
        s.setUpdateTime(now);
        this.dao.saveOrUpdate(s);
    }
}
