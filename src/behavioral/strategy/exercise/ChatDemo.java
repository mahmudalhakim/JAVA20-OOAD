package behavioral.strategy.exercise;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-17
 * Time: 09:12
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class ChatDemo {

  public static void main(String[] args) {
    var chat = new ChatClient("AES");
    chat.send("Hello");
  }
}

