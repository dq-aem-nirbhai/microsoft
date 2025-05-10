package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WindowsPage {

        @ValueMapValue
        private String fileReference;

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String description;

        @ValueMapValue
        private String buttontext;

        @ValueMapValue
        private String buttonlink;


    public String getFileReference() {
        return fileReference;
    }

        public String getTitle() {
            return title;
        }


        public String getDescription() {
            return description;
        }

        public String getButtontext() {
            return buttontext;
        }

        public String getButtonlink() {
            return buttonlink;
        }

    }