package com.address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

public class ZipCodeService {
	static String webService = "http://viacep.com.br/ws/";
	static int successCode = 200;
	
	public static Address searchAddressBy(String postalCode) throws Exception {
		String urlForCall = webService + postalCode + "/json";
		
		
		try {
			URL url = new URL(urlForCall);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			if (connection.getResponseCode() != successCode) throw new RuntimeException("HTTP error code: " + connection.getResponseCode());
				
			BufferedReader response = new BufferedReader(new InputStreamReader((connection.getInputStream())));
			String jsonInString = Util.convertJsonInString(response);
				
			Gson gson = new Gson();
			Map jsonObject = gson.fromJson(jsonInString, Map.class);
			Address address = new Address();
			address.setPublicPlace(jsonObject.get("logradouro").toString());
			address.setDistrict(jsonObject.get("bairro").toString());
			address.setLocality(jsonObject.get("localidade").toString());
			address.setFu(jsonObject.get("uf").toString());
				
			return address;
			
		} catch (Exception e) {
			throw new Exception("Error: " + e);
		}
	}
}
