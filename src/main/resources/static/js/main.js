// JavaScript Document
$(document).ready(function() {
	$('.dept-pages .dept-pages-list li:nth-child(1) a').tooltip({
		title: "TRAINING SHIP RAHAMAN Please click on this Logo to know more about Pre Sea and Post Sea Courses", 
		placement: "left"
	}); 
	$('.dept-pages .dept-pages-list li:nth-child(2) a').tooltip({
		title: "RAHAMAN COLLEGE OF ADVANCED  MARITIME STUDIES & RESEARCH Please click on this logo to know more about Engineering, Fire Fighting, and Engineering Modular Courses", 
		placement: "left"
	}); 
	$('.dept-pages .dept-pages-list li:nth-child(3) a').tooltip({
		title: "ABDUL RASHID ACADEMY OF CULINARY ARTS & MARITIME HOSPITALITY Please click on this logo to know more about  Maritime Hospitality Studies, Maritime Catering and Culinary Arts", 
		placement: "left"
	}); 
	$('.dept-pages .dept-pages-list li:nth-child(4) a').tooltip({
		title: "LKM School", 
		placement: "left"
	});

 	$('form.search span').click(function(){
                $('form.search').toggleClass('search-expand');
                $('.search-input').focus();
            });
		  window.onclick = function(event) {
		  	var valuee = $('.search-input').val();
  if (!event.target.matches('form.search span, .search-input')) {
      if (valuee != "") {
      	$('form.search').addClass('search-expand');
      }
      else
      {
      	$('form.search').removeClass('search-expand');
      }
    }
  }

	/*mbl-toggle*/	
	$('.menu-click').click(function(){
		$('.mbl-menu').addClass('active');
	});
	$('.close-menu').click(function(){
		$('.mbl-menu').removeClass('active');
	});


	if ($(window).width() < 750) {

	   $('.menu-wrapper').css({

		  height: 'auto',

	   });

	}

	 $(".banner-pattern, .banner-home .fullscreen-bg, .banner-home .carousel-inner .item, .menu-wrapper, #mp-menu").css({

			'height' : $(window).height()

	}); 
	$('.banner-home').height($(window).height() - 113);

	document.addEventListener("touchstart", function(){}, true);

	

	$('.other-menu').click(function (){

		$('.menu-wrapper').slideDown('fast');

	});

	$('.close-button').click(function (){

		$('.menu-wrapper').slideUp('fast');

	});	

	$('.mouse-down a').click( function(){

		$('html, body').animate({

			scrollTop: ($(document).height(), 1000)

		}); return false
	}); 

	/*Hover*/	

	$('.history-content').hover(function(){

		$(this).find('.history-overlay').css({

			opacity: 1,

			transition: '0.2s all'

		});

	}, function(){

		$('.history-overlay').css({

			opacity: 0

		});

	});
 
	var QueryString = function () {
	  // This function is anonymous, is executed immediately and 
	  // the return value is assigned to QueryString!
	  var query_string = {};
	  var query = window.location.search.substring(1);
	  var vars = query.split("&");
	  for (var i=0;i<vars.length;i++) {
		var pair = vars[i].split("=");
			// If first entry with this name
		if (typeof query_string[pair[0]] === "undefined") {
		  query_string[pair[0]] = decodeURIComponent(pair[1]);
			// If second entry with this name
		} else if (typeof query_string[pair[0]] === "string") {
		  var arr = [ query_string[pair[0]],decodeURIComponent(pair[1]) ];
		  query_string[pair[0]] = arr;
			// If third or later entry with this name
		} else {
		  query_string[pair[0]].push(decodeURIComponent(pair[1]));
		}
	  } 
		return query_string;
	}();	

	//console.log(QueryString.car)	
	if (QueryString.tsr == "course") {
		$('.parallelogram-tab.course').addClass('active');
	}

	switch(QueryString.tsrSub) {
		case "tsr-about":
			$(".parallelogram-tab").eq(0).find("a").click();
		break;
		case "tsr-alumni":
			$(".parallelogram-tab").eq(1).find("a").click();
		break;
		case "tsr-member":
			$(".parallelogram-tab").eq(2).find("a").click();
		break;     
		default:
		//default code block
	}
	switch(QueryString.rcamsarSub) {
		case "rcamsar-about":
			$(".parallelogram-tab").eq(0).find("a").click();
		break;
		case "rcamsar-alumni":
			$(".parallelogram-tab").eq(1).find("a").click();
		break;
		case "rcamsar-member":
			$(".parallelogram-tab").eq(2).find("a").click();
		break;     
		default:
		//default code block
	}
	switch(QueryString.aracahSub) {
		case "aracah-about":
			$(".parallelogram-tab").eq(0).find("a").click();
		break;
		case "aracah-alumni":
			$(".parallelogram-tab").eq(1).find("a").click();
		break;
		case "aracah-member":
			$(".parallelogram-tab").eq(2).find("a").click();
		break;     
		default:
		//default code block
	}

	$('.choose-products-hover').hover(function(){

		$(this).find('.choose-overlay, .choose-overlay-arrow, .choose-overlay-arrow-right, .choose-overlay-arrow:after, .choose-overlay-arrow-right:after').css({

			opacity: 1,

			transition: '0.2s all'

		});

		$(this).find('.choose-tsr .about-choose1 .choose-products-brown .product-content .tri-arrow:after, .choose-tsr .about-choose2 .choose-products-brown .product-content .tri-arrow:after, .choose-tsr .about-choose3 .choose-products-brown .product-content .tri-arrow:after, .choose-tsr .about-choose1 .choose-products-blue .product-content .tri-arrow:after, .choose-tsr .about-choose2 .choose-products-blue .product-content .tri-arrow:after, .choose-tsr .about-choose3 .choose-products-blue .product-content .tri-arrow:after, .choose-tsr .about-choose2 .choose-musem .product-content .tri-arrow:after, .choose-tsr .about-choose3 .choose-musem .product-content .tri-arrow:after, .choose-tsr .about-choose2 .choose-faculity .product-content .tri-arrow:after, .choose-tsr .about-choose3 .choose-faculity .product-content .tri-arrow:after').css({

			opacity: 1,

			transition: '0s all'

		});

	}, function(){

		$('.choose-overlay, .choose-overlay-arrow, .choose-overlay-arrow-right').css({

			opacity: 0

		});

	});	

	$('.course-1, .catering-gallery-group li').hover(function(){

		$(this).find('.course-overlay').css({

			opacity: 0.9,

			transition: '0.2s all'			

		});

	}, function(){

		$('.course-overlay').css({

			opacity: 0

		});

	});

	$('.gallery').hover(function(){

		$(this).find('.course-overlay').css({

			opacity: 0.9,

			transition: '0.2s all'					

		});

	}, function(){

		$('.course-overlay').css({

			opacity: 0

		});

	});	

	/*Menu Hover*/

	$('header .left-menu p a, header .right-menu p a').hover(function(){

		$(this).css({color: '#940202'});

		$(this).find('span').css({color: '#003e64'})

	}, function(){

		$(this).css({color: '#7e5e2d'});

		$(this).find('span').css({color: '#929292'})

	})

	/*PopuP*/
	$('.facility-click-1').click(function (){
		$('.pop-facility-warp1').css({
			display: 'block'
		})		
	});
	$('.facility-click-2').click(function (){
		$('.pop-facility-warp2').css({
			display: 'block'
		})		
	});
	$('.facility-click-3').click(function (){
		$('.pop-facility-warp3').css({
			display: 'block'
		})		
	});
	$('.facility-click-4').click(function (){
		$('.pop-facility-warp4').css({
			display: 'block'
		})		
	});
	$('.facility-click-5').click(function (){
		$('.pop-facility-warp5').css({
			display: 'block'
		})		
	});
	$('.facility-click-6').click(function (){
		$('.pop-facility-warp6').css({
			display: 'block'
		})		
	});
	$('.facility-click-7').click(function (){
		$('.pop-facility-warp7').css({
			display: 'block'
		})		
	});
	$('.facility-click-8').click(function (){
		$('.pop-facility-warp8').css({
			display: 'block'
		})		
	});
	$('.news-click-1').click(function (){
		$('.pop-warp-news-1').css({
			display: 'block'
		})		
	});
	$('.news-click-2').click(function (){
		$('.pop-warp-news-2').css({
			display: 'block'
		})		
	});
	$('.news-click-3').click(function (){
		$('.pop-warp-news-3').css({
			display: 'block'
		})		
	});
	$('.news-click-4').click(function (){
		$('.pop-warp-news-4').css({
			display: 'block'
		})		
	});
	$('.news-click-5').click(function (){
		$('.pop-warp-news-5').css({
			display: 'block'
		})		
	});
	$('.news-click-6').click(function (){
		$('.pop-warp-news-6').css({
			display: 'block'
		})		
	});
	$('.eve-click-1').click(function (){
		$('.pop-warp-events-1').css({
			display: 'block'
		})		
	});
	$('.eve-click-2').click(function (){
		$('.pop-warp-events-2').css({
			display: 'block'
		})		
	});
	$('.not-click-pop').click(function (){
		$('.pop-not-click').css({
			display: 'block'
		})		
	});
	$('.eve-click-3').click(function (){
		$('.pop-warp-events-3').css({
			display: 'block'
		});		
	});
	$('.eve-click-4').click(function (){
		$('.pop-warp-events-4').css({
			display: 'block'
		});		
	});
	$(".pop-warp1, .pop-warp2, .pop-warp3, .pop-warp4, .pop-warp5, .pop-warp6, .pop-close, .pop-facility-warp1, .pop-facility-warp2, .pop-facility-warp3, .pop-facility-warp4, .pop-facility-warp5, .pop-facility-warp6, .pop-facility-warp7, .pop-facility-warp8, .pop-warp-news-1, .pop-warp-news-2, .pop-warp-news-3, .pop-warp-news-4, .pop-warp-news-5, .pop-warp-news-6, .pop-warp-events-1, .pop-warp-events-2, .pop-warp-events-3, .pop-not-click").click(function (){
		$(".pop-warp1, .pop-warp2, .pop-warp3, .pop-warp4, .pop-warp5, .pop-warp6, .pop-facility-warp1, .pop-facility-warp2, .pop-facility-warp3, .pop-facility-warp4, .pop-facility-warp5, .pop-facility-warp6, .pop-facility-warp7, .pop-facility-warp8, .pop-warp-news-1, .pop-warp-news-2, .pop-warp-news-3, .pop-warp-news-4, .pop-warp-news-5, .pop-warp-news-6, .pop-warp-events-1, .pop-warp-events-2, .pop-warp-events-3, .pop-not-click").css({
			display: 'none'
		})
	})	

	/*Search Box*/

	$(".search-icon img, .search-background-skew").hover(function() {

		$('.search-icon img').attr('src', 'images/search_hover.png')

	}, function() {

		$('.search-icon img').attr('src', 'images/search.png')

	})

	$('.search-container .search-icon img, .search-background-skew').click( function() {

		//alert();

		$('.search-box').css({
			width: '230px',
			'border-bottom': '1px solid #fff',
			outline: 'none',
			'box-shadow': 'none',
			padding: '15px',
			cursor: 'text',
			'border-radius': 0,
			background: 'none',
			color: '#fff',
		})

		$('.search-background-skew').css({
			"min-width": '280px',
		})

		$('header .left-menu').css({
			left: '200px',		
		})

		$('#search-submit').css({
			display: 'block',
			border: 'none'
		})			

	});

	$('.banner-home, .banner-inner, .banner-inner-contact, .banner-inner-courses, .inner-contact').click(function() {
		$('.search-box').css({
			width: '25px',
			border: 'none',
			outline: 'none',
			padding: 0,
			'box-shadow': 'none',
			'border-radius': '0',
			background: 'none',
			color: '#fff',
		})

		$('.search-background-skew').css({
			"min-width": '70px',
		})
		$('header .left-menu').css({
			left: '0px',
		})
		$('#search-submit').css({
			display: 'none'
		})

	})

	$(function() {
		$( '#dl-menu' ).dlmenu({
			animationClasses : { classin : 'dl-animate-in-1', classout : 'dl-animate-out-1' }
		});
	});	

	$(function() {
		$( '#dl-trigger' ).dlmenu({
			animationClasses : { classin : 'dl-animate-in-1', classout : 'dl-animate-out-1' }
		});
	});

	//About us 

	/*Ticker banner*/

	(function($){

		$.fn.ticker = function(options) {

			$.fn.ticker.defaults =  {

				controls: false, //show controls, to be implemented

				interval: 3000, //interval to show next item

				effect: "fadeIn", // available effects: fadeIn, slideUp, slideDown

				duration: 400 //duration of the change to the next item

			};

			var o = $.extend({}, $.fn.ticker.defaults, options);

			if (!this.length)

				return;

			return this.each(function() {

				var $ul = $(this),

					$items = $ul.find("li"),

					index = 0,

					paused = false,

					time;

				function start() {

					time = setInterval(function() {

						if (!paused)

							changeItem();

					}, o.interval);

				}

				function changeItem() {

	

					var $current = $items.eq(index);

					index++;

					if (index == $items.length)

						index = 0;

					var $next =  $items.eq(index);

	

					if (o.effect == "fadeIn") {

						$current.fadeOut(function() {

							$next.fadeIn();

						});

					}

					else if (o.effect == "slideUp" || o.effect == "slideDown") {

						var h = $ul.height();

						var d = (o.effect == "slideUp") ? 1 : -1;

						$current.animate({

							top: -h * d + "px"

						}, o.duration, function() { $(this).hide(); });

						$next.css({

							"display": "block",

							"top": h * d + "px"

						});

						$next.animate({

							top: 0

						}, o.duration);

					}

				}

				function bindEvents() {
					$ul.hover(function() {
						paused = true;
					},function() {
						paused = false;
				});
				}

				function init() {
					$items.not(":first").hide();
	    			if (o.effect == "slideUp" || o.effect == "slideDown") {
						$ul.css("position", "relative");
						$items.css("position", "absolute");
					}
					bindEvents();
					start();
				}

				init();
			});
		};

	
	})(jQuery);

	/*End Ticker banner*/



});
 $(window).load(function()
{
(function(a){a.preload=function(){var d=Object.prototype.toString.call(arguments[0])==="[object Array]"?arguments[0]:arguments;
var c=[];var b=d.length;for(;b--;){c.push(a("<img />").attr("src",d[b]));}};})(jQuery); 
$.preload('images/other_menu.png', 'images/other_menu-hover.png' );
 $(".master-preloader").fadeOut("slow");
 if( $('.hide-link').val() === 0 ) 
    {  
     $('.hide-link').parent().fadeOut();
   } 

   if( $('.hide-link').text() == "Courses" ) 
   {  
     $('.hide-link').parent().fadeIn();
   }
 }); 
	
	
/* Social Post*/
$(document).ready(function(){
	 
	$(".post-link.share-article-loop").mouseenter(function() {
    $('.blog-post li a span.share-text').css('opacity','0').css('transition','0.5s');
}).mouseleave(function() {
     $('.blog-post li a span.share-text').css('opacity','1').css('transition','0.5s');
});
	
});