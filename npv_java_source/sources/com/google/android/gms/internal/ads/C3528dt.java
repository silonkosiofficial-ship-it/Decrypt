package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3528dt extends javax.net.ssl.SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final javax.net.ssl.SSLSocketFactory f34834a = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3638et f34835b;

    C3528dt(com.google.android.gms.internal.ads.C3638et c3638et) {
        this.f34835b = c3638et;
    }

    private final java.net.Socket a(java.net.Socket socket) throws java.net.SocketException {
        com.google.android.gms.internal.ads.C3638et c3638et = this.f34835b;
        if (c3638et.f35103s > 0) {
            socket.setReceiveBufferSize(c3638et.f35103s);
        }
        this.f34835b.f35104t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i6) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.f34834a.createSocket(str, i6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i6, java.net.InetAddress inetAddress, int i10) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.f34834a.createSocket(str, i6, inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i6) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.f34834a.createSocket(inetAddress, i6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i6, java.net.InetAddress inetAddress2, int i10) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.f34834a.createSocket(inetAddress, i6, inetAddress2, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i6, boolean z6) throws java.io.IOException {
        java.net.Socket socketCreateSocket = this.f34834a.createSocket(socket, str, i6, z6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.f34834a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.f34834a.getSupportedCipherSuites();
    }
}
