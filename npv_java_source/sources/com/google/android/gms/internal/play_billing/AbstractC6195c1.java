package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6195c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41524a = java.lang.Runtime.getRuntime().availableProcessors();

    public static int a(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            return n(intent.getExtras(), "ProxyBillingActivity");
        }
        j("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            java.lang.Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof java.lang.Integer) {
                return ((java.lang.Integer) obj).intValue();
            }
            strConcat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        }
        j(str, strConcat);
        return 6;
    }

    public static android.os.Bundle c(android.os.Bundle bundle, java.lang.String str, long j6) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j6);
        return bundle;
    }

    public static android.os.Bundle d(boolean z6, boolean z10, boolean z11, boolean z12, java.lang.String str, long j6) {
        android.os.Bundle bundle = new android.os.Bundle();
        c(bundle, str, j6);
        if (z6 && z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.C2135d e(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            com.android.billingclient.api.C2135d.a aVarC = com.android.billingclient.api.C2135d.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(f(intent.getExtras(), str));
            return aVarC.a();
        }
        j("BillingHelper", "Got null intent!");
        com.android.billingclient.api.C2135d.a aVarC2 = com.android.billingclient.api.C2135d.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static java.lang.String f(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return "";
        }
        java.lang.Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        j(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static java.lang.String g(int i6) {
        return com.google.android.gms.internal.play_billing.EnumC6278q0.e(i6).toString();
    }

    public static java.util.List h(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            com.android.billingclient.api.Purchase purchaseO = o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseO == null) {
                i("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseO);
        } else {
            i("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i6 = 0; i6 < stringArrayList.size() && i6 < stringArrayList2.size(); i6++) {
                com.android.billingclient.api.Purchase purchaseO2 = o(stringArrayList.get(i6), stringArrayList2.get(i6));
                if (purchaseO2 != null) {
                    arrayList.add(purchaseO2);
                }
            }
        }
        return arrayList;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (!android.util.Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i6 = 40000;
        while (!str2.isEmpty() && i6 > 0) {
            int iMin = java.lang.Math.min(str2.length(), java.lang.Math.min(4000, i6));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i6 -= iMin;
        }
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
        }
    }

    public static void k(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            if (android.util.Log.isLoggable(str, 5) && th == null) {
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static android.os.Bundle l(com.android.billingclient.api.C2135d c2135d, int i6) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("RESPONSE_CODE", c2135d.b());
        bundle.putString("DEBUG_MESSAGE", c2135d.a());
        bundle.putInt("LOG_REASON", i6 - 1);
        return bundle;
    }

    public static android.os.Bundle m(com.android.billingclient.api.C2135d c2135d, int i6, java.lang.String str) {
        android.os.Bundle bundleL = l(c2135d, 5);
        if (str != null) {
            bundleL.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleL;
    }

    private static int n(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        j(str, "Unexpected null bundle received!");
        return 0;
    }

    private static com.android.billingclient.api.Purchase o(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            i("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new com.android.billingclient.api.Purchase(str, str2);
        } catch (org.json.JSONException e6) {
            j("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e6.toString()));
            return null;
        }
    }
}
