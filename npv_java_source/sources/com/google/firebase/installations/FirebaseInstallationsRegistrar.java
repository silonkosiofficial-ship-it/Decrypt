package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ G5.e lambda$getComponents$0(p046e5.InterfaceC6532e interfaceC6532e) {
        return new com.google.firebase.installations.c((Q4.f) interfaceC6532e.a(Q4.f.class), interfaceC6532e.d(E5.i.class), (java.util.concurrent.ExecutorService) interfaceC6532e.c(p046e5.F.a(U4.a.class, java.util.concurrent.ExecutorService.class)), p056f5.j.b((java.util.concurrent.Executor) interfaceC6532e.c(p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(G5.e.class).h("fire-installations").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.h(E5.i.class)).b(p046e5.r.i(p046e5.F.a(U4.a.class, java.util.concurrent.ExecutorService.class))).b(p046e5.r.i(p046e5.F.a(U4.b.class, java.util.concurrent.Executor.class))).f(new p046e5.h() { // from class: G5.f
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.installations.FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC6532e);
            }
        }).d(), E5.h.a(), M5.h.b("fire-installations", "18.0.0"));
    }
}
