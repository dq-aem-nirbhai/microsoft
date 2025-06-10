package com.aem.trg.microsoft.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class CardsTest {

    private final AemContext context = new AemContext();
    private Cards cards;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(Cards.class, Items.class);
        context.load().json("src/test/resources/jsonfiles/cards.json","/content");
    }

    @Test
    void getLinks() {
        context.currentResource("/content");
        cards = context.currentResource().adaptTo(Cards.class);
        List<Items> links = cards.getLinks();

        assertNotNull(links);
        assertEquals(2, links.size());

        Items firstItem = links.get(0);
        assertEquals("Achieve the extraordinary", firstItem.getTitle());
        assertEquals("Microsoft 365 delivers cloud storage, security and Microsoft Copilot in your favourite apps – all in one plan.", firstItem.getDescription());
        assertEquals("/content/link1",firstItem.getButtonlink());

        Items secondItem = links.get(1);
        assertEquals("Copilot is your AI companion",secondItem.getTitle());
        assertEquals("Always by your side, ready to support you whenever and wherever you need it.",secondItem.getDescription());
        assertEquals("/content/link2",secondItem.getButtonlink());
    }
}