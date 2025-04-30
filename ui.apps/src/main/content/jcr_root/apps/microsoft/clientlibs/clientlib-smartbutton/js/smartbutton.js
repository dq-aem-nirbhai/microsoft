document.addEventListener('DOMContentLoaded', function () {
let lastScrollTop = 0;
const backToTopButton = document.getElementById('backToTop');
const footer = document.querySelector('footer'); // Assuming you have a <footer> tag

if (!backToTopButton) {
console.error('Back to Top button not found!');
return;
}

window.addEventListener('scroll', function () {
let scrollTop = window.pageYOffset || document.documentElement.scrollTop;
let windowHeight = window.innerHeight;
let footerOffsetTop = footer ? footer.offsetTop : Number.MAX_VALUE; // If footer not found, set very large number

// Show/hide button based on scroll position
if (scrollTop > 300) {
backToTopButton.classList.add('show');
} else {
backToTopButton.classList.remove('show');
}

// Scroll up effect
if (scrollTop > lastScrollTop) {
backToTopButton.classList.remove('scroll-up');
} else {
if (scrollTop < 300) {
backToTopButton.classList.add('scroll-up');
} else {
backToTopButton.classList.remove('scroll-up');
}
}

// Sticky above footer
if ((scrollTop + windowHeight) >= footerOffsetTop) {
backToTopButton.classList.add('near-footer');
} else {
backToTopButton.classList.remove('near-footer');
}

// Update last scroll position
lastScrollTop = scrollTop <= 0 ? 0 : scrollTop;
}, false);

// Smooth scroll to the top when button is clicked
backToTopButton.addEventListener('click', function () {
window.scrollTo({
top: 0,
behavior: 'smooth'
});
});
});
