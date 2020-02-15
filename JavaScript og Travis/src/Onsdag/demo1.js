var boys = ["Peter", "lars", "Ole"];
var girls = ["Janne", "hanne", "Sanne"];
const all = boys.concat(girls);

console.log(all);

// RESULTAT: [ 'Peter', 'lars', 'Ole', 'Janne', 'hanne', 'Sanne' ]

console.log(all.join());

// RESUlTAT: Peter,lars,Ole,Janne,hanne,Sanne

console.log(all.join('-'));

// RESULTAT: Peter-lars-Ole-Janne-hanne-Sanne

const end = all.push("Lone", "Gitte");
console.log(end);
console.log(all);

// RESULTAT: [
//  'Peter', 'lars',
//  'Ole',   'Janne',
//  'hanne', 'Sanne',
//  'Lone',  'Gitte'
//]


const start = all.unshift("Hans", "Kurt");
console.log(start);
console.log(all);

//RESULTAT : [
//  'Hans',  'Kurt',
//  'Peter', 'lars',
//  'Ole',   'Janne',
//  'hanne', 'Sanne',
//  'Lone',  'Gitte'
//]


const first = all.shift();
console.log(first);
console.log(all);
//
////RESULTAT : Hans
//[
//  'Kurt',  'Peter',
//  'lars',  'Ole',
//  'Janne', 'hanne',
//  'Sanne', 'Lone',
//  'Gitte'
//]

const last = all.pop();
console.log(last);
console.log(all);

//Resultat : Gitte
//[
//  'Kurt',  'Peter',
//  'lars',  'Ole',
//  'Janne', 'hanne',
//  'Sanne', 'Lone'
//]

all.reverse();
console.log(all);

//Resultat : [
//  'Lone',  'Sanne',
//  'hanne', 'Janne',
//  'Ole',   'lars',
//  'Peter', 'Kurt'
//]

all.splice(3, 2);
console.log(all);

////Resultat
//[ 'Lone', 'Sanne', 'hanne', 'lars', 'Peter', 'Kurt' ]


for (let i = 0; i < all.length; i++) {
 all[i] = all[i].toUpperCase();
}

console.log(all);

//RESULTAT
//[ 'LONE', 'SANNE', 'HANNE', 'LARS', 'PETER', 'KURT' ]
