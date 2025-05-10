package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PlanningCard {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ChildResource
    List<PlanningCardItems> items;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<PlanningCardItems> getItems() {
        return items;
    }



}
