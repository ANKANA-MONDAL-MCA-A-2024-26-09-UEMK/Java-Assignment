public class Main3 {
    public static void main(String[] args) {
        ZigzagConverter converter = new ZigzagConverter();

        System.out.println("Example 1 Output: " + converter.convert("PAYPALISHIRING", 3)); // Output: "PAHNAPLSIIGYIR"
        System.out.println("Example 2 Output: " + converter.convert("PAYPALISHIRING", 4)); // Output: "PINALSIGYAHRPI"
        System.out.println("Example 3 Output: " + converter.convert("A", 1));              // Output: "A"
    }
}

class ZigzagConverter {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize each row as a new StringBuilder
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction when reaching top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }
}
