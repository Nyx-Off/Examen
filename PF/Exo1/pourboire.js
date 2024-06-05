function calculPourboire(montant, service) {
    var pourcentagePourboire;

    service = service.toLowerCase();

    if (service === "terrible") {
        pourcentagePourboire = 0;
    } else if (service === "poor") {
        pourcentagePourboire = 0.05;
    } else if (service === "good") {
        pourcentagePourboire = 0.1;
    } else if (service === "great") {
        pourcentagePourboire = 0.15;
    } else if (service === "excellent") {
        pourcentagePourboire = 0.2;
    } else {
        return "Rating not recognised";
    }

    var pourboire = Math.ceil(montant * pourcentagePourboire);

    return pourboire;
}