package com.google.firebase.appcheck;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckRegistrar implements com.google.firebase.components.ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ V4.e b(p046e5.F f6, p046e5.F f10, p046e5.F f11, p046e5.F f12, p046e5.InterfaceC6532e interfaceC6532e) {
        return new Y4.h((Q4.f) interfaceC6532e.a(Q4.f.class), interfaceC6532e.d(E5.i.class), (java.util.concurrent.Executor) interfaceC6532e.c(f6), (java.util.concurrent.Executor) interfaceC6532e.c(f10), (java.util.concurrent.Executor) interfaceC6532e.c(f11), (java.util.concurrent.ScheduledExecutorService) interfaceC6532e.c(f12));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        final p046e5.F fA = p046e5.F.a(U4.d.class, java.util.concurrent.Executor.class);
        final p046e5.F fA2 = p046e5.F.a(U4.c.class, java.util.concurrent.Executor.class);
        final p046e5.F fA3 = p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class);
        final p046e5.F fA4 = p046e5.F.a(U4.b.class, java.util.concurrent.ScheduledExecutorService.class);
        return java.util.Arrays.asList(p046e5.C6530c.f(V4.e.class, p006a5.a.class).h("fire-app-check").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.i(fA)).b(p046e5.r.i(fA2)).b(p046e5.r.i(fA3)).b(p046e5.r.i(fA4)).b(p046e5.r.h(E5.i.class)).f(new p046e5.h() { // from class: V4.f
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.appcheck.FirebaseAppCheckRegistrar.b(fA, fA2, fA3, fA4, interfaceC6532e);
            }
        }).c().d(), E5.h.a(), M5.h.b("fire-app-check", "18.0.0"));
    }
}
