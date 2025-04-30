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
public class IconGridModel {

    @ValueMapValue
    private String sectionTitle;

    @ValueMapValue
    private String sectionText;

    @ValueMapValue
    private String sectionLink;

    @ChildResource(name = "accessorycards")
    private Resource accessoryCardsResource;


    private List<AccessoryCardItem> cards = new ArrayList<>();

    public String getSectionTitle() {
        return sectionTitle;
    }

    public String getSectionText() {
        return sectionText;
    }

    public String getSectionLink() {
        return sectionLink;
    }

    @PostConstruct
    protected void init() {
        if (accessoryCardsResource != null) {
            for (Resource card : accessoryCardsResource.getChildren()) {
                cards.add(card.adaptTo(AccessoryCardItem.class));
            }
        }
    }

    @Model(adaptables = Resource.class)
    public static class AccessoryCardItem {

        @ValueMapValue(name = "title")
        private String title;

        @ValueMapValue(name = "link")
        private String link;

        @ValueMapValue(name = "fileReference")
        private String fileReference;

        public String getTitle() {
            return title;
        }

        public String getLink() {
            return link;
        }

        public String getFileReference() {
            return fileReference;
        }
    }
}

