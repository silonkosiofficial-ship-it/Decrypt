package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements p129m9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.p f51276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51278c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ char f51280E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char c6) {
            super(0);
            this.f51280E = c6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Expected " + p129m9.t.this.f51278c + " but got " + this.f51280E;
        }
    }

    public t(p237x7.p pVar, boolean z6, java.lang.String str) {
        p247y7.AbstractC7350t.f(pVar, "isNegativeSetter");
        p247y7.AbstractC7350t.f(str, "whatThisExpects");
        this.f51276a = pVar;
        this.f51277b = z6;
        this.f51278c = str;
    }

    @Override // p129m9.o
    public java.lang.Object a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (i6 >= charSequence.length()) {
            return p129m9.k.f51253a.b(i6);
        }
        char cCharAt = charSequence.charAt(i6);
        if (cCharAt == '-') {
            this.f51276a.u(obj, java.lang.Boolean.TRUE);
            return p129m9.k.f51253a.b(i6 + 1);
        }
        if (cCharAt != '+' || !this.f51277b) {
            return p129m9.k.f51253a.a(i6, new m9.t.a(cCharAt));
        }
        this.f51276a.u(obj, java.lang.Boolean.FALSE);
        return p129m9.k.f51253a.b(i6 + 1);
    }

    public java.lang.String toString() {
        return this.f51278c;
    }
}
