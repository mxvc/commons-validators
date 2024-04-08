package cn.moon.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 不包含汉字
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartWithLetterValidator.class)
public @interface NotContainsChinese {

    String message() default "{cn.moon.validation.Validators.StartWithLetter.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
