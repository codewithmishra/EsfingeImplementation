package examples.metadata.fieldmetadata;


import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.validator.NeedsToHave;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@SearchInsideAnnotations
@NeedsToHave(ToPrint.class)
@ComMinIntterface
public @interface Prefix {
    String value();
}
