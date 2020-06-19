const rent = require('./rental.js');

function fetchStub(imdbId){
    return JSON.stringify({
        imdbRating: "7.0",
        Title: "The Abyss"
    });
}

let args = process.argv.slice(2)

let imdbId = args[0];

console.log(rent(imdbId, fetchStub));

/*
    Example movies:


    tt0096754 - high rated
    tt0060666 - low rated
    tt0317303 - medium rated

 */