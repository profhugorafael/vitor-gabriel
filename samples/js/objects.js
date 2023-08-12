const users = [
  {
    firstName: 'Joao',
    lastName: 'Pedro',
    age: 21,
    address: {
      street: 'Rua',
      number: '123'
    }
  },
  {
    firstName: 'Pedro',
    lastName: 'Lucas',
    age: 21,
    address: {
      street: 'Rua',
      number: '123'
    }
  },
  {
    firstName: 'Beatriz',
    lastName: 'Maria',
    age: 21,
    address: {
      street: 'Rua',
      number: '123'
    }
  }
];

const sampleUser = {
  firstName: 'Joao',
  lastName: 'Pedro',
  age: 21,
  address: {
    street: 'Rua',
    number: '123'
  },

  job: {
    name: "Developer",
    time: "2 months",
    company: {
      name: "Chat Sbt",
      createdAt: "2023/11/08"
    },

    drinkCoffee(hour) {
      return (hour >= 9 && hour <= 17) ? "drink coffee" : "out of time"
    }
  }  
};

console.log('name' in sampleUser)
console.log('nickname' in sampleUser)

console.log(Object.keys(sampleUser))
console.log(Object.values(sampleUser))

console.log('-----------------------')

users.filter(user => 
  Object
  .values(user)
  .some( value => value === 'Pedro') 
).forEach(user => console.log(user))
  
console.log('-----------------------')

console.log(JSON.stringify(Object.values(sampleUser)))

console.log('-----------------------')

// const companyName = sampleUser.job ? 
//   sampleUser.job.company ?
//     sampleUser.job.company.name 
//     : "Not on a company"
//   : "Not on a company"


// Optional chaining - quando nao ha certeza sobre os atributos

const companyName = sampleUser?.job?.company.name ?? "Not on a company";
const coffeeMessage = sampleUser?.job?.drinkCoffee?.(15) ?? "Coffee is not possible"

console.log(coffeeMessage)
console.log(companyName)


// desestruturacao
const { firstName: nickname, age } = sampleUser; 

// reestruturacao
const profile = { name: nickname, age }

function showProfile({ firstName, lastName, age }){
  console.log("Profile:");
  console.log(`First name: ${firstName}`);
  console.log(`Last name: ${lastName}`);
  console.log(`Name: ${age}`);
  console.log("------------");
}

console.log(nickname)
console.log(age)
console.log(profile)

console.log('-----------------------')

showProfile(sampleUser)

// call stack