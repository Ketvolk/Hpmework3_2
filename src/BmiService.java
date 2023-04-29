public class BmiService {
    public int calculate(int mKg, double hMeter) {
        int result = (int) (mKg / (hMeter * hMeter));
        return result;
    }
}
