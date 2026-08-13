package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class RemoteConfigRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.remoteconfig.c lambda$getComponents$0(p046e5.F f6, p046e5.InterfaceC6532e interfaceC6532e) {
        return new com.google.firebase.remoteconfig.c((android.content.Context) interfaceC6532e.a(android.content.Context.class), (java.util.concurrent.ScheduledExecutorService) interfaceC6532e.c(f6), (Q4.f) interfaceC6532e.a(Q4.f.class), (G5.e) interfaceC6532e.a(G5.e.class), ((com.google.firebase.abt.component.a) interfaceC6532e.a(com.google.firebase.abt.component.a.class)).b("frc"), interfaceC6532e.d(T4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        final p046e5.F fA = p046e5.F.a(U4.b.class, java.util.concurrent.ScheduledExecutorService.class);
        return java.util.Arrays.asList(p046e5.C6530c.f(com.google.firebase.remoteconfig.c.class, P5.a.class).h("fire-rc").b(p046e5.r.j(android.content.Context.class)).b(p046e5.r.i(fA)).b(p046e5.r.j(Q4.f.class)).b(p046e5.r.j(G5.e.class)).b(p046e5.r.j(com.google.firebase.abt.component.a.class)).b(p046e5.r.h(T4.a.class)).f(new p046e5.h() { // from class: N5.q
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.remoteconfig.RemoteConfigRegistrar.lambda$getComponents$0(fA, interfaceC6532e);
            }
        }).e().d(), M5.h.b("fire-rc", "22.0.1"));
    }
}
