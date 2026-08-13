package com.google.firebase.database;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class DatabaseRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.database.a lambda$getComponents$0(p046e5.InterfaceC6532e interfaceC6532e) {
        return new com.google.firebase.database.a((Q4.f) interfaceC6532e.a(Q4.f.class), interfaceC6532e.i(p036d5.a.class), interfaceC6532e.i(p006a5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<p046e5.C6530c> getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(com.google.firebase.database.a.class).h("fire-rtdb").b(p046e5.r.j(Q4.f.class)).b(p046e5.r.a(p036d5.a.class)).b(p046e5.r.a(p006a5.a.class)).f(new p046e5.h() { // from class: u5.a
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return com.google.firebase.database.DatabaseRegistrar.lambda$getComponents$0(interfaceC6532e);
            }
        }).d(), M5.h.b("fire-rtdb", "21.0.0"));
    }
}
