// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package gis.com.restaurant.domain;

import gis.com.restaurant.domain.Client;
import gis.com.restaurant.domain.Reservation;
import gis.com.restaurant.domain.TableService;
import java.util.Date;

privileged aspect Reservation_Roo_JavaBean {
    
    public Date Reservation.getDateResa() {
        return this.dateResa;
    }
    
    public void Reservation.setDateResa(Date dateResa) {
        this.dateResa = dateResa;
    }
    
    public TableService Reservation.getTable_() {
        return this.table_;
    }
    
    public void Reservation.setTable_(TableService table_) {
        this.table_ = table_;
    }
    
    public Client Reservation.getClient() {
        return this.client;
    }
    
    public void Reservation.setClient(Client client) {
        this.client = client;
    }
    
}
