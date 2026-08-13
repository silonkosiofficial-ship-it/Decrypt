package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f51259D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f51260E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p129m9.a f51261F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.Object obj, java.lang.Object obj2, p129m9.a aVar) {
            super(0);
            this.f51259D = obj;
            this.f51260E = obj2;
            this.f51261F = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Attempting to assign conflicting values '" + this.f51259D + "' and '" + this.f51260E + "' to field '" + this.f51261F.getName() + '\'';
        }
    }

    public static final p129m9.q a(int i6, int i10, p129m9.a aVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        return new p129m9.q(p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.p(new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.s(i6, aVar, str, i10)))), p097j7.AbstractC6879v.m()), new p129m9.q(p097j7.AbstractC6879v.p(new p129m9.r("+"), new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.w(null, null, aVar, str, false)))), p097j7.AbstractC6879v.m()), new p129m9.q(p097j7.AbstractC6879v.p(new p129m9.r("-"), new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.w(null, null, aVar, str, true)))), p097j7.AbstractC6879v.m())));
    }

    public static final p129m9.q b(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, p129m9.a aVar, java.lang.String str, java.lang.Integer num4) {
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        java.util.List listS = p097j7.AbstractC6879v.s(e(num, num2, num3, aVar, str, true));
        if (num4 != null) {
            listS.add(f(num, num4, num3, aVar, str, false, 32, null));
            listS.add(new p129m9.q(p097j7.AbstractC6879v.p(new p129m9.r("+"), new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.w(java.lang.Integer.valueOf(num4.intValue() + 1), num2, aVar, str, false)))), p097j7.AbstractC6879v.m()));
        } else {
            listS.add(f(num, num2, num3, aVar, str, false, 32, null));
        }
        return new p129m9.q(p097j7.AbstractC6879v.m(), listS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object d(p129m9.a aVar, java.lang.Object obj, java.lang.Object obj2, int i6, int i10) {
        java.lang.Object objC = aVar.c(obj, obj2);
        return objC == null ? p129m9.k.f51253a.b(i10) : p129m9.k.f51253a.a(i6, new m9.p.a(objC, obj2, aVar));
    }

    public static final p129m9.q e(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, p129m9.a aVar, java.lang.String str, boolean z6) {
        int iIntValue;
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        int i6 = 1;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z6 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z6) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = java.lang.Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return g(z6, aVar, str, iIntValue2, iIntValue);
        }
        p129m9.q qVarG = g(z6, aVar, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2 += i6;
            qVarG = new p129m9.q(p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.p(g(z6, aVar, str, iIntValue2, iIntValue2), p129m9.n.b(p097j7.AbstractC6879v.p(new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.r(" ")), p097j7.AbstractC6879v.m()), qVarG))));
            i6 = 1;
        }
        if (iIntValue3 > iIntValue) {
            return p129m9.n.b(p097j7.AbstractC6879v.p(new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.r(S8.r.N(" ", iIntValue3 - iIntValue))), p097j7.AbstractC6879v.m()), qVarG));
        }
        return iIntValue3 == iIntValue ? qVarG : new p129m9.q(p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.p(g(z6, aVar, str, iIntValue3 + 1, iIntValue), qVarG));
    }

    public static /* synthetic */ p129m9.q f(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, p129m9.a aVar, java.lang.String str, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 32) != 0) {
            z6 = false;
        }
        return e(num, num2, num3, aVar, str, z6);
    }

    private static final p129m9.q g(boolean z6, p129m9.a aVar, java.lang.String str, int i6, int i10) {
        if (i10 < (z6 ? 1 : 0) + 1) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.List listC = p097j7.AbstractC6879v.c();
        if (z6) {
            listC.add(new p129m9.r("-"));
        }
        listC.add(new p129m9.h(p097j7.AbstractC6879v.e(new p129m9.w(java.lang.Integer.valueOf(i6 - (z6 ? 1 : 0)), java.lang.Integer.valueOf(i10 - (z6 ? 1 : 0)), aVar, str, z6))));
        return new p129m9.q(p097j7.AbstractC6879v.a(listC), p097j7.AbstractC6879v.m());
    }
}
