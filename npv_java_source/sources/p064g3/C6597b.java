package p064g3;

/* JADX INFO: renamed from: g3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C6597b extends p064g3.AbstractC6606k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f45507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y2.p f45508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y2.i f45509c;

    C6597b(long j6, Y2.p pVar, Y2.i iVar) {
        this.f45507a = j6;
        if (pVar == null) {
            throw new java.lang.NullPointerException("Null transportContext");
        }
        this.f45508b = pVar;
        if (iVar == null) {
            throw new java.lang.NullPointerException("Null event");
        }
        this.f45509c = iVar;
    }

    @Override // p064g3.AbstractC6606k
    public Y2.i b() {
        return this.f45509c;
    }

    @Override // p064g3.AbstractC6606k
    public long c() {
        return this.f45507a;
    }

    @Override // p064g3.AbstractC6606k
    public Y2.p d() {
        return this.f45508b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p064g3.AbstractC6606k)) {
            return false;
        }
        p064g3.AbstractC6606k abstractC6606k = (p064g3.AbstractC6606k) obj;
        return this.f45507a == abstractC6606k.c() && this.f45508b.equals(abstractC6606k.d()) && this.f45509c.equals(abstractC6606k.b());
    }

    public int hashCode() {
        long j6 = this.f45507a;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f45508b.hashCode()) * 1000003) ^ this.f45509c.hashCode();
    }

    public java.lang.String toString() {
        return "PersistedEvent{id=" + this.f45507a + ", transportContext=" + this.f45508b + ", event=" + this.f45509c + "}";
    }
}
