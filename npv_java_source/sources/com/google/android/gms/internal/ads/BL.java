package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class BL implements p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.InterfaceC5483vi, p204u3.z, com.google.android.gms.internal.ads.InterfaceC5703xi, p204u3.InterfaceC7202d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p184s3.InterfaceC7076a f25946C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5483vi f25947D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p204u3.z f25948E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5703xi f25949F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p204u3.InterfaceC7202d f25950G;

    @Override // com.google.android.gms.internal.ads.InterfaceC5483vi
    public final synchronized void C(java.lang.String str, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi = this.f25947D;
        if (interfaceC5483vi != null) {
            interfaceC5483vi.C(str, bundle);
        }
    }

    @Override // p204u3.z
    public final synchronized void T2() {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.T2();
        }
    }

    protected final synchronized void a(p184s3.InterfaceC7076a interfaceC7076a, com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi, p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi, p204u3.InterfaceC7202d interfaceC7202d) {
        this.f25946C = interfaceC7076a;
        this.f25947D = interfaceC5483vi;
        this.f25948E = zVar;
        this.f25949F = interfaceC5703xi;
        this.f25950G = interfaceC7202d;
    }

    @Override // p204u3.z
    public final synchronized void d2() {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.d2();
        }
    }

    @Override // p184s3.InterfaceC7076a
    public final synchronized void e0() {
        p184s3.InterfaceC7076a interfaceC7076a = this.f25946C;
        if (interfaceC7076a != null) {
            interfaceC7076a.e0();
        }
    }

    @Override // p204u3.z
    public final synchronized void f3() {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.f3();
        }
    }

    @Override // p204u3.InterfaceC7202d
    public final synchronized void i() {
        p204u3.InterfaceC7202d interfaceC7202d = this.f25950G;
        if (interfaceC7202d != null) {
            interfaceC7202d.i();
        }
    }

    @Override // p204u3.z
    public final synchronized void p4(int i6) {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.p4(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5703xi
    public final synchronized void q(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi = this.f25949F;
        if (interfaceC5703xi != null) {
            interfaceC5703xi.q(str, str2);
        }
    }

    @Override // p204u3.z
    public final synchronized void q0() {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.q0();
        }
    }

    @Override // p204u3.z
    public final synchronized void y0() {
        p204u3.z zVar = this.f25948E;
        if (zVar != null) {
            zVar.y0();
        }
    }
}
