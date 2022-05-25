package com.address;

import com.address.ZipCodeService;
import java.util.Scanner;

public class PostalCode {

	public static void main(String[] args) throws Exception {
		System.out.println("Informe seu CEP: ");
		String postalCode = new Scanner(System.in).nextLine();
		Address address = ZipCodeService.searchAddressBy(postalCode);

		System.out.println("Logradouro: " + address.getPublicPlace());
		System.out.println("Bairro: " + address.getDistrict());
		System.out.println("Localidade: " + address.getLocality());
		System.out.println("UF: " + address.getFu());	
	}
}
