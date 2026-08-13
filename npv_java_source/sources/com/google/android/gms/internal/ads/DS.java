package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f26694a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26695b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26696c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26697d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26698e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f26699f = new java.lang.Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f26700g = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Object f26701h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.Object f26702i = new java.lang.Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.Object f26703j = new java.lang.Object();

    public final int a() {
        int i6;
        synchronized (this.f26700g) {
            i6 = this.f26695b;
        }
        return i6;
    }

    public final synchronized long b() {
        long j6;
        synchronized (this.f26703j) {
            j6 = this.f26698e;
        }
        return j6;
    }

    public final synchronized long c() {
        long j6;
        synchronized (this.f26702i) {
            j6 = this.f26697d;
        }
        return j6;
    }

    public final synchronized long d() {
        long j6;
        synchronized (this.f26699f) {
            j6 = this.f26694a;
        }
        return j6;
    }

    public final long e() {
        long j6;
        synchronized (this.f26701h) {
            j6 = this.f26696c;
        }
        return j6;
    }

    public final synchronized void f(long j6) {
        synchronized (this.f26703j) {
            this.f26698e = j6;
        }
    }

    public final synchronized void g(long j6) {
        synchronized (this.f26702i) {
            this.f26697d = j6;
        }
    }

    public final synchronized void h(long j6) {
        synchronized (this.f26699f) {
            this.f26694a = j6;
        }
    }

    public final void i(int i6) {
        synchronized (this.f26700g) {
            this.f26695b = i6;
        }
    }

    public final void j(long j6) {
        synchronized (this.f26701h) {
            this.f26696c = j6;
        }
    }
}
