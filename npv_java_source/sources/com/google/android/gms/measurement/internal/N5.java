package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f42067a;

    static {
        int[] iArr = new int[p085i4.p.values().length];
        f42067a = iArr;
        try {
            iArr[p085i4.p.POLICY.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f42067a[p085i4.p.GRANTED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f42067a[p085i4.p.DENIED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f42067a[p085i4.p.UNINITIALIZED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
