package com.aem.trg.microsoft.core.models;



import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
import java.util.stream.Collectors;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class CustomTab {


    @ChildResource
    private List<NavItem> items;
    public List<TabItem> getTabs() {
        return tabs;
    }
    @ChildResource
    private List<TabItem> tabs;

    public List<NavItem> getItems() {
        return items;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class NavItem {
        @ValueMapValue
         private String label;
        @ValueMapValue
         private String anchorId;


        public String getLabel() {
            return label;
        }

        public String getAnchorId() {
            return anchorId;
        }


    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class TabItem {


        @ValueMapValue
        private  String resourceType;

        @ValueMapValue
       private String id;

        public String getId() {
            return id;
        }

        public String getResourceType() { return "microsoft/components/"+resourceType; }
    }

}
