window.onload=function(){
    
    const menuBtns=document.querySelectorAll(".navbar_menu li>a");
    menuBtns.forEach(function(liButton){
        liButton.addEventListener('mouseover',function(){
            
            menuBtns.forEach(function(liButton){
                liButton.parentNode.lastChild.style.display='none';    
            });
            liButton.parentNode.lastChild.style.display='block';
        });
        
    })


}