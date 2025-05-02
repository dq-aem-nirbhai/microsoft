package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomePageHeader {
    @ValueMapValue
    private String fileReference;
    @ValueMapValue
    private String link;
    @ChildResource
    private List<NavItems> navItems;
    @ValueMapValue
    private String allMicrosoftLinkText;
    @ValueMapValue
    private String allMicrosoftLink;
    @ValueMapValue
    private String searchtitle;
    @ValueMapValue
    private String searchlink;
    @ValueMapValue
    private String searchicon;
    @ValueMapValue
    private String carttitle;
    @ValueMapValue
    private String cartlink;
    @ValueMapValue
    private String carticon;
    @ValueMapValue
    private String signintitle;
    @ValueMapValue
    private String signinlink;
    @ValueMapValue
    private String signinicon;

    public String getFileReference() {
        return fileReference;
    }

    public String getLink() {
        return link;
    }

    public List<NavItems> getNavItems() {
        return navItems;
    }

    public String getAllMicrosoftLinkText() {
        return allMicrosoftLinkText;
    }

    public String getAllMicrosoftLink() {
        return allMicrosoftLink;
    }

    public String getSearchtitle() {
        return searchtitle;
    }

    public String getSearchlink() {
        return searchlink;
    }

    public String getSearchicon() {
        return searchicon;
    }

    public String getCarttitle() {
        return carttitle;
    }

    public String getCartlink() {
        return cartlink;
    }

    public String getCarticon() {
        return carticon;
    }

    public String getSignintitle() {
        return signintitle;
    }

    public String getSigninlink() {
        return signinlink;
    }

    public String getSigninicon() {
        return signinicon;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class NavItems{
        @ValueMapValue
        private String title;
        @ValueMapValue
        private String url;

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }
    }

}
