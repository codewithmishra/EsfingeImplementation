package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.AnnotationReader;

public class PrincipalReadFields {

    public static void main(String[] args) throws Exception {

        AnnotationReader reader = new AnnotationReader();
        ClassContainer container = reader.readingAnnotationsTo(ClassComMetadatas.class,ClassContainer.class);

        for(FieldContainer c : container.getFieldMetadata()) {
            System.out.println(c.getName()+" - "+c.getPrefix()+"/"+ c.getSufix()+" - "+c.getInterval());
        }
    }

}
