package Collections.Task7;

class Sort
{
    public static void merge(int arr[], int left, int middle, int right)
    {
        int low = middle - left + 1;                    //size of the left subarray
        int high = right - middle;                      //size of the right subarray

        int L[] = new int[low];                             //create the left and right subarray
        int R[] = new int[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++) {                              //copy elements into left subarray
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++) {                             //copy elements into right subarray
            R[j] = arr[middle + 1 + j];
        }


        int k = left;                                           //get starting index for sort
        i = 0;                                             //reset loop variables before performing merge
        j = 0;

        while (i < low && j < high) {                    //merge the left and right subarrays
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low) {                            //merge the remaining elements from the left subarray
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < high) {                         //merge the remaining elements from right subarray
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int arr[], int left, int right) {      //helper function that creates the sub cases for sorting
        int middle;
        if (left < right) {                             //sort only if the left index is lesser than the right index (meaning that sorting is done)
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);                    //left subarray
            mergeSort(arr, middle + 1, right);               //right subarray

            merge(arr, left, middle, right);                //merge the two subarrays
        }
    }

    public static void display(int arr[]) {                //display the array
        for (int i=0; i<arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("==========================================");
    }



    // HEAP SORT ===========================================================================================

    public static void heapSort(int arr[])
    {
        int temp;

        for (int i = arr.length / 2 - 1; i >= 0; i--)                //build the heap
        {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--)                            //extract elements from the heap
        {
            temp = arr[0];                                                  //move current root to end (since it is the largest)
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);                                             //recall heapify to rebuild heap for the remaining elements
        }
    }

    public static void heapify(int arr[], int n, int i)
    {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
        int temp;

        if (left < n && arr[left] > arr[MAX])            //check if the left child of the root is larger than the root
        {
            MAX = left;
        }

        if (right < n && arr[right] > arr[MAX])            //check if the right child of the root is larger than the root
        {
            MAX = right;
        }

        if (MAX != i)
        {                                               //repeat the procedure for finding the largest element in the heap
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }

    //Insertion Sort ================================================================================

    public static void insertionSort(int arr[], int n) { // n - length of array
        if (n <= 1) {                           //passes are done
            return;
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array

        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array

        while (j >= 0 && arr[j] > last) {                //find the correct index of the last element
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }


    //Selection Sort ======================================================================================

    public static void selectionSort(int arr[]) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {                 //find the index of the minimum element
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    //Bubble Sort===========================================================================================

    static void bubbleSort(int arr[], int n)
    {
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
        {
            if (arr[i] > arr[i+1])      //check if the elements are in order
            {                           //if not, swap them
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);           //one pass done, proceed to the next
    }
}
