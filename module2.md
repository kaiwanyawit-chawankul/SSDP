Homework:Story I
As a customer of an online shopping platform, I wish to view a product listing so that I can
select items that suit my preferences.
Backend, API implementation:
- Parameters include the page number, defaulting to 1, and the number of product entries per page,
defaulting to 15 with a maximum of 30.
- The returned information should include the image URL, product name, price, stock availability, and other
relevant details.
Frontend (optional):
- Display 15 products per page.
- For each product, show the image, product name, price, stock status, and other pertinent information.
- Below the products, provide pagination information to navigate between pages.

Example I
Currently, we are developing a product catalog service that provides detailed
information on all available products through an API;
This API includes functionalities to list all products, view a specific product by
SKU, categorize products, and search for products by keyword;
The results returned by the API are in JSON format;
When searching for a non-existent SKU, it returns a 404 status;
The keyword search functionality employs POST instead of GET;
It is written in Java;
Functional tests are provided for all features, including exceptional cases;
Please write both functional code and test code.