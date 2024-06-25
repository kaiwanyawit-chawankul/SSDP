Story II (Backend)
As a customer of an online shopping platform, I wish to be able to create orders based on my selected items, ensuring that my
shopping experience is both efficient and secure.
Order Placement Success:
Upon selecting products and submitting order information, the system should conduct a basic verification of the order, including but not limited to
stock availability checks and price validation.
If all verifications pass, the system should generate the order, assign a unique order number, and set the order status to "Pending Payment."
The system should then display a message confirming successful order creation, providing details such as the order number and instructions for
the next payment step.
Unpaid Order Check:
Before allowing me to create a new order, the system should check if there are any unpaid orders in my account. If unpaid orders are detected,
the system should prevent me from creating a new order and display an error message, informing me to address these unpaid orders first.
Stock Availability Check:
In the event that the selected products are out of stock, the system should not permit order creation and should inform me of the insufficient
stock.
Price Verification:
If the price of the chosen products changes during the ordering process, the system should notify me and request confirmation whether I wish to
proceed with the order.