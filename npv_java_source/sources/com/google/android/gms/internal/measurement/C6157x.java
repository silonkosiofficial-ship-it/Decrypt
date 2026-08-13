package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6157x implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41271C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C6133u f41272D;

    C6157x(com.google.android.gms.internal.measurement.C6133u c6133u) {
        this.f41272D = c6133u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41271C < this.f41272D.f41229C.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (this.f41271C >= this.f41272D.f41229C.length()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f41271C;
        this.f41271C = i6 + 1;
        return new com.google.android.gms.internal.measurement.C6133u(java.lang.String.valueOf(i6));
    }
}
