package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2575Li0 extends com.google.android.gms.internal.ads.AbstractC2648Ni0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.C2575Li0 f29552C = new com.google.android.gms.internal.ads.C2575Li0();

    private C2575Li0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2648Ni0
    public final com.google.android.gms.internal.ads.AbstractC2648Ni0 a() {
        return com.google.android.gms.internal.ads.C2977Wi0.f32783C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2648Ni0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }
}
