package Services;

import Specs.RequestSpec;
import Specs.ResponseSpec;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Artist extends RequestSpec {
    public Artist() {
        super("/v1/artists");
    }


    public Response getArtistTracks(String artistId, int statusCode){
        Response response =
                given()
                        .spec(super.getRequestSpecification())
                        .get("/{id}/top-tracks",artistId)
                        .then()
                        .spec(ResponseSpec.checkStatusCode(statusCode))
                        .extract()
                        .response();
        List<Object> trackList =  response.jsonPath().getList("tracks");
        for (int i = 0; i < trackList.size(); i++){
            // here, I wanted to order tracks according to the fame
        System.out.println("Tracks : "+trackList.get(i));
        }
        return response;
    }
}
