package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Wy0 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f32960a;

    Wy0(java.util.Map map) {
        this.f32960a = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    final java.util.Map a() {
        return this.f32960a;
    }
}
