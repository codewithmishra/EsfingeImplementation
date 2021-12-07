package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.AnnotationPropertyValidator;
import net.sf.esfinge.metadata.AnnotationValidationException;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class MaxCharsValidator implements AnnotationPropertyValidator {

    private int maxChars;
    @Override
    public void initialize(Annotation annotation) {
        maxChars = ((MaxChars)annotation).value();

    }

    @Override
    public void validate(Annotation annotation, AnnotatedElement annotatedElement, Method method, Object o) throws AnnotationValidationException {
    if(o.toString().length()>maxChars){
        throw new AnnotationValidationException("Value "+o.toString()+" exceeds max character limit "+maxChars);
    }
    }
}
