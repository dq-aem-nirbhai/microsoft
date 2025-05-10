package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WindowsComponent {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;


    @ChildResource
    private List<LinkItem> buttons; // this will map the multifield

    public List<LinkItem> getButtons() {
        return buttons;
    }



    public String getTitle() {
        return title;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getText() {
        return text;
    }

}



