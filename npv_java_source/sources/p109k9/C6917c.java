package p109k9;

/* JADX INFO: renamed from: k9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6917c implements p109k9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.o f49839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f49840b;

    public C6917c(p109k9.o oVar, java.util.List list) {
        p247y7.AbstractC7350t.f(oVar, "mainFormat");
        p247y7.AbstractC7350t.f(list, "formats");
        this.f49839a = oVar;
        this.f49840b = list;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        return this.f49839a.a();
    }

    @Override // p109k9.o
    public p129m9.q b() {
        java.util.List listM = p097j7.AbstractC6879v.m();
        java.util.List listC = p097j7.AbstractC6879v.c();
        listC.add(this.f49839a.b());
        java.util.Iterator it = this.f49840b.iterator();
        while (it.hasNext()) {
            listC.add(((p109k9.o) it.next()).b());
        }
        return new p129m9.q(listM, p097j7.AbstractC6879v.a(listC));
    }

    public final java.util.List c() {
        return this.f49840b;
    }

    public final p109k9.o d() {
        return this.f49839a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p109k9.C6917c) {
            p109k9.C6917c c6917c = (p109k9.C6917c) obj;
            if (p247y7.AbstractC7350t.b(this.f49839a, c6917c.f49839a) && p247y7.AbstractC7350t.b(this.f49840b, c6917c.f49840b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f49839a.hashCode() * 31) + this.f49840b.hashCode();
    }

    public java.lang.String toString() {
        return "AlternativesParsing(" + this.f49840b + ')';
    }
}
