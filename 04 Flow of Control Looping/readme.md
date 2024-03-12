# Flow of Control : Looping
## Topics
- Event-Controlled Loops Using while
- Looping Techniques
- Type-Safe Input Using Scanner
- Constructing Loop Conditions
- Testing Techniques for while Loops
- Event-Controlled Loops Using do/while
- Count-Controlled Loops Using for
- Nested Loops

## Types of loops

<img width="640" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/01204a0b-68f7-4bf8-8b62-e7a7f55eb9d7">


### Example: The Grocery Cashier
- A grocery cashier's job is to calculate the total costs of the items in the cart.
- The cashier starts with a total of OMR 0.00.
- The cashier scans an item to get its price and adds the price to the total.
- The cashier scans the next item to get its price and adds the price to the total.
- When there are no more items to scan, the total is complete.

**Notice that the cashier is performing the same operations on each item!**

## Looping
- In computing, we often need to perform the same operations on multiple items.
- Typically, these tasks follow this pattern:
	- initialize values  (set total to 0)
	- process items one at a time (add price to total)
	- report results  (report total)
- The flow of control that programmers use to complete jobs with this pattern is called looping, or repetition.
### The while Loop

- The while loop is designed for repeating a set of operations on data items when we don't know how many data items there will be.
- When we reach the end of the items to process, we will get some signal. (For the grocery cashier, it's the divider bar.)
- The end of data items could be indicated by a special input value called a sentinel value or by reaching the end of a file.
- Receiving the signal is an event; we call this event-controlled looping.
