package examples.metadata.fieldmetadata;


import net.sf.esfinge.metadata.annotation.finder.SearchOnEnclosingElements;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@SearchOnEnclosingElements
public @interface ToPrint {
}
