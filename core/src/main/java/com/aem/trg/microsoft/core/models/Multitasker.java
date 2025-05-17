package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Multitasker {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String maintitle;

    @ValueMapValue
    private String backgroundColor;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @ChildResource(name = "links") // this must match the field name
    private List<CardItems> links;

    public String getFileReference() {
        return fileReference;
    }

    public String getTitle() {
        return title;
    }

    public String getMaintitle() {
        return maintitle;
    }

    public List<CardItems> getLinks() {
        return links;
    }

    public String getDescription() {
        return description;

    }

}