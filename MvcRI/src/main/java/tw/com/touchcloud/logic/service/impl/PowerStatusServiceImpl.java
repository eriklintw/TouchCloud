/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.logic.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.touchcloud.logic.service.PowerStatusService;
import tw.com.touchcloud.logic.dao.PowerStatusDao;
import tw.com.touchcloud.entity.PowerStatus;
import tw.com.touchcloud.vo.PowerStatusVo;

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
        //BeanUtils
                
        List<PowerStatus> list = this.dao.getAll();
        
        if(list != null){
            List<PowerStatus> rtnList = new ArrayList<PowerStatus>();
            PowerStatusVo vo = null;
            for(PowerStatus db : list){
               vo = new PowerStatusVo();
               BeanUtils.copyProperties(db, vo);
               rtnList.add(vo);
            }
            return rtnList;
        }
        return list;
    }

    public void addSignal(PowerStatus s) {
        Date now = new Date();
        s.setUid(now.getTime());
        s.setUpdateTime(now);
        this.dao.saveOrUpdate(s);
    }
}
