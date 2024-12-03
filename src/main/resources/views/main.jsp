<html>
<head>
    <title>Student Sorting</title>
</head>
<body>
    <h1>Student Sorting and Class Assignment</h1>
    <form action="sortStudents" method="post">
        <label for="names">Enter Student Names (comma-separated):</label><br>
        <textarea name="names" rows="4" cols="50"></textarea><br><br>
        <label for="algorithm">Select Sorting Algorithm:</label>
        <select name="algorithm">
            <option value="Heap Sort">Heap Sort</option>
            <option value="Quick Sort">Quick Sort</option>
            <option value="Merge Sort">Merge Sort</option>
            <option value="Radix Sort">Radix Sort</option>
        </select><br><br>
        <button type="submit">Sort and Assign</button>
    </form>
</body>
</html>
