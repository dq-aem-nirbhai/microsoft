package com.aem.trg.microsoft.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.jcr.Item;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class Card1Test {

    private final AemContext context = new AemContext();
    private Card1 card1;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(Card1.class, Items.class);
        context.load().json("src/test/resources/jsonfiles/card1.json", "/content");
    }

    @Test
    void getMainLabel() {
        context.currentResource("/content");
        card1 = context.currentResource().adaptTo(Card1.class);
        assertNotNull(card1);
        assertEquals("For business", card1.getMainLabel());
    }

    @Test
    void getLinks() {
        context.currentResource("/content");
       card1 = context.currentResource().adaptTo(Card1.class);
        List<Items> links = card1.getLinks();

        assertNotNull(links);
        assertEquals(2, links.size());

        Items firstItem = links.get(0);
        assertEquals("Surface Pro for Business, Copilot+ PC | Intel", firstItem.getTitle());
        assertEquals("Ultra-versatile and built with Intel® Core™ Ultra processors (Series 2) that power AI experiences to amplify your team’s productivity.", firstItem.getDescription());
        assertEquals("/content/cardA", firstItem.getButtonlink());

        Items secondItem = links.get(1);
       assertEquals("Microsoft 365 Copilot",secondItem.getTitle());
       assertEquals("Save time and focus on the things that matter most with AI in Microsoft 365 for business.", secondItem.getDescription());
       assertEquals("/content/cardB",secondItem.getButtonlink());
    }
}
