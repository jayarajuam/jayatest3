package com.kogentix;

import java.util.HashMap;
import java.util.Map;

public class AAFindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "CustomerPlan,CustomerPlanDescription,Event,EventDescription,EventStartDate,EventEndDate,EventStatus,Tactic,TacticSpendMethod,"
				+ "'EventExpense,TradeSpendValue,TacticStartDate,TacticEndDate,"
				+ "TacticStatus,"
				+ "EventCustomer,EventCustomerDescription,CustomerPlanType,PlanningEntity,PlanningEntityDescription,ProductCategory,ProductCategoryDescription,ProductPPG,"
				+ "ProductPPGDescription,ProductHierarchy,ProductHierarchyDescription,ProductSKU,ProductSKUDescription,RegularRetailPrice,RegularRetailPriceCase,PromoRetailPrice,PromoRetailPriceCase,PaymentVolume,ScanUnits,WarehouseWithdrawalVolume,ListPrice,TacticPlannedSpend,TacticActualSpend,TacticSpendLE,ActualVolumeCases,Process_ID,Sender,Receiver,GUID,Direction,CDATE,CTIME,RecordCount,Flag,Level,"
				+ "Hieraracy_Root_ID_Lookup,Hierarcy_Node_Id_Lookup,Hierarcy_Node_Id_Description,IsActive,SalesOrg,Distribution,Division,Parent_ID_Lookup,Parent_ID_Description,Name,SKUCode,upc,unitofmeasureid_lookup,"
				+ "packsize,packdescription,unitspercase,unitsize,isactive,code_CaseBarcode,code_GTINBarcode,Classification_HierarchyIDLookup,Brand_HierarchyHierarchyIDLookup,YE_EastPricing,YW_WestPricing,salesorg,distribution,division,price_list_exclusion,first_avail_ship_date,prodhierarchy,hierarchydescription,catgcode,catgdesc,prodfmly,prodfmlydesc,finpln,finplndesc,promogroup,promogroupdesc";
		String finalStr = str.toUpperCase();
		String[] strarray = finalStr.split(",");

		Map<String, String> map = new HashMap<String, String>();

		for (String st : strarray) {
			if (map.containsKey(st)) {
				System.out.println("==duplicate Key---" + st);
			} else {
				map.put(st, st);

			}

		}

	}
}
