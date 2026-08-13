package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC2624Mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f29843a;

    static {
        int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
        f29843a = iArr;
        try {
            iArr[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f29843a[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f29843a[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f29843a[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f29843a[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
