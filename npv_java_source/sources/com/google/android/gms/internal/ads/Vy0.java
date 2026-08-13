package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.LinkedHashMap f32629a;

    Vy0(int i6) {
        this.f32629a = com.google.android.gms.internal.ads.Xy0.b(i6);
    }

    final com.google.android.gms.internal.ads.Vy0 a(java.lang.Object obj, com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        com.google.android.gms.internal.ads.AbstractC4089iz0.a(obj, "key");
        com.google.android.gms.internal.ads.AbstractC4089iz0.a(interfaceC4309kz0, "provider");
        this.f32629a.put(obj, interfaceC4309kz0);
        return this;
    }
}
