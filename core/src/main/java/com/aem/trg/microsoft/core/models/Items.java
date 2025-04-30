package com.aem.trg.microsoft.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Items {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String imagelink;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String titlelink;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String descriptionlink;

    @ValueMapValue
    private String buttontext;

    @ValueMapValue
    private String buttonlink;

    public String getTitle() {
        return title;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getDescription() {
        return description;
    }

    public String getButtontext() {
        return buttontext;
    }

    public String getImagelink() {
        return imagelink;
    }

    public String getTitlelink() {
        return titlelink;
    }

    public String getDescriptionlink() {
        return descriptionlink;
    }

    public String getButtonlink() {
        return buttonlink;


    }
}



