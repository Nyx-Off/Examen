function calculPourboire(montant, service) {
    const pourboires = {
        "terrible": 0,
        "poor": 0.05,
        "good": 0.1,
        "great": 0.15,
        "excellent": 0.2
    };

    service = service.toLowerCase();

    if (!pourboires.hasOwnProperty(service)) {
        return "Rating not recognised";
    }

    const pourboire = Math.ceil(montant * pourboires[service]);
    return pourboire;
}