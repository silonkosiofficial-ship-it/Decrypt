package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3428cx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34602a;

    public final void a(int i6) {
        this.f34602a |= 536870912;
    }

    public void b() {
        this.f34602a = 0;
    }

    public final void c(int i6) {
        this.f34602a = i6;
    }

    protected final boolean d(int i6) {
        return (this.f34602a & i6) == i6;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }

    public final boolean h() {
        return d(536870912);
    }

    public final boolean i() {
        return d(67108864);
    }
}
