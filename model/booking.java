/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public class booking {
tenant tenant;
propertyUnit property;
Date bookingDate;
Date bookingStarts;
Date bookingEnds;
public ArrayList<booking> list(){
return null;
}

    public booking(tenant tenant, propertyUnit property, Date bookingDate, Date bookingStarts, Date bookingEnds) {
        this.tenant = tenant;
        this.property = property;
        this.bookingDate = bookingDate;
        this.bookingStarts = bookingStarts;
        this.bookingEnds = bookingEnds;
    }

    public tenant getTenant() {
        return tenant;
    }

    public void setTenant(tenant tenant) {
        this.tenant = tenant;
    }

    public propertyUnit getProperty() {
        return property;
    }

    public void setProperty(propertyUnit property) {
        this.property = property;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getBookingStarts() {
        return bookingStarts;
    }

    public void setBookingStarts(Date bookingStarts) {
        this.bookingStarts = bookingStarts;
    }

    public Date getBookingEnds() {
        return bookingEnds;
    }

    public void setBookingEnds(Date bookingEnds) {
        this.bookingEnds = bookingEnds;
    }

}
