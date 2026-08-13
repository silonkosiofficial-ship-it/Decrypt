package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ON {
    public static android.os.Bundle a(android.util.Pair... pairArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            for (int i6 = 0; i6 < 2; i6++) {
                android.util.Pair pair = pairArr[i6];
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) pair.first) && ((java.lang.Long) pair.second).longValue() > 0) {
                    bundle.putLong((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
