// SAMUEL ZHANG


public class JavaRefresher {

    /**
     * Determine the Hamming distance between two arrays of ints. 
     * Neither the parameter aData or
     * bData are altered as a result of this method.
     * @param aData != null, aData.length == aData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */    
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) { 
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }

        /*  INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/

        return -1;
    }


    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter aData or 
     * the parameter bData are altered as a result of this method.
     * @param aData != null
     * @param bData != null
     * @return true if aData is a permutation of bData, 
     * false otherwise
     * 
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }

        /*  INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/        

        return true; 
    }


    /**
     * Determine the index of the String that 
     * has the largest number of vowels. 
     * Vowels are defined as 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 
     * 'U', and 'u'.
     * The parameter arrayOfStrings is not altered as a result of this method.
     * pre: arrayOfStrings != null, arrayOfStrings.length > 0, 
     * there is an least 1 non null element in arrayOfStrings.
     * post: return the index of the non-null element in arrayOfStrings that has the 
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero. 
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has 
     * the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0 || !atLeastOneNonNull(arrayOfStrings)) { 
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }

        /*  INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/
        //  You can use all methods from the String class and native arrays.

        return -1;
    }



    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people. 
     * Return the number of pairs of people that share the
     * same birthday.
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday 
     * after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople + 
                    ", numDaysInYear: " + numDaysInYear);
        }

        /*  INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/

        return -1; 
    }


    /**
     * Determine if the chess board represented by board is a safe set up.
     * pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.
     * post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter board is not altered as a result of 
     * this method.
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board) 
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");        
        }

        /*  INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/

        return false; 
    }


    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    //  Put your birthday problem experiment code here:



// HELPER METHODS -- USED TO VALIDATE INPUTS FOR SOME OF THE METHODS
// DO NOT MODIFY UNLESS INSTRUCTED

    /* 
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is 
     * not null, otherwise return false. 
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < arrayOfStrings.length ) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }


    /* 
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < numRows) {
            isSquare = ( mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }


    /* 
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the 
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while(onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }


    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while(correct && row < mat.length) {
            correct = (mat[row] != null) 
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of JavaRefresher can be created
    private JavaRefresher() {

    }
}
