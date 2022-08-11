package com.sparta.dr.start;

import com.sparta.dr.display.DisplayManager;
import com.sparta.dr.exceptions.SorterLoaderException;
import com.sparta.dr.sorters.GenericSorter;

public class Controller {
    private DisplayManager displayManager;
    private int choiceOfSorter;
    private int arrayLength;
    private int[] randArray;
    double start;
    double finish;
    double totalTime;
    public Controller(DisplayManager view){
        displayManager = view;

    }
    public void runController() throws SorterLoaderException {
        choiceOfSorter = displayManager.getSorter();
        GenericSorter chosenSorter = SortFactory.getSorter(choiceOfSorter);
        displayManager.choiceMade(chosenSorter.getName());
        arrayLength = displayManager.getArrayLength();
        randArray = ArrayGenerator.randomArrayGenerator(arrayLength);
        displayManager.arrayBefore(randArray);
        start = SortTimer.timeBeforeSort();
        randArray = chosenSorter.sortArray(randArray);
        finish = SortTimer.timeAfterSort();
        displayManager.arrayAfter(randArray);
        displayManager.timeTaken(SortTimer.getDuration(finish, start));

    }

    //
}
