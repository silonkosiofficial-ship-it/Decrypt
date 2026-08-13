package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4823ph0 extends com.google.android.gms.internal.ads.C4163jh0 implements java.util.SortedSet {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f38052E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4823ph0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.SortedMap sortedMap) {
        super(abstractC5372uh0, sortedMap);
        this.f38052E = abstractC5372uh0;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return d().comparator();
    }

    java.util.SortedMap d() {
        return (java.util.SortedMap) this.f39662C;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return d().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C4823ph0(this.f38052E, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return d().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.C4823ph0(this.f38052E, d().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C4823ph0(this.f38052E, d().tailMap(obj));
    }
}
