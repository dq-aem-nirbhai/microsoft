package com.aem.trg.microsoft.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class OfficeTest {
    private final AemContext context = new AemContext();
    private Office office;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(Office.class,Office.DropdownItem.class);
        context.load().json("/jsonfiles/office.json", "/content");
    }

    @Test
    void getTitle() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("Office is now Microsoft 365",office.getTitle());
    }

    @Test
    void getText() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("Find the right plan for you",office.getText());
    }
    @Test
    void getSubtitle() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("Office apps, cloud storage, and more",office.getSubtitle());
    }

    @Test
    void getButtonText() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("Signup for free",office.getButtonText());
    }

    @Test
    void getButtonText1() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("Get Microsoft 365",office.getButtonText1());
    }

    @Test
    void getLinkUrl() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        assertNotNull(office);
        assertEquals("/content/office/get-started",office.getLinkUrl());

    }

    @Test
    void getDropdownItems() {
        context.currentResource("/content");
        office = context.currentResource().adaptTo(Office.class);
        List<Office.DropdownItem> items = office.getDropdownItems();
        assertNotNull(items);
        assertEquals(2,items.size());

        Office.DropdownItem item0 = items.get(0);
        assertEquals("Personal and family", item0.getText1());
        assertEquals("/content/office/personal and family", item0.getLink());

        Office.DropdownItem item1 = items.get(1);
        assertEquals("Business", item1.getText1());
        assertEquals("/content/office/business", item1.getLink());
    }

}