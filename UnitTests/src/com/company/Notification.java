package com.company;

import java.util.Date;

public class Notification {
    private Pop popup;
    private Date targetDate;
    private boolean isActive;


    public Notification(Date targetDate, Pop popup) {
        this.popup = popup;
        this.targetDate = targetDate;
    }

    public void dismiss(){
        isActive = false;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
    public void notificate(){
//        if (!isActive){
//            return;
//        }
        long now = new Date().getTime();
        long interval = targetDate.getTime() - now;
        int intervalInMinutes = (int) (interval/60000);
        if (15<intervalInMinutes && intervalInMinutes < 30){
            showPopUp();
        }
        if (0 < intervalInMinutes){
            sendEmail();

        }
        logInFile();
    }

    private void logInFile() {
        System.out.println("Log in file");
    }

    private void sendEmail() {
        System.out.println("email sended");
    }

    private void showPopUp() {
        if (!isActive){
            return;
        }
        popup.showPopUP();
    }

}
