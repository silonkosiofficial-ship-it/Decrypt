package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5814yi0 extends java.util.AbstractMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient java.util.Set f40124C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient java.util.Collection f40125D;

    AbstractC5814yi0() {
    }

    abstract java.util.Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.f40124C;
        if (set != null) {
            return set;
        }
        java.util.Set setA = a();
        this.f40124C = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.f40125D;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.C5704xi0 c5704xi0 = new com.google.android.gms.internal.ads.C5704xi0(this);
        this.f40125D = c5704xi0;
        return c5704xi0;
    }
}
