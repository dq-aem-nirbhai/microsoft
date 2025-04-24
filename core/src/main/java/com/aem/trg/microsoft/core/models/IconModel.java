package com.aem.trg.microsoft.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class IconModel {

    @ChildResource(name = "cards")
    private List<CardItem> cards;

    public List<CardItem> getCards() {
        return cards;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class CardItem {

        @ValueMapValue(name = "fileReference")
        private String fileReference;

        @ValueMapValue(name = "title")
        private String title;

        @ValueMapValue(name = "link")
        private String link;

        public String getFileReference() {
            return fileReference;
        }

        public String getTitle() {
            return title;
        }

        public String getLink() {
            return link;
        }
    }
}
