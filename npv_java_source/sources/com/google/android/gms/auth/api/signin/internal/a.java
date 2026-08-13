package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes.dex */
final class a implements androidx.loader.app.a.InterfaceC0431a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity f24839a;

    /* synthetic */ a(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity, L3.x xVar) {
        this.f24839a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0431a
    public final p053f2.b a(int i6, android.os.Bundle bundle) {
        return new L3.g(this.f24839a, O3.f.b());
    }

    @Override // androidx.loader.app.a.InterfaceC0431a
    public final /* bridge */ /* synthetic */ void b(p053f2.b bVar, java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = this.f24839a;
        signInHubActivity.setResult(signInHubActivity.f24837g0, signInHubActivity.f24838h0);
        this.f24839a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0431a
    public final void c(p053f2.b bVar) {
    }
}
