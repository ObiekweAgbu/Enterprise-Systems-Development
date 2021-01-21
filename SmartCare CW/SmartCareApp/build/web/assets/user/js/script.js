$(document).ready(function() {
	// sticky navigation
    $('.js-section-info').waypoint(function(direction) {
        if (direction == 'down') {
            $('nav').addClass('sticky');
        }
        else {
            $('nav').removeClass('sticky');
        }
    }, {
    	offset: '80spx;'
    });
    
    $('.js-section-Appointment-Doctor').waypoint(function(direction) {
        if (direction == 'down') {
            $('nav').addClass('sticky');
        }
        else {
            $('nav').removeClass('sticky');
        }
    }, {
    	offset: '80spx;'
    });
    
    // navigation scroll
    $(function() {
    	// Select all links with hashes
		$('a[href*="#"]')
		  // Remove links that don't actually link to anything
		  .not('[href="#"]')
		  .not('[href="#0"]')
		  .click(function(event) {
		    // On-page links
		    if (
		      location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') 
		      && 
		      location.hostname == this.hostname
		    ) {
		      // Figure out element to scroll to
		      var target = $(this.hash);
		      target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
		      // Does a scroll target exist?
		      if (target.length) {
		        // Only prevent default if animation is actually gonna happen
		        event.preventDefault();
		        $('html, body').animate({
		          scrollTop: target.offset().top
		        }, 1000, function() {
		          // Callback after animation
		          // Must change focus!
		          var $target = $(target);
		          $target.focus();
		          if ($target.is(":focus")) { // Checking if the target was focused
		            return false;
		          } else {
		            $target.attr('tabindex','-1'); // Adding tabindex for elements not focusable
		            $target.focus(); // Set focus again
		          };
		        });
		      }
		    }
		  });
    });
    
     $('.mobile-nav-icon1').click(function() {
        let nav = $('.js-side-nav1');
        let icon = $('.js-nav-icon1 ion-icon');
        if(icon.attr('name') == 'menu-outline') {
            icon.attr('name','close-outline');
        }
        else {
            icon.attr('name','menu-outline');
        }
        nav.slideToggle(200);
    });
    
     $('.mobile-nav-icon2').click(function() {
        let nav = $('.js-side-nav2');
        let icon = $('.js-nav-icon2 ion-icon');
        if(icon.attr('name') == 'menu-outline') {
            icon.attr('name','close-outline');
        }
        else {
            icon.attr('name','menu-outline');
        }
        nav.slideToggle(200);
    });
    
     $('.mobile-nav-icon3').click(function() {
        let nav = $('.js-side-nav3');
        let icon = $('.js-nav-icon3 ion-icon');
        if(icon.attr('name') == 'menu-outline') {
            icon.attr('name','close-outline');
        }
        else {
            icon.attr('name','menu-outline');
        }
        nav.slideToggle(200);
    });
    
    
});