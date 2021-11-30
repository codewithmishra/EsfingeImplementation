package examples.metadata.simplereading;

import net.sf.esfinge.metadata.AnnotationReader;

public class Principal {
    public static void main(String[] args) throws Exception {
        AnnotationReader reader = new AnnotationReader();
        ContainerMetadata container = reader.readingAnnotationsTo(ClassAnotation.class,ContainerMetadata.class);

        System.out.println(container.getClasse());
        System.out.println(container.getNameClass());
        System.out.println(container.isTemAnotacaoExemplo());
        System.out.println(container.getTextAnnotationExample());


    }
}
