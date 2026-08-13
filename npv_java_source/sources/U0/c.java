package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U0.c.a f14410a = new U0.c.a();

    public static final class a extends android.text.style.CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.emoji2.text.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final java.lang.CharSequence a(java.lang.String str, float f6, M0.P p6, java.util.List list, java.util.List list2, Y0.e eVar, p237x7.r rVar, boolean z6) {
        java.lang.CharSequence charSequenceU;
        M0.y yVarA;
        if (z6 && androidx.emoji2.text.f.k()) {
            M0.A aW = p6.w();
            M0.C1335g c1335gD = (aW == null || (yVarA = aW.a()) == null) ? null : M0.C1335g.d(yVarA.b());
            charSequenceU = androidx.emoji2.text.f.c().u(str, 0, str.length(), Integer.MAX_VALUE, c1335gD == null ? 0 : M0.C1335g.g(c1335gD.j(), M0.C1335g.f6714b.a()));
            p247y7.AbstractC7350t.c(charSequenceU);
        } else {
            charSequenceU = str;
        }
        if (list.isEmpty() && list2.isEmpty() && p247y7.AbstractC7350t.b(p6.D(), X0.r.f15653c.a()) && Y0.y.g(p6.s())) {
            return charSequenceU;
        }
        android.text.Spannable spannableString = charSequenceU instanceof android.text.Spannable ? (android.text.Spannable) charSequenceU : new android.text.SpannableString(charSequenceU);
        if (p247y7.AbstractC7350t.b(p6.A(), X0.k.f15631b.d())) {
            V0.e.u(spannableString, f14410a, 0, str.length());
        }
        if (b(p6) && p6.t() == null) {
            V0.e.r(spannableString, p6.s(), f6, eVar);
        } else {
            X0.h hVarT = p6.t();
            if (hVarT == null) {
                hVarT = X0.h.f15605c.a();
            }
            V0.e.q(spannableString, p6.s(), f6, eVar, hVarT);
        }
        V0.e.y(spannableString, p6.D(), f6, eVar);
        V0.e.w(spannableString, p6, list, eVar, rVar);
        V0.d.b(spannableString, list2, eVar);
        return spannableString;
    }

    public static final boolean b(M0.P p6) {
        M0.y yVarA;
        M0.A aW = p6.w();
        if (aW == null || (yVarA = aW.a()) == null) {
            return false;
        }
        return yVarA.c();
    }
}
