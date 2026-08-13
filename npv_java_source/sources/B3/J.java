package B3;

/* JADX INFO: loaded from: classes.dex */
public final class J implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f547i;

    public J(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz4, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz5, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz6, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz7, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz8) {
        this.f539a = interfaceC5078rz0;
        this.f540b = interfaceC5078rz1;
        this.f541c = interfaceC5078rz2;
        this.f542d = interfaceC5078rz3;
        this.f543e = interfaceC5078rz4;
        this.f544f = interfaceC5078rz5;
        this.f545g = interfaceC5078rz6;
        this.f546h = interfaceC5078rz7;
        this.f547i = interfaceC5078rz8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        P4.d dVarA;
        B3.BinderC0816w binderC0816w = (B3.BinderC0816w) this.f539a.b();
        com.google.android.gms.internal.ads.C5429v90 c5429v90 = (com.google.android.gms.internal.ads.C5429v90) this.f540b.b();
        B3.L lB = ((B3.M) this.f541c).b();
        com.google.android.gms.internal.ads.C3787gC c3787gCB = ((com.google.android.gms.internal.ads.C3897hC) this.f542d).b();
        com.google.android.gms.internal.ads.C3358cH c3358cH = (com.google.android.gms.internal.ads.C3358cH) this.f543e.b();
        B3.C c6 = (B3.C) this.f544f.b();
        com.google.android.gms.internal.ads.C2363Fq c2363Fq = (com.google.android.gms.internal.ads.C2363Fq) this.f545g.b();
        int iIntValue = ((java.lang.Integer) this.f546h.b()).intValue();
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C5434vC) this.f547i).a().f37526s;
        B3.N nA = null;
        if (iIntValue == 1 && c2363Fq != null) {
            bundle.putLong(com.google.android.gms.internal.ads.MN.READ_FROM_DISK_START.e(), p174r3.v.c().a());
            nA = c6.a(c2363Fq, binderC0816w, bundle);
            bundle.putLong(com.google.android.gms.internal.ads.MN.READ_FROM_DISK_END.e(), p174r3.v.c().a());
        }
        if (nA != null) {
            c3358cH.q1(nA);
            dVarA = com.google.android.gms.internal.ads.AbstractC2652Nk0.h(nA);
        } else {
            dVarA = c5429v90.b(com.google.android.gms.internal.ads.EnumC4770p90.GENERATE_SIGNALS, c3787gCB.c()).f(lB).i(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS).a();
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarA, new B3.C0818y(c3358cH), com.google.android.gms.internal.ads.AbstractC3524dr.f34795a);
        }
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(dVarA);
        return dVarA;
    }
}
