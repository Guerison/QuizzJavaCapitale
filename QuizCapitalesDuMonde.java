import java.util.Scanner;

public class QuizCapitalesDuMonde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[][] questions = {
            {"1. Quelle est la capitale de la France?", "a) Paris", "b) Londres", "c) Rome", "d) Madrid", "a"},
            {"2. Quelle est la capitale de l'Allemagne?", "a) Berlin", "b) Vienne", "c) Amsterdam", "d) Budapest", "a"},
            // Ajoutez les questions supplémentaires ici
        };

        System.out.println("Bienvenue au quiz sur les capitales du monde!");

        System.out.print("Combien de questions souhaitez-vous répondre (maximum 25) ? ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la ligne en trop

        if (numQuestions < 1 || numQuestions > 25) {
            System.out.println("Nombre de questions non valide. Le quiz se terminera après 25 questions.");
            numQuestions = 25;
        }

        for (int i = 0; i < numQuestions; i++) {
            String[] question = questions[i % questions.length];
            System.out.println(question[0]);
            for (int j = 1; j < question.length - 1; j++) {
                System.out.println(question[j]);
            }

            System.out.print("Votre réponse (a, b, c ou d) : ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals(question[question.length - 1])) {
                System.out.println("Bonne réponse!");
                score++;
            } else {
                System.out.println("Mauvaise réponse. La réponse correcte était " + question[question.length - 1]);
            }

            System.out.println();
        }

        System.out.println("Votre score final est de " + score + "/" + numQuestions + ". Merci d'avoir participé!");
    }
}
