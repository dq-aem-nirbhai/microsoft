package com.aem.trg.microsoft.core.models;

import java.util.List;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class OfficeFooterIcon {

    @ValueMapValue
    private String Title;



    @ChildResource(name = "learnMoreItems")
    private List<LearnMoreItem> learnMoreItems;

    public String getTitle() {
        return Title;
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