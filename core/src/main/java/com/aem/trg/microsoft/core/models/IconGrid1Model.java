package com.aem.trg.microsoft.core.models;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class IconGrid1Model {

    @ValueMapValue
    private String sectionTitle;

    @ValueMapValue
    @Inject
    private String sectionDescription;

    @ChildResource(name = "learnMoreItems")
    private List<LearnMoreItem> learnMoreItems;

    public String getSectionTitle() {
        return sectionTitle;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public List<LearnMoreItem> getLearnMoreItems() {
        return learnMoreItems;
    }

    @Model(adaptables = Resource.class)
    public static class LearnMoreItem {

        @ValueMapValue(name = "fileReference")
        private String icon;

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String link;

        public String getIcon() {
            return icon;
        }

        public String getTitle() {
            return title;
        }

        public String getLink() {
            return link;
        }
    }
}

