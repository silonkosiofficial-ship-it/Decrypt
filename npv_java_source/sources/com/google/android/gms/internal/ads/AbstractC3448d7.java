package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3448d7 implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4435m7 f34638C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f34639D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f34640E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f34641F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.Object f34642G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3667f7 f34643H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.Integer f34644I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3557e7 f34645J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f34646K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.google.android.gms.internal.ads.M6 f34647L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3338c7 f34648M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R6 f34649N;

    public AbstractC3448d7(int i6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3667f7 interfaceC3667f7) {
        android.net.Uri uri;
        java.lang.String host;
        this.f34638C = com.google.android.gms.internal.ads.C4435m7.f37286c ? new com.google.android.gms.internal.ads.C4435m7() : null;
        this.f34642G = new java.lang.Object();
        int iHashCode = 0;
        this.f34646K = false;
        this.f34647L = null;
        this.f34639D = i6;
        this.f34640E = str;
        this.f34643H = interfaceC3667f7;
        this.f34649N = new com.google.android.gms.internal.ads.R6();
        if (!android.text.TextUtils.isEmpty(str) && (uri = android.net.Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f34641F = iHashCode;
    }

    final void A() {
        com.google.android.gms.internal.ads.InterfaceC3338c7 interfaceC3338c7;
        synchronized (this.f34642G) {
            interfaceC3338c7 = this.f34648M;
        }
        if (interfaceC3338c7 != null) {
            interfaceC3338c7.a(this);
        }
    }

    final void B(com.google.android.gms.internal.ads.C3887h7 c3887h7) {
        com.google.android.gms.internal.ads.InterfaceC3338c7 interfaceC3338c7;
        synchronized (this.f34642G) {
            interfaceC3338c7 = this.f34648M;
        }
        if (interfaceC3338c7 != null) {
            interfaceC3338c7.b(this, c3887h7);
        }
    }

    final void C(int i6) {
        com.google.android.gms.internal.ads.C3557e7 c3557e7 = this.f34645J;
        if (c3557e7 != null) {
            c3557e7.c(this, i6);
        }
    }

    final void D(com.google.android.gms.internal.ads.InterfaceC3338c7 interfaceC3338c7) {
        synchronized (this.f34642G) {
            this.f34648M = interfaceC3338c7;
        }
    }

    public final boolean E() {
        boolean z6;
        synchronized (this.f34642G) {
            z6 = this.f34646K;
        }
        return z6;
    }

    public final boolean F() {
        synchronized (this.f34642G) {
        }
        return false;
    }

    public byte[] G() {
        return null;
    }

    public final com.google.android.gms.internal.ads.R6 H() {
        return this.f34649N;
    }

    public final int a() {
        return this.f34639D;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.f34644I.intValue() - ((com.google.android.gms.internal.ads.AbstractC3448d7) obj).f34644I.intValue();
    }

    public final int e() {
        return this.f34649N.b();
    }

    public final int g() {
        return this.f34641F;
    }

    public final com.google.android.gms.internal.ads.M6 i() {
        return this.f34647L;
    }

    public final com.google.android.gms.internal.ads.AbstractC3448d7 m(com.google.android.gms.internal.ads.M6 m6) {
        this.f34647L = m6;
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC3448d7 n(com.google.android.gms.internal.ads.C3557e7 c3557e7) {
        this.f34645J = c3557e7;
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC3448d7 o(int i6) {
        this.f34644I = java.lang.Integer.valueOf(i6);
        return this;
    }

    protected abstract com.google.android.gms.internal.ads.C3887h7 q(com.google.android.gms.internal.ads.Z6 z6);

    public final java.lang.String s() {
        int i6 = this.f34639D;
        java.lang.String str = this.f34640E;
        if (i6 == 0) {
            return str;
        }
        return java.lang.Integer.toString(1) + "-" + str;
    }

    public final java.lang.String t() {
        return this.f34640E;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Integer.toHexString(this.f34641F));
        F();
        return "[ ] " + this.f34640E + " " + "0x".concat(strValueOf) + " NORMAL " + this.f34644I;
    }

    public java.util.Map u() {
        return java.util.Collections.emptyMap();
    }

    public final void v(java.lang.String str) {
        if (com.google.android.gms.internal.ads.C4435m7.f37286c) {
            this.f34638C.a(str, java.lang.Thread.currentThread().getId());
        }
    }

    public final void w(com.google.android.gms.internal.ads.C4215k7 c4215k7) {
        com.google.android.gms.internal.ads.InterfaceC3667f7 interfaceC3667f7;
        synchronized (this.f34642G) {
            interfaceC3667f7 = this.f34643H;
        }
        interfaceC3667f7.a(c4215k7);
    }

    protected abstract void x(java.lang.Object obj);

    final void y(java.lang.String str) {
        com.google.android.gms.internal.ads.C3557e7 c3557e7 = this.f34645J;
        if (c3557e7 != null) {
            c3557e7.b(this);
        }
        if (com.google.android.gms.internal.ads.C4435m7.f37286c) {
            long id = java.lang.Thread.currentThread().getId();
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.google.android.gms.internal.ads.RunnableC3229b7(this, str, id));
            } else {
                this.f34638C.a(str, id);
                this.f34638C.b(toString());
            }
        }
    }

    public final void z() {
        synchronized (this.f34642G) {
            this.f34646K = true;
        }
    }
}
