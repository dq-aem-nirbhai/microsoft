package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class OfficeHeaderIconItem {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String iconTitle;

    @ValueMapValue
    private String iconLink;

    public String getFileReference() {
        return fileReference;
    }

    public String getIconTitle() {
        return iconTitle;
    }

    public String getIconLink() {
        return iconLink;
    }
}
