package behavioral.strategy.exercise.solution;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-17
 * Time: 09:28
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class DES implements EncryptionAlgorithm {
  @Override
  public String encrypt(String text) {
    System.out.println("Encrypting message using DES");
    return "encryptedText";
  }
}
