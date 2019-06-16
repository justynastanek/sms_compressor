package js.compressor;

public class Cost_Calculator {

    double price_per_sms = 0.1;

    public Cost_Calculator(double price_per_sms) {
        this.price_per_sms = price_per_sms;
    }

    public double calculate(int x){
        return x*this.price_per_sms;
    }
}
