package com.aem.trg.microsoft.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import javax.inject.Inject;




@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ReusableComponent {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String text;



    private String link;
    @Inject
    private String buttonText;

    @Inject
    private String buttonLink;

    @Inject
    private String title;
    @ValueMapValue
    private String description2;

    @ValueMapValue
    private boolean showButton;
    @ValueMapValue
    private String layoutChoice;


    @ValueMapValue
    private String backgroundColor;


    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getLayoutChoice() {
        return layoutChoice;
    }

    public boolean isShowButton() {
        return showButton;
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





    public String getDescription2() {
        return description2;
    }


    public String getTitle() {
        return title;
    }
}
