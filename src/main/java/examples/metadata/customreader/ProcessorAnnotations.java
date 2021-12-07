package examples.metadata.customreader;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

import java.lang.annotation.Annotation;

public interface ProcessorAnnotations {

    @ExecuteProcessor
    public void processor(Annotation annotation);

    public String printMetadata();

}
