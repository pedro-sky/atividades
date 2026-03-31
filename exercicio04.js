function Palindromo(numero) {
    const str = numero.toString();
    const invertido = str.split('').reverse().join('');
    return str === invertido;
}

const numero = prompt("Digite um número:");
console.log(Palindromo(numero)); 