import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;

public class RestApi {
    public static void main(String[] args) throws Exception {
        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://bit.ly/3yxKEIY");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(transcript);

        System.out.println(jsonRequest);
        
        // HttpRequest postRequest = HttpRequest.newBuilder()
        //     .uri(new URI("https://api.assemblyai.com/v2/transcript"))
        //     .header("Authorization", Constants.API_TOKEN)
        //     .POST(BodyPublishers.ofString())
    }
}