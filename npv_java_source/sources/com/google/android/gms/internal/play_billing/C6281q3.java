package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6281q3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6281q3 f41637c = new com.google.android.gms.internal.play_billing.C6281q3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f41638d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f41640b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6304u3 f41639a = new com.google.android.gms.internal.play_billing.C6191b3();

    private C6281q3() {
    }

    public static com.google.android.gms.internal.play_billing.C6281q3 a() {
        return f41637c;
    }

    public final com.google.android.gms.internal.play_billing.InterfaceC6298t3 b(java.lang.Class cls) {
        com.google.android.gms.internal.play_billing.Q2.c(cls, "messageType");
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3A = (com.google.android.gms.internal.play_billing.InterfaceC6298t3) this.f41640b.get(cls);
        if (interfaceC6298t3A == null) {
            interfaceC6298t3A = this.f41639a.a(cls);
            com.google.android.gms.internal.play_billing.Q2.c(cls, "messageType");
            com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3 = (com.google.android.gms.internal.play_billing.InterfaceC6298t3) this.f41640b.putIfAbsent(cls, interfaceC6298t3A);
            if (interfaceC6298t3 != null) {
                return interfaceC6298t3;
            }
        }
        return interfaceC6298t3A;
    }
}
