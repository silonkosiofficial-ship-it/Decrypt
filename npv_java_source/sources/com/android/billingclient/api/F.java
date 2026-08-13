package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
abstract class F {
    static com.android.billingclient.api.E a(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24658k;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("%s got null owned items list", str2));
            return new com.android.billingclient.api.E(c2135d, 54);
        }
        int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.b(bundle, "BillingClient");
        java.lang.String strF = com.google.android.gms.internal.play_billing.AbstractC6195c1.f(bundle, "BillingClient");
        com.android.billingclient.api.C2135d.a aVarC = com.android.billingclient.api.C2135d.c();
        aVarC.c(iB);
        aVarC.b(strF);
        com.android.billingclient.api.C2135d c2135dA = aVarC.a();
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("%s failed. Response code: %s", str2, java.lang.Integer.valueOf(iB)));
            return new com.android.billingclient.api.E(c2135dA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new com.android.billingclient.api.E(c2135d, 55);
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new com.android.billingclient.api.E(c2135d, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("Bundle returned from %s contains null purchases list.", str2));
            return new com.android.billingclient.api.E(c2135d, 57);
        }
        if (stringArrayList3 != null) {
            return new com.android.billingclient.api.E(com.android.billingclient.api.z.f24659l, 1);
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", java.lang.String.format("Bundle returned from %s contains null signatures list.", str2));
        return new com.android.billingclient.api.E(c2135d, 58);
    }
}
