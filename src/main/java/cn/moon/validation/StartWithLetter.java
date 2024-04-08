package cn.moon.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字母开头
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartWithLetterValidator.class)
public @interface StartWithLetter {

    String message() default "{cn.moon.validation.Validators.StartWithLetter.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
