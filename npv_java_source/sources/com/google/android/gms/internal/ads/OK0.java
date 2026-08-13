package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class OK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f30482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4530n f30483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4292kr f30484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2612Mj f30485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f30486e = com.google.android.gms.internal.ads.AbstractC3398ci0.O();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4447mD f30487f = com.google.android.gms.internal.ads.InterfaceC4447mD.f37298a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30488g;

    public OK0(android.content.Context context, com.google.android.gms.internal.ads.C4530n c4530n) {
        this.f30482a = context.getApplicationContext();
        this.f30483b = c4530n;
    }

    public final com.google.android.gms.internal.ads.OK0 d(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f30487f = interfaceC4447mD;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4090j e() {
        com.google.android.gms.internal.ads.LC.f(!this.f30488g);
        com.google.android.gms.internal.ads.AbstractC3982i abstractC3982i = null;
        if (this.f30485d == null) {
            if (this.f30484c == null) {
                this.f30484c = new com.google.android.gms.internal.ads.C3762g(null);
            }
            this.f30485d = new com.google.android.gms.internal.ads.C3872h(this.f30484c);
        }
        com.google.android.gms.internal.ads.C4090j c4090j = new com.google.android.gms.internal.ads.C4090j(this, abstractC3982i);
        this.f30488g = true;
        return c4090j;
    }
}
