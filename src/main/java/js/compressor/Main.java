package js.compressor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your message: ");
        String text = sc.nextLine();

        System.out.println("Your compressed message: ");
        NaiveCompressor nc = new NaiveCompressor();
        String compressed_text = nc.compress(text);
        System.out.println(compressed_text);

        System.out.println("Your decompressed message: ");
        System.out.println(nc.decompress(compressed_text));

        System.out.println("Provide max length of sms: ");
        int max_length = sc.nextInt();

        System.out.println("Your splitted messages: ");
        Paginator pg = new Paginator(max_length);
        String[] paginated_text = pg.paginate(compressed_text);

        System.out.println();
        for(String i : paginated_text){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Provide cost per sms: ");
        double cost_per_sms = sc.nextDouble();

        System.out.println("Your total cost: ");
        Cost_Calculator cc = new Cost_Calculator(cost_per_sms);
        System.out.println(cc.calculate(paginated_text.length));



    }
}
