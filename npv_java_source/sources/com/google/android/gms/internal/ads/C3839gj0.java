package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3839gj0 extends com.google.android.gms.internal.ads.AbstractC3947hi0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object f35669E;

    C3839gj0(java.lang.Object obj) {
        obj.getClass();
        this.f35669E = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f35669E.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int d(java.lang.Object[] objArr, int i6) {
        objArr[i6] = this.f35669E;
        return i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 g() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.P(this.f35669E);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35669E.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.C4385li0(this.f35669E);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC4167jj0 n() {
        return new com.google.android.gms.internal.ads.C4385li0(this.f35669E);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.f35669E.toString() + "]";
    }
}
