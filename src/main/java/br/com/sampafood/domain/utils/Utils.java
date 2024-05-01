package br.com.sampafood.domain.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Utils {

	public static String getResource(String resource) {
        StringBuilder json = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(Objects.requireNonNull(Utils.class.getClassLoader().getResourceAsStream(resource)),
                            StandardCharsets.UTF_8));
            String str;
            while ((str = in.readLine()) != null)
                json.append(str);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException("Caught exception reading resource " + resource, e);
        }
        return json.toString();
    }
	
}
