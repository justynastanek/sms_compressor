package js.compressor;

public class NaiveCompressor implements Compressor {

    @Override
    public String compress(String text) {

        String[] splited_text = text.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String i : splited_text){
            i = i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase();
            sb.append(i);
        }

        return sb.toString();
    }

    @Override
    public String decompress(String text) {

        String[] splited_text = text.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");

        StringBuilder sb = new StringBuilder();

        for(String i : splited_text){
            sb.append(i);
            sb.append(" ");
        }

        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
