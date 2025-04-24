package com.aem.trg.microsoft.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterLinksComponentModel {

    @ValueMapValue
    private String title;

    @ChildResource// optional but clearer
    private List<FooterLinkModel> links=new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public List<FooterLinkModel> getLinks() {
        return links;
    }
}



