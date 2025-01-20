package com.assignment;
import java.util.Date;
import java.util.List;

class PremiumSubscription {
    private Date startDate;
    private Date endDate;
    
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void getPremiumSubscription(User user, Date starDate, Date endDate){
        List<PremiumSubscription> subscriptions = user.getSubscription();
        PremiumSubscription s = new PremiumSubscription();
        s.setStartDate(starDate);
        s.setEndDate(endDate);
        subscriptions.add(s);
        user.setSubscription(subscriptions);
    }
    
    public void cancelPremiumSubscription(User user, PremiumSubscription subscription){
        
    }
    
}
