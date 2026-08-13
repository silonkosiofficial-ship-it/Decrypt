package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Qy0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f31092C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Ry0 f31093D;

    Qy0(com.google.android.gms.internal.ads.Ry0 ry0) {
        this.f31093D = ry0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31092C < this.f31093D.f31502C.size() || this.f31093D.f31503D.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f31092C >= this.f31093D.f31502C.size()) {
            com.google.android.gms.internal.ads.Ry0 ry0 = this.f31093D;
            ry0.f31502C.add(ry0.f31503D.next());
            return next();
        }
        com.google.android.gms.internal.ads.Ry0 ry1 = this.f31093D;
        int i6 = this.f31092C;
        this.f31092C = i6 + 1;
        return ry1.f31502C.get(i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
