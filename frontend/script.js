$(document).ready(function() {
    $.ajax({
        url: `http://localhost:8080/api/klijenat`,
        method: 'GET',
        success: function(data) {
            var clientsTableBody = $('#clientsTableBody');
            data.forEach(function(client) {
                clientsTableBody.append('<tr><td>' + client.id + '</td><td>' + client.prezime + '</td></tr>');
            });
        }
    });

    $.ajax({
        url: `http://localhost:8080/api/usluga`,
        method: 'GET',
        success: function(data) {
            var servicesList = $('#servicesList');
            data.forEach(function(service) {
                servicesList.append('<li class="list-group-item">' + service.naziv + ' - ' + service.cena + ' </li>');
            });
        }
    });

    $.ajax({
        url: 'http://localhost:8080/api/termin',
        method: 'GET',
        success: function(data) {
            var appointmentsList = $('#appointmentSelect');
            data.forEach(function(appointment) {
                appointmentsList.append('<option value="' + appointment.datum + ' - ' + appointment.vreme + '">' + appointment.datum + ' - ' + appointment.vreme + '</option>');
            });
        },
    });
    $.ajax({
        url: `http://localhost:8080/api/stilista`,
        method: 'GET',
        success: function(data) {
            var stylistSelect = $('#stylistSelect');
            data.forEach(function(stylist) {
                stylistSelect.append('<option value="' + stylist.id + '">' + stylist.ime + ' - ' + stylist.pozicija + '</option>');
            });
        }
    });

    $(document).ready(function() {
        $.ajax({
            url: `http://localhost:8080/api/stilista`,
            method: 'GET',
            success: function(data) {
                var tableBody = $('#stylistTable tbody');
                tableBody.empty();

                data.forEach(function(stylist) {
                    var row = '<tr>' +
                        '<td>' + stylist.ime + '</td>' +
                        '<td>' + stylist.prezime + '</td>' +
                        '<td>' + stylist.godine + '</td>' +
                        '<td>' + stylist.pozicija + '</td>' +
                        '</tr>';
                    tableBody.append(row);
                });
            }
        });
    });

    fetch(`http://localhost:8080/api/klijenat`)
        .then(response => response.json())
        .then(data => {
            const clientSelect = document.getElementById('clientSelect');
            data.forEach(client => {
                const option = document.createElement('option');
                option.text = client.ime + " " + client.prezime;
                option.value = client.id;
                clientSelect.add(option);
            });
        });

    fetch(`http://localhost:8080/api/usluga`)
        .then(response => response.json())
        .then(data => {
            const serviceSelect = document.getElementById('serviceSelect');
            data.forEach(service => {
                const option = document.createElement('option');
                option.text = service.naziv;
                option.value = service.id;
                option.dataset.cena = service.cena;
                serviceSelect.add(option);
            });
        });
});


$(document).ready(function() {
    $('#makeAppointmentBtn').click(function() {
        // Get selected values
        var clientText = $('#clientSelect option:selected').text();
        var serviceText = $('#serviceSelect option:selected').text();
        var stylistText = $('#stylistSelect option:selected').text();
        var appointmentText = $('#appointmentSelect option:selected').text();
        var servicePrice = $('#serviceSelect option:selected').data('cena'); // Corrected

        window.open('zakazi.html?klijenat=' + clientText + '&usluga=' + serviceText + '&cena=' + servicePrice + '&stilista=' + stylistText + '&termin=' + appointmentText, '_blank');
    });
});