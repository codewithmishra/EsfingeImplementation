package examples.metadata.customreader;

import java.lang.annotation.Annotation;

public class ProcessMineAnnotation implements ProcessorAnnotations {
    @Override
    public void processor(Annotation annotation) {

    }

    @Override
    public String printMetadata() {
        return "Annotation Present";
    }
}
