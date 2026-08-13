package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2900Ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f32249a = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f32250b = new java.util.concurrent.atomic.AtomicReference();

    static {
        new java.util.concurrent.atomic.AtomicBoolean();
    }

    static com.google.android.gms.internal.ads.InterfaceC2828Sg a() {
        return (com.google.android.gms.internal.ads.InterfaceC2828Sg) f32249a.get();
    }

    static com.google.android.gms.internal.ads.InterfaceC2864Tg b() {
        androidx.appcompat.app.D.a(f32250b.get());
        return null;
    }

    public static void c(com.google.android.gms.internal.ads.InterfaceC2828Sg interfaceC2828Sg) {
        f32249a.set(interfaceC2828Sg);
    }
}
