package examples.metadata.advanced;

import net.sf.esfinge.metadata.annotation.container.AnnotationReadingConfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@AnnotationReadingConfig(IsPublicProcessor.class)
public @interface IsPublic {
}
