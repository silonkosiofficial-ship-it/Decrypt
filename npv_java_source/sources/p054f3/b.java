package p054f3;

/* JADX INFO: loaded from: classes.dex */
final class b extends p054f3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p084i3.a f44940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44941b;

    b(p084i3.a aVar, java.util.Map map) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("Null clock");
        }
        this.f44940a = aVar;
        if (map == null) {
            throw new java.lang.NullPointerException("Null values");
        }
        this.f44941b = map;
    }

    @Override // p054f3.f
    p084i3.a e() {
        return this.f44940a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p054f3.f)) {
            return false;
        }
        p054f3.f fVar = (p054f3.f) obj;
        return this.f44940a.equals(fVar.e()) && this.f44941b.equals(fVar.h());
    }

    @Override // p054f3.f
    java.util.Map h() {
        return this.f44941b;
    }

    public int hashCode() {
        return ((this.f44940a.hashCode() ^ 1000003) * 1000003) ^ this.f44941b.hashCode();
    }

    public java.lang.String toString() {
        return "SchedulerConfig{clock=" + this.f44940a + ", values=" + this.f44941b + "}";
    }
}
