package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Collections;
import java.util.List;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class QuoteCarouselModel {

    @ChildResource
    private List<QuoteItem> quoteItems;

    public List<QuoteItem> getQuoteItems() {
        return quoteItems != null ? quoteItems : Collections.emptyList();
    }

    @Model(
            adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public static class QuoteItem {

        @ValueMapValue
        private String quoteText;

        @ValueMapValue
        private String author;

        @ValueMapValue
        private String designation;

        public String getQuoteText() {
            return quoteText;
        }

        public String getAuthor() {
            return author;
        }

        public String getDesignation() {
            return designation;
        }
    }
}
