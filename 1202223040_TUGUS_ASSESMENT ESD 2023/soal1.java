import java.util.Arrays;

public class soal1{

    public static void main(String[] args) {
        double[] reviews1 = {4.5, 2.0, 1.5, 3.0, 2.5, 4.0, 5.0, 3.5, 2.0, 1.0};
        double[] reviews2 = {5, 4, 2.5, 5, 3.6, 1.1, 3.6, 4, 4.2, 1.5};

        double[] result1 = analisisReview(reviews1);
        double[] result2 = analisisReview(reviews2);

        System.out.println("Output 1: " + Arrays.toString(result1));
        System.out.println("Output 2: " + Arrays.toString(result2));
    }

    public static double[] analisisReview(double[] reviews) {
        if (reviews == null || reviews.length == 0) {
            return new double[]{0, 0, 0};
        }

        double minRating = reviews[0];
        double maxRating = reviews[0];
        double totalRating = reviews[0];

        for (int i = 1; i < reviews.length; i++) {
            double rating = reviews[i];

            if (rating < minRating) {
                minRating = rating;
            }

            if (rating > maxRating) {
                maxRating = rating;
            }

            totalRating += rating;
        }

        double averageRating = totalRating / reviews.length;

        return new double[]{minRating, maxRating, averageRating};
    }
}