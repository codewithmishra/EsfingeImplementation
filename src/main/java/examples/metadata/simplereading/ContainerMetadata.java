package examples.metadata.simplereading;

import net.sf.esfinge.metadata.annotation.container.*;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
public class ContainerMetadata {

    @ReflectionReference
    private Class<?> classe;

    @ElementName
    private String nameClass;

    @ContainsAnnotation(AnnotationExample.class)
    private boolean temAnotacaoExemplo;

    @AnnotationProperty(annotation = AnnotationExample.class, property ="texto")
    private String textAnnotationExample;

    public Class<?> getClasse() {
        return classe;
    }


    public void setClasse(Class<?> classe) {
        this.classe = classe;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getTextAnnotationExample() {
        return textAnnotationExample;
    }

    public void setTextAnnotationExample(String textAnnotationExample) {
        this.textAnnotationExample = textAnnotationExample;
    }

    public boolean isTemAnotacaoExemplo() {
        return temAnotacaoExemplo;
    }

    public void setTemAnotacaoExemplo(boolean temAnotacaoExemplo) {
        this.temAnotacaoExemplo = temAnotacaoExemplo;
    }
}
