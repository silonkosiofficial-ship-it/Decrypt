package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ly0 implements java.util.Iterator, java.io.Closeable, com.google.android.gms.internal.ads.R7 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.P7 f29611I = new com.google.android.gms.internal.ads.Ky0("eof ");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.M7 f29612C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.My0 f29613D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    com.google.android.gms.internal.ads.P7 f29614E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    long f29615F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    long f29616G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.List f29617H = new java.util.ArrayList();

    static {
        com.google.android.gms.internal.ads.Sy0.b(com.google.android.gms.internal.ads.Ly0.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.P7 p10 = this.f29614E;
        if (p10 == f29611I) {
            return false;
        }
        if (p10 != null) {
            return true;
        }
        try {
            this.f29614E = next();
            return true;
        } catch (java.util.NoSuchElementException unused) {
            this.f29614E = f29611I;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.P7 next() {
        com.google.android.gms.internal.ads.P7 p7A;
        com.google.android.gms.internal.ads.P7 p10 = this.f29614E;
        if (p10 != null && p10 != f29611I) {
            this.f29614E = null;
            return p10;
        }
        com.google.android.gms.internal.ads.My0 my0 = this.f29613D;
        if (my0 == null || this.f29615F >= this.f29616G) {
            this.f29614E = f29611I;
            throw new java.util.NoSuchElementException();
        }
        try {
            synchronized (my0) {
                this.f29613D.h(this.f29615F);
                p7A = this.f29612C.a(this.f29613D, this);
                this.f29615F = this.f29613D.b();
            }
            return p7A;
        } catch (java.io.EOFException unused) {
            throw new java.util.NoSuchElementException();
        } catch (java.io.IOException unused2) {
            throw new java.util.NoSuchElementException();
        }
    }

    public final java.util.List o() {
        return (this.f29613D == null || this.f29614E == f29611I) ? this.f29617H : new com.google.android.gms.internal.ads.Ry0(this.f29617H, this);
    }

    public final void r(com.google.android.gms.internal.ads.My0 my0, long j6, com.google.android.gms.internal.ads.M7 m10) {
        this.f29613D = my0;
        this.f29615F = my0.b();
        my0.h(my0.b() + j6);
        this.f29616G = my0.b();
        this.f29612C = m10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i6 = 0; i6 < this.f29617H.size(); i6++) {
            if (i6 > 0) {
                sb.append(";");
            }
            sb.append(((com.google.android.gms.internal.ads.P7) this.f29617H.get(i6)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
