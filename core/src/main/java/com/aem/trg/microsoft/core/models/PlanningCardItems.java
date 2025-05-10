package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public  class PlanningCardItems {

        @ValueMapValue
        private String fileReference;

        @ValueMapValue
        private String title1;

        @ValueMapValue
        private String title2;

        @ValueMapValue
        private String buttonText;

        @ValueMapValue
        private String buttonLink;

        @ValueMapValue
        private String linktext;

        @ValueMapValue
        private String link;

        @ChildResource
        List<LinkItem> listoflinks;

        @ValueMapValue
        private String backgroundColor;

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public String getFileReference() {
            return fileReference;
        }

        public String getTitle1() {
            return title1;
        }

        public String getTitle2() {
            return title2;
        }

        public String getButtonText() {
            return buttonText;
        }

        public String getButtonLink() {
            return buttonLink;
        }

        public String getLinktext() {
            return linktext;
        }

        public String getLink() {
            return link;
        }

        public List<LinkItem> getListoflinks() {
            return listoflinks;
        }
}
