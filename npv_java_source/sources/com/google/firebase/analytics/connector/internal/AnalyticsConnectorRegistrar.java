package com.google.firebase.analytics.connector.internal;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"MissingPermission"})
    public java.util.List<p046e5.C6530c> getComponents() {
        return java.util.Arrays.asList(p046e5.C6530c.e(T4.a.class).b(p046e5.r.j(Q4.f.class)).b(p046e5.r.j(android.content.Context.class)).b(p046e5.r.j(D5.d.class)).f(new p046e5.h() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return T4.b.g((Q4.f) interfaceC6532e.a(Q4.f.class), (android.content.Context) interfaceC6532e.a(android.content.Context.class), (D5.d) interfaceC6532e.a(D5.d.class));
            }
        }).e().d(), M5.h.b("fire-analytics", "22.1.2"));
    }
}
