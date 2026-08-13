package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4812pc implements java.util.Comparator {
    C4812pc(com.google.android.gms.internal.ads.C5031rc c5031rc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.C5361uc c5361uc = (com.google.android.gms.internal.ads.C5361uc) obj;
        com.google.android.gms.internal.ads.C5361uc c5361uc2 = (com.google.android.gms.internal.ads.C5361uc) obj2;
        int i6 = c5361uc.f39187c - c5361uc2.f39187c;
        return i6 != 0 ? i6 : java.lang.Long.compare(c5361uc.f39185a, c5361uc2.f39185a);
    }
}
