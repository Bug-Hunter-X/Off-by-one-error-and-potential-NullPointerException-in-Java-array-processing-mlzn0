# Off-by-One Error and Potential NullPointerException in Java

This repository demonstrates a common Java coding error: an off-by-one error in array iteration, coupled with the potential for a `NullPointerException`.  The `bug.java` file contains the erroneous code, while `bugSolution.java` provides the corrected version.

The original code attempts to access an array index that is out of bounds, causing an `ArrayIndexOutOfBoundsException`. Additionally, the code lacks error handling for the scenario where the array is null. The corrected version demonstrates how to avoid these issues using proper loop bounds and null checks.

This example highlights the importance of careful array index management and defensive programming techniques.