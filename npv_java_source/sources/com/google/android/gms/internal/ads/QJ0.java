package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.EB0[] f30964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.IJ0[] f30965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C3852gq f30966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f30967e;

    public QJ0(com.google.android.gms.internal.ads.EB0[] eb0Arr, com.google.android.gms.internal.ads.IJ0[] ij0Arr, com.google.android.gms.internal.ads.C3852gq c3852gq, java.lang.Object obj) {
        int length = eb0Arr.length;
        com.google.android.gms.internal.ads.LC.d(length == ij0Arr.length);
        this.f30964b = eb0Arr;
        this.f30965c = (com.google.android.gms.internal.ads.IJ0[]) ij0Arr.clone();
        this.f30966d = c3852gq;
        this.f30967e = obj;
        this.f30963a = length;
    }

    public final boolean a(com.google.android.gms.internal.ads.QJ0 qj0, int i6) {
        return qj0 != null && j$.util.Objects.equals(this.f30964b[i6], qj0.f30964b[i6]) && j$.util.Objects.equals(this.f30965c[i6], qj0.f30965c[i6]);
    }

    public final boolean b(int i6) {
        return this.f30964b[i6] != null;
    }
}
