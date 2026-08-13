package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p106k5.C6911w f43999a;

    private a(p106k5.C6911w c6911w) {
        this.f43999a = c6911w;
    }

    static com.google.firebase.crashlytics.a b(Q4.f fVar, G5.e eVar, F5.a aVar, F5.a aVar2, F5.a aVar3, java.util.concurrent.ExecutorService executorService, java.util.concurrent.ExecutorService executorService2, java.util.concurrent.ExecutorService executorService3) {
        android.content.Context contextK = fVar.k();
        java.lang.String packageName = contextK.getPackageName();
        p076h5.g.f().g("Initializing Firebase Crashlytics " + p106k5.C6911w.k() + " for " + packageName);
        p116l5.f fVar2 = new p116l5.f(executorService, executorService2);
        p166q5.g gVar = new p166q5.g(contextK);
        p106k5.C c6 = new p106k5.C(fVar);
        p106k5.H h6 = new p106k5.H(contextK, packageName, eVar, c6);
        p076h5.d dVar = new p076h5.d(aVar);
        p066g5.d dVar2 = new p066g5.d(aVar2);
        p106k5.C6902m c6902m = new p106k5.C6902m(c6, gVar);
        T5.a.e(c6902m);
        p106k5.C6911w c6911w = new p106k5.C6911w(fVar, h6, dVar, c6, dVar2.e(), dVar2.d(), gVar, c6902m, new p076h5.l(aVar3), fVar2);
        java.lang.String strC = fVar.n().c();
        java.lang.String strM = p106k5.AbstractC6898i.m(contextK);
        java.util.List<p106k5.C6895f> listJ = p106k5.AbstractC6898i.j(contextK);
        p076h5.g.f().b("Mapping file ID is: " + strM);
        for (p106k5.C6895f c6895f : listJ) {
            p076h5.g.f().b(java.lang.String.format("Build id for %s on %s: %s", c6895f.c(), c6895f.a(), c6895f.b()));
        }
        try {
            p106k5.C6890a c6890aA = p106k5.C6890a.a(contextK, h6, strC, strM, listJ, new p076h5.f(contextK));
            p076h5.g.f().i("Installer package name is: " + c6890aA.f49596d);
            p186s5.g gVarL = p186s5.g.l(contextK, strC, h6, new p156p5.b(), c6890aA.f49598f, c6890aA.f49599g, gVar, c6);
            gVarL.o(fVar2).d(executorService3, new p115l4.InterfaceC6926g() { // from class: g5.g
                @Override // p115l4.InterfaceC6926g
                public final void d(java.lang.Exception exc) {
                    com.google.firebase.crashlytics.a.c(exc);
                }
            });
            if (c6911w.u(c6890aA, gVarL)) {
                c6911w.i(gVarL);
            }
            return new com.google.firebase.crashlytics.a(c6911w);
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            p076h5.g.f().e("Error retrieving app package info.", e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(java.lang.Exception exc) {
        p076h5.g.f().e("Error fetching settings.", exc);
    }
}
