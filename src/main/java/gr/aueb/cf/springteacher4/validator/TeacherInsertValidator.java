package gr.aueb.cf.springteacher4.validator;

import gr.aueb.cf.springteacher4.dto.TeacherInsertDTO;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Column;

@Component
public class TeacherInsertValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return TeacherInsertDTO.class == clazz;
    }

    @Override
    public void validate(Object target, Errors errors) {
        TeacherInsertDTO teacherInsertDTO = (TeacherInsertDTO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "empty");
        if (teacherInsertDTO.getFirstname().length() < 3 || teacherInsertDTO.getFirstname().length() > 50) {
            errors.rejectValue("firstname", "size");
        }
        if (teacherInsertDTO.getLastname().length() < 3 || teacherInsertDTO.getLastname().length() > 50) {
            errors.rejectValue("lastname", "size");
        }
    }
}
