/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.dao.impl;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import tw.com.touchcloud.dao.PowerStatusDao;
import tw.com.touchcloud.entity.PowerStatus;

/**
 *
 * @author ErikLin
 */
@Repository("powerStatusDao")

public class PowerStatusDaoImpl extends GenericDaoImpl<PowerStatus,Long> implements PowerStatusDao{
    
}
