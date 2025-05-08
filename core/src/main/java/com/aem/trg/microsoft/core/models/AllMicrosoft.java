package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AllMicrosoft {
    @ChildResource
    private List<LinkItem> links;
    @ChildResource
    private List<SubItems>items;
    @ValueMapValue
    private String sitemap;
    @ValueMapValue
    private String sitemaplink;

    public String getSitemap() {
        return sitemap;
    }

    public String getSitemaplink() {
        return sitemaplink;
    }

    public List<LinkItem> getLinks() {
        return links;
    }

    public List<SubItems> getItems() {
        return items;
    }

    @Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class SubItems{
        @ValueMapValue
        private String title;
        @ChildResource
        private List<LinkItem> listoflinks1;

        public String getTitle() {
            return title;
        }

        public List<LinkItem> getListoflinks1() {
            return listoflinks1;
        }
    }
}
