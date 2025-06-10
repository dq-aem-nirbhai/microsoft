package com.aem.trg.microsoft.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class OfficeItemTest {

    private final AemContext context = new AemContext();
    private OfficeItem officeItem;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(OfficeItem.class);
        context.load().json("src/test/resources/jsonfiles/officeitems.json", "/content");

    }

    @Test
    void getTitle() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("For home",officeItem.getTitle());
    }

    @Test
    void getFileReference() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("/content/dam/images/sample.jpg", officeItem.getFileReference());
    }

    @Test
    void getDescription() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("Powerful productivity apps for individuals and families..",officeItem.getDescription());
    }

    @Test
    void getButtontext() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("Learn more", officeItem.getButtontext());

    }

   @Test
    void getButtonlink() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("/content/office/learn-more",officeItem.getButtonlink());
    }

    @Test
    void getButtontext1() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("See plans and pricing",officeItem.getButtontext1());
    }

    @Test
    void getButtonlink1() {
        context.currentResource("/content");
        officeItem = context.currentResource().adaptTo(OfficeItem.class);
        assertNotNull(officeItem);
        assertEquals("/content/office/see-plans and pricing",officeItem.getButtonlink1());
    }
}