package com.google.firebase.datatransport;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W2.i lambda$getComponents$0(p046e5.InterfaceC6532e interfaceC6532e) {
        Y2.u.f((android.content.Context) interfaceC6532e.a(android.content.Context.class));
        return Y2.u.c().g(com.google.android.datatransport.cct.a.f24687h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W2.i lambda$getComponents$1(p046e5.InterfaceC6532e interfaceC6532e) {
        Y2.u.f((android.content.Context) interfaceC6532e.a(android.content.Context.class));
        return Y2.u.c().g(com.google.android.datatransport.cct.a.f24687h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W2.i lambda$getComponents$2(p046e5.InterfaceC6532e interfaceC6532e) {
        Y2.u.f((android.content.Context) interfaceC6532e.a(android.content.Context.class));
        return Y2.u.c().g(com.google.android.datatransport.cct.a.f24686g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(W2.i.class).h("fire-transport").b(p046e5.r.j(android.content.Context.class)).f(new p046e5.h() { // from class: x5.c
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.c(p046e5.F.a(p236x5.a.class, W2.i.class)).b(p046e5.r.j(android.content.Context.class)).f(new p046e5.h() { // from class: x5.d
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$1(interfaceC6532e);
            }
        }).d(), p046e5.C6530c.c(p046e5.F.a(p236x5.b.class, W2.i.class)).b(p046e5.r.j(android.content.Context.class)).f(new p046e5.h() { // from class: x5.e
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$2(interfaceC6532e);
            }
        }).d(), M5.h.b("fire-transport", "19.0.0"));
    }
}
