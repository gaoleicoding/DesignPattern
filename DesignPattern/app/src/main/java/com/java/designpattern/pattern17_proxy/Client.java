package com.java.designpattern.pattern17_proxy;

public class Client {
    public static void main(String[] args) {
        Station station = new Station();
        StationProxy stationProxy = new StationProxy(station);
        stationProxy.sellTicket();
    }
}