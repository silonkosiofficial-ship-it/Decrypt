package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3663f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f35272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f35274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f35275d;

    private C3663f5(java.lang.String str, int i6, java.lang.String str2, java.util.Set set) {
        this.f35273b = i6;
        this.f35272a = str;
        this.f35274c = str2;
        this.f35275d = set;
    }

    public static com.google.android.gms.internal.ads.C3663f5 a(java.lang.String str, int i6) {
        java.lang.String str2;
        java.lang.String strTrim = str.trim();
        com.google.android.gms.internal.ads.LC.d(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            java.lang.String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        java.lang.String[] strArrSplit = strTrim.split("\\.", -1);
        java.lang.String str3 = strArrSplit[0];
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new com.google.android.gms.internal.ads.C3663f5(str3, i6, str2, hashSet);
    }

    public static com.google.android.gms.internal.ads.C3663f5 b() {
        return new com.google.android.gms.internal.ads.C3663f5("", 0, "", java.util.Collections.emptySet());
    }
}
