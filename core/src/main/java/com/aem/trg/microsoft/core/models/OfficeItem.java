package com.aem.trg.microsoft.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OfficeItem {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String buttontext;

    @ValueMapValue
    private String buttonlink;

    @ValueMapValue
    private String buttontext1;

    @ValueMapValue
    private String buttonlink1;

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

    public String getButtonlink() {
        return buttonlink;
    }

    public String getButtontext1() {
        return buttontext1;
    }

    public String getButtonlink1() {
        return buttonlink1;
    }

}


