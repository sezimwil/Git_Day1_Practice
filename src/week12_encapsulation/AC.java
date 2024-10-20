package week12_encapsulation;

public class AC {
    private  int temp;
    private String power;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "AC{" +
                "temp=" + temp +
                ", power='" + power + '\'' +
                '}';
    }

    public AC(int temp, String power) {
        this.temp = temp;
        this.power = power;


    }
}
