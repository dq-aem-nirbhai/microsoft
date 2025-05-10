package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SystemRequirement {
    @ValueMapValue
    private String title;
    @ValueMapValue
    private String linkText;
    @ValueMapValue
    private String link;
    @ChildResource
    List<Reuirements> listofitems;

    public String getTitle() {
        return title;
    }

    public String getLinkText() {
        return linkText;
    }

    public String getLink() {
        return link;
    }

    public List<Reuirements> getListofitems() {
        return listofitems;
    }

    @Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class Reuirements{
        @ValueMapValue
        private String fileReference;
        @ValueMapValue
        private String title;
        @ValueMapValue
        private String text;

        public String getFileReference() {
            return fileReference;
        }

        public String getTitle() {
            return title;
        }

        public String getText() {
            return text;
        }
    }
}
