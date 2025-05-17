package com.aem.trg.microsoft.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Links {

    @ValueMapValue
    private String mainTitle;

    @ValueMapValue
    private String mainText;


    @ValueMapValue
    private String backgroundColor;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @ValueMapValue
    private String backgroundColor1;

    public String getBackgroundColor1() {
        return backgroundColor1;
    }


    public String getMainTitle() {
        return mainTitle;
    }

    public String getMainText() {
        return mainText;
    }




}