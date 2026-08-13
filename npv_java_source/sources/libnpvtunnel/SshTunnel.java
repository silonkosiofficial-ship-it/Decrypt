package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public final class SshTunnel implements go.Seq.Proxy {
    private final int refnum;

    static {
        libnpvtunnel.Libnpvtunnel.touch();
    }

    public SshTunnel() {
        int i__NewSshTunnel = __NewSshTunnel();
        this.refnum = i__NewSshTunnel;
        go.Seq.trackGoRef(i__NewSshTunnel, this);
    }

    SshTunnel(int i6) {
        this.refnum = i6;
        go.Seq.trackGoRef(i6, this);
    }

    private static native int __NewSshTunnel();

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof libnpvtunnel.SshTunnel)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        go.Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native long measureDelay(java.lang.String str, long j6);

    public native void reconnect();

    public native void start(byte[] bArr, libnpvtunnel.SshTunnelInterface sshTunnelInterface, boolean z6, java.lang.String str, long j6, long j10, boolean z10, boolean z11, boolean z12, java.lang.String str2);

    public native void stop();

    public java.lang.String toString() {
        return "SshTunnel{}";
    }
}
