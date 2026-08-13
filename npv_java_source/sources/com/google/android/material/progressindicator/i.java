package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.google.android.material.progressindicator.j f43549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.util.List f43550b = new java.util.ArrayList();

    protected i(int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            this.f43550b.add(new com.google.android.material.progressindicator.h.a());
        }
    }

    abstract void a();

    protected float b(int i6, int i10, int i11) {
        return (i6 - i10) / i11;
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    protected void e(com.google.android.material.progressindicator.j jVar) {
        this.f43549a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
