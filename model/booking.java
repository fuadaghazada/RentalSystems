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
public class Booking {
Tenant tenant;
PropertyUnit property;
Date bookingDate;
Date bookingStarts;
Date bookingEnds;
public ArrayList<Booking> list(){
return null;
}

    public Booking(Tenant tenant, PropertyUnit property, Date bookingDate, Date bookingStarts, Date bookingEnds) {
        this.tenant = tenant;
        this.property = property;
        this.bookingDate = bookingDate;
        this.bookingStarts = bookingStarts;
        this.bookingEnds = bookingEnds;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public PropertyUnit getProperty() {
        return property;
    }

    public void setProperty(PropertyUnit property) {
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
