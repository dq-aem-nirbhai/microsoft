package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WindowsBusiness {

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String link;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }
    @ChildResource
    private List<ReusableComponent> lists;


    public List<ReusableComponent> getLists() {
        return lists;
    }
}
