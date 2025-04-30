document.addEventListener("DOMContentLoaded", function () {
                const searchIcon = document.querySelector(".search-icon");
                const searchBox = document.querySelector(".search-box");
                const navSearchIcons = document.querySelector(".nav-search-icons");
                const menuToggle = document.querySelector(".menu-toggle");
                const clickableElements = document.querySelectorAll(
                    ".header-left a, .nav-items ul li a"
                );

                clickableElements.forEach(function (el) {
                    el.addEventListener("mousedown", function () {
                        clickableElements.forEach((e) => e.classList.remove("outline-dashed"));
                        el.classList.add("outline-dashed");
                    });

                    el.addEventListener("blur", function () {
                        el.classList.remove("outline-dashed");
                    });
                });

                if (searchBox && navSearchIcons) {
                    searchIcon.addEventListener("click", function (e) {
                        e.preventDefault();
                        searchBox.classList.toggle("expanded");
                        navSearchIcons.classList.toggle("search-active");
                        searchBox.focus();
                        menuToggle.style.display = "inline-block";
                    });

                    document.addEventListener("click", function (e) {
                        const isClickInside =
                            searchBox.contains(e.target) || searchIcon.contains(e.target);
                        if (!isClickInside) {
                            searchBox.classList.remove("expanded");
                            navSearchIcons.classList.remove("search-active");
                            menuToggle.style.display = "none";
                        }
                    });
                }

                const spans = document.querySelectorAll(".header-icons span");
                spans.forEach(function (span) {
                    span.addEventListener("click", function () {
                        spans.forEach((s) => s.classList.remove("clicked"));
                        span.classList.add("clicked");
                    });
                });
            });