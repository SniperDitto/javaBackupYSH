window.onload=function(){
    const toggleBtn=document.querySelector(".navbar_toggleBtn");
    const menu=document.querySelector(".navbar_menu");
    const links=document.querySelector(".navbar_links");
    //toggleBtn.addEventListener("click",()=>{});
    toggleBtn.addEventListener('click',function(){
        menu.classList.toggle('active');
        links.classList.toggle('active');

    });

    const menubtn=document.querySelectorAll(".navbar_menu li>a");
    menubtn.forEach(function(libtn){
        libtn.addEventListener('mouseover',function(){
            menubtn.forEach(function(libtn){
                libtn.parentNode.lastChild.style.display='none';
            });
            libtn.parentNode.lastChild.style.display='block';
        });
    })

}

