async function loadSubscriptions() {
    const response = await fetch('/api/subscriptions');
    const subs = await response.json();
    const list = document.getElementById('aboList');
    list.innerHTML = '';

    subs.forEach(sub => {
        const li = document.createElement('li');
        li.textContent = `${sub.name} - ${sub.price}€ (${sub.billingCycle}) `;

        const btn = document.createElement('button');
        btn.textContent = 'Löschen';
        btn.onclick = () => deleteSubscription(sub.id);

        li.appendChild(btn);
        list.appendChild(li);
    });
}

document.getElementById('aboForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const data = {
        name: document.getElementById('name').value,
        price: parseFloat(document.getElementById('price').value),
        billingCycle: document.getElementById('billingCycle').value,
        startDate: document.getElementById('startDate').value,
        active: document.getElementById('active').checked
    };

    await fetch('/api/subscriptions', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });

    document.getElementById('aboForm').reset();
    loadSubscriptions();
});

async function deleteSubscription(id) {
    await fetch(`/api/subscriptions/${id}`, { method: 'DELETE' });
    loadSubscriptions();
}

// Beim Laden der Seite direkt die Abos abrufen
loadSubscriptions();