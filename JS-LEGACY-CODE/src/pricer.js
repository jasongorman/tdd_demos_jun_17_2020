function price(imdbId, fetchMovie) {
    const body = fetchMovie(imdbId);

    const rating = JSON.parse(body).imdbRating;
    const title = JSON.parse(body).Title;

    let base_price = 3.95;

    if (rating >= 7) {
        base_price += 1.0;
    }
    if (rating < 4) {
        base_price -= 1.0;
    }

    return {title: title, price: base_price};

}

module.exports = price;