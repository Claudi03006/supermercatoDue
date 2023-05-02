$(document).ready(function(){
    $.getJSON("/api/clienti", function(data){
        $.each(data, function(index, value){
            
            $("#clienti").append("<tr><td>"+value.id+"</td><td>"+value.cognome+"</td><td>"+value.email+"</td><td>"+value.indirizzo+"</td><td>"+value.nome+"</td></tr>");
        });
    });
});

$("#btn_aggiungi_cliente").on("click", aggiungi_cliente);

function aggiungi_cliente(){
    const nome = $("#nome").val();
    const cognome =$("#cognome").val();
    const email = $("#email").val();
    const indirizzo =$("#indirizzo").val();
    if(nome.trim().length > 2 && cognome.trim().length > 2 && email.trim().length > 2 && indirizzo.trim().length > 2){
        $.ajax({
            type:"post",
            url:"api/addCliente",
            data:{
                cognome:cognome,
                email:email,
                indirizzo:indirizzo,
                nome:nome
            }
        }).done(function(id){
            alert("cliente inserito con successo");
            $("#clienti").append("<tr><td>"+id+"</td><td>"+cognome+"</td><td>"+email+"</td><td>"+indirizzo+"</td><td>"+nome+"</td></tr>");
        });
    }else{
        alert("i valori inseriti non sono corretti");
    }
}
