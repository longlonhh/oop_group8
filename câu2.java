public interface Signal {
    double getAmplitude();  // Phương thức lấy biên độ tín hiệu
    double getFrequency();  // Phương thức lấy tần số tín hiệu
    double getPeriod();     // Phương thức lấy chu kỳ tín hiệu
    double getWavelength(); // Phương thức lấy bước sóng tín hiệu
}

public class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;

    // Constructor cho DiscreteSignal
    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }

    // Phương thức để thực hiện định nghĩa tín hiệu rời rạc
    public double discreteSignalDefinition(int n, int k) {
        return amplitude * deltaFunction(n - k);
    }

    // Định nghĩa dãy xung đơn vị delta
    private double deltaFunction(int n) {
        return (n == 0) ? 1 : 0;
    }
}

public class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;

    // Constructor cho ContinuousSignal
    public ContinuousSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }
}


    // Phương thức để thực hiện định nghĩa tín hiệu rời rạc
    public double discreteSignalDefinition(int n, int k) {
        return amplitude * deltaFunction(n - k);
    }

    // Định nghĩa dãy xung đơn vị delta
    private double deltaFunction(int n) {
        return (n == 0) ? 1 : 0;
    }
}
public class Radar {
    // Phương thức để phân tích tín hiệu rời rạc
    public double analyzeDiscreteSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double)n / 15;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Radar radar = new Radar();
        int n = 4;
        double result = radar.analyzeDiscreteSignal(n);
        System.out.println("Output of discrete signal sample for n = " + n + " is: " + result);
    }
}