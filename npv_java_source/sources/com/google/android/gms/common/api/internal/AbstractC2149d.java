package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2149d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N3.C1391d[] f24905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24907c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private P3.i f24908a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private N3.C1391d[] f24910c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24909b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f24911d = 0;

        /* synthetic */ a(P3.z zVar) {
        }

        public com.google.android.gms.common.api.internal.AbstractC2149d a() {
            Q3.AbstractC1477p.b(this.f24908a != null, "execute parameter required");
            return new com.google.android.gms.common.api.internal.t(this, this.f24910c, this.f24909b, this.f24911d);
        }

        public com.google.android.gms.common.api.internal.AbstractC2149d.a b(P3.i iVar) {
            this.f24908a = iVar;
            return this;
        }

        public com.google.android.gms.common.api.internal.AbstractC2149d.a c(boolean z6) {
            this.f24909b = z6;
            return this;
        }

        public com.google.android.gms.common.api.internal.AbstractC2149d.a d(N3.C1391d... c1391dArr) {
            this.f24910c = c1391dArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.AbstractC2149d.a e(int i6) {
            this.f24911d = i6;
            return this;
        }
    }

    protected AbstractC2149d(N3.C1391d[] c1391dArr, boolean z6, int i6) {
        this.f24905a = c1391dArr;
        boolean z10 = false;
        if (c1391dArr != null && z6) {
            z10 = true;
        }
        this.f24906b = z10;
        this.f24907c = i6;
    }

    public static com.google.android.gms.common.api.internal.AbstractC2149d.a a() {
        return new com.google.android.gms.common.api.internal.AbstractC2149d.a(null);
    }

    protected abstract void b(O3.a.b bVar, p115l4.C6932m c6932m);

    public boolean c() {
        return this.f24906b;
    }

    public final int d() {
        return this.f24907c;
    }

    public final N3.C1391d[] e() {
        return this.f24905a;
    }
}
