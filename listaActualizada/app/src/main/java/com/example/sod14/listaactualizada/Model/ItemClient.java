package com.example.sod14.listaactualizada.Model;

/**
 * Created by sod14 on 06/12/2017.
 */

public class ItemClient {
    String clientName;
    String clientIP;
    int itemNumber;

    public ItemClient(String clientName, String clientIP, int itemNumber) {
        this.clientName = clientName;
        this.clientIP = clientIP;
        this.itemNumber = itemNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
}
