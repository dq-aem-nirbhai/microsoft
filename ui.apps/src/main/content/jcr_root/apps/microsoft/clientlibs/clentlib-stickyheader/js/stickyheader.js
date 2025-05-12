 window.addEventListener('scroll', function () {
      const stickyHeader = document.getElementById('stickyHeader');
      const triggerPoint = 200; // adjust if needed
      if (window.scrollY >= triggerPoint) {
        stickyHeader.classList.add('visible');
      } else {
        stickyHeader.classList.remove('visible');
      }
    });