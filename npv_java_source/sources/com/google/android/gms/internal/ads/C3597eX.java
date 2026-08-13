package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3597eX implements p174r3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p174r3.g f35001a;

    @Override // p174r3.g
    public final synchronized void a(android.view.View view) {
        p174r3.g gVar = this.f35001a;
        if (gVar != null) {
            gVar.a(view);
        }
    }

    @Override // p174r3.g
    public final synchronized void b() {
        p174r3.g gVar = this.f35001a;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // p174r3.g
    public final synchronized void c() {
        p174r3.g gVar = this.f35001a;
        if (gVar != null) {
            gVar.c();
        }
    }

    public final synchronized void d(p174r3.g gVar) {
        this.f35001a = gVar;
    }
}
