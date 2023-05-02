$(document).ready(function(){
    $.getJSON("/api/prodotti", function(data){
        $.each(data, function(index, value){
            
        $("#prodotti").append("<tr><td>"+value.id+"</td><td>"+value.nome+"</td><td>"+value.prezzo+"</td></tr>");	
        });
    });
});
$("#btn_aggiungi").on("click",aggiungi_prodotto);
function aggiungi_prodotto(){
    const nome = $("#nome").val();
    const prezzo = parseInt( $("#prezzo").val());
    if(nome.length > 3 && prezzo > 0){
       $.ajax({
        type:"post",
        url:"api/addProdotto",
        data:{
            nome:nome,
            prezzo:prezzo
        }

       }).done(function(id){
        alert("prodotto inserito con successo");
        $("#prodotti").append("<tr><td>"+id+"</td><td>"+nome+"</td><td>"+prezzo+"</td></tr>");	

       });
        
    }else{
        alert("i valori inseriti non sono corretti");
    }

}

