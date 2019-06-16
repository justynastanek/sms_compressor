package js.compressor;

public class Paginator {

    int max_text_length = 160;

    public Paginator(int max_text_length) {
        this.max_text_length = max_text_length;
    }

    public String[] paginate(String text){

        double x = text.length();
        String[] splitedMessages = new String[(int)Math.ceil(x/this.max_text_length)];

        for(int i = 0; i < splitedMessages.length-1;  i++){
            splitedMessages[i] = text.substring(i*(this.max_text_length), (i+1)*this.max_text_length);
        }

            splitedMessages[splitedMessages.length-1] = text.substring((splitedMessages.length-1)*this.max_text_length);

        return splitedMessages;
    }
}
