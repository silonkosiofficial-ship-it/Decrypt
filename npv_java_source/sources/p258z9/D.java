package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p239x9.C7326u f57668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57669b;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.p {
        a(java.lang.Object obj) {
            super(2, obj, p258z9.D.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final java.lang.Boolean s(p219v9.f fVar, int i6) {
            p247y7.AbstractC7350t.f(fVar, "p0");
            return java.lang.Boolean.valueOf(((p258z9.D) this.f57287D).e(fVar, i6));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s((p219v9.f) obj, ((java.lang.Number) obj2).intValue());
        }
    }

    public D(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        this.f57668a = new p239x9.C7326u(fVar, new z9.D.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(p219v9.f fVar, int i6) {
        boolean z6 = !fVar.i(i6) && fVar.h(i6).c();
        this.f57669b = z6;
        return z6;
    }

    public final boolean b() {
        return this.f57669b;
    }

    public final void c(int i6) {
        this.f57668a.a(i6);
    }

    public final int d() {
        return this.f57668a.d();
    }
}
