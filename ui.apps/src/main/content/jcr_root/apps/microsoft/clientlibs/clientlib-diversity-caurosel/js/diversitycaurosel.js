  document.addEventListener('DOMContentLoaded', function () {
        const items = document.querySelectorAll('.carousel-item-diversity');
        const indicators = document.querySelectorAll('.indicator');
        let currentIndex = 0;

        function showSlide(index) {
            items.forEach((item, i) => {
                item.classList.toggle('active', i === index);
                indicators[i].classList.toggle('active', i === index);
            });
            currentIndex = index;
        }

        document.querySelector('.carousel-control-diversity.next').addEventListener('click', () => {
            const nextIndex = (currentIndex + 1) % items.length;
            showSlide(nextIndex);
        });

        document.querySelector('.carousel-control-diversity.prev').addEventListener('click', () => {
            const prevIndex = (currentIndex - 1 + items.length) % items.length;
            showSlide(prevIndex);
        });

        indicators.forEach((indicator, i) => {
            indicator.addEventListener('click', () => {
                showSlide(i);
            });
        });
    });