package examples.metadata.fieldmetadata;


import net.sf.esfinge.metadata.annotation.validator.ToValidate;
import net.sf.esfinge.metadata.annotation.validator.ToValidateProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.METHOD)
@ToValidateProperty(MaxCharsValidator.class)
public @interface MaxChars {
    int value();
}
