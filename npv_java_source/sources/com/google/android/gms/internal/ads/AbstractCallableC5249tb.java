package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCallableC5249tb implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C2262Da f38974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.lang.String f38975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final java.lang.String f38976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C5316u8 f38977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected java.lang.reflect.Method f38978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f38979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f38980g;

    public AbstractCallableC5249tb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        this.f38974a = c2262Da;
        this.f38975b = str;
        this.f38976c = str2;
        this.f38977d = c5316u8;
        this.f38979f = i6;
        this.f38980g = i10;
    }

    protected abstract void a();

    public java.lang.Void b() {
        int i6;
        try {
            long jNanoTime = java.lang.System.nanoTime();
            java.lang.reflect.Method methodJ = this.f38974a.j(this.f38975b, this.f38976c);
            this.f38978e = methodJ;
            if (methodJ == null) {
                return null;
            }
            a();
            com.google.android.gms.internal.ads.S9 s9D = this.f38974a.d();
            if (s9D == null || (i6 = this.f38979f) == Integer.MIN_VALUE) {
                return null;
            }
            s9D.c(this.f38980g, i6, (java.lang.System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        b();
        return null;
    }
}
