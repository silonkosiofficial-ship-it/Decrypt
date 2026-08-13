package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6149w implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41260C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C6133u f41261D;

    C6149w(com.google.android.gms.internal.measurement.C6133u c6133u) {
        this.f41261D = c6133u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41260C < this.f41261D.f41229C.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (this.f41260C >= this.f41261D.f41229C.length()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.f41261D.f41229C;
        int i6 = this.f41260C;
        this.f41260C = i6 + 1;
        return new com.google.android.gms.internal.measurement.C6133u(java.lang.String.valueOf(str.charAt(i6)));
    }
}
