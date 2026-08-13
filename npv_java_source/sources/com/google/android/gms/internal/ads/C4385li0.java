package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4385li0 extends com.google.android.gms.internal.ads.AbstractC4167jj0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f37204C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f37205D;

    C4385li0(java.lang.Object obj) {
        this.f37204C = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f37205D;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f37205D) {
            throw new java.util.NoSuchElementException();
        }
        this.f37205D = true;
        return this.f37204C;
    }
}
