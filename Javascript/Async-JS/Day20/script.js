const cart = [];
const addCartBtn = document.querySelectorAll('.addToCart');
const result = document.querySelector('.product-result');
const totalPrice = document.querySelector('.total-price');

addCartBtn.forEach((btn) => {
    btn.addEventListener('click', (e) => {
        e.preventDefault();
        const parentElem = btn.parentElement;
        const productImage = parentElem.querySelector('.product-image').getAttribute('src');
        const productName = parentElem.querySelector('.product-name').textContent;
        const productPriceKey = parentElem.querySelector('.product-price').textContent;
        const productPrice = parseInt(productPriceKey.replace(/\D/g, ''));

        let product = {
            pImage: productImage,
            pName: productName,
            pPrice: productPrice,
            pQuantity: 1,
        }

        const existing = cart.find(item => item.pName === productName);
        if (existing) {
            existing.pQuantity++;
        } else {
            cart.push(product);
        }

        showCart();
    })
})


showCart();

function showCart() {
    // clear existing results
    result.innerHTML = '';

    // render all items from cart
    cart.forEach(item => {
        const li = document.createElement('li');
        li.innerHTML = `
        <img src="${item.pImage}" style="width:50px;">
        <span>${item.pName}</span>
        <span class="fw-semibold">Qty: ${item.pQuantity}</span>
        <span class="fw-semibold">${item.pPrice} Rs</span>
        `;
        result.appendChild(li);
    })

    // update Cart count - total quantity across items
    let cartItem = document.querySelector('.cart-count');
    const totalItems = cart.reduce((acc, item) => acc + item.pQuantity, 0);
    cartItem.textContent = totalItems;

    // compute total price considering quantity
    let total = cart.reduce((acc, item) => {
        return acc + item.pPrice * item.pQuantity;
    }, 0);
    totalPrice.textContent = total;
}
