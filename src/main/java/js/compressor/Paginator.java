package js.compressor;

import java.util.ArrayList;
import java.util.List;

public class Paginator {

    int max_text_length = 160;

    public Paginator(int max_text_length) {
        this.max_text_length = max_text_length;
    }

    public String[] paginate(String text){

        double x = text.length();
        List<String> splitedMessages = new ArrayList<>();

        for(int i = 0; i < (int)Math.ceil(x/this.max_text_length)-1;  i++){
            splitedMessages.add(text.substring(i*(this.max_text_length), (i+1)*this.max_text_length));
        }

            splitedMessages.add(text.substring((splitedMessages.size())*this.max_text_length));

        return splitedMessages.toArray(new String[0]);
    }
}
