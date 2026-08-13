package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f46697C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f46698D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f46699E;

    public A(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f46697C = obj;
        this.f46698D = obj2;
        this.f46699E = obj3;
    }

    public final java.lang.Object a() {
        return this.f46697C;
    }

    public final java.lang.Object b() {
        return this.f46698D;
    }

    public final java.lang.Object c() {
        return this.f46699E;
    }

    public final java.lang.Object d() {
        return this.f46699E;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p087i7.A)) {
            return false;
        }
        p087i7.A a6 = (p087i7.A) obj;
        return p247y7.AbstractC7350t.b(this.f46697C, a6.f46697C) && p247y7.AbstractC7350t.b(this.f46698D, a6.f46698D) && p247y7.AbstractC7350t.b(this.f46699E, a6.f46699E);
    }

    public int hashCode() {
        java.lang.Object obj = this.f46697C;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f46698D;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f46699E;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return '(' + this.f46697C + ", " + this.f46698D + ", " + this.f46699E + ')';
    }
}
