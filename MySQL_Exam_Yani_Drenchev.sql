-- 1.Write a SQL query to find the top 3 most expensive products. Display their product name and price. 
select p.productname as ProductName, Round(p.unitPrice, 2) as UnitPrice from products p
order by p.unitPrice desc
limit 3;
-- 2. Write a SQL query to find the top 5 (ordered alphabetically by product name) 
-- products along with their supplier company name. 
select p.productname as ProductName, s.CompanyName as Supplier_company_name from products p
join suppliers s ON s.SupplierID = p.SupplierID
order by p.productName 
limit 5;
-- 3. Write a SQL query to find all managers that have more than 2 employees. 
-- Display their first name and last name. 
select m.FirstName, m.LastName from employees e, employees m
where  e.ReportsTo = m.EmployeeID
group by m.FirstName
having Count( m.employeeID) > 2;
-- 4. Write a SQL query to find the product name, unit price and category name 
-- of the products (ordered by unit price) that have the max unit price in their category 
select a.productName, Round(a.UnitPrice,2), b.CategoryName from products a
	join(select p.CategoryID, MAX(p.UnitPrice) maxPrice, c.CategoryName 
            from products p
            join categories c on c.CategoryID = p.CategoryID
            GROUP BY c.CategoryName
        ) b ON a.CategoryID = b.CategoryID AND
                a.UnitPrice = b.maxPrice
	order by a.UnitPrice 
-- 5. Write a SQL query to display the shipper's company name with minimum orders 
select s.companyName ,min(o.shipVia) as count from orders o
join shippers s ON s.ShipperID = o.ShipVia
group by 


