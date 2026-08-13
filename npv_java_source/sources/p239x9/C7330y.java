package p239x9;

/* JADX INFO: renamed from: x9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7330y implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Enum[] f57062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p219v9.f f57063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57064c;

    public C7330y(final java.lang.String str, java.lang.Enum[] enumArr) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(enumArr, "values");
        this.f57062a = enumArr;
        this.f57064c = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: x9.x
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.C7330y.h(this.f57058C, str);
            }
        });
    }

    private final p219v9.f g(java.lang.String str) {
        p239x9.C7328w c7328w = new p239x9.C7328w(str, this.f57062a.length);
        for (java.lang.Enum r6 : this.f57062a) {
            p239x9.C7311k0.s(c7328w, r6.name(), false, 2, null);
        }
        return c7328w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f h(p239x9.C7330y c7330y, java.lang.String str) {
        p219v9.f fVar = c7330y.f57063b;
        return fVar == null ? c7330y.g(str) : fVar;
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return (p219v9.f) this.f57064c.getValue();
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.lang.Enum b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        int iK = hVar.k(a());
        if (iK >= 0) {
            java.lang.Enum[] enumArr = this.f57062a;
            if (iK < enumArr.length) {
                return enumArr[iK];
            }
        }
        throw new p199t9.d(iK + " is not among valid " + a().a() + " enum values, values size is " + this.f57062a.length);
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, java.lang.Enum r6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(r6, "value");
        int iL0 = p097j7.AbstractC6872n.l0(this.f57062a, r6);
        if (iL0 != -1) {
            jVar.i(a(), iL0);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(r6);
        sb.append(" is not a valid enum ");
        sb.append(a().a());
        sb.append(", must be one of ");
        java.lang.String string = java.util.Arrays.toString(this.f57062a);
        p247y7.AbstractC7350t.e(string, "toString(...)");
        sb.append(string);
        throw new p199t9.d(sb.toString());
    }

    public java.lang.String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }
}
