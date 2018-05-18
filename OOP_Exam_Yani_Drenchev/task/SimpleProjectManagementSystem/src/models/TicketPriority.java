package models;

public enum  TicketPriority {
    HIGH, LOW;
    private static final String HIGH_PRIORITY = "HIGH";
    private static final String LOW_PRIORITY = "LOW";
    public static TicketPriority fromName(String name) {
        switch (name) {
            case HIGH_PRIORITY:
                return HIGH;
            case LOW_PRIORITY:
                return LOW;
            default:
                return null;
        }
    }
}
