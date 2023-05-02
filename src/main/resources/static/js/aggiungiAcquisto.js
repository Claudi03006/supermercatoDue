$.getJSON("/api/acquisti", function(data){
  $.each(data, function(index, value){
    $("#acquisti").append("<tr><td>"+value.id+"</td><td>"+value.data+"</td><td>"+value.quantita+"</td></tr>");	
  });
});


$("#btn_aggiungi_acquisto").on("click", aggiungi_acquisto);

function aggiungi_acquisto(){
    const data = $("#data").val();
    const quantita = parseInt($("#quantita").val());
    if(data != null&& quantita > 0){
       $.ajax({
        type: "post",
        url: "api/addAcquisto",
        data: {
            data: data,
            quantita: quantita
        }

       }).done(function(id){
        alert("acquisto inserito con successo");
        $("#acquisti").append("<tr><td>"+id+"</td><td>"+data+"</td><td>"+quantita+"</td></tr>");	

       });
        
    } else {
        alert("i valori inseriti non sono corretti");
    }

}
