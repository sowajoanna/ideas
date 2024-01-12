package pl.stormit.ideas.question.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import pl.stormit.ideas.question.domail.model.Question;

@Service
public class QuestionService {

    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question("Question1"),
                new Question("Question2"));
    }

    public Question getQuestion(UUID id) {
        return new Question("Question " + id);
    }

    public Question createQuestion(Question question) {
        question.setId(UUID.randomUUID());
        return question;
    }

    public Question updateQuestion(UUID id, Question question) {
        return question;
    }

    public void deleteQuestion(UUID id) {

    }
}
