package com.aem.trg.microsoft.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServiceModel {

    @ValueMapValue
    private String maintitle;

    @ChildResource(name = "links")
    private List<SubtitleItem> links;

    public String getMaintitle() {
        return maintitle;
    }

    public List<SubtitleItem> getLinks() {
        return links;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class SubtitleItem {

        @ValueMapValue
        private String subtitle;

        @ChildResource(name = "linkList")
        private List<LinkItem> linkList;

        public String getSubtitle() {
            return subtitle;
        }

        public List<LinkItem> getLinkList() {
            return linkList;
        }
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class LinkItem {

        @ValueMapValue(name = "label")
        private String label;

        @ValueMapValue(name = "linkPath")
        private String linkPath;

        public String getLabel() {
            return label;
        }

        public String getLinkPath() {
            return linkPath;
        }
    }
}
