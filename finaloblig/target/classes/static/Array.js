
function bestillBillett(){
    const billett = {
        film : $("#filmliste").val(),
        antall : $("#antallinn").val(),
        fornavn : $("#fornavninn").val(),
        etternavn : $("#etternavninn").val(),
        telefon : $("#tlfinn").val(),
        Epost : $("#Epostinn").val()
    };
    if (!billett.film || !billett.antall || !billett.fornavn || !billett.etternavn || !billett.telefon || !billett.Epost){
        if (!billett.film){
            $("#FilmError").html("Velg Film!");
        } else {
            $("#FilmError").html("");
        }
        if (!billett.antall){
            $("#AntallError").html("Velg Antall!");
        } else {
            $("#AntallError").html("");
        }
        if (!billett.fornavn){
            $("#FornavnError").html("Fyll inn Fornavn!");
        } else {
            $("#FornavnError").html("");
        }
        if (!billett.etternavn){
            $("#EtternavnError").html("Fyll inn Etternavn!");
        } else {
            $("#EtternavnError").html("");
        }
        if (!billett.telefon){
            $("#TelefonError").html("Fyll inn Telefonnummer!");
        } else {
            $("#TelefonError").html("");
        }
        if (!billett.Epost){
            $("#EpostError").html("Fyll inn Epost!");
        }else {
            $("#EpostError").html("");
            }
    }
    $.post("/bestill", billett, function (){
        hentAlleBilletter()
    });
    $("#filmliste").val("");
    $("#antallinn").val("");
    $("#fornavninn").val("");
    $("#etternavninn").val("");
    $("#tlfinn").val("");
    $("#Epostinn").val("");
}
    function hentAlleBilletter(){
        $.get("/hent", function (data){
            formaterBilletter(data);
        });
    }

    function formaterBilletter(billetter){
        let ut= "<table><tr><th>Film</th><th>Antall</th><th>Fornavn</th>" +
            "<th>Etternavn</th><th>Telefon</th><th>Epost</th></tr>";
        for (const billett of billetter){
            ut += "<tr><td>"+billett.film+ "</td><td>"+billett.antall+"</td><td>"
                +billett.fornavn+ "</td><td>"+billett.etternavn+ "</td><td>"
                +billett.telefon+ "</td><td>"+billett.Epost+ "</td></tr>";
        }
        ut += "</table>";
        $("#billettTabell").html(ut);
    }

    function slettAllebilletter(){
        $.get("/slett", function (){
            hentAlleBilletter();
        });
    }

