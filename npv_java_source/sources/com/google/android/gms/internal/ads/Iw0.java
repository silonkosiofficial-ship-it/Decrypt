package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Iw0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f28538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.net.DatagramPacket f28539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.net.Uri f28540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.net.DatagramSocket f28541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.net.MulticastSocket f28542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.net.InetAddress f28543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28545l;

    public Iw0(int i6) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f28538e = bArr;
        this.f28539f = new java.net.DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C4193jw0 {
        if (i10 == 0) {
            return 0;
        }
        if (this.f28545l == 0) {
            try {
                java.net.DatagramSocket datagramSocket = this.f28541h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f28539f);
                int length = this.f28539f.getLength();
                this.f28545l = length;
                D(length);
            } catch (java.net.SocketTimeoutException e6) {
                throw new com.google.android.gms.internal.ads.C4193jw0(e6, 2002);
            } catch (java.io.IOException e10) {
                throw new com.google.android.gms.internal.ads.C4193jw0(e10, 2001);
            }
        }
        int length2 = this.f28539f.getLength();
        int i11 = this.f28545l;
        int iMin = java.lang.Math.min(i11, i10);
        java.lang.System.arraycopy(this.f28538e, length2 - i11, bArr, i6, iMin);
        this.f28545l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C4193jw0 {
        android.net.Uri uri = c3843gl0.f35675a;
        this.f28540g = uri;
        java.lang.String host = uri.getHost();
        host.getClass();
        int port = this.f28540g.getPort();
        h(c3843gl0);
        try {
            this.f28543j = java.net.InetAddress.getByName(host);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.f28543j, port);
            if (this.f28543j.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.f28542i = multicastSocket;
                multicastSocket.joinGroup(this.f28543j);
                this.f28541h = this.f28542i;
            } else {
                this.f28541h = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.f28541h.setSoTimeout(8000);
            this.f28544k = true;
            i(c3843gl0);
            return -1L;
        } catch (java.io.IOException e6) {
            throw new com.google.android.gms.internal.ads.C4193jw0(e6, 2001);
        } catch (java.lang.SecurityException e10) {
            throw new com.google.android.gms.internal.ads.C4193jw0(e10, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f28540g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f28540g = null;
        java.net.MulticastSocket multicastSocket = this.f28542i;
        if (multicastSocket != null) {
            try {
                java.net.InetAddress inetAddress = this.f28543j;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.f28542i = null;
            } catch (java.io.IOException unused) {
            }
        }
        java.net.DatagramSocket datagramSocket = this.f28541h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f28541h = null;
        }
        this.f28543j = null;
        this.f28545l = 0;
        if (this.f28544k) {
            this.f28544k = false;
            g();
        }
    }
}
