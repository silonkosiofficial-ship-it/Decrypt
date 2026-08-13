package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f42495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f42496b;

    static {
        int[] iArr = new int[com.google.android.gms.internal.measurement.M1.b.values().length];
        f42496b = iArr;
        try {
            iArr[com.google.android.gms.internal.measurement.M1.b.LESS_THAN.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f42496b[com.google.android.gms.internal.measurement.M1.b.GREATER_THAN.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f42496b[com.google.android.gms.internal.measurement.M1.b.EQUAL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f42496b[com.google.android.gms.internal.measurement.M1.b.BETWEEN.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[com.google.android.gms.internal.measurement.O1.b.values().length];
        f42495a = iArr2;
        try {
            iArr2[com.google.android.gms.internal.measurement.O1.b.REGEXP.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f42495a[com.google.android.gms.internal.measurement.O1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f42495a[com.google.android.gms.internal.measurement.O1.b.ENDS_WITH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f42495a[com.google.android.gms.internal.measurement.O1.b.PARTIAL.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f42495a[com.google.android.gms.internal.measurement.O1.b.EXACT.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f42495a[com.google.android.gms.internal.measurement.O1.b.IN_LIST.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
    }
}
