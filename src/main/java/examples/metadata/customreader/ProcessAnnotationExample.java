package examples.metadata.customreader;

import net.sf.esfinge.metadata.annotation.container.AnnotationProperty;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.container.ContainerTarget;

import java.lang.annotation.Annotation;


@ContainerFor(ContainerTarget.ALL)
public class ProcessAnnotationExample implements ProcessorAnnotations {

    @AnnotationProperty(annotation = AnnotationExample.class,property = "name")
    private String exampleAnnotation;

    @AnnotationProperty(annotation = AnnotationComplementry.class,property = "value")
    private int complementry;

    public int getComplementry() {
        return complementry;
    }

    public void setComplementry(int complementry) {
        this.complementry = complementry;
    }

    public String getExampleAnnotation() {
        return exampleAnnotation;
    }

    public void setExampleAnnotation(String exampleAnnotation) {
        this.exampleAnnotation = exampleAnnotation;
    }

    @Override
    public void processor(Annotation annotation) {
        exampleAnnotation = ((AnnotationExample)annotation).name();

    }

    @Override
    public String printMetadata() {
        return "Annotatioon Encountered with name "+exampleAnnotation+" - "+complementry;
    }
}
