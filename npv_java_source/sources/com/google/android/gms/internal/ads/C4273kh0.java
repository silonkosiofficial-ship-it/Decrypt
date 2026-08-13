package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4273kh0 extends com.google.android.gms.internal.ads.C4713oh0 implements java.util.NavigableMap {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f36996I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4273kh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0, java.util.NavigableMap navigableMap) {
        super(abstractC5372uh0, navigableMap);
        this.f36996I = abstractC5372uh0;
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0
    final /* synthetic */ java.util.SortedMap c() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.f35665E);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry entryCeilingEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new com.google.android.gms.internal.ads.C4273kh0(this.f36996I, ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ java.util.SortedSet keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    final java.util.Map.Entry f(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        java.util.Collection collectionH = this.f36996I.h();
        collectionH.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new com.google.android.gms.internal.ads.C3047Yh0(entry.getKey(), this.f36996I.i(collectionH));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry entryFirstEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry entryFloorEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C4713oh0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet d() {
        return new com.google.android.gms.internal.ads.C4383lh0(this.f36996I, (java.util.NavigableMap) ((java.util.SortedMap) this.f35665E));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z6) {
        return new com.google.android.gms.internal.ads.C4273kh0(this.f36996I, ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).headMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry entryHigherEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0, com.google.android.gms.internal.ads.C3835gh0, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry entryLastEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry entryLowerEntry = ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
        return f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
        return f(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z10) {
        return new com.google.android.gms.internal.ads.C4273kh0(this.f36996I, ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).subMap(obj, z6, obj2, z10));
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z6) {
        return new com.google.android.gms.internal.ads.C4273kh0(this.f36996I, ((java.util.NavigableMap) ((java.util.SortedMap) this.f35665E)).tailMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.C4713oh0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }
}
