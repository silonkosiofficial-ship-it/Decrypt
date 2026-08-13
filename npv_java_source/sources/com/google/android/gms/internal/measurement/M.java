package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f40571a;

    static {
        int[] iArr = new int[com.google.android.gms.internal.measurement.Z.values().length];
        f40571a = iArr;
        try {
            iArr[com.google.android.gms.internal.measurement.Z.AND.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f40571a[com.google.android.gms.internal.measurement.Z.NOT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f40571a[com.google.android.gms.internal.measurement.Z.OR.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
