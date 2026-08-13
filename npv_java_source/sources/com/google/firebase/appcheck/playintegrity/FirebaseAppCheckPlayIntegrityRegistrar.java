package com.google.firebase.appcheck.playintegrity;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements com.google.firebase.components.ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p026c5.i b(p046e5.F f6, p046e5.F f10, p046e5.InterfaceC6532e interfaceC6532e) {
        return new p026c5.i((Q4.f) interfaceC6532e.a(Q4.f.class), (java.util.concurrent.Executor) interfaceC6532e.c(f6), (java.util.concurrent.Executor) interfaceC6532e.c(f10));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        final p046e5.F fA = p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class);
        final p046e5.F fA2 = p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class);
        return java.util.Arrays.asList(p046e5.C6530c.e(p026c5.i.class).h("fire-app-check-play-integrity").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.i(fA)).b(p046e5.r.i(fA2)).f(new p046e5.h() { // from class: b5.a
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar.b(fA, fA2, interfaceC6532e);
            }
        }).d(), M5.h.b("fire-app-check-play-integrity", "18.0.0"));
    }
}
