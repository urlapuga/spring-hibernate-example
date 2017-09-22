package com.boraji.tutorial.spring.serviceEntities;

import javax.persistence.*;

@Entity
@Table(name="pinger")
public class Pinger {
    private Integer id;
    private String ipaddress;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ipaddress", nullable = true, length = 0)
    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pinger pinger = (Pinger) o;

        if (id != null ? !id.equals(pinger.id) : pinger.id != null) return false;
        if (ipaddress != null ? !ipaddress.equals(pinger.ipaddress) : pinger.ipaddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ipaddress != null ? ipaddress.hashCode() : 0);
        return result;
    }
}
