package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class BH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f25920a = new java.util.concurrent.atomic.AtomicLong();

    public BH0(long j6, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, long j10) {
        android.net.Uri uri = c3843gl0.f35675a;
        java.util.Collections.emptyMap();
    }

    public BH0(long j6, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, android.net.Uri uri, java.util.Map map, long j10, long j11, long j12) {
    }

    public static long a() {
        return f25920a.getAndIncrement();
    }
}
