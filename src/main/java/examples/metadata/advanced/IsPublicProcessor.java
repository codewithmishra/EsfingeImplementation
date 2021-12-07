package examples.metadata.advanced;

import net.sf.esfinge.metadata.AnnotationReadingException;
import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.container.AnnotationReadingProcessor;
import net.sf.esfinge.metadata.container.ContainerTarget;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class IsPublicProcessor implements AnnotationReadingProcessor {

    private String property;

    @Override
    public void initAnnotation(Annotation annotation, AnnotatedElement annotatedElement) throws AnnotationValidationException {
        property = ((Field)annotatedElement).getName();
    }

    @Override
    public void read(AnnotatedElement annotatedElement, Object o, ContainerTarget containerTarget) throws AnnotationReadingException {
        int modifiers = ((Field)annotatedElement).getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        try {
            BeanUtils.setProperty(o,property,isPublic);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new AnnotationReadingException(e);
        }

    }
}
