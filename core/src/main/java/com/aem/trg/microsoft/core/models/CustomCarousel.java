package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CustomCarousel {

    @ChildResource
    private List<Slide> slides;

    public List<Slide> getSlides() {
        return slides;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class Slide {

        @ValueMapValue
        private String fileReference;

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String text;

        @ValueMapValue
        private String buttonText;

        @ValueMapValue
        private String buttonLink;

        @ValueMapValue
        private boolean cardLayout;

        public String getFileReference() {
            return fileReference;
        }

        public String getTitle() {
            return title;
        }

        public String getText() {
            return text;
        }

        public String getButtonText() {
            return buttonText;
        }

        public String getButtonLink() {
            return buttonLink;
        }

        public boolean isCardLayout() {
            return cardLayout;
        }
    }
}
