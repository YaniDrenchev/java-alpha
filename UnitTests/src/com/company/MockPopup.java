package com.company;

public class MockPopup implements Pop {
    private boolean popupShown = false;

    public boolean isPopupShown() {
        return popupShown;
    }

    @Override
    public void showPopUP() {
        System.out.println("PopUpShown");
    }
}
