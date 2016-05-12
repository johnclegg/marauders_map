package com.maraudersmap.mattbennett.maraudersmapfto;

import android.location.Location;

/**
 * Created by matt.bennett on 12/05/2016.
 */
public class MaraudersApiClient {
    private String maraudersBaseUrl;
    private String OpenFormat = "api/trucks/open/%d?lat=%f&long=%f";

   public MaraudersApiClient(String maraudersBaseUrl) {
       this.maraudersBaseUrl = maraudersBaseUrl;
   }

    public String postLocationToMarauders(Location location) {
        //call endpoint



        return "Saved successfully!";
    }

    private String openUrl(Location location, int id) {
        return String.format(OpenFormat, id, location.getLatitude(), location.getLongitude());
    }
}
