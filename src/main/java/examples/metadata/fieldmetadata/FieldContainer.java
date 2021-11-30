package examples.metadata.fieldmetadata;


import net.sf.esfinge.metadata.annotation.container.AnnotationProperty;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.FIELDS)
public class FieldContainer {


    @ElementName
    private String name;

    @AnnotationProperty(annotation = Prefix.class,property = "value")
    private String prefix;

    @AnnotationProperty(annotation = Sufix.class,property = "value")
    private String sufix;

    @AnnotationProperty(annotation = InterValue.class,property = "value")
    private int interval;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSufix() {
        return sufix;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
