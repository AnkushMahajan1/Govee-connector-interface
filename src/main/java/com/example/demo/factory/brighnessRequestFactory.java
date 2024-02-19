package com.example.demo.factory;

public class brighnessRequestFactory {

    OkHttpClient client = new OkHttpClient();

    MediaType mediaType = MediaType.parse("application/json");
    Request request = new Request.Builder()
            .url("https://developer-api.govee.com/v1/devices/control")
            .put(body)
            .addHeader("accept", "application/json")
            .addHeader("content-type", "application/json")
            .addHeader("Govee-API-Key", "d0105fe8-f487-4cf4-9dcc-50710a51f4f0")
            .build();

    Response response = client.newCall(request).execute();
}
