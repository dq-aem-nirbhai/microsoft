package com.aem.trg.microsoft.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionWindows {

    @ValueMapValue
    private String title;

    @ChildResource
    private List<QueAnswer> qs;

    public String getDescription() {
        return description;
    }

    @ValueMapValue
    private String description;



    public List<QueAnswer> getQs() {
        return qs;
    }

    public String getTitle() {
        return title;
    }

    @Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class QueAnswer{
        @ValueMapValue
        private String question;

        @ValueMapValue
        private String answer;

        @ValueMapValue
        private String description;

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }

        public String getDescription(){return description;}
    }
}
