package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OfficeHeaderIcon {

    @ValueMapValue
    private String sectionTitle;

    @ValueMapValue
    private String sectionText;

    @ValueMapValue
    private String sectionLink;


    public String getSectionTitle() {
        return sectionTitle;
    }

    public String getSectionText() {
        return sectionText;
    }

    public String getSectionLink() {
        return sectionLink;
    }

}
