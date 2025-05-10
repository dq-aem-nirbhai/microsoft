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

public class ReusableComponent implements ComponentExporter {
    protected static final String RESOURCE_TYPE = "microsoft/components/textwithimage";


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


    @ValueMapValue
    private String backgroundColor; // Injecting the backgroundColor field

    public boolean isCustomButtonStyle() {
        return customButtonStyle;
    }


    public String getLayoutChoice() {
        return layoutChoice;
    }

    public boolean isShowButton() {
        return showButton;
    }



    public String getBackgroundColor() {
        /*if (backgroundColor != null && backgroundColor.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")) {
            return backgroundColor;
        }
        return null;*/ // or return a default color
        return backgroundColor;
    }

    public String getTextColorClass() {
        if (backgroundColor == null) {
            return ""; // fallback
        }

        // Normalize to lowercase and remove spaces
        String color = backgroundColor.toLowerCase().trim();

        // Check common values (expand as needed)
        if (color.equals("#000000") || color.equals("black")) {
            return "text-white";
        } else if (color.equals("#ffffff") || color.equals("white")) {
            return "text-black";
        }

        // Optionally, add more logic to check contrast dynamically or return a default
        return "text-black"; // safe default
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

