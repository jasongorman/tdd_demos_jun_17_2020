const price = require('./pricer.js');

const rent = (imdbId, fetchMovie) => {
    const movie = price(imdbId, fetchMovie);
    return {id: imdbId, title: movie.title, price: movie.price};
}

module.exports = rent;