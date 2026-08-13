package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30947a;

    public QE(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
    }

    public final synchronized void a() {
        while (!this.f30947a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z6 = false;
        while (!this.f30947a) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z6;
        z6 = this.f30947a;
        this.f30947a = false;
        return z6;
    }

    public final synchronized boolean d() {
        return this.f30947a;
    }

    public final synchronized boolean e() {
        if (this.f30947a) {
            return false;
        }
        this.f30947a = true;
        notifyAll();
        return true;
    }
}
