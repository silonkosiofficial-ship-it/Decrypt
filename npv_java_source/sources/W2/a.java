package W2;

/* JADX INFO: loaded from: classes.dex */
final class a extends W2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f15327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f15328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2.e f15329c;

    a(java.lang.Integer num, java.lang.Object obj, W2.e eVar, W2.f fVar, W2.d dVar) {
        this.f15327a = num;
        if (obj == null) {
            throw new java.lang.NullPointerException("Null payload");
        }
        this.f15328b = obj;
        if (eVar == null) {
            throw new java.lang.NullPointerException("Null priority");
        }
        this.f15329c = eVar;
    }

    @Override // W2.c
    public java.lang.Integer a() {
        return this.f15327a;
    }

    @Override // W2.c
    public W2.d b() {
        return null;
    }

    @Override // W2.c
    public java.lang.Object c() {
        return this.f15328b;
    }

    @Override // W2.c
    public W2.e d() {
        return this.f15329c;
    }

    @Override // W2.c
    public W2.f e() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W2.c)) {
            return false;
        }
        W2.c cVar = (W2.c) obj;
        java.lang.Integer num = this.f15327a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f15328b.equals(cVar.c()) && this.f15329c.equals(cVar.d())) {
                cVar.e();
                cVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Integer num = this.f15327a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f15328b.hashCode()) * 1000003) ^ this.f15329c.hashCode()) * (-721379959);
    }

    public java.lang.String toString() {
        return "Event{code=" + this.f15327a + ", payload=" + this.f15328b + ", priority=" + this.f15329c + ", productData=" + ((java.lang.Object) null) + ", eventContext=" + ((java.lang.Object) null) + "}";
    }
}
