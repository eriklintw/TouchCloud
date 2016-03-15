/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ErikLin
 */
@Entity
@Table(name = "PowerStatus")
@NamedQueries({
    @NamedQuery(name = "PowerStatus.findAll", query = "SELECT p FROM PowerStatus p")})
public class PowerStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "uid")
    private Long uid;
    @Column(name = "address")
    private String address;
    @Column(name = "manufacturerId")
    private Integer manufacturerId;
    @Column(name = "batteryLevel")
    private String batteryLevel;
    @Column(name = "majorId")
    private Integer majorId;
    @Column(name = "minorId")
    private Integer minorId;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "mac")
    private String mac;
    @Column(name = "isBatteryLow")
    private Boolean isBatteryLow;

    public PowerStatus() {
    }

    public PowerStatus(Long uid) {
        this.uid = uid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getMinorId() {
        return minorId;
    }

    public void setMinorId(Integer minorId) {
        this.minorId = minorId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Boolean getIsBatteryLow() {
        return isBatteryLow;
    }

    public void setIsBatteryLow(Boolean isBatteryLow) {
        this.isBatteryLow = isBatteryLow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PowerStatus)) {
            return false;
        }
        PowerStatus other = (PowerStatus) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tw.com.touchcloud.entity.PowerStatus[ uid=" + uid + " ]";
    }
    
}
