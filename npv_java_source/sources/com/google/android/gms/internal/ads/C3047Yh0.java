package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3047Yh0 extends com.google.android.gms.internal.ads.AbstractC5482vh0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.Object f33390C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.lang.Object f33391D;

    C3047Yh0(java.lang.Object obj, java.lang.Object obj2) {
        this.f33390C = obj;
        this.f33391D = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5482vh0, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f33390C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5482vh0, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f33391D;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
