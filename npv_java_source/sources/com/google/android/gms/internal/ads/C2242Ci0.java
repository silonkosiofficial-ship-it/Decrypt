package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ci0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2242Ci0 extends com.google.android.gms.internal.ads.AbstractC2390Gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.Comparator f26285a;

    C2242Ci0(java.util.Comparator comparator) {
        this.f26285a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2390Gi0
    final java.util.Map a() {
        return new java.util.TreeMap(this.f26285a);
    }
}
