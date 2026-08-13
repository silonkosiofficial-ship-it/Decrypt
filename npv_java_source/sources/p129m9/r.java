package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements p129m9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51264a;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Unexpected end of input: yet to parse '" + p129m9.r.this.b() + '\'';
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f51267E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f51268F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f51269G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.CharSequence charSequence, int i6, int i10) {
            super(0);
            this.f51267E = charSequence;
            this.f51268F = i6;
            this.f51269G = i10;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Expected ");
            sb.append(p129m9.r.this.b());
            sb.append(" but got ");
            java.lang.CharSequence charSequence = this.f51267E;
            int i6 = this.f51268F;
            sb.append(charSequence.subSequence(i6, this.f51269G + i6 + 1).toString());
            return sb.toString();
        }
    }

    public r(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        this.f51264a = str;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Empty string is not allowed".toString());
        }
        if (!(!p099j9.f.b(str.charAt(0)))) {
            throw new java.lang.IllegalArgumentException(("String '" + str + "' starts with a digit").toString());
        }
        if (!p099j9.f.b(str.charAt(str.length() - 1))) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("String '" + str + "' ends with a digit").toString());
    }

    @Override // p129m9.o
    public java.lang.Object a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (this.f51264a.length() + i6 > charSequence.length()) {
            return p129m9.k.f51253a.a(i6, new m9.r.a());
        }
        int length = this.f51264a.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i6 + i10) != this.f51264a.charAt(i10)) {
                return p129m9.k.f51253a.a(i6, new m9.r.b(charSequence, i6, i10));
            }
        }
        return p129m9.k.f51253a.b(i6 + this.f51264a.length());
    }

    public final java.lang.String b() {
        return this.f51264a;
    }

    public java.lang.String toString() {
        return '\'' + this.f51264a + '\'';
    }
}
