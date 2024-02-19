package com.example.demo.factory;

public class colorControlRequestFactory {

    @Value("${govee.dev.url}")
    private String goveeApiUrl;

    @Value("${govee.api}")
    private String goveeApiKey;

    private final RestTemplate restTemplate;

    public GoveeApiRequestFactory(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendControlRequest(ControlRequest controlRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Govee-API-Key", goveeApiKey);

        HttpEntity<ControlRequest> requestEntity = new HttpEntity<>(controlRequest, headers);

        restTemplate.exchange(goveeApiUrl, HttpMethod.PUT, requestEntity, Void.class);
    }
}
