package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Xu0 extends com.google.android.gms.internal.ads.Yu0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f33187C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f33188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3753fv0 f33189E;

    Xu0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        this.f33189E = abstractC3753fv0;
        this.f33188D = abstractC3753fv0.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3205av0
    public final byte a() {
        int i6 = this.f33187C;
        if (i6 >= this.f33188D) {
            throw new java.util.NoSuchElementException();
        }
        this.f33187C = i6 + 1;
        return this.f33189E.f(i6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33187C < this.f33188D;
    }
}
