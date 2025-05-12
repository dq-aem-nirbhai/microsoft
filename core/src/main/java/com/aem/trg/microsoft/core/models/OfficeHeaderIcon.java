package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OfficeHeaderIcon {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ChildResource(name = "links")
    private List<Resource> linkItems;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<OfficeHeaderIconItem> getLinks() {
        if (linkItems == null) {
            return Collections.emptyList();
        }

        return linkItems.stream()
                .map(resource -> resource.adaptTo(OfficeHeaderIconItem.class))
                .filter(java.util.Objects::nonNull)
                .collect(Collectors.toList());
    }
}
