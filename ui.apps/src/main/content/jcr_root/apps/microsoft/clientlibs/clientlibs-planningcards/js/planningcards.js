

    document.addEventListener("DOMContentLoaded", function () {
      const homes = document.querySelectorAll(".home");

      homes.forEach((home) => {
        home.addEventListener("click", () => {
          const allContainers = document.querySelectorAll(".cart-container");
          const allHiddenContents = document.querySelectorAll(".hiddenintially");
          const allArrows = document.querySelectorAll(".home .arrow");

          const isExpanded = allContainers[0].classList.contains("expanded");

          if (!isExpanded) {
            // Expand all cards
            allContainers.forEach(container => container.classList.add("expanded"));
            // Hide all hidden content
            allHiddenContents.forEach(content => content.style.display = "none");
            // Show only clicked card's hidden content
            const clickedContainer = home.closest(".cart-container");
            const hiddenContent = clickedContainer.querySelector(".hiddenintially");
            if (hiddenContent) hiddenContent.style.display = "block";

            // Reset all arrows
            allArrows.forEach(arrow => arrow.classList.remove("rotate"));
            // Rotate the clicked one
            const clickedArrow = home.querySelector(".arrow");
            if (clickedArrow) clickedArrow.classList.add("rotate");
          } else {
            // Collapse all cards
            allContainers.forEach(container => container.classList.remove("expanded"));
            allHiddenContents.forEach(content => content.style.display = "none");
            // Remove rotation from all arrows
            allArrows.forEach(arrow => arrow.classList.remove("rotate"));
          }
        });
      });
    });