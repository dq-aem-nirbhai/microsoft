$(document).ready(function(){
    var $carousel = $('.slick-carousel');

    $carousel.slick({
        dots: true,
        arrows: false,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 4000,
        adaptiveHeight: true
    });

    $('.carousel-prev').on('click', function(){
        $carousel.slick('slickPrev');
    });

    $('.carousel-next').on('click', function(){
        $carousel.slick('slickNext');
    });

    var isPaused = false;
    $('.carousel-pause').on('click', function(){
        if (isPaused) {
            $carousel.slick('slickPlay');
            $(this).html('&#10074;&#10074;');
        } else {
            $carousel.slick('slickPause');
            $(this).html('&#9658;');
        }
        isPaused = !isPaused;
    });
});
