package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4421m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4311l0 f37266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f37267b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public C4421m0(com.google.android.gms.internal.ads.InterfaceC4311l0 interfaceC4311l0) {
        this.f37266a = interfaceC4311l0;
    }

    public final com.google.android.gms.internal.ads.InterfaceC5190t0 a(java.lang.Object... objArr) {
        java.lang.reflect.Constructor constructorA;
        synchronized (this.f37267b) {
            if (this.f37267b.get()) {
                constructorA = null;
            } else {
                try {
                    constructorA = this.f37266a.a();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.f37267b.set(true);
                    constructorA = null;
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e6);
                }
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.ads.InterfaceC5190t0) constructorA.newInstance(objArr);
        } catch (java.lang.Exception e10) {
            throw new java.lang.IllegalStateException("Unexpected error creating extractor", e10);
        }
    }
}
