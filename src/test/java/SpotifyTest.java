import io.restassured.response.Response;
import org.junit.Test;

public class SpotifyTest extends BaseTestElements{

    @Test
    public void SpotifyAPITest(){
        String artistName = "queen";
        String artistId = "1dfeR4HaWDbWqFHLkxsg1d";

        user.getUserId(200);
        search.findArtist(artistName,200);
        artist.getArtistTracks(artistId,200);

    }

}
