package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements A9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f57680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57682c;

    public M(p249y9.C7363g c7363g) {
        p247y7.AbstractC7350t.f(c7363g, "configuration");
        this.f57680a = c7363g.e();
        this.f57681b = c7363g.p();
        this.f57682c = c7363g.f() != p249y9.EnumC7357a.NONE;
    }

    private final void d(p219v9.f fVar, F7.c cVar) {
        int iE = fVar.e();
        for (int i6 = 0; i6 < iE; i6++) {
            java.lang.String strF = fVar.f(i6);
            if (p247y7.AbstractC7350t.b(strF, this.f57680a)) {
                throw new java.lang.IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(p219v9.f fVar, F7.c cVar) {
        p219v9.m mVarJ = fVar.j();
        if ((mVarJ instanceof p219v9.c) || p247y7.AbstractC7350t.b(mVarJ, v9.m.a.f56056a)) {
            throw new java.lang.IllegalArgumentException("Serializer for " + cVar.c() + " can't be registered as a subclass for polymorphic serialization because its kind " + mVarJ + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f57681b && this.f57682c) {
            if (p247y7.AbstractC7350t.b(mVarJ, v9.n.b.f56059a) || p247y7.AbstractC7350t.b(mVarJ, v9.n.c.f56060a) || (mVarJ instanceof p219v9.d) || (mVarJ instanceof v9.m.b)) {
                throw new java.lang.IllegalArgumentException("Serializer for " + cVar.c() + " of kind " + mVarJ + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // A9.d
    public void a(F7.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "baseClass");
        p247y7.AbstractC7350t.f(lVar, "defaultDeserializerProvider");
    }

    @Override // A9.d
    public void b(F7.c cVar, F7.c cVar2, p199t9.b bVar) {
        p247y7.AbstractC7350t.f(cVar, "baseClass");
        p247y7.AbstractC7350t.f(cVar2, "actualClass");
        p247y7.AbstractC7350t.f(bVar, "actualSerializer");
        p219v9.f fVarA = bVar.a();
        e(fVarA, cVar2);
        if (this.f57681b || !this.f57682c) {
            return;
        }
        d(fVarA, cVar2);
    }

    @Override // A9.d
    public void c(F7.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "baseClass");
        p247y7.AbstractC7350t.f(lVar, "defaultSerializerProvider");
    }
}
