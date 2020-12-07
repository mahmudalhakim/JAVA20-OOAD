package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-17
 * Time: 09:10
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class ChatClient {

  private EncryptionAlgorithm encryptionAlgorithm;

  public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }

  public void send(String message) {
    String encryptedMessage = encryptionAlgorithm.encrypt(message);
    System.out.println("Sending the encrypted message...");
  }
}

