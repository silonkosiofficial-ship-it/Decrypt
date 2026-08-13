package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2160Ae0 extends com.google.android.gms.internal.ads.AbstractC5256te0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2865Tg0 f25204C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2865Tg0 f25205D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5916ze0 f25206E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.net.HttpURLConnection f25207F;

    C2160Ae0() {
        this(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.ve0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return com.google.android.gms.internal.ads.C2160Ae0.f();
            }
        }, new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.we0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return com.google.android.gms.internal.ads.C2160Ae0.g();
            }
        }, null);
    }

    C2160Ae0(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0, com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg1, com.google.android.gms.internal.ads.InterfaceC5916ze0 interfaceC5916ze0) {
        this.f25204C = interfaceC2865Tg0;
        this.f25205D = interfaceC2865Tg1;
        this.f25206E = interfaceC5916ze0;
    }

    static /* synthetic */ java.lang.Integer f() {
        return -1;
    }

    static /* synthetic */ java.lang.Integer g() {
        return -1;
    }

    public static void y(java.net.HttpURLConnection httpURLConnection) {
        com.google.android.gms.internal.ads.AbstractC5366ue0.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y(this.f25207F);
    }

    public java.net.HttpURLConnection r() {
        com.google.android.gms.internal.ads.AbstractC5366ue0.b(((java.lang.Integer) this.f25204C.a()).intValue(), ((java.lang.Integer) this.f25205D.a()).intValue());
        com.google.android.gms.internal.ads.InterfaceC5916ze0 interfaceC5916ze0 = this.f25206E;
        interfaceC5916ze0.getClass();
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) interfaceC5916ze0.a();
        this.f25207F = httpURLConnection;
        return httpURLConnection;
    }

    public java.net.HttpURLConnection s(com.google.android.gms.internal.ads.InterfaceC5916ze0 interfaceC5916ze0, final int i6, final int i10) {
        this.f25204C = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.xe0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return java.lang.Integer.valueOf(i6);
            }
        };
        this.f25205D = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.ye0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return java.lang.Integer.valueOf(i10);
            }
        };
        this.f25206E = interfaceC5916ze0;
        return r();
    }
}
