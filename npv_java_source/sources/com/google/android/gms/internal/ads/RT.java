package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class RT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p103k2.a f31270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f31271b;

    RT(android.content.Context context) {
        this.f31271b = context;
    }

    public final P4.d a() {
        try {
            p103k2.a aVarA = p103k2.a.a(this.f31271b);
            this.f31270a = aVarA;
            return aVarA == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.IllegalStateException("MeasurementManagerFutures is null")) : aVarA.b();
        } catch (java.lang.Exception e6) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(e6);
        }
    }

    public final P4.d b(android.net.Uri uri, android.view.InputEvent inputEvent) {
        try {
            p103k2.a aVar = this.f31270a;
            j$.util.Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (java.lang.Exception e6) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(e6);
        }
    }
}
