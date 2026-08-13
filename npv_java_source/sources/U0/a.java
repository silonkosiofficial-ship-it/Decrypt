package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final void a(android.text.SpannableString spannableString, M0.C c6, int i6, int i10, Y0.e eVar, R0.AbstractC1494h.b bVar) {
        android.text.style.TypefaceSpan typefaceSpanA;
        V0.e.k(spannableString, c6.g(), i6, i10);
        V0.e.o(spannableString, c6.k(), eVar, i6, i10);
        if (c6.n() != null || c6.l() != null) {
            R0.q qVarN = c6.n();
            if (qVarN == null) {
                qVarN = R0.q.f9331D.d();
            }
            R0.o oVarL = c6.l();
            spannableString.setSpan(new android.text.style.StyleSpan(R0.AbstractC1490d.c(qVarN, oVarL != null ? oVarL.i() : R0.o.f9321b.b())), i6, i10, 33);
        }
        if (c6.i() != null) {
            if (c6.i() instanceof R0.u) {
                typefaceSpanA = new android.text.style.TypefaceSpan(((R0.u) c6.i()).c());
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                R0.AbstractC1494h abstractC1494hI = c6.i();
                R0.p pVarM = c6.m();
                java.lang.Object value = R0.i.a(bVar, abstractC1494hI, null, 0, pVarM != null ? pVarM.k() : R0.p.f9325b.a(), 6, null).getValue();
                p247y7.AbstractC7350t.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                typefaceSpanA = U0.i.f14434a.a((android.graphics.Typeface) value);
            }
            spannableString.setSpan(typefaceSpanA, i6, i10, 33);
        }
        if (c6.s() != null) {
            X0.k kVarS = c6.s();
            X0.k.a aVar = X0.k.f15631b;
            if (kVarS.d(aVar.d())) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), i6, i10, 33);
            }
            if (c6.s().d(aVar.b())) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), i6, i10, 33);
            }
        }
        if (c6.u() != null) {
            spannableString.setSpan(new android.text.style.ScaleXSpan(c6.u().b()), i6, i10, 33);
        }
        V0.e.s(spannableString, c6.p(), i6, i10);
        V0.e.h(spannableString, c6.d(), i6, i10);
    }

    public static final android.text.SpannableString b(M0.C1332d c1332d, Y0.e eVar, R0.AbstractC1494h.b bVar, U0.t tVar) {
        android.text.style.ClickableSpan clickableSpanA;
        android.text.SpannableString spannableString = new android.text.SpannableString(c1332d.i());
        java.util.List listH = c1332d.h();
        if (listH != null) {
            int size = listH.size();
            for (int i6 = 0; i6 < size; i6++) {
                M0.C1332d.c cVar = (M0.C1332d.c) listH.get(i6);
                M0.C c6 = (M0.C) cVar.a();
                a(spannableString, c6.a((65503 & 1) != 0 ? c6.g() : 0L, (65503 & 2) != 0 ? c6.f6614b : 0L, (65503 & 4) != 0 ? c6.f6615c : null, (65503 & 8) != 0 ? c6.f6616d : null, (65503 & 16) != 0 ? c6.f6617e : null, (65503 & 32) != 0 ? c6.f6618f : null, (65503 & 64) != 0 ? c6.f6619g : null, (65503 & 128) != 0 ? c6.f6620h : 0L, (65503 & 256) != 0 ? c6.f6621i : null, (65503 & 512) != 0 ? c6.f6622j : null, (65503 & 1024) != 0 ? c6.f6623k : null, (65503 & 2048) != 0 ? c6.f6624l : 0L, (65503 & 4096) != 0 ? c6.f6625m : null, (65503 & 8192) != 0 ? c6.f6626n : null, (65503 & 16384) != 0 ? c6.f6627o : null, (65503 & 32768) != 0 ? c6.f6628p : null), cVar.b(), cVar.c(), eVar, bVar);
            }
        }
        java.util.List listJ = c1332d.j(0, c1332d.length());
        int size2 = listJ.size();
        for (int i10 = 0; i10 < size2; i10++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) listJ.get(i10);
            spannableString.setSpan(V0.g.a((M0.S) cVar2.a()), cVar2.b(), cVar2.c(), 33);
        }
        java.util.List listK = c1332d.k(0, c1332d.length());
        int size3 = listK.size();
        for (int i11 = 0; i11 < size3; i11++) {
            M0.C1332d.c cVar3 = (M0.C1332d.c) listK.get(i11);
            spannableString.setSpan(tVar.c((M0.T) cVar3.a()), cVar3.b(), cVar3.c(), 33);
        }
        java.util.List listD = c1332d.d(0, c1332d.length());
        int size4 = listD.size();
        for (int i12 = 0; i12 < size4; i12++) {
            M0.C1332d.c cVar4 = (M0.C1332d.c) listD.get(i12);
            if (cVar4.f() != cVar4.d()) {
                M0.AbstractC1336h abstractC1336h = (M0.AbstractC1336h) cVar4.e();
                if (abstractC1336h instanceof M0.AbstractC1336h.b) {
                    abstractC1336h.a();
                    clickableSpanA = tVar.b(c(cVar4));
                } else {
                    clickableSpanA = tVar.a(cVar4);
                }
                spannableString.setSpan(clickableSpanA, cVar4.f(), cVar4.d(), 33);
            }
        }
        return spannableString;
    }

    private static final M0.C1332d.c c(M0.C1332d.c cVar) {
        java.lang.Object objE = cVar.e();
        p247y7.AbstractC7350t.d(objE, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new M0.C1332d.c((M0.AbstractC1336h.b) objE, cVar.f(), cVar.d());
    }
}
