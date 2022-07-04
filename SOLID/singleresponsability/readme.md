# Single Responsability Principle Demo

The Journal class should only have methods and characteristis that are logic and belong to 'a journal'.

We could think that 'saving' is a method that should be in the Journal class,
but if we think carefuly, it is not a pure responsability that belongs to 'a journal'. So adding
the 'save' method inside the Journal class will break the Single Responsability Principle.

* Do separation of concerns.

* Always be careful and think if  you are adding methods (behaviors, resposabilities) that should not be in that particular class and if you must be doing a separation of concerns and create a separate class.