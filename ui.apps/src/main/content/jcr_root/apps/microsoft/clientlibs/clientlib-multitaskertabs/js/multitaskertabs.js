document.addEventListener("DOMContentLoaded", function () {
  const tabButtons = document.querySelectorAll(".microsoft_tab button");
  const tabContents = document.querySelectorAll(".cmp-tabs__tabpanel");

  tabButtons.forEach(button => {
    button.addEventListener("click", () => {
      // Remove active class from all buttons
      tabButtons.forEach(btn => btn.classList.remove("active"));

      // Add active class to clicked button
      button.classList.add("active");

      // Get the ID of the tab to show
      const tabTarget = button.getAttribute("aria-controls");

      // Show the correct tab panel and hide others
      tabContents.forEach(panel => {
        panel.style.display = panel.id === tabTarget ? "block" : "none";
      });
    });
  });

  // Trigger the first tab to be active by default
  if (tabButtons.length > 0) {
    tabButtons[0].click();
  }
});
