package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends p129m9.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f51292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f51293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p129m9.a f51294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.Integer num, java.lang.Integer num2, p129m9.a aVar, java.lang.String str, boolean z6) {
        super(p247y7.AbstractC7350t.b(num, num2) ? num : null, str, null);
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        this.f51292c = num;
        this.f51293d = num2;
        this.f51294e = aVar;
        this.f51295f = z6;
        if (b() == null || new E7.i(1, 9).D(b().intValue())) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid length for field " + c() + ": " + b()).toString());
    }

    @Override // p129m9.e
    public p129m9.g a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        java.lang.Integer num = this.f51293d;
        if (num != null && i10 - i6 > num.intValue()) {
            return new m9.g.d(this.f51293d.intValue());
        }
        java.lang.Integer num2 = this.f51292c;
        if (num2 != null && i10 - i6 < num2.intValue()) {
            return new m9.g.c(this.f51292c.intValue());
        }
        java.lang.Integer numE = p129m9.f.e(charSequence, i6, i10);
        if (numE == null) {
            return m9.g.b.f51237a;
        }
        p129m9.a aVar = this.f51294e;
        boolean z6 = this.f51295f;
        int iIntValue = numE.intValue();
        if (z6) {
            iIntValue = -iIntValue;
        }
        return p129m9.f.f(aVar, obj, java.lang.Integer.valueOf(iIntValue));
    }
}
