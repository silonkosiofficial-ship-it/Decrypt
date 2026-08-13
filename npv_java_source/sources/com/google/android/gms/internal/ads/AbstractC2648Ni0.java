package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ni0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2648Ni0 implements java.util.Comparator {
    protected AbstractC2648Ni0() {
    }

    public static com.google.android.gms.internal.ads.AbstractC2648Ni0 b(java.util.Comparator comparator) {
        return new com.google.android.gms.internal.ads.C2609Mh0(comparator);
    }

    public static com.google.android.gms.internal.ads.AbstractC2648Ni0 c() {
        return com.google.android.gms.internal.ads.C2575Li0.f29552C;
    }

    public com.google.android.gms.internal.ads.AbstractC2648Ni0 a() {
        return new com.google.android.gms.internal.ads.C3013Xi0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);
}
