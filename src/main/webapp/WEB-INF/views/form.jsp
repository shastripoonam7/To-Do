<!DOCTYPE html>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
    <h2>Enter Task Details</h2>
    <form action="/submitDetails" method="post">
        <label for="name">Task Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">Task Descriptor:</label>
        <input type="text" id="description" name="description" required><br><br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>
