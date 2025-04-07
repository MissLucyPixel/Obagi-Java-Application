import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] answers = {3, 1, 4, 1, 2}; // Correct answers
        int score = 0;

        String[] questions = {
            "Which gas is considered the primary driver of the current global warming trend?\n1) Oxygen\n2) Nitrogen\n3) Carbon Dioxide\n4) Argon",
            "Some scientists argue that natural factors, such as solar activity, have a greater impact on global temperatures than human activity. True or False?\n1) True\n2) False",
            "The IPCC has concluded that warming of the climate system is unequivocal. What is the level of certainty they assign to human influence on the climate?\n1) Low confidence\n2) Medium confidence\n3) High confidence\n4) Virtually certain",
            "Critics of climate change action often argue that proposed solutions will have a negative impact on which of the following?\n1) Economic growth\n2) Public health\n3) Biodiversity\n4) Ocean acidity",
            "Which of the following is a potential consequence of rising sea levels due to global warming?\n1) Increased agricultural productivity\n2) Displacement of coastal populations\n3) Expansion of polar ice caps\n4) Decreased frequency of extreme weather events"
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (1-4): ");
            int userAnswer = input.nextInt();
            if (userAnswer == answers[i]) {
                score++;
            }
        }

        System.out.println("\nYou scored " + score + " out of 5.");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }

        // Example websites for research (replace with your own):
        System.out.println("\nWebsites for further research:");
        System.out.println("- IPCC: www.ipcc.ch");
        System.out.println("- NASA Climate: climate.nasa.gov");
        System.out.println("- Global Warming Skeptics: Search online for reputable sources");

        input.close();
    }
}