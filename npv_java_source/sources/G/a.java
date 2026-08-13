package G;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p141o0.e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G.b f3004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G.b f3005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G.b f3006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G.b f3007d;

    public a(G.b bVar, G.b bVar2, G.b bVar3, G.b bVar4) {
        this.f3004a = bVar;
        this.f3005b = bVar2;
        this.f3006c = bVar3;
        this.f3007d = bVar4;
    }

    public static /* synthetic */ G.a c(G.a aVar, G.b bVar, G.b bVar2, G.b bVar3, G.b bVar4, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i6 & 1) != 0) {
            bVar = aVar.f3004a;
        }
        if ((i6 & 2) != 0) {
            bVar2 = aVar.f3005b;
        }
        if ((i6 & 4) != 0) {
            bVar3 = aVar.f3006c;
        }
        if ((i6 & 8) != 0) {
            bVar4 = aVar.f3007d;
        }
        return aVar.b(bVar, bVar2, bVar3, bVar4);
    }

    @Override // p141o0.e2
    public final p141o0.L1 a(long j6, Y0.v vVar, Y0.e eVar) {
        float fA = this.f3004a.a(j6, eVar);
        float fA2 = this.f3005b.a(j6, eVar);
        float fA3 = this.f3006c.a(j6, eVar);
        float fA4 = this.f3007d.a(j6, eVar);
        float fH = p131n0.m.h(j6);
        float f6 = fA + fA4;
        if (f6 > fH) {
            float f10 = fH / f6;
            fA *= f10;
            fA4 *= f10;
        }
        float f11 = fA4;
        float f12 = fA2 + fA3;
        if (f12 > fH) {
            float f13 = fH / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && f11 >= 0.0f) {
            return d(j6, fA, fA2, fA3, f11, vVar);
        }
        throw new java.lang.IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f11 + ")!").toString());
    }

    public abstract G.a b(G.b bVar, G.b bVar2, G.b bVar3, G.b bVar4);

    public abstract p141o0.L1 d(long j6, float f6, float f10, float f11, float f12, Y0.v vVar);

    public final G.b e() {
        return this.f3006c;
    }

    public final G.b f() {
        return this.f3007d;
    }

    public final G.b g() {
        return this.f3005b;
    }

    public final G.b h() {
        return this.f3004a;
    }
}
