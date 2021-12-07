package examples.metadata.customreader;

import net.sf.esfinge.metadata.annotation.validator.NeedsToHave;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@NeedsToHave(AnnotationExample.class)
public @interface AnnotationComplementry {
    int value();
}
