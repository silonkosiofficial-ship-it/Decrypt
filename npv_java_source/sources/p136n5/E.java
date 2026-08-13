package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class E extends n5.G.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51525c;

    E(java.lang.String str, java.lang.String str2, boolean z6) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null osRelease");
        }
        this.f51523a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null osCodeName");
        }
        this.f51524b = str2;
        this.f51525c = z6;
    }

    @Override // n5.G.c
    public boolean b() {
        return this.f51525c;
    }

    @Override // n5.G.c
    public java.lang.String c() {
        return this.f51524b;
    }

    @Override // n5.G.c
    public java.lang.String d() {
        return this.f51523a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.G.c)) {
            return false;
        }
        n5.G.c cVar = (n5.G.c) obj;
        return this.f51523a.equals(cVar.d()) && this.f51524b.equals(cVar.c()) && this.f51525c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f51523a.hashCode() ^ 1000003) * 1000003) ^ this.f51524b.hashCode()) * 1000003) ^ (this.f51525c ? 1231 : 1237);
    }

    public java.lang.String toString() {
        return "OsData{osRelease=" + this.f51523a + ", osCodeName=" + this.f51524b + ", isRooted=" + this.f51525c + "}";
    }
}
