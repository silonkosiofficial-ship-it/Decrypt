package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements com.google.firebase.components.ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p046e5.F f43996a = p046e5.F.a(U4.a.class, java.util.concurrent.ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p046e5.F f43997b = p046e5.F.a(U4.b.class, java.util.concurrent.ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p046e5.F f43998c = p046e5.F.a(U4.c.class, java.util.concurrent.ExecutorService.class);

    static {
        T5.a.a(T5.b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.a b(p046e5.InterfaceC6532e interfaceC6532e) {
        p116l5.f.f(false);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b((Q4.f) interfaceC6532e.a(Q4.f.class), (G5.e) interfaceC6532e.a(G5.e.class), interfaceC6532e.i(p076h5.a.class), interfaceC6532e.i(T4.a.class), interfaceC6532e.i(P5.a.class), (java.util.concurrent.ExecutorService) interfaceC6532e.c(this.f43996a), (java.util.concurrent.ExecutorService) interfaceC6532e.c(this.f43997b), (java.util.concurrent.ExecutorService) interfaceC6532e.c(this.f43998c));
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            p076h5.g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarB;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(com.google.firebase.crashlytics.a.class).h("fire-cls").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.j(G5.e.class)).b(p046e5.r.i(this.f43996a)).b(p046e5.r.i(this.f43997b)).b(p046e5.r.i(this.f43998c)).b(p046e5.r.a(p076h5.a.class)).b(p046e5.r.a(T4.a.class)).b(p046e5.r.a(P5.a.class)).f(new p046e5.h() { // from class: g5.f
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return this.f45547a.b(interfaceC6532e);
            }
        }).e().d(), M5.h.b("fire-cls", "19.3.0"));
    }
}
