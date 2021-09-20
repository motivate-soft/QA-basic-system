package elastic.qa.distilbert;

import elastic.qa.distilbert.models.AnsweredQuestion;

public class Main {

    public static void main(String[] args) {
        String question = "What is the capital city of German?"; // To test
        String[] services = new String[10]; // Initialized, you need to change

        System.out.println("<<<<<<<<<<<<<<<<<<<<< Start >>>>>>>>>>>>>>>>>>>>>>>>\n");

        ElasticQAService elasticQAService = new ElasticQAService("");
        AnsweredQuestion[] results = elasticQAService.answerQuestion(question, services, 10, true);

        System.out.println("\n<<<<<<<<<<<<<<<<<<<<< End >>>>>>>>>>>>>>>>>>>>>>>>\n");
    }
}
