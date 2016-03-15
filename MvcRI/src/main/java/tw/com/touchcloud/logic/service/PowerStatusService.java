/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.logic.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import tw.com.touchcloud.entity.PowerStatus;

/**
 *
 * @author ErikLin
 */
@Transactional
public interface PowerStatusService {
    public void addSignal(String content);
    public void addSignal(PowerStatus s);
    public List<PowerStatus> findAll();
}
