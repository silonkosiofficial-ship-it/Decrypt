package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class T5 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.H5 f42163b;

    T5(com.google.android.gms.measurement.internal.H5 h6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42162a = m6;
        this.f42163b = h6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2K;
        java.lang.String str;
        if (this.f42163b.U((java.lang.String) Q3.AbstractC1477p.l(this.f42162a.f42031C)).z() && com.google.android.gms.measurement.internal.A3.q(this.f42162a.f42052X).z()) {
            com.google.android.gms.measurement.internal.C6351c2 c6351c2H = this.f42163b.h(this.f42162a);
            if (c6351c2H != null) {
                return c6351c2H.m();
            }
            c6442p2K = this.f42163b.j().L();
            str = "App info was null when attempting to get app instance id";
        } else {
            c6442p2K = this.f42163b.j().K();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        c6442p2K.a(str);
        return null;
    }
}
