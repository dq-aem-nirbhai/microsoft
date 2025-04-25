package com.aem.trg.microsoft.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.wcm.core.components.models.Image;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageTextButton implements ComponentExporter {
    protected static final String RESOURCE_TYPE = "myFirstAemProject/components/textwithimage";

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String text;

    @ChildResource(name = "link")
    private Resource linkResource;

    private String link;
    @Inject
    private String buttonText;

    @Inject
    private String buttonLink;

    @Inject
    private String title;
    @ValueMapValue
    private String description2;
    @PostConstruct
    protected void init() {
        if (linkResource != null) {
            link = linkResource.getValueMap().get("href", String.class);
        }
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }

    public String getButtonText() {
        return buttonText;
    }

    public String getButtonLink() {
        if (buttonLink != null && !buttonLink.startsWith("http")) {
            return "https://" + buttonLink;
        }
        return buttonLink;
    }


    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }


    public String getDescription2() {
        return description2;
    }


    public String getTitle() {
        return title;
    }
}
