package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public final class XrayTunnel implements go.Seq.Proxy {
    private final int refnum;

    static {
        libnpvtunnel.Libnpvtunnel.touch();
    }

    public XrayTunnel() {
        int i__NewXrayTunnel = __NewXrayTunnel();
        this.refnum = i__NewXrayTunnel;
        go.Seq.trackGoRef(i__NewXrayTunnel, this);
    }

    XrayTunnel(int i6) {
        this.refnum = i6;
        go.Seq.trackGoRef(i6, this);
    }

    private static native int __NewXrayTunnel();

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof libnpvtunnel.XrayTunnel)) {
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

    public native long queryStats(java.lang.String str);

    public native void start(byte[] bArr, libnpvtunnel.XrayTunnelInterface xrayTunnelInterface, java.lang.String str, java.lang.String str2, boolean z6, boolean z10, boolean z11, boolean z12, java.lang.String str3);

    public native void stop();

    public java.lang.String toString() {
        return "XrayTunnel{}";
    }
}
