package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f42068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f42069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f42070c;

    static {
        int[] iArr = new int[com.google.android.gms.internal.measurement.R1.d.values().length];
        f42070c = iArr;
        try {
            iArr[com.google.android.gms.internal.measurement.R1.d.DENIED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f42070c[com.google.android.gms.internal.measurement.R1.d.GRANTED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[com.google.android.gms.internal.measurement.R1.e.values().length];
        f42069b = iArr2;
        try {
            iArr2[com.google.android.gms.internal.measurement.R1.e.AD_STORAGE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f42069b[com.google.android.gms.internal.measurement.R1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f42069b[com.google.android.gms.internal.measurement.R1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f42069b[com.google.android.gms.internal.measurement.R1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[com.google.android.gms.internal.measurement.H7.values().length];
        f42068a = iArr3;
        try {
            iArr3[com.google.android.gms.internal.measurement.H7.DEBUG.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            f42068a[com.google.android.gms.internal.measurement.H7.ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f42068a[com.google.android.gms.internal.measurement.H7.WARN.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f42068a[com.google.android.gms.internal.measurement.H7.VERBOSE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
    }
}
