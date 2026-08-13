package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4383lh0 extends com.google.android.gms.internal.ads.C4823ph0 implements java.util.NavigableSet {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f37198F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4383lh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.NavigableMap navigableMap) {
        super(abstractC5372uh0, navigableMap);
        this.f37198F = abstractC5372uh0;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4823ph0
    final /* synthetic */ java.util.SortedMap d() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.f39662C);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new com.google.android.gms.internal.ads.C4383lh0(this.f37198F, ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z6) {
        return new com.google.android.gms.internal.ads.C4383lh0(this.f37198F, ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).headMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.C4823ph0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        return com.google.android.gms.internal.ads.AbstractC4495mi0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        return com.google.android.gms.internal.ads.AbstractC4495mi0.a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        return new com.google.android.gms.internal.ads.C4383lh0(this.f37198F, ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).subMap(obj, z6, obj2, z10));
    }

    @Override // com.google.android.gms.internal.ads.C4823ph0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z6) {
        return new com.google.android.gms.internal.ads.C4383lh0(this.f37198F, ((java.util.NavigableMap) ((java.util.SortedMap) this.f39662C)).tailMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.C4823ph0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }
}
