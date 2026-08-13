package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f32230a;

    UY(java.util.Set set) {
        this.f32230a = set;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f32230a.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.SY(arrayList, null));
    }
}
