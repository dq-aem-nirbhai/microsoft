

document.addEventListener("DOMContentLoaded", function () {
        const links = document.querySelectorAll('.sticky-nav-container a.nav-link');

        links.forEach(link => {
            // Add dashed border on mousedown
            link.addEventListener("mousedown", () => {
                links.forEach(l => l.classList.remove("clicked"));
                link.classList.add("clicked");
            });

            // Remove dashed border on mouseup
            link.addEventListener("mouseup", () => {
                link.classList.remove("clicked");
            });

            // Smooth scroll
            link.addEventListener("click", function (e) {
                e.preventDefault();
                const targetId = this.getAttribute("href");
                const target = document.querySelector(targetId);
                const stickyHeight = document.querySelector('.sticky-nav-container').offsetHeight;
                if (target) {
                    const scrollToPosition = target.offsetTop - stickyHeight - 10;
                    window.scrollTo({
                        top: scrollToPosition,
                        behavior: 'smooth'
                    });
                }
            });
        });
    });