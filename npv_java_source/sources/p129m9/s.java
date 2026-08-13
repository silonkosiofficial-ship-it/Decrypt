package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends p129m9.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p129m9.a f51271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f51273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f51275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i6, p129m9.a aVar, java.lang.String str, int i10) {
        super(java.lang.Integer.valueOf(i6), str, null);
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        this.f51270c = i6;
        this.f51271d = aVar;
        this.f51272e = i10;
        int i11 = p099j9.e.b()[b().intValue()];
        this.f51273f = i11;
        int i12 = i10 % i11;
        this.f51274g = i12;
        this.f51275h = i10 - i12;
        int iIntValue = b().intValue();
        if (1 > iIntValue || iIntValue >= 10) {
            throw new java.lang.IllegalArgumentException(("Invalid length for field " + c() + ": " + b().intValue()).toString());
        }
    }

    @Override // p129m9.e
    public p129m9.g a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        int iD = p129m9.f.d(charSequence, i6, i10);
        return p129m9.f.f(this.f51271d, obj, java.lang.Integer.valueOf((iD >= this.f51274g ? this.f51275h : this.f51275h + this.f51273f) + iD));
    }

    @Override // p129m9.e
    public java.lang.Integer b() {
        return java.lang.Integer.valueOf(this.f51270c);
    }
}
