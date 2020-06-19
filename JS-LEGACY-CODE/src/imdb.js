function fetchMovie(imdbId) {
    const request = require("sync-request");

    const response = request('GET', 'http://www.omdbapi.com/?i=' + imdbId + '&apikey=6487ec62');
    const body = response.getBody();
    return body;
}

module.exports = fetchMovie;