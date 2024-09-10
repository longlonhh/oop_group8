public interface Signal {
    void transmit(); // Phương thức truyền tín hiệu
    void receive(); // Phương thức nhận tín hiệu
}

public class DiscreteSignal implements Signal {
    private int[] signalData; // Mảng lưu trữ dữ liệu tín hiệu rời rạc

    public DiscreteSignal(int[] data) {
    this.signalData = data; // Khởi tạo tín hiệu với dữ liệu đầu vào
}

    @Override
    public void transmit() {
        System.out.println("Transmitting discrete signal...");
        // Thực hiện logic truyền tín hiệu rời rạc
    }

    @Override
    public void receive() {
        System.out.println("Receiving discrete signal...");
        // Thực hiện logic nhận tín hiệu rời rạc
    }

    public void displaySignal() {
        System.out.print("Discrete Signal: ");
        for (int value : signalData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class ContinuousSignal implements Signal {
    private double[] signalData; // Mảng lưu trữ dữ liệu tín hiệu liên tục

    public ContinuousSignal(double[] data) {
    this.signalData = data; // Khởi tạo tín hiệu với dữ liệu đầu vào
}

@Override
public void transmit() {
    System.out.println("Transmitting continuous signal...");
    // Thực hiện logic truyền tín hiệu liên tục
}

@Override
public void receive() {
    System.out.println("Receiving continuous signal...");
    // Thực hiện logic nhận tín hiệu liên tục
}

public void displaySignal() {
    System.out.print("Continuous Signal: ");
    for (double value : signalData) {
        System.out.print(value + " ");
    }
        System.out.println();
    }
}