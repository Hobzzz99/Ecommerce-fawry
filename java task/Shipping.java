public class Shipping 
{
    public static void ship(Shippable[] items) 
    {
        if (items.length == 0) 
        {
            System.out.println("No items to ship.");
            return;
        }
        System.out.println("** Shipment notice **"); // Shipment notice
        double totalWeight = 0;
        String[] processedProductNames = new String[items.length];
        int processedCount = 0;
        for (int i = 0; i < items.length; i++) 
        {
            String currentItemName = items[i].getName();
            boolean alreadyProcessed = false;
            for (int j = 0; j < processedCount; j++) {
                if (processedProductNames[j].equals(currentItemName)) {
                    alreadyProcessed = true;
                    break;
                }
            }
            if (alreadyProcessed) {
                continue;
            }
            int currentProductCount = 0;
            double singleProductWeight = 0;
            for (int k = 0; k < items.length; k++) 
            {
                if (items[k].getName().equals(currentItemName)) 
                {
                    currentProductCount++;
                    singleProductWeight = items[k].getWeight();
                }
            }
            System.out.printf("%dx %s\t%.0fg\n", currentProductCount, currentItemName, singleProductWeight * currentProductCount * 1000);
            totalWeight += singleProductWeight * currentProductCount;
            processedProductNames[processedCount++] = currentItemName;
        }
        System.out.printf("Total package weight %.1fkg\n\n", totalWeight); // Total package weight 1.1kg
    }
}