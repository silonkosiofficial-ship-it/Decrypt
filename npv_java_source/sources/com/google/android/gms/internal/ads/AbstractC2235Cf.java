package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2235Cf {
    public static java.lang.Object a(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        try {
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC2865Tg0.a();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
