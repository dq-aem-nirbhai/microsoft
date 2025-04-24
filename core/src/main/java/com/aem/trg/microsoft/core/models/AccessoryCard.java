package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccessoryCard {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String text1;

    @ValueMapValue
    private String text2;

    @ValueMapValue
    private String link;
    @ValueMapValue
    private String linkTitle;

    public String getLinkTitle(){
        return linkTitle;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getText1() {
        return text1;
    }



    public String getText2() {
        return text2;
    }



    public String getLink() {
        return link;
    }


}