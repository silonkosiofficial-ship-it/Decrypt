package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
class e implements com.google.firebase.installations.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.i f44034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p115l4.C6932m f44035b;

    public e(com.google.firebase.installations.i iVar, p115l4.C6932m c6932m) {
        this.f44034a = iVar;
        this.f44035b = c6932m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(H5.d dVar) {
        if (!dVar.k() || this.f44034a.f(dVar)) {
            return false;
        }
        this.f44035b.c(com.google.firebase.installations.g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(java.lang.Exception exc) {
        this.f44035b.d(exc);
        return true;
    }
}
