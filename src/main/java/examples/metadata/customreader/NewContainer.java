package examples.metadata.customreader;


import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;

import java.util.List;

@ContainerFor(ContainerTarget.TYPE)
public class NewContainer {

    @CustomReader(type = ProcessorType.READER_IS_PROCESSOR,configAnnotation = ProcessorAnnotation.class)
    private List<ProcessorAnnotations> processors;

    public List<ProcessorAnnotations> getProcessors() {
        return processors;
    }

    public void setProcessors(List<ProcessorAnnotations> processors) {
        this.processors = processors;
    }
}
