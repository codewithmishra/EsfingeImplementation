package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.AnnotationValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

public class ComMinIntterfaceLogic implements AnnotationValidator {

    @Override
    public void initialize(Annotation annotation) {

    }

    @Override
    public void validate(Annotation annotation, AnnotatedElement annotatedElement) throws AnnotationValidationException {
        Class[] interfaces = ((Field)annotatedElement).getDeclaringClass().getInterfaces();

        for(Class interf : interfaces) {
            if(interf == Mininterface.class){
                return;
            }
        }
        throw new AnnotationValidationException("A class not is a Mininterface class");
    }
}
