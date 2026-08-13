package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3049Yi0 extends com.google.android.gms.internal.ads.AbstractC3287bh0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.util.Iterator f33392E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ java.util.Set f33393F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ java.util.Set f33394G;

    C3049Yi0(com.google.android.gms.internal.ads.C3085Zi0 c3085Zi0, java.util.Set set, java.util.Set set2) {
        this.f33393F = set;
        this.f33394G = set2;
        this.f33392E = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287bh0
    protected final java.lang.Object a() {
        while (this.f33392E.hasNext()) {
            java.util.Iterator it = this.f33392E;
            java.util.Set set = this.f33394G;
            java.lang.Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
