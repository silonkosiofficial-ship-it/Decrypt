package M4;

/* JADX INFO: loaded from: classes3.dex */
final class i extends M4.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f7019C;

    i(java.lang.Object obj) {
        this.f7019C = obj;
    }

    @Override // M4.g
    public java.lang.Object b() {
        return this.f7019C;
    }

    @Override // M4.g
    public boolean c() {
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof M4.i) {
            return this.f7019C.equals(((M4.i) obj).f7019C);
        }
        return false;
    }

    public int hashCode() {
        return this.f7019C.hashCode() + 1502476572;
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.f7019C);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
