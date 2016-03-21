/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.vo;

import tw.com.touchcloud.entity.PowerStatus;
import tw.com.touchcloud.vo.util.DateUtility;

/**
 *
 * @author ErikLin
 */
public class PowerStatusVo extends PowerStatus{

    /**
     * @return the displayUpdateTime
     */
    public String getDisplayUpdateTime() {
        return DateUtility.formatDateTime(this.getUpdateTime());
    }
    
}
