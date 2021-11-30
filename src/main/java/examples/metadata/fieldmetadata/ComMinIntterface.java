package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.annotation.validator.ToValidate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@ToValidate(ComMinIntterfaceLogic.class)
public @interface ComMinIntterface {
}
