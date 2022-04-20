// document.getElementById("count-el").innerText = 4;
let count = 0;
let countEL = document.getElementById("count-el");
let saveEl = document.getElementById("save-el");
document.getElementById("count-el").innerText = count;
function increment(){
    count ++;
    countEL.textContent = count;
}
function save(){
    let countStr = count + " - ";
    saveEl.textContent += countStr;
    count = 0;
    countEL.textContent  = count;
    
}