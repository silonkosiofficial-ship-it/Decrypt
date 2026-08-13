package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5691xc implements java.util.Comparator {
    public C5691xc(com.google.android.gms.internal.ads.C5801yc c5801yc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.C4592nc c4592nc = (com.google.android.gms.internal.ads.C4592nc) obj;
        com.google.android.gms.internal.ads.C4592nc c4592nc2 = (com.google.android.gms.internal.ads.C4592nc) obj2;
        if (c4592nc.d() < c4592nc2.d()) {
            return -1;
        }
        if (c4592nc.d() <= c4592nc2.d()) {
            if (c4592nc.b() < c4592nc2.b()) {
                return -1;
            }
            if (c4592nc.b() <= c4592nc2.b()) {
                float fA = (c4592nc.a() - c4592nc.d()) * (c4592nc.c() - c4592nc.b());
                float fA2 = (c4592nc2.a() - c4592nc2.d()) * (c4592nc2.c() - c4592nc2.b());
                if (fA > fA2) {
                    return -1;
                }
                if (fA >= fA2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
