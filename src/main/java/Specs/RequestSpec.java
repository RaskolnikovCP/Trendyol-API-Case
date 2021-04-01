package Specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
    RequestSpecification requestSpecification;
    private String baseUrl = "https://api.spotify.com";
    private String token = "BQDgPFU3wFV3ljOvr2Su4S8cqRvk06PIau3QK9VZ4zPU5fIDPEsKlBbsqEQTChHlW4KT" +
            "1iCYOFvYTAiFvnmM6aGwaJSUv9OA0NzfxA1R7hpyMX01BiMFvckqmuJcEs5rlHwTiC3qAS1qjkyiaZzvX" +
            "o4l8NEy_HzzK-TXzcoCfxd3-RNPtr96bIYTO9Tp45lgCa1l9N6pJS8-8eJuU1U84RmfcpCuI7Z3YH4n5Bnn" +
            "KKKiyPOGa340DaW6fxpUsqZUXYwfia5Vq_wZekMjuTIVxjw";

    public RequestSpec(String endPoint){
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUrl+endPoint)
                .addHeader("Authorization","Bearer " +token)
                .setContentType("application/json")
                .setAccept("application/json")
                .build();
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}
