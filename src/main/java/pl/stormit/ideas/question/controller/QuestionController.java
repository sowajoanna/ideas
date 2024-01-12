package pl.stormit.ideas.question.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.stormit.ideas.question.domail.model.Question;
import pl.stormit.ideas.question.service.QuestionService;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    List<Question> getQuestions() {
        return questionService.getQuestions();
    }

    @GetMapping("{id}")
    Question getQuestion(@PathVariable UUID id) {
        return questionService.getQuestion(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    Question updateQuestion(@PathVariable UUID id, @RequestBody Question question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteQuestion(@PathVariable UUID id) {
        questionService.deleteQuestion(id);
    }
}
