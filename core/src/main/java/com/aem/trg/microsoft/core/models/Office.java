package com.aem.trg.microsoft.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Office implements ComponentExporter {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String buttonText;

    @ValueMapValue
    private String buttonText1;

    @ValueMapValue
    private String linkUrl;

    @ChildResource(name = "dropdownitems")
    private Resource dropdownItemsResource;

    // Getter methods for the dialog fields
    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getText() {
        return text;
    }

    public String getButtonText() {
        return buttonText;
    }

    public String getButtonText1() {
        return buttonText1;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    // This method fetches dropdown items from the resource and converts them to DropdownItem objects
    public List<DropdownItem> getDropdownItems() {
        List<DropdownItem> items = new ArrayList<>();
        if (dropdownItemsResource != null) {
            for (Resource item : dropdownItemsResource.getChildren()) {
                items.add(new DropdownItem(item));
            }
        }
        return items;
    }

    // DropdownItem is an inner class representing the items in the dropdown menu
    public static class DropdownItem {
        private final String text1;
        private final String link;

        public DropdownItem(Resource resource) {
            this.text1 = Optional.ofNullable(resource.getValueMap().get("text1", String.class)).orElse("");
            this.link = Optional.ofNullable(resource.getValueMap().get("link", String.class)).orElse("");
        }

        public String getText1() {
            return text1;
        }

        public String getLink() {
            return link;
        }
    }

    // Export the model data as a JSON object for easy consumption by other parts of AEM
    @Override
    public String getExportedType() {
        return "com.aem.trg.microsoft.core.models.Office";
    }
}
