package com.problemsolving.challenge_contests.contests;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Result {
    static Holding holdingList[];
    static Pricing pricingList[];
    List<Response> responseList = new ArrayList<>();

    public static double calculateNAV(String date) {
        double result = 0;
        Set<Response> securityName = new HashSet<>();
        for (Holding holding : holdingList) {
            if (holding.getDate().equals(date)) {
                securityName.add(new Response(holding.date,holding.security, holding.quantity));
            }
        }

        for (Response response : securityName) {
            double totalPrice = 0;
            for (Pricing pricing : pricingList) {
                if (pricing.date.equals(date) && pricing.security.equals(response.security)) {
                    totalPrice = pricing.pricing * response.quantity;
                }
            }
            result+= totalPrice;
        }
        return result;
    }

    public static void fetchApiData(String apiUrl, ApiType type) {
        try {

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            StringBuffer sb = new StringBuffer();
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            System.out.println(sb.toString());

            Result result = new Result();
            switch (type.name()) {
                case "HOLDING": {
                    result.createHoldingList(sb.toString());
                    break;
                }
                case "PRICING": {
                    result.createPricingList(sb.toString());
                    break;
                }
            }
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createHoldingList(String holdingMessage) {
        Gson gson = new Gson();
        holdingList = gson.fromJson(holdingMessage, Holding[].class);
    }

    private void createPricingList(String pricingMessage) {
        Gson gson = new Gson();
        holdingList = gson.fromJson(pricingMessage, Holding[].class);
    }


    public static void main(String[] args) {
        String holdingUrl = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding";
        String pricingUrl = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing";
        fetchApiData(holdingUrl, ApiType.HOLDING);
        fetchApiData(pricingUrl, ApiType.PRICING);
    }
}

enum ApiType {HOLDING, PRICING, HOLDING_PAGE, PRICING_PAGE}

class Holding {
    @SerializedName("date")
    String date;
    @SerializedName("security")
    String security;
    @SerializedName("quantity")
    int quantity;
    @SerializedName("portfolio")
    String portfolio;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }
}

class Response {
    String date;
    String security;
    double totalNav;
    int quantity;

    public Response(String date, String security, int quantity) {
        this.date = date;
        this.security = security;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return date.equals(response.date) &&
                security.equals(response.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, security);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public double getTotalNav() {
        return totalNav;
    }

    public void setTotalNav(double totalNav) {
        this.totalNav = totalNav;
    }
}


class Pricing {
    String date;
    String security;
    double pricing;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }
}
