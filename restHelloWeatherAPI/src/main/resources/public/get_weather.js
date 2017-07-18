$(document).ready(function() {
    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?id=498817&APPID=b28f2a6afdcfacf251b19c906a70bcba"
    }).then(function(data) {
       $('.temp-id').append(data.main.temp - 273.15 + " degrees Celsius");
    });
});