 document.addEventListener("DOMContentLoaded", function () {
     const searchIcon = document.querySelector(".search-icon");
     const searchBox = document.querySelector(".search-box");
     const cancelBtn = document.querySelector(".search-cancel");

     if (searchIcon && searchBox && cancelBtn) {
         searchIcon.addEventListener("click", function () {
             searchBox.classList.add("expanded");
             cancelBtn.classList.add("show");
             searchBox.focus();
         });

         cancelBtn.addEventListener("click", function () {
             searchBox.classList.remove("expanded");
             cancelBtn.classList.remove("show");
             searchBox.value = "";
         });

         document.addEventListener("click", function (e) {
             const isClickInside = searchBox.contains(e.target) ||
                 searchIcon.contains(e.target) ||
                 cancelBtn.contains(e.target);

             if (!isClickInside) {
                 searchBox.classList.remove("expanded");
                 cancelBtn.classList.remove("show");
             }
         });
     }

     // All Microsoft dropdown toggle
     const toggleLink = document.getElementById("toggle-allmicrosoft");
     const allMicrosoftComponent = document.getElementById("allmicrosoft-component");

     if (toggleLink && allMicrosoftComponent) {
         toggleLink.addEventListener("click", function (e) {
             e.stopPropagation(); // prevent document click from hiding it
             const isVisible = allMicrosoftComponent.style.display === "block";
             allMicrosoftComponent.style.display = isVisible ? "none" : "block";
         });

         document.addEventListener("click", function (e) {
             if (!toggleLink.contains(e.target)) {
                 allMicrosoftComponent.style.display = "none";
             }
         });
     }
 });


