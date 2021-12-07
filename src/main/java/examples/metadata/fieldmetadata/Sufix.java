package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@SearchInsideAnnotations
public @interface Sufix {
    @MaxChars(10)
    String value();
}
