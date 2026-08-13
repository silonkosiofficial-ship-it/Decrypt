package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p017b7.a f9091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f9092b;

    public d(p017b7.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "expectedType");
        p247y7.AbstractC7350t.f(obj, "response");
        this.f9091a = aVar;
        this.f9092b = obj;
    }

    public final p017b7.a a() {
        return this.f9091a;
    }

    public final java.lang.Object b() {
        return this.f9092b;
    }

    public final java.lang.Object c() {
        return this.f9092b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q6.d)) {
            return false;
        }
        Q6.d dVar = (Q6.d) obj;
        return p247y7.AbstractC7350t.b(this.f9091a, dVar.f9091a) && p247y7.AbstractC7350t.b(this.f9092b, dVar.f9092b);
    }

    public int hashCode() {
        return (this.f9091a.hashCode() * 31) + this.f9092b.hashCode();
    }

    public java.lang.String toString() {
        return "HttpResponseContainer(expectedType=" + this.f9091a + ", response=" + this.f9092b + ')';
    }
}
