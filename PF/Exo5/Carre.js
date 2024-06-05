function carreDesChiffres(nombre) {
    let chiffres = nombre.toString().split('');
    let chiffresAuCarre = chiffres.map(chiffre => Math.pow(chiffre, 2));
    let resultat = chiffresAuCarre.join('');
    return Number(resultat);
}

console.log(carreDesChiffres(9119));