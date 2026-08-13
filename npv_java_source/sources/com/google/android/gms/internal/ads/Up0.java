package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Up0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Up0 f32270b = new com.google.android.gms.internal.ads.Up0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Sp0 f32271c = new com.google.android.gms.internal.ads.Sp0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32272a = new java.util.concurrent.atomic.AtomicReference();

    public static com.google.android.gms.internal.ads.Up0 b() {
        return f32270b;
    }

    public final com.google.android.gms.internal.ads.Ep0 a() {
        com.google.android.gms.internal.ads.Ep0 ep0 = (com.google.android.gms.internal.ads.Ep0) this.f32272a.get();
        return ep0 == null ? f32271c : ep0;
    }
}
