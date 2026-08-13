package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.LocalDateTime f47987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.ZoneOffset f47988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.ZoneOffset f47989d;

    b(long j6, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        this.f47986a = j6;
        this.f47987b = j$.time.LocalDateTime.T(j6, 0, zoneOffset);
        this.f47988c = zoneOffset;
        this.f47989d = zoneOffset2;
    }

    b(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f47986a = j$.time.chrono.AbstractC6701g.n(localDateTime, zoneOffset);
        this.f47987b = localDateTime;
        this.f47988c = zoneOffset;
        this.f47989d = zoneOffset2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a((byte) 2, this);
    }

    public final long L() {
        return this.f47986a;
    }

    public final boolean M() {
        return this.f47989d.getTotalSeconds() > this.f47988c.getTotalSeconds();
    }

    final void N(java.io.DataOutput dataOutput) {
        j$.time.zone.a.c(this.f47986a, dataOutput);
        j$.time.zone.a.d(this.f47988c, dataOutput);
        j$.time.zone.a.d(this.f47989d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.f47986a, ((j$.time.zone.b) obj).f47986a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j$.time.zone.b)) {
            return false;
        }
        j$.time.zone.b bVar = (j$.time.zone.b) obj;
        return this.f47986a == bVar.f47986a && this.f47988c.equals(bVar.f47988c) && this.f47989d.equals(bVar.f47989d);
    }

    public final int hashCode() {
        return (this.f47987b.hashCode() ^ this.f47988c.hashCode()) ^ java.lang.Integer.rotateLeft(this.f47989d.hashCode(), 16);
    }

    public final j$.time.LocalDateTime n() {
        return this.f47987b.W(this.f47989d.getTotalSeconds() - this.f47988c.getTotalSeconds());
    }

    public final j$.time.LocalDateTime p() {
        return this.f47987b;
    }

    public final j$.time.Duration q() {
        return j$.time.Duration.x(this.f47989d.getTotalSeconds() - this.f47988c.getTotalSeconds());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transition[");
        sb.append(M() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f47987b);
        sb.append(this.f47988c);
        sb.append(" to ");
        sb.append(this.f47989d);
        sb.append(']');
        return sb.toString();
    }

    public final j$.time.ZoneOffset u() {
        return this.f47989d;
    }

    public final j$.time.ZoneOffset x() {
        return this.f47988c;
    }

    final java.util.List y() {
        return M() ? java.util.Collections.emptyList() : j$.com.android.tools.r8.a.i(new java.lang.Object[]{this.f47988c, this.f47989d});
    }
}
