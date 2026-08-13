package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.material.progressindicator.b f43544a;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f43545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f43546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43548d;

        protected a() {
        }
    }

    public h(com.google.android.material.progressindicator.b bVar) {
        this.f43544a = bVar;
    }

    abstract void a(android.graphics.Canvas canvas, android.graphics.Rect rect, float f6, boolean z6, boolean z10);

    abstract void b(android.graphics.Canvas canvas, android.graphics.Paint paint, int i6, int i10);

    abstract void c(android.graphics.Canvas canvas, android.graphics.Paint paint, com.google.android.material.progressindicator.h.a aVar, int i6);

    abstract void d(android.graphics.Canvas canvas, android.graphics.Paint paint, float f6, float f10, int i6, int i10, int i11);

    abstract int e();

    abstract int f();

    void g(android.graphics.Canvas canvas, android.graphics.Rect rect, float f6, boolean z6, boolean z10) {
        this.f43544a.e();
        a(canvas, rect, f6, z6, z10);
    }
}
