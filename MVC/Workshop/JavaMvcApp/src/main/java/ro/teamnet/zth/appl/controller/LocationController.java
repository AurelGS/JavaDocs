package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

@MyController(urlPath = "/locations")

public class LocationController {

    @MyRequestMethod(urlPath = "/one")
    public String getOneLocation() {
        return "oneRandomLocation";
    }

    @MyRequestMethod(urlPath = "/all")
    public String getAllLocations() {
        return "allLocations";
    }

}
