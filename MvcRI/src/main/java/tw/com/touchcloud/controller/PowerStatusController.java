/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import tw.com.touchcloud.entity.PowerStatus;
import tw.com.touchcloud.logic.service.PowerStatusService;

/**
 *
 * @author ErikLin
 */
@RestController
public class PowerStatusController {

    @Autowired
    private PowerStatusService service;

    @RequestMapping(value = "/powerStatus/", method = RequestMethod.GET)
    public ResponseEntity<List<PowerStatus>> listAllStatus() {
        List<PowerStatus> statusList = service.findAll();
        if (statusList.isEmpty()) {
            return new ResponseEntity<List<PowerStatus>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<PowerStatus>>(statusList, HttpStatus.OK);
    }

    @RequestMapping(value = "/powerStatus/", method = RequestMethod.POST)
    public ResponseEntity<Void> addPowerStatus(@RequestBody PowerStatus user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating PowerStatus " + user.getContent());

        service.addSignal(user);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/powerStatus/{id}").buildAndExpand(user.getUuid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
