package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AppsServiceComponent {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ChildResource(name = "items")
    private List<TextGroup> textGroups;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<TextGroup> getTextGroups() {
        return textGroups;
    }

    public List<TextGroup> getLeftColumnGroups() {
        int mid = (textGroups != null) ? (textGroups.size() + 1) / 2 : 0;
        return (textGroups != null) ? textGroups.subList(0, mid) : null;
    }

    public List<TextGroup> getRightColumnGroups() {
        int mid = (textGroups != null) ? (textGroups.size() + 1) / 2 : 0;
        return (textGroups != null) ? textGroups.subList(mid, textGroups.size()) : null;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class TextGroup {

        @ValueMapValue
        private String text;

        @ChildResource(name = "services")
        private List<ServiceEntry> services;

        public String getText() {
            return text;
        }

        public List<ServiceEntry> getServices() {
            return services;
        }

        @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
        public static class ServiceEntry {

            @ValueMapValue
            private String label;

            @ValueMapValue
            private String link;

            public String getLabel() {
                return label;
            }

            public String getLink() {
                return link;
            }
        }
    }
}
