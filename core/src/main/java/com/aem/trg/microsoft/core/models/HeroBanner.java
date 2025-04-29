package com.aem.trg.microsoft.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        adapters = { HeroBanner.class, ComponentExporter.class },
        resourceType = HeroBanner.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeroBanner implements ComponentExporter {

    public static final String RESOURCE_TYPE = "your-project/components/herobanner"; // Replace with your actual component path

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String linkUrl;

    @ValueMapValue
    private String buttonText;

    public String getFileReference() {
        return fileReference;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public String getButtonText() {
        return buttonText;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
