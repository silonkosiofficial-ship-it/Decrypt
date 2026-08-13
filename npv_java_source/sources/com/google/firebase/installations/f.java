package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
class f implements com.google.firebase.installations.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p115l4.C6932m f44036a;

    public f(p115l4.C6932m c6932m) {
        this.f44036a = c6932m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(H5.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f44036a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(java.lang.Exception exc) {
        return false;
    }
}
