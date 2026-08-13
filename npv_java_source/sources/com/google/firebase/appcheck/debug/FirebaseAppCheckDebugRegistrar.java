package com.google.firebase.appcheck.debug;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckDebugRegistrar implements com.google.firebase.components.ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ X4.e b(p046e5.F f6, p046e5.F f10, p046e5.F f11, p046e5.InterfaceC6532e interfaceC6532e) {
        return new X4.e((Q4.f) interfaceC6532e.a(Q4.f.class), interfaceC6532e.d(W4.b.class), (java.util.concurrent.Executor) interfaceC6532e.c(f6), (java.util.concurrent.Executor) interfaceC6532e.c(f10), (java.util.concurrent.Executor) interfaceC6532e.c(f11));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        final p046e5.F fA = p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class);
        final p046e5.F fA2 = p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class);
        final p046e5.F fA3 = p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class);
        return java.util.Arrays.asList(p046e5.C6530c.e(X4.e.class).h("fire-app-check-debug").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.h(W4.b.class)).b(p046e5.r.i(fA)).b(p046e5.r.i(fA2)).b(p046e5.r.i(fA3)).f(new p046e5.h() { // from class: W4.a
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.appcheck.debug.FirebaseAppCheckDebugRegistrar.b(fA, fA2, fA3, interfaceC6532e);
            }
        }).d(), M5.h.b("fire-app-check-debug", "18.0.0"));
    }
}
