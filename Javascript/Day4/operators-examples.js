// Concise examples for JavaScript operator categories -- generated for notes

console.log('--- Arithmetic ---');
let a = 5, b = 2;
console.log('a + b =', a + b);
console.log('a - b =', a - b);
console.log('a * b =', a * b);
console.log('a / b =', a / b);
console.log('a % b =', a % b);
console.log('a ** b =', a ** b);
console.log('post-increment a++ =', a++, '(value returned), a now ->', a);
console.log('pre-increment ++a =', ++a);

console.log('\n--- Assignment ---');
let x = 10;
x += 5; // x = 15
console.log('x after x += 5 ->', x);
x *= 2; // x = 30
console.log('x after x *= 2 ->', x);

console.log('\n--- Comparison ---');
console.log("0 == '0' ->", 0 == '0');
console.log("0 === '0' ->", 0 === '0');
console.log('5 > 3 ->', 5 > 3);

console.log('\n--- Logical ---');
console.log('true && false ->', true && false);
console.log('true || false ->', true || false);
console.log('!true ->', !true);

console.log('\n--- Ternary ---');
const sign = (x > 0) ? 'positive' : 'non-positive';
console.log('x (currently', x, ') is', sign);

console.log('\n--- typeof / instanceof / in ---');
console.log("typeof 123 ->", typeof 123);
console.log("typeof 'abc' ->", typeof 'abc');
console.log('[] instanceof Array ->', [] instanceof Array);
const obj = { a: 1 };
console.log("'a' in obj ->", 'a' in obj);
console.log("'toString' in obj ->", 'toString' in obj); // prototype check

console.log('\n--- Unary operators ---');
console.log("+'42' ->", +'42');
console.log("- '10' ->", -'10');
const delObj = { p: 1 };
console.log('before delete delObj.p ->', delObj);
console.log('delete delObj.p ->', delete delObj.p);
console.log('after delete delObj.p ->', delObj);

console.log('\n--- Bitwise ---');
console.log('5 & 1 ->', 5 & 1);
console.log('5 | 1 ->', 5 | 1);
console.log('5 ^ 1 ->', 5 ^ 1);
console.log('~5 ->', ~5);
console.log('5 << 1 ->', 5 << 1);

console.log('\n--- Nullish coalescing and optional chaining ---');
const maybe = null;
console.log('maybe ?? "fallback" ->', maybe ?? 'fallback');
const user = { profile: { name: 'Alex' } };
console.log('user?.profile?.name ->', user?.profile?.name);
console.log('user?.notExist?.prop ->', user?.notExist?.prop);

console.log('\n--- Short-circuit evaluation patterns ---');
function sideEffect() { console.log('sideEffect ran'); return 'done'; }
console.log('false && sideEffect() ->', false && sideEffect());
console.log('true && sideEffect() ->', true && sideEffect());
console.log('0 || "default" ->', 0 || 'default');
console.log('undefined ?? "default" ->', undefined ?? 'default');

console.log('\n--- typeof on undeclared identifier (safe) ---');
// typeof an undeclared identifier returns 'undefined' rather than throwing
console.log('typeof undeclaredVar ->', typeof undeclaredVar);

console.log('\nEnd of operator examples');
