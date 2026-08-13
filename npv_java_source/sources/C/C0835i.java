package C;

/* JADX INFO: renamed from: C.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0835i implements D.AbstractC0878o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f1087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f1088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f1089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.r f1090d;

    public C0835i(p237x7.l lVar, p237x7.p pVar, p237x7.l lVar2, p237x7.r rVar) {
        this.f1087a = lVar;
        this.f1088b = pVar;
        this.f1089c = lVar2;
        this.f1090d = rVar;
    }

    public final p237x7.r a() {
        return this.f1090d;
    }

    public final p237x7.p b() {
        return this.f1088b;
    }

    @Override // D.AbstractC0878o.a
    public p237x7.l getKey() {
        return this.f1087a;
    }

    @Override // D.AbstractC0878o.a
    public p237x7.l getType() {
        return this.f1089c;
    }
}
