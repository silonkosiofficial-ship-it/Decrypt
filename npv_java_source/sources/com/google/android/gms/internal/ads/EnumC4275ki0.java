package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ki0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC4275ki0 implements java.util.Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.m(false, "no calls to next() since the last call to remove()");
    }
}
