package com.aem.trg.microsoft.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.*;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StickyHeaderModel  {


    @ValueMapValue

    private String title;

    @ChildResource
    private List<ButtonItem> buttons;

    public String getTitle() {
        return title;
    }

    public List<ButtonItem> getButtons() {
        return buttons;
    }



    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class ButtonItem {
        @ValueMapValue
        private String label;

        @ValueMapValue
        private String url;

        public String getUrl() {
            return url;
        }

        public String getLabel() {
            return label;
        }
    }
}
