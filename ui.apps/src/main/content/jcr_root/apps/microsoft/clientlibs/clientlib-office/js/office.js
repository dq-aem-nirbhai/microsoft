function toggleDropdown(button) {
        const dropdown = button.nextElementSibling;
        const arrow = button.querySelector(".arrow");

        const isOpen = dropdown.style.display === "block";

        dropdown.style.display = isOpen ? "none" : "block";
        arrow.style.transform = isOpen ? "rotate(0deg)" : "rotate(180deg)";

        button.classList.toggle("active");
    }