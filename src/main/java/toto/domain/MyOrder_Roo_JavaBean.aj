// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package toto.domain;

import java.util.Date;
import java.util.Set;
import toto.domain.Account;
import toto.domain.LineItem;
import toto.domain.MyOrder;
import toto.domain.OrderStatus;

privileged aspect MyOrder_Roo_JavaBean {
    
    public OrderStatus MyOrder.getStatus() {
        return this.status;
    }
    
    public void MyOrder.setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public int MyOrder.getMynumber() {
        return this.Mynumber;
    }
    
    public void MyOrder.setMynumber(int Mynumber) {
        this.Mynumber = Mynumber;
    }
    
    public Date MyOrder.getOrdered() {
        return this.ordered;
    }
    
    public void MyOrder.setOrdered(Date ordered) {
        this.ordered = ordered;
    }
    
    public boolean MyOrder.isShipped() {
        return this.shipped;
    }
    
    public void MyOrder.setShipped(boolean shipped) {
        this.shipped = shipped;
    }
    
    public double MyOrder.getTotal() {
        return this.total;
    }
    
    public void MyOrder.setTotal(double total) {
        this.total = total;
    }
    
    public String MyOrder.getShipTo() {
        return this.shipTo;
    }
    
    public void MyOrder.setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }
    
    public Account MyOrder.getAccount() {
        return this.account;
    }
    
    public void MyOrder.setAccount(Account account) {
        this.account = account;
    }
    
    public Set<LineItem> MyOrder.getItems() {
        return this.items;
    }
    
    public void MyOrder.setItems(Set<LineItem> items) {
        this.items = items;
    }
    
}