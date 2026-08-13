package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4713oh0 extends com.google.android.gms.internal.ads.C3835gh0 implements java.util.SortedMap {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.util.SortedSet f37849G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f37850H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4713oh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.SortedMap sortedMap) {
        super(abstractC5372uh0, sortedMap);
        this.f37850H = abstractC5372uh0;
    }

    java.util.SortedMap c() {
        return (java.util.SortedMap) this.f35665E;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return c().comparator();
    }

    java.util.SortedSet d() {
        return new com.google.android.gms.internal.ads.C4823ph0(this.f37850H, c());
    }

    @Override // com.google.android.gms.internal.ads.C3835gh0, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.f37849G;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet sortedSetD = d();
        this.f37849G = sortedSetD;
        return sortedSetD;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return c().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C4713oh0(this.f37850H, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return c().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.C4713oh0(this.f37850H, c().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C4713oh0(this.f37850H, c().tailMap(obj));
    }
}
