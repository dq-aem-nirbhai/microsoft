package com.aem.trg.microsoft.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WindowCards {

    @ValueMapValue
    private String mainLabel;


    public String getMainLabel() {
        return mainLabel;
    }

    @ChildResource
    private List<OfficeItem> links; // this will map the multifield

    public List<OfficeItem> getLinks() {
        return links;
    }


}