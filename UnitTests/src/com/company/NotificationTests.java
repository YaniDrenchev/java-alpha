package com.company;
import org.junit.*;

import java.util.Date;

public class NotificationTests {
    @Test
    public void sendNotification_shoud_doNothing_when_dismissed(){
        //Arrange
        MockPopup p = new MockPopup();
        Notification not = new Notification(new Date(), new MockPopup());
        //Act
        not.dismiss();
        not.notificate();
        //Assert
        Assert.assertFalse(p.isPopupShown());
    }
}
