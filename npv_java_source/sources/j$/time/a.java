package j$.time;

/* JADX INFO: loaded from: classes4.dex */
final class a extends j$.time.Clock implements java.io.Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final j$.time.a f47708b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.ZoneId f47709a;

    static {
        java.lang.System.currentTimeMillis();
        f47708b = new j$.time.a(j$.time.ZoneOffset.UTC);
    }

    a(j$.time.ZoneId zoneId) {
        this.f47709a = zoneId;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final j$.time.ZoneId a() {
        return this.f47709a;
    }

    @Override // j$.time.Clock
    public final long b() {
        return java.lang.System.currentTimeMillis();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof j$.time.a)) {
            return false;
        }
        return this.f47709a.equals(((j$.time.a) obj).f47709a);
    }

    public final int hashCode() {
        return this.f47709a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final j$.time.Instant instant() {
        return j$.time.Instant.ofEpochMilli(java.lang.System.currentTimeMillis());
    }

    public final java.lang.String toString() {
        return "SystemClock[" + this.f47709a + "]";
    }
}
