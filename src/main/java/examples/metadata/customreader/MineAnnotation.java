package examples.metadata.customreader;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ProcessorAnnotation(ProcessMineAnnotation.class)
public @interface MineAnnotation {

}
