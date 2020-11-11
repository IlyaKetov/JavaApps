package com.java.covid19.Sevices;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.covid19.Entities.Summary;
import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
//----------Lombok Annotation----------//
@AllArgsConstructor
public class DefaultServices implements Services {
    private final OkHttpClient httpClient = new OkHttpClient();

    @Override
    public Summary getSummaryInfo() throws IOException {
        String s;
        Summary summary = null;
        Request request = new Request.Builder()
                .url("https://api.covid19api.com/summary")
                .method("GET", null)
                .build();
        ObjectMapper mapper = new ObjectMapper();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            s = response.body().string();
        }
        try {
            summary = mapper.readValue(s, Summary.class);
            System.out.println(summary);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return summary;
    }
}
