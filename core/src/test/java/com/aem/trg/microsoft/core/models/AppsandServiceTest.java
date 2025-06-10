package com.aem.trg.microsoft.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class AppsandServiceTest {

    private final AemContext context = new AemContext();
    private AppsandService appsandService;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(AppsandService.class,LinkItem.class);
        context.load().json("src/test/resources/jsonfiles/appsandservice.json","/content");
    }

    @Test
    void getTitle() {
        context.currentResource("/content");
        appsandService = context.currentResource().adaptTo(AppsandService.class);
        assertNotNull(appsandService);
        assertEquals("Apps and services",appsandService.getTitle());
    }

    @Test
    void getFileReference() {
        context.currentResource("/content");
        appsandService = context.currentResource().adaptTo(AppsandService.class);
        assertNotNull(appsandService);
        assertEquals("/content/dam/image.png",appsandService.getFileReference());
    }

    @Test
    void getText() {
        context.currentResource("/content");
        appsandService = context.currentResource().adaptTo(AppsandService.class);
        assertNotNull(appsandService);
        assertEquals("Create your best work on all your devices—from desktop to web—using the tools you need for home and business.",appsandService.getText());
    }

    @Test
    void getButtons() {
        context.currentResource("/content");
        appsandService = context.currentResource().adaptTo(AppsandService.class);
        assertNotNull(appsandService);
        List<LinkItem> buttons = appsandService.getButtons();
        assertNotNull(buttons);
        assertEquals(4,buttons.size());

        LinkItem item0 = buttons.get(0);
        assertEquals("Personal and family",item0.getText());
        assertEquals("/content/personal-and-family",item0.getLink());

        LinkItem item1 = buttons.get(1);
        assertEquals("Business",item1.getText());
        assertEquals("/content/business",item1.getLink());

        LinkItem item2 = buttons.get(2);
        assertEquals("Enterprise",item2.getText());
        assertEquals("/content/enterprise",item2.getLink());

        LinkItem item3 = buttons.get(3);
        assertEquals("Education",item3.getText());
        assertEquals("/content/education",item3.getLink());
    }

}