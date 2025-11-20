public class Sign {
    private String message;
    private int width;
    int length;
    public Sign(String message1, int width1) {
        message = message1;
        width = width1;
        length = message.length();
    }
    public int numberOfLines() {
        int numlines = length / width;
        if ((length % width) != 0) numlines++;
        return numlines;
    }

    public String getLines() {
        int count = 0;
        String text = "";
        if (message == "") {
            return null;
        }
        else {
            while (count < numberOfLines()) {
                if (count == length/width) {
                    for (int i = 0; i < length % width; i++) {
                        text += message.substring(count * width + i, count * width + i + 1);
                    }
                }
                else {
                    for (int i = 0; i < width; i++) {
                        text += message.substring(count * width + i, count * width + i + 1);
                    }
                }
                if (count != numberOfLines()-1) text += ";";
                count++;
            }
        }
        return text;
    }

}
