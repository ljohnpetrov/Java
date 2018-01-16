/**
 * Java. Level 2. Lesson 6 Homework
 * 
 * @author Ivan Petrov
 * @version dated Jan 14, 2018
 * @link https://github.com/ljohnpetrov/Java
 */
import java.io.*;
import java.net.*;
import java.util.*;
/**
 * 1. Модернизировать код SimpleClient так,
 * чтобы клиент мог не только отправлять сообщения на сервер, но и получать их от него.
 */

class SimpleClient_ver2 {

    final String SERVER_ADDR = "127.0.0.1"; // or "localhost"
    final int SERVER_PORT = 2048;
    final String CLIENT_PROMPT = "$ ";
    final String CONNECT_TO_SERVER = "Connection to server established.";
    final String CONNECT_CLOSED = "Connection closed.";
    final String EXIT_COMMAND = "exit"; // command for exit

    public static void main(String[] args) {
        new SimpleClient();
    }

    SimpleClient_ver2() {
        String message;
        try (Socket socket = new Socket(SERVER_ADDR, SERVER_PORT);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in)) {
            System.out.println(CONNECT_TO_SERVER);
            BufferedReader reader =
                new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            do {
                System.out.print(CLIENT_PROMPT);
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
                System.out.println(reader.readLine());
            } while (!message.equals(EXIT_COMMAND));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(CONNECT_CLOSED);
    }
}