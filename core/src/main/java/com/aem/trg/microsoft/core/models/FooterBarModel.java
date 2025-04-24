package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.cq.wcm.core.components.models.Component;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterBarModel {

    @ValueMapValue
    private String language;

    public String getLink1() {
        return link1;
    }

    @ValueMapValue
    private String link1;
    @ValueMapValue
    private String privacyChoices;

    public String getLink2() {
        return link2;
    }

    @ValueMapValue
    private String link2;
    @ValueMapValue
    private String consumerHealth;

    public String getFileReference() {
        return fileReference;
    }

    @ValueMapValue
    private String fileReference;


    public String getLink3() {
        return link3;
    }

    @ValueMapValue
    private String link3;

    public String getLanguage() {
        return language;
    }


    public String getPrivacyChoices() {
        return privacyChoices;
    }


    public String getConsumerHealth() {
        return consumerHealth;
    }
    @ChildResource// optional but clearer
    private List<LinkItem> links=new ArrayList<>();

    public List<LinkItem> getLinks() {
        return links;
    }

}

