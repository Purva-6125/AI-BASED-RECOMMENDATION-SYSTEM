# AI-BASED-RECOMMENDATION-SYSTEM

**COMPANY** : CODTECH IT SOLUTION

**NAME** : PURVA KISHOR BAKARE

**INTERN ID** : CT08GOM

**DOMAIN** : JAVA PROGRAMMING

**BATCH DURATION** : JANUARY 5th, 2025 to FEBRUVARY 5th, 2025

**MENTOR NAME** : NEELA SANTOSH

**DESCRIPTION OF TASK** : Recommendation systems have become an integral part of various industries, including e-commerce, entertainment, and social media platforms. They help users discover new products, movies, or music based on their interests. Apache Mahout is a powerful machine learning library that enables the development of scalable recommendation engines. In this project, we implemented a user-based collaborative filtering recommendation system using Mahout.

Tools and Libraries Used
Apache Mahout: A scalable machine learning library for building recommendation engines.
Java: The programming language used for implementation.
FileDataModel: A class from Mahout used to load rating data from a CSV file.
PearsonCorrelationSimilarity: A similarity metric to compute user similarity based on Pearson correlation.
NearestNUserNeighborhood: A method to find the nearest neighbors based on similarity.
GenericUserBasedRecommender: The core recommendation engine using user-based collaborative filtering.
Notepad: Used for writing and executing Java code.
Dataset (ratings.csv): A structured file containing user-item ratings data.

Implementation Steps
1. Loading the Dataset
The program first loads a CSV file (ratings.csv) that contains user ratings for different products. The dataset is structured as follows:
UserID, ProductID, Rating
1, 101, 4.5
1, 102, 3.0
2, 101, 5.0
3, 103, 4.0
Each row represents a user’s rating for a particular product. This data is read using the FileDataModel class in Mahout.

2. Computing User Similarity
The program calculates user similarity using the PearsonCorrelationSimilarity metric. This method compares users’ rating patterns and determines how similar they are. The Pearson correlation coefficient ranges from -1 to 1, where:
1 means the users have identical preferences.
0 means no correlation.
-1 means opposite preferences.
   
3. Finding the Nearest Neighbors
The program selects the top N most similar users using NearestNUserNeighborhood. Here, N is set to 2, meaning that for each user, the system identifies two other users with the most similar preferences.

4. Generating Recommendations
The GenericUserBasedRecommender class is used to generate recommendations based on similar users. The program predicts ratings for items that a user hasn’t rated yet by analyzing the ratings of similar users.
For example, if User 1 has rated Product 101 and 102, and User 2 has rated Product 101 and 103, the system might recommend Product 103 to User 1 based on User 2’s preferences.

5. Displaying the Recommendations
The program provides recommendations for a given user. The output displays recommended product IDs along with their recommendation scores.

Resources Used :
Apache Mahout Documentation: Official guides and API references.
Online Tutorials: Articles and video tutorials on collaborative filtering.
Machine Learning Textbooks: Books explaining recommendation algorithms in depth.

How the Output is Generated
The output is generated in multiple steps:
Loading user-item interactions from the CSV file.
Computing similarity scores between users.
Selecting similar users using nearest-neighbor search.
Predicting missing ratings for each user based on similar users’ preferences.
Sorting recommendations and displaying the top N items.

This project demonstrates how to build a simple user-based collaborative filtering system using Apache Mahout. By utilizing Pearson correlation and nearest-neighbor search, we can effectively recommend items to users based on shared interests. This type of recommendation system can be expanded further by incorporating item-based filtering, hybrid approaches, or deep learning techniques for better accuracy.

**OUTPUT OF THE TASK** : 

Example output:

Top recommendations for User 1:
ProductId: 103, Recommendation Value: 4.2
ProductId: 105, Recommendation Value: 3.9

Top recommendations for User 3:
ProductId: 101, Recommendation Value: 4.7
ProductId: 102, Recommendation Value: 4.0
