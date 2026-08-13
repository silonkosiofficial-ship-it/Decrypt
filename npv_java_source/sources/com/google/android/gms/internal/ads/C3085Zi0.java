package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3085Zi0 extends com.google.android.gms.internal.ads.AbstractC3510dj0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.Set f33647C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.util.Set f33648D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3085Zi0(java.util.Set set, java.util.Set set2) {
        super(null);
        this.f33647C = set;
        this.f33648D = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f33647C.contains(obj) && this.f33648D.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f33647C.containsAll(collection) && this.f33648D.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC4167jj0 iterator() {
        return new com.google.android.gms.internal.ads.C3049Yi0(this, this.f33647C, this.f33648D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return java.util.Collections.disjoint(this.f33648D, this.f33647C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.f33647C.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (this.f33648D.contains(it.next())) {
                i6++;
            }
        }
        return i6;
    }
}
