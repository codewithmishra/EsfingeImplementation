package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.annotation.container.AllFieldsWith;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessMethods;
import net.sf.esfinge.metadata.container.ContainerTarget;

import java.util.List;

@ContainerFor(ContainerTarget.TYPE)
public class ClassContainer {

    @AllFieldsWith(ToPrint.class)
    private List<FieldContainer> fieldMetadata;

    public List<FieldContainer> getFieldMetadata() {
        return fieldMetadata;
    }

    public void setFieldMetadata(List<FieldContainer> fieldMetadata) {
        this.fieldMetadata = fieldMetadata;
    }
}
