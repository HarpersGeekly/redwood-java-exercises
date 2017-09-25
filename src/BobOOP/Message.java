package BobOOP;

/**
 * Created by RyanHarper on 9/25/17.
 */
public class Message {

        private String message;

        public Message(String message) {
            this.message = message;
        }

        public boolean isSilence() {
            return message.isEmpty();
        }

        public boolean isShouting() {
            return (message.endsWith("!") || message.equals(message.toUpperCase()))
                    && !message.isEmpty();
        }

        public boolean isQuestion() {
            return message.endsWith("?");
        }
    }
