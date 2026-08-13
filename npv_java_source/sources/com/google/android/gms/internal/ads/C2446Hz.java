package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2446Hz implements com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f28353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.Executor f28354D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28355E = new java.util.concurrent.atomic.AtomicReference();

    C2446Hz(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.concurrent.Executor executor) {
        this.f28353C = interfaceC2698Ot;
        this.f28354D = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final synchronized void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        if (this.f28353C != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.wc)).booleanValue()) {
                if (c2596Mb.f29800j) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = this.f28355E;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        java.util.concurrent.Executor executor = this.f28354D;
                        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f28353C;
                        j$.util.Objects.requireNonNull(interfaceC2698Ot);
                        executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ez
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC2698Ot.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!c2596Mb.f29800j) {
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = this.f28355E;
                    java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        java.util.concurrent.Executor executor2 = this.f28354D;
                        final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = this.f28353C;
                        j$.util.Objects.requireNonNull(interfaceC2698Ot2);
                        executor2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Gz
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC2698Ot2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
