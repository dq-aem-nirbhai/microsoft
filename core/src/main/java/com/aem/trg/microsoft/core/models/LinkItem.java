package com.aem.trg.microsoft.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LinkItem {
    @ValueMapValue
    private String text;

    @ValueMapValue
    private String link;

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }



}

