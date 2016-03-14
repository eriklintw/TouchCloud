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
import javax.persistence.Table;

/**
 *
 * @author ErikLin
 */
@Entity
@Table(name = "PowerStatus")
public class PowerStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "UUID")
    private Long uuid;
    @Basic(optional = false)
    @Column(name = "CONTENT")
    private String content;

    public PowerStatus() {
    }

    public PowerStatus(Long uuid) {
        this.uuid = uuid;
    }

    public PowerStatus(Long uuid, String content) {
        this.uuid = uuid;
        this.content = content;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uuid != null ? uuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PowerStatus)) {
            return false;
        }
        PowerStatus other = (PowerStatus) object;
        if ((this.uuid == null && other.uuid != null) || (this.uuid != null && !this.uuid.equals(other.uuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tw.com.touchcloud.entity.PowerStatus[ uuid=" + uuid + " ]";
    }
    
}
