document.getElementById('goBackBtn').addEventListener('click', function() {
    window.location.href = 'index.html';
});

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
}

var clientId = getUrlParameter('klijenat');
var serviceName = getUrlParameter('usluga');
var servicePrice = getUrlParameter('cena');
var stylistId = getUrlParameter('stilista');
var appointmentId = getUrlParameter('termin');

// Display selected details
var clientDetailsDiv = document.getElementById('clientDetails');
clientDetailsDiv.innerHTML = '<p>Klijenat: ' + clientId + '</p>';

var serviceDetailsDiv = document.getElementById('serviceDetails');
serviceDetailsDiv.innerHTML = '<p>Usluga: ' + serviceName + '</p>' +
    '<p>Cena: ' + servicePrice + '</p>'; // Add cena

var stylistDetailsDiv = document.getElementById('stylistDetails');
stylistDetailsDiv.innerHTML = '<p>Stilista: ' + stylistId + '</p>';

var appointmentDetailsDiv = document.getElementById('appointmentDetails');
appointmentDetailsDiv.innerHTML = '<p>Termin: ' + appointmentId + '</p>';

document.getElementById('printIdsBtn').addEventListener('click', function() {
    function getUrlParameter(name) {
        name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
        var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
        var results = regex.exec(location.search);
        return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
    }

    var clientId = getUrlParameter('klijenat');
    var stylistId = getUrlParameter('stilista');
    var appointmentId = getUrlParameter('termin');

    var message = 'Uspesno ste zakazali termin ' + clientId + '. Vaš stilista je ' + stylistId + ', vidimo se u ' + appointmentId + '!';

    document.getElementById('idsInfo').innerHTML = message;
});