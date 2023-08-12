const something = undefined

// truthy = not falsy
// falsy = 0, false, '', [], NaN, undefined, null

// if(something) {
//   console.log('true')
// } else {
//   console.log('false')
// }

const employee = {
  name : 'Pedro',
  job: [
    {
      name: 'Take care of old people',
      type: 'voluntary',
    },
    {
      name: 'Estagio',
      type: 'trainee',
      salary: 0
    }
  ]
}

// operador ou = problema com falsy value
// const salario1 = employee.job[0].salary || 'nao se aplica';
// const salario2 = employee.job[1].salary || 'nao se aplica';

// operador ??
const salario1 = employee.job[0].salary ?? 'nao se aplica';
const salario2 = employee.job[1].salary ?? 'nao se aplica';

console.log(salario1);
console.log(salario2);