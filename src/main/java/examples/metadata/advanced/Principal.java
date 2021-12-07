package examples.metadata.advanced;

import net.sf.esfinge.metadata.AnnotationReader;

public class Principal {
    public static void main(String[] args) throws Exception {
        AnnotationReader reader = new AnnotationReader();
        PublicClassContainer container = reader.readingAnnotationsTo(ExampleClass.class,PublicClassContainer.class);

        for(PublicFieldContainer fc : container.getFieldContainer()) {
            System.out.println(fc.getName()+ " - "+fc.isInPublic());
        }
    }
}
