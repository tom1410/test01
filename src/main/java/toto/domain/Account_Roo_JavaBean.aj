// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package toto.domain;

import java.util.Date;
import java.util.Set;
import toto.domain.Account;
import toto.domain.Customer;
import toto.domain.MyOrder;
import toto.domain.Payment;
import toto.domain.ShoppinCart;

privileged aspect Account_Roo_JavaBean {
    
    public boolean Account.isIsClosed() {
        return this.isClosed;
    }
    
    public void Account.setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    
    public String Account.getBillingAddress() {
        return this.billingAddress;
    }
    
    public void Account.setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    public Date Account.getMyopen() {
        return this.Myopen;
    }
    
    public void Account.setMyopen(Date Myopen) {
        this.Myopen = Myopen;
    }
    
    public Date Account.getClosed() {
        return this.closed;
    }
    
    public void Account.setClosed(Date closed) {
        this.closed = closed;
    }
    
    public ShoppinCart Account.getCart() {
        return this.cart;
    }
    
    public void Account.setCart(ShoppinCart cart) {
        this.cart = cart;
    }
    
    public Set<MyOrder> Account.getMyorder() {
        return this.Myorder;
    }
    
    public void Account.setMyorder(Set<MyOrder> Myorder) {
        this.Myorder = Myorder;
    }
    
    public Set<Payment> Account.getPayment() {
        return this.payment;
    }
    
    public void Account.setPayment(Set<Payment> payment) {
        this.payment = payment;
    }
    
    public Customer Account.getCustomer() {
        return this.customer;
    }
    
    public void Account.setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
