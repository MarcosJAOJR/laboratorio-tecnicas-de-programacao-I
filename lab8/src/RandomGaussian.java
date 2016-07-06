import java.util.Random;
import java.io.*;

public final class RandomGaussian {

  public static void main(String... aArgs) throws Exception{
    File f = new File("arquivo.txt");
    OutputStream os = new FileOutputStream(f);
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);

    RandomGaussian gaussian = new RandomGaussian();
    double MEAN = 100.0f;
    double VARIANCE = 5.0f;

    for (int idx = 1; idx <= 10; ++idx){
      bw.write(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE))+"\n");
    }
    bw.close();
  }

  private Random fRandom = new Random();

  private double getGaussian(double aMean, double aVariance){
    return aMean + fRandom.nextGaussian() * aVariance;
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
}
