/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.serviceri.dao.impl;


import org.springframework.stereotype.Repository;
import tw.com.touchcloud.serviceri.dao.PowerStatusDao;
import tw.com.touchcloud.serviceri.entity.PowerStatus;


/**
 *
 * @author ErikLin
 */
@Repository("powerStatusDao")

public class PowerStatusDaoImpl extends GenericDaoImpl<PowerStatus,Long> implements PowerStatusDao{
    /*
        CREATE TABLE touchcloud.`PowerStatus` ( 
                uid                  NUMERIC( 64 ) NOT NULL,
                address              VARCHAR( 50 ),
                `manufacturerId`     INT,
                `batteryLevel`       VARCHAR( 10 ),
                `majorId`            INT,
                `minorId`            INT,
                uuid                 VARCHAR( 64 ),
                mac                  VARCHAR( 50 ),
                `isBatteryLow`       BOOL,
                `updateTime`         DATETIME NOT NULL,
                CONSTRAINT pk_powerstatus PRIMARY KEY ( uid )
         );

        ALTER TABLE touchcloud.`PowerStatus` MODIFY uuid VARCHAR( 64 ) COMMENT 'beacon uuid';    
    */
}
