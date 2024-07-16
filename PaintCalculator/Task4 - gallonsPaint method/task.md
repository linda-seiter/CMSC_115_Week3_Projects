Assume a gallon of paint covers 350 square feet and that the store
only sells paint by the gallon (i.e. no 1/2 gallons available for purchase).

<img src="../../common/images/gallonsPaint_call_graph.png" alt="gallonsPaint method calls roomArea method" >

<br>

| Test Cases                     | Expected Result | Expected Call              |
|--------------------------------|-----------------|----------------------------|
| gallonsPaint(12.0, 15.0, 10.0) | 3               | roomArea(12.0, 15.0, 10.0) |
| gallonsPaint(7.5, 11.5, 8.25)  | 2               | roomArea(7.5, 11.5, 8.25)  |

- Add a new method named `gallonsPaint` to calculate the gallons of paint
  required to paint the ceiling and four walls. The method
  should return the number of gallons **rounded up** to the nearest integer.
  The `gallonsPaint` method should directly call the `roomArea` method to get the square footage of space to paint,
  then calculate the number of gallons needed to cover that area.
    <div class="hint">
    Algorithm:<br>
    (1) Call <code>roomArea</code> method to get the square footage as a double<br>
    (2) Divide the square footage by 350.0 to get the number of gallons as a double<br>
    (3) Call <code>Math.ceil</code> to round the number of gallons up to the nearest double value equivalent to an integer<br>
    (4) Cast the double value returned from <code>Math.ceil</code> as an int<br>
    (5) Return the number of gallons as an int
    
    Feel free to introduce one or more local variables to store intermediate values during the calculation.
    </div>
- Edit `main` to print the result of calling `roomArea` for each test case listed.
- Run the program and confirm the expected result.
- Check your solution to proceed to the next task.





| Method Call                    | Expected |
|--------------------------------|----------|
| gallonsPaint(15.0, 12.0, 10.0) | 3        |
| gallonsPaint(7.5, 11.5, 8.25)  | 2        |

Update the `main` method to calculate and print the area along with the number
of gallons of paint. Format the output as shown in the sample below.

```text
Enter room length, width and height.
15.0 12.0 10.0 
Ceiling area = 180.0
Wall area = 540.0
Room area = 720.0
Gallons of paint = 3
```

Run the program to confirm the expected result is produced.

Check your solution to proceed to the next task.