document.addEventListener("DOMContentLoaded", function () {
        const buyButton = document.querySelector('.sticky-buy-button');

        // Function to toggle button visibility based on scroll position
        function toggleButtonVisibility() {
            if (window.scrollY > 100) {  // Adjust 100px to your desired scroll threshold
                buyButton.classList.add('visible');
            } else {
                buyButton.classList.remove('visible');
            }
        }

        // Initial check on page load
        toggleButtonVisibility();

        // Listen to the scroll event
        window.addEventListener('scroll', toggleButtonVisibility);

        // Button interaction styles
        buyButton.addEventListener('mousedown', function () {
            buyButton.style.border = '2px dashed #ffffff';
        });

        buyButton.addEventListener('mouseup', function () {
            buyButton.style.border = '2px dashed transparent';
        });

        buyButton.addEventListener('mouseleave', function () {
            buyButton.style.border = '2px dashed transparent';
        });

        buyButton.addEventListener('keydown', function () {
            buyButton.style.border = '2px dashed transparent';
        });
    });