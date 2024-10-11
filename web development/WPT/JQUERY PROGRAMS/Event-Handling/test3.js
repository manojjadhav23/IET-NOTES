$('h1').click(function(){
    alert('Click any button, you will get greetings message')
    })
    $('button:first').click(function(){
    alert('Hello Dont Sleep')
    $(this).css('background','yellow')
    })
    $('button:nth-of-type(2)').click(function(){
    alert('Hello Dont Sleep, I will beat you')
    $(this).css('background','orange')
    })
    $('button:last').click(function(){
    alert('Hello Stupid, dont sleep, I will kill you')
    $(this).css('background','red')
    })
    