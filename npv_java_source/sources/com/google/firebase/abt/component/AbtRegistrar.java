package com.google.firebase.abt.component;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class AbtRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.abt.component.a lambda$getComponents$0(p046e5.InterfaceC6532e interfaceC6532e) {
        return new com.google.firebase.abt.component.a((android.content.Context) interfaceC6532e.a(android.content.Context.class), interfaceC6532e.d(T4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(com.google.firebase.abt.component.a.class).h("fire-abt").b(p046e5.r.j(android.content.Context.class)).b(p046e5.r.h(T4.a.class)).f(new p046e5.h() { // from class: S4.a
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.abt.component.AbtRegistrar.lambda$getComponents$0(interfaceC6532e);
            }
        }).d(), M5.h.b("fire-abt", "21.1.1"));
    }
}
