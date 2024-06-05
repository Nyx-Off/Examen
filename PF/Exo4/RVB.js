function convertirEnNiveauxDeGris(image) {
    return image.map(ligne => ligne.map(pixel => {
        const moyenne = Math.round((pixel[0] + pixel[1] + pixel[2]) / 3);
        return [moyenne, moyenne, moyenne];
    }));
}

let image = [
    [[123, 231, 12], [56, 43, 124]],
    [[78, 152, 76], [64, 132, 200]]
];

let imageEnNiveauxDeGris = convertirEnNiveauxDeGris(image);
console.log(imageEnNiveauxDeGris);