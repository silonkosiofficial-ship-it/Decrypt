package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2065z extends java.io.IOException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.datastore.preferences.protobuf.O f22240C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f22241D;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends androidx.datastore.preferences.protobuf.C2065z {
        public a(java.lang.String str) {
            super(str);
        }
    }

    public C2065z(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f22240C = null;
    }

    public C2065z(java.lang.String str) {
        super(str);
        this.f22240C = null;
    }

    static androidx.datastore.preferences.protobuf.C2065z b() {
        return new androidx.datastore.preferences.protobuf.C2065z("Protocol message end-group tag did not match expected tag.");
    }

    static androidx.datastore.preferences.protobuf.C2065z c() {
        return new androidx.datastore.preferences.protobuf.C2065z("Protocol message contained an invalid tag (zero).");
    }

    static androidx.datastore.preferences.protobuf.C2065z d() {
        return new androidx.datastore.preferences.protobuf.C2065z("Protocol message had invalid UTF-8.");
    }

    static androidx.datastore.preferences.protobuf.C2065z.a e() {
        return new androidx.datastore.preferences.protobuf.C2065z.a("Protocol message tag had invalid wire type.");
    }

    static androidx.datastore.preferences.protobuf.C2065z f() {
        return new androidx.datastore.preferences.protobuf.C2065z("CodedInputStream encountered a malformed varint.");
    }

    static androidx.datastore.preferences.protobuf.C2065z g() {
        return new androidx.datastore.preferences.protobuf.C2065z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static androidx.datastore.preferences.protobuf.C2065z h() {
        return new androidx.datastore.preferences.protobuf.C2065z("Failed to parse the message.");
    }

    static androidx.datastore.preferences.protobuf.C2065z i() {
        return new androidx.datastore.preferences.protobuf.C2065z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static androidx.datastore.preferences.protobuf.C2065z l() {
        return new androidx.datastore.preferences.protobuf.C2065z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static androidx.datastore.preferences.protobuf.C2065z m() {
        return new androidx.datastore.preferences.protobuf.C2065z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f22241D;
    }

    void j() {
        this.f22241D = true;
    }

    public androidx.datastore.preferences.protobuf.C2065z k(androidx.datastore.preferences.protobuf.O o6) {
        this.f22240C = o6;
        return this;
    }
}
