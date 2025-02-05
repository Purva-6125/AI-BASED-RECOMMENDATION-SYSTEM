import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

public class RecommendationEngine {

    public static void main(String[] args) throws Exception {
        // Load the CSV file containing ratings data
        File file = new File("ratings.csv");
        DataModel model = new FileDataModel(file);

        // Calculate User Similarity using Pearson Correlation
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

        // Define the number of nearest users to consider
        int nearestNeighbors = 2;
        
        // Create a Nearest User Neighborhood
        NearestNUserNeighborhood neighborhood = new NearestNUserNeighborhood(nearestNeighbors, similarity, model);

        // Create a recommender using the user similarity and neighborhood
        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        // Get the top 3 recommendations for user 1
        List<RecommendedItem> recommendations = recommender.recommend(1, 3);

        // Output the recommendations
        System.out.println("Top recommendations for User 1:");
        for (RecommendedItem recommendation : recommendations) {
            System.out.println("ProductId: " + recommendation.getItemID() + ", Recommendation Value: " + recommendation.getValue());
        }

        // Get recommendations for another user, e.g., User 3
        recommendations = recommender.recommend(3, 3);
        System.out.println("\nTop recommendations for User 3:");
        for (RecommendedItem recommendation : recommendations) {
            System.out.println("ProductId: " + recommendation.getItemID() + ", Recommendation Value: " + recommendation.getValue());
        }
    }
}
