package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p058f8.i f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Collection f16033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16034c;

    public r(p058f8.i iVar, java.util.Collection collection, boolean z6) {
        p247y7.AbstractC7350t.f(iVar, "nullabilityQualifier");
        p247y7.AbstractC7350t.f(collection, "qualifierApplicabilityTypes");
        this.f16032a = iVar;
        this.f16033b = collection;
        this.f16034c = z6;
    }

    public /* synthetic */ r(p058f8.i iVar, java.util.Collection collection, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(iVar, collection, (i6 & 4) != 0 ? iVar.c() == p058f8.h.NOT_NULL : z6);
    }

    public static /* synthetic */ X7.r b(X7.r rVar, p058f8.i iVar, java.util.Collection collection, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = rVar.f16032a;
        }
        if ((i6 & 2) != 0) {
            collection = rVar.f16033b;
        }
        if ((i6 & 4) != 0) {
            z6 = rVar.f16034c;
        }
        return rVar.a(iVar, collection, z6);
    }

    public final X7.r a(p058f8.i iVar, java.util.Collection collection, boolean z6) {
        p247y7.AbstractC7350t.f(iVar, "nullabilityQualifier");
        p247y7.AbstractC7350t.f(collection, "qualifierApplicabilityTypes");
        return new X7.r(iVar, collection, z6);
    }

    public final boolean c() {
        return this.f16034c;
    }

    public final p058f8.i d() {
        return this.f16032a;
    }

    public final java.util.Collection e() {
        return this.f16033b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X7.r)) {
            return false;
        }
        X7.r rVar = (X7.r) obj;
        return p247y7.AbstractC7350t.b(this.f16032a, rVar.f16032a) && p247y7.AbstractC7350t.b(this.f16033b, rVar.f16033b) && this.f16034c == rVar.f16034c;
    }

    public int hashCode() {
        return (((this.f16032a.hashCode() * 31) + this.f16033b.hashCode()) * 31) + p190t.h.a(this.f16034c);
    }

    public java.lang.String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f16032a + ", qualifierApplicabilityTypes=" + this.f16033b + ", definitelyNotNull=" + this.f16034c + ')';
    }
}
