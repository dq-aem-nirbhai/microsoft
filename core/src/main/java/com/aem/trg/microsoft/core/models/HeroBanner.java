package com.aem.trg.microsoft.core.models;



import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = "microsoft/components/herobanner",  // Change this to your component's resourceType
        adapters = { HeroBanner.class, ComponentExporter.class })
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HeroBanner implements ComponentExporter {

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

    private String imagePath;

    @PostConstruct
    protected void init() {
        if (fileReference != null) {
            imagePath = "/content/dam" + fileReference;  // Assuming the file is stored in DAM (Digital Asset Management)
        }
    }

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

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String getExportedType() {
        return "microsoft/components/herobanner";  // Ensure this matches the resourceType of the dialog
    }
}
