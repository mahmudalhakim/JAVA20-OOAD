package behavioral.strategy.exercise;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-17
 * Time: 09:10
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class ChatClient {
    private String encryptionAlgorithm;

    public ChatClient(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        if (encryptionAlgorithm == "DES")
            System.out.println("Encrypting message using DES");
        else if (encryptionAlgorithm == "AES")
            System.out.println("Encrypting message using AES");
        else
            throw new UnsupportedOperationException
                ("Unsupported encryption algorithm");

        System.out.println("Sending the encrypted message...");
    }
}

