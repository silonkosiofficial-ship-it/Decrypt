package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6254m0 extends com.google.android.gms.internal.play_billing.AbstractC6248l0 implements java.util.NavigableSet, com.google.android.gms.internal.play_billing.L0, j$.util.SortedSet {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.util.Comparator f41588E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    transient com.google.android.gms.internal.play_billing.AbstractC6254m0 f41589F;

    AbstractC6254m0(java.util.Comparator comparator) {
        this.f41588E = comparator;
    }

    static com.google.android.gms.internal.play_billing.I0 R(java.util.Comparator comparator) {
        if (com.google.android.gms.internal.play_billing.C6295t0.f41656C.equals(comparator)) {
            return com.google.android.gms.internal.play_billing.I0.f41417H;
        }
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6206e0.f41547E;
        return new com.google.android.gms.internal.play_billing.I0(com.google.android.gms.internal.play_billing.B0.f41326H, comparator);
    }

    abstract com.google.android.gms.internal.play_billing.AbstractC6254m0 M();

    abstract com.google.android.gms.internal.play_billing.AbstractC6254m0 N(java.lang.Object obj, boolean z6);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.AbstractC6254m0 subSet(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f41588E.compare(obj, obj2) <= 0) {
            return P(obj, z6, obj2, z10);
        }
        throw new java.lang.IllegalArgumentException();
    }

    abstract com.google.android.gms.internal.play_billing.AbstractC6254m0 P(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10);

    abstract com.google.android.gms.internal.play_billing.AbstractC6254m0 Q(java.lang.Object obj, boolean z6);

    @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.L0
    public final java.util.Comparator comparator() {
        return this.f41588E;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
        com.google.android.gms.internal.play_billing.AbstractC6254m0 abstractC6254m0 = this.f41589F;
        if (abstractC6254m0 != null) {
            return abstractC6254m0;
        }
        com.google.android.gms.internal.play_billing.AbstractC6254m0 abstractC6254m0M = M();
        this.f41589F = abstractC6254m0M;
        abstractC6254m0M.f41589F = this;
        return abstractC6254m0M;
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ java.util.NavigableSet headSet(java.lang.Object obj, boolean z6) {
        obj.getClass();
        return N(obj, z6);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        obj.getClass();
        return N(obj, false);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ java.util.NavigableSet tailSet(java.lang.Object obj, boolean z6) {
        obj.getClass();
        return Q(obj, z6);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        obj.getClass();
        return Q(obj, true);
    }
}
