package fr.afpa.main;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ProgrammeChien {

	public static void main(String[] args) {
		Security.addProvider(new BouncyCastleProvider());

	}

}
