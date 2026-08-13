package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6073m5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.C6073m5 f41039c = new com.google.android.gms.internal.measurement.C6073m5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f41041b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC6091o5 f41040a = new com.google.android.gms.internal.measurement.N4();

    private C6073m5() {
    }

    public static com.google.android.gms.internal.measurement.C6073m5 a() {
        return f41039c;
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6100p5 b(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.AbstractC6146v4.f(cls, "messageType");
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5 = (com.google.android.gms.internal.measurement.InterfaceC6100p5) this.f41041b.get(cls);
        if (interfaceC6100p5 != null) {
            return interfaceC6100p5;
        }
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5A = this.f41040a.a(cls);
        com.google.android.gms.internal.measurement.AbstractC6146v4.f(cls, "messageType");
        com.google.android.gms.internal.measurement.AbstractC6146v4.f(interfaceC6100p5A, "schema");
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p6 = (com.google.android.gms.internal.measurement.InterfaceC6100p5) this.f41041b.putIfAbsent(cls, interfaceC6100p5A);
        return interfaceC6100p6 != null ? interfaceC6100p6 : interfaceC6100p5A;
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6100p5 c(java.lang.Object obj) {
        return b(obj.getClass());
    }
}
