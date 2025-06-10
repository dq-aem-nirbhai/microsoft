package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardItems {

    @ValueMapValue
    private String maintitle;

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title1;

    @ValueMapValue
    private String title2;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String backgroundcolor;

    public String getMaintitle(){
        return maintitle;
    }

    public String getFileReference() {
        return fileReference;
    }
    public String getTitle1(){
        return title1;
    }
    public String getTitle2(){
        return title2;
    }
    public String getDescription(){
        return description;
    }
    public String getBackgroundColor(){
        return backgroundcolor;
    }
}
