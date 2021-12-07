package examples.metadata.customreader;

import net.sf.esfinge.metadata.AnnotationReader;

public class PrincipalCustomReader {
    public static void main(String[] args) throws Exception {
        AnnotationReader reader = new AnnotationReader();
        NewContainer container = reader.readingAnnotationsTo(ExampleClassAnnotation.class,NewContainer.class);

        for(ProcessorAnnotations p :container.getProcessors()){
            System.out.println(p.printMetadata());
        }
        System.out.println("Done");
    }
}
