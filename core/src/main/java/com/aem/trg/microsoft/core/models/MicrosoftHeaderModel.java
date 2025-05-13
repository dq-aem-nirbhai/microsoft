package com.aem.trg.microsoft.core.models;




import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class MicrosoftHeaderModel {

    @ValueMapValue
    private String fileReference;

    @ValueMapValue
    private String brandText;
    @ValueMapValue
    private String link1;
    @ValueMapValue
    private String title;
    @ValueMapValue
    private String buttontext;

    @ValueMapValue
    private String buttonlink;

    public String getSearchtext() {
        return searchtext;
    }

    public String getSearchlink() {
        return searchlink;
    }

    public String getSignintext() {
        return signintext;
    }

    public String getSigninlink() {
        return signinlink;
    }

    @ValueMapValue
    private String searchtext;
    @ValueMapValue
    private String searchlink;
    @ValueMapValue
    private String signintext;
    @ValueMapValue
    private String signinlink;

    @ValueMapValue
    private String showButton;

    public String getShowButton() {
        return showButton;
    }

    public String getSearchicon() {
        return searchicon;
    }

    @ValueMapValue
    private String searchicon;

    public String getFileReference() {
        return fileReference;
    }



    @ValueMapValue
    private String signinicon;

    public String getSigninicon() {
        return signinicon;
    }

    public String getTitle() {
        return title;
    }

    @ChildResource
    private List<NavItem> navItems;

    @ChildResource
    private List<DropDownItems>linkItems;

    public List<DropDownItems> getLinkItems() {
        return linkItems;
    }

    @ValueMapValue
    private String allMicrosoftLinkText;

    @ValueMapValue
    private String allMicrosoftLinkUrl;

    public String getBrandText() {
        return brandText;
    }

    public List<NavItem> getNavItems() {
        return navItems;
    }

    public String getAllMicrosoftLinkUrl() {
        return allMicrosoftLinkUrl;
    }

    public String getAllMicrosoftLinkText() {
        return allMicrosoftLinkText;
    }

    public String getLink1() {
        return link1;
    }

    public String getButtontext() {
        return buttontext;
    }

    public String getButtonlink() {
        return buttonlink;
    }

    @Model(
            adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public static class NavItem {

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String url;

        @ChildResource
        private List<DropdownItem> dropdownItems;

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public List<DropdownItem> getDropdownItems() {
            return dropdownItems;
        }
    }



    @Model(
            adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public static class DropdownItem {

        @ValueMapValue
        private String label;

        @ValueMapValue
        private String link;

        public String getLabel()
        {
            return label;
        }

        public String getLink() {
            return link;
        }
    }

    @Model(
            adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public static class DropDownItems {

        @ValueMapValue
        private String text;

        @ValueMapValue
        private String path;

        public String getText()
        {
            return text;
        }

        public String getPath() {
            return path;
        }
    }

}
