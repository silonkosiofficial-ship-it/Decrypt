package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W2.b f16324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16325b;

    public h(W2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new java.lang.NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        this.f16324a = bVar;
        this.f16325b = bArr;
    }

    public byte[] a() {
        return this.f16325b;
    }

    public W2.b b() {
        return this.f16324a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2.h)) {
            return false;
        }
        Y2.h hVar = (Y2.h) obj;
        if (this.f16324a.equals(hVar.f16324a)) {
            return java.util.Arrays.equals(this.f16325b, hVar.f16325b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16324a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f16325b);
    }

    public java.lang.String toString() {
        return "EncodedPayload{encoding=" + this.f16324a + ", bytes=[...]}";
    }
}
