package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public class k extends java.io.IOException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p158p8.p f52823C;

    public k(java.lang.String str) {
        super(str);
        this.f52823C = null;
    }

    static p158p8.k b() {
        return new p158p8.k("Protocol message end-group tag did not match expected tag.");
    }

    static p158p8.k c() {
        return new p158p8.k("Protocol message contained an invalid tag (zero).");
    }

    static p158p8.k d() {
        return new p158p8.k("Protocol message had invalid UTF-8.");
    }

    static p158p8.k e() {
        return new p158p8.k("Protocol message tag had invalid wire type.");
    }

    static p158p8.k f() {
        return new p158p8.k("CodedInputStream encountered a malformed varint.");
    }

    static p158p8.k g() {
        return new p158p8.k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static p158p8.k h() {
        return new p158p8.k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static p158p8.k j() {
        return new p158p8.k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static p158p8.k k() {
        return new p158p8.k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p158p8.p a() {
        return this.f52823C;
    }

    public p158p8.k i(p158p8.p pVar) {
        this.f52823C = pVar;
        return this;
    }
}
