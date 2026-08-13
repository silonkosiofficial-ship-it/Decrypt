package M4;

/* JADX INFO: loaded from: classes3.dex */
final class a extends M4.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final M4.a f7010C = new M4.a();

    private a() {
    }

    static M4.g e() {
        return f7010C;
    }

    @Override // M4.g
    public java.lang.Object b() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // M4.g
    public boolean c() {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public java.lang.String toString() {
        return "Optional.absent()";
    }
}
