package examples.metadata.advanced;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.container.ContainerTarget;

import java.util.List;

@ContainerFor(ContainerTarget.TYPE)
public class PublicClassContainer {

    @ProcessFields
    private List<PublicFieldContainer> fieldContainer;

    public List<PublicFieldContainer> getFieldContainer() {
        return fieldContainer;
    }

    public void setFieldContainer(List<PublicFieldContainer> fieldContainer) {
        this.fieldContainer = fieldContainer;
    }
}
