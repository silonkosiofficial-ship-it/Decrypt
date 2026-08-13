package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4321l5 {
    public static float a(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    public static long b(java.lang.String str) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        java.lang.String[] strArrSplit = str.split("\\.", 2);
        long j6 = 0;
        for (java.lang.String str2 : strArrSplit[0].split(":", -1)) {
            j6 = (j6 * 60) + java.lang.Long.parseLong(str2);
        }
        long j10 = j6 * 1000;
        if (strArrSplit.length == 2) {
            j10 += java.lang.Long.parseLong(strArrSplit[1]);
        }
        return j10 * 1000;
    }
}
