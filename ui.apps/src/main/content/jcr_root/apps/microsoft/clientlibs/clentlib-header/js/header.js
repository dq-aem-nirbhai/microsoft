 document.addEventListener("DOMContentLoaded", function () {
            const navItems = document.querySelectorAll(".nav-item");

            navItems.forEach(item => {
                const dropdown = item.querySelector(".dropdown");
                if (dropdown) {
                    const link = item.querySelector(".nav-link");
                    link.addEventListener("click", function (e) {
                        e.preventDefault();
                        navItems.forEach(i => i.classList.remove("active"));
                        item.classList.toggle("active");
                    });
                }
            });

            document.addEventListener("click", function (e) {
                if (!e.target.closest(".nav-item")) {
                    navItems.forEach(i => i.classList.remove("active"));
                }
            });
        });





