
function showtext(){
let fname= document.getElementById("fname").value;
let lname= document.getElementById("lname").value;
let dob= document.getElementById("dob").value;
let phone= document.getElementById("phone").value;
let occupation= document.getElementById("occupation").value;
let street= document.getElementById("street").value;
let city= document.getElementById("city").value;
let state= document.getElementById("state").value;
let zipcode= document.getElementById("zipcode").value;
let textString =`Name: ${fname} ${lname} <br>
DOB: ${dob} <br>
Phone: ${phone} <br>
Occupation: ${occupation} <br>
Address: ${street}, ${city}, ${state} - ${zipcode}
`;
let divEl = document.getElementById("showtxt");
console.log(textString);
divEl.innerHTML = textString;
}
