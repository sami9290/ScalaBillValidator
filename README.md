# Simple car damage validator of cars insurer. 

They sell insurances against car damages. If insurance holders have to repair their cars, the 
repair shop's bill is sent to the insurer in order to claim reimbursements. 

Such a claim is then validated by the insurer and deemed either valid or invalid.



validation of all incoming claims results in a lot of costly labour. Therefore, the cars insurer asked us to automatize 
their claims validation process. 



Claims come in as bills consisting of line items. Each line item consists of a textual description and a price of the billed labour or material.


The rules of validation are simple: There is a list of accepted bill line items and for each item, there is a maximum price. 

If as little as 1 Cent on the bill comes from an unaccepted item or if an accepted item has been 
billed with at least 1 Cent more than the accepted maximum price, the whole bill is considered invalid.



## Implement the car damage validator! The cars insurer will send the bills in form
of csv-files where each line has two values in the format description, priceInCent where description is a string and priceInCent an integer value.

In the `src/main/resources/bills`-folder, you'll find example bills. 

## Concept vs reality

Unfortunately, in reality, the example bills provided by the cars insurer do not reflect the full complexity of the problem. In reality,  unclean data, e.g. data not matching the (string,int) format, might reach your validator. Whenever
there is such a problem, the string "error" should be returned.

