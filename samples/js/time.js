const test = () => console.log('rodei')

// const timeout = setTimeout(test, 2000);
console.log('fora do timout')
// clearTimeout(timeout)

const interval = setInterval(test, 1000)
setTimeout(() => clearInterval(interval), 6000);