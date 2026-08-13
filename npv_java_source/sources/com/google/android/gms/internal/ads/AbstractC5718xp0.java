package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC5718xp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f39926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f39927b;

    static {
        int[] iArr = new int[com.google.android.gms.internal.ads.EnumC3529dt0.values().length];
        f39927b = iArr;
        try {
            iArr[com.google.android.gms.internal.ads.EnumC3529dt0.SYMMETRIC.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f39927b[com.google.android.gms.internal.ads.EnumC3529dt0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[com.google.android.gms.internal.ads.Kt0.values().length];
        f39926a = iArr2;
        try {
            iArr2[com.google.android.gms.internal.ads.Kt0.TINK.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f39926a[com.google.android.gms.internal.ads.Kt0.LEGACY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f39926a[com.google.android.gms.internal.ads.Kt0.RAW.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f39926a[com.google.android.gms.internal.ads.Kt0.CRUNCHY.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
