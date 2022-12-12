package com.ltp.gradesubmission;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.Arrays;

public class ScoreValidator implements ConstraintValidator<Score, String>{

    List<String> scores = Arrays.asList(
        "A+", "A", "A-",
        "B+", "B", "B-",
        "C+", "C", "C-",
        "D+", "D", "D-",
        "F"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return scores.stream().anyMatch(score -> score.equals(value));
    }


    
}
