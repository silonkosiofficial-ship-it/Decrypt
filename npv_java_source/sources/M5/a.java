package M5;

/* JADX INFO: loaded from: classes3.dex */
final class a extends M5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f7027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f7028b;

    a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null libraryName");
        }
        this.f7027a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null version");
        }
        this.f7028b = str2;
    }

    @Override // M5.f
    public java.lang.String b() {
        return this.f7027a;
    }

    @Override // M5.f
    public java.lang.String c() {
        return this.f7028b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M5.f)) {
            return false;
        }
        M5.f fVar = (M5.f) obj;
        return this.f7027a.equals(fVar.b()) && this.f7028b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f7027a.hashCode() ^ 1000003) * 1000003) ^ this.f7028b.hashCode();
    }

    public java.lang.String toString() {
        return "LibraryVersion{libraryName=" + this.f7027a + ", version=" + this.f7028b + "}";
    }
}
