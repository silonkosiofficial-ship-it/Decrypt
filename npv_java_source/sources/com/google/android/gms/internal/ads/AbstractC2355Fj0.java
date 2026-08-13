package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2355Fj0 {
    public static char a(long j6) {
        char c6 = (char) j6;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.h(((long) c6) == j6, "Out of range: %s", j6);
        return c6;
    }

    public static char b(byte b6, byte b10) {
        return (char) ((b6 << 8) | (b10 & 255));
    }
}
