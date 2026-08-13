package ca;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final ca.c.a f24471D = new ca.c.a();

        public a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof da.a);
        }
    }

    static final class b extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f24472E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f24473F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f24474G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f24475H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ da.a f24476I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(da.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f24476I = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0034  */
        /* JADX WARN: Code duplicated, block: B:12:0x004c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004a -> B:13:0x004d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r5.f24474G
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                int r1 = r5.f24473F
                int r3 = r5.f24472E
                java.lang.Object r4 = r5.f24475H
                R8.j r4 = (R8.j) r4
                p087i7.x.b(r6)
                goto L4d
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                p087i7.x.b(r6)
                java.lang.Object r6 = r5.f24475H
                R8.j r6 = (R8.j) r6
                da.a r1 = r5.f24476I
                da.e r1 = r1.g()
                int r1 = r1.a()
                r3 = 0
                r4 = r6
            L32:
                if (r3 >= r1) goto L4f
                da.a r6 = r5.f24476I
                da.e r6 = r6.g()
                da.c r6 = r6.b(r3)
                r5.f24475H = r4
                r5.f24472E = r3
                r5.f24473F = r1
                r5.f24474G = r2
                java.lang.Object r6 = r4.b(r6, r5)
                if (r6 != r0) goto L4d
                return r0
            L4d:
                int r3 = r3 + r2
                goto L32
            L4f:
                i7.M r6 = p087i7.M.f46721a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.c.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(R8.j jVar, p127m7.e eVar) {
            return ((ca.c.b) x(jVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            ca.c.b bVar = new ca.c.b(this.f24476I, eVar);
            bVar.f24475H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: ca.c$c, reason: collision with other inner class name */
    public static final class C0468c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final ca.c.C0468c f24477D = new ca.c.C0468c();

        public C0468c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof da.a);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final ca.c.d f24478D = new ca.c.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(da.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "it");
            return java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(aVar.e(), "item"));
        }
    }

    public static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final ca.c.e f24479D = new ca.c.e();

        public e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof da.a);
        }
    }

    public static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final ca.c.f f24480D = new ca.c.f();

        public f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof da.a);
        }
    }

    private static final da.a a(da.a aVar, java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        java.lang.String strF = aVar.f(str);
        R8.h hVarW = R8.k.w(c(aVar), ca.c.a.f24471D);
        p247y7.AbstractC7350t.d(hVarW, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        java.util.Iterator it = hVarW.iterator();
        while (it.hasNext()) {
            next = it.next();
            da.a aVar2 = (da.a) next;
            if (p247y7.AbstractC7350t.b(aVar2.c(), "http://schemas.android.com/aapt") && p247y7.AbstractC7350t.b(aVar2.d(), "attr")) {
                if (p247y7.AbstractC7350t.b(aVar2.b("name"), strF + ":" + str2)) {
                    return (da.a) next;
                }
            }
        }
        next = null;
        return (da.a) next;
    }

    private static final java.lang.String b(da.a aVar, java.lang.String str, java.lang.String str2) {
        java.lang.String strA = aVar.a(str, str2);
        if (!S8.r.s0(strA)) {
            return strA;
        }
        return null;
    }

    private static final R8.h c(da.a aVar) {
        return R8.k.b(new ca.c.b(aVar, null));
    }

    private static final void d(da.a aVar, u0.d.a aVar2, ca.a aVar3) {
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "name");
        if (strB == null) {
            strB = "";
        }
        aVar2.a((254 & 1) != 0 ? "" : strB, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & 256) != 0 ? p201u0.o.e() : p201u0.o.a(b(aVar, "http://schemas.android.com/apk/res/android", "pathData")));
        aVar3.a().add(ca.a.EnumC0467a.Virtual);
    }

    private static final p087i7.u e(da.a aVar, float f6) {
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "offset");
        if (strB != null) {
            f6 = java.lang.Float.parseFloat(strB);
        }
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "color");
        if (strB2 == null) {
            return null;
        }
        return p087i7.B.a(java.lang.Float.valueOf(f6), p141o0.C7016y0.i(p141o0.A0.b(ca.b.a(strB2))));
    }

    private static final p087i7.u[] f(da.a aVar) {
        R8.h hVarW = R8.k.w(c(aVar), ca.c.C0468c.f24477D);
        p247y7.AbstractC7350t.d(hVarW, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        java.util.List listM = R8.k.M(R8.k.w(hVarW, ca.c.d.f24478D));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = 0;
        for (java.lang.Object obj : listM) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            p087i7.u uVarE = e((da.a) obj, i6 / E7.j.d(p097j7.AbstractC6879v.o(listM), 1));
            if (uVarE != null) {
                arrayList.add(uVarE);
            }
            i6 = i10;
        }
        if (arrayList.isEmpty()) {
            java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "startColor");
            java.lang.Integer numValueOf = strB != null ? java.lang.Integer.valueOf(ca.b.a(strB)) : null;
            java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "centerColor");
            java.lang.Integer numValueOf2 = strB2 != null ? java.lang.Integer.valueOf(ca.b.a(strB2)) : null;
            java.lang.String strB3 = b(aVar, "http://schemas.android.com/apk/res/android", "endColor");
            java.lang.Integer numValueOf3 = strB3 != null ? java.lang.Integer.valueOf(ca.b.a(strB3)) : null;
            if (numValueOf != null) {
                arrayList.add(p087i7.B.a(java.lang.Float.valueOf(0.0f), p141o0.C7016y0.i(p141o0.A0.b(numValueOf.intValue()))));
            }
            if (numValueOf2 != null) {
                arrayList.add(p087i7.B.a(java.lang.Float.valueOf(0.5f), p141o0.C7016y0.i(p141o0.A0.b(numValueOf2.intValue()))));
            }
            if (numValueOf3 != null) {
                arrayList.add(p087i7.B.a(java.lang.Float.valueOf(1.0f), p141o0.C7016y0.i(p141o0.A0.b(numValueOf3.intValue()))));
            }
        }
        return (p087i7.u[]) arrayList.toArray(new p087i7.u[0]);
    }

    private static final p141o0.AbstractC6984n0 g(da.a aVar) {
        java.lang.Object next;
        R8.h hVarW = R8.k.w(c(aVar), ca.c.e.f24479D);
        p247y7.AbstractC7350t.d(hVarW, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        java.util.Iterator it = hVarW.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p247y7.AbstractC7350t.b(((da.a) next).e(), "gradient"));
        da.a aVar2 = (da.a) next;
        if (aVar2 != null) {
            return h(aVar2);
        }
        return null;
    }

    private static final p141o0.AbstractC6984n0 h(da.a aVar) {
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "type");
        if (strB != null) {
            int iHashCode = strB.hashCode();
            if (iHashCode != -1102672091) {
                if (iHashCode != -938579425) {
                    if (iHashCode == 109850348 && strB.equals("sweep")) {
                        return n(aVar);
                    }
                } else if (strB.equals("radial")) {
                    return l(aVar);
                }
            } else if (strB.equals("linear")) {
                return j(aVar);
            }
        }
        return null;
    }

    private static final void i(da.a aVar, u0.d.a aVar2, ca.a aVar3) {
        ca.a.EnumC0467a enumC0467a;
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "name");
        if (strB == null) {
            strB = "";
        }
        java.lang.String str = strB;
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "rotation");
        float f6 = strB2 != null ? java.lang.Float.parseFloat(strB2) : 0.0f;
        java.lang.String strB3 = b(aVar, "http://schemas.android.com/apk/res/android", "pivotX");
        float f10 = strB3 != null ? java.lang.Float.parseFloat(strB3) : 0.0f;
        java.lang.String strB4 = b(aVar, "http://schemas.android.com/apk/res/android", "pivotY");
        float f11 = strB4 != null ? java.lang.Float.parseFloat(strB4) : 0.0f;
        java.lang.String strB5 = b(aVar, "http://schemas.android.com/apk/res/android", "scaleX");
        float f12 = strB5 != null ? java.lang.Float.parseFloat(strB5) : 1.0f;
        java.lang.String strB6 = b(aVar, "http://schemas.android.com/apk/res/android", "scaleY");
        float f13 = strB6 != null ? java.lang.Float.parseFloat(strB6) : 1.0f;
        java.lang.String strB7 = b(aVar, "http://schemas.android.com/apk/res/android", "translateX");
        float f14 = strB7 != null ? java.lang.Float.parseFloat(strB7) : 0.0f;
        java.lang.String strB8 = b(aVar, "http://schemas.android.com/apk/res/android", "translateY");
        aVar2.a(str, f6, f10, f11, f12, f13, f14, strB8 != null ? java.lang.Float.parseFloat(strB8) : 0.0f, p201u0.o.e());
        aVar3.a().add(ca.a.EnumC0467a.Real);
        p(aVar, aVar2, aVar3);
        do {
            enumC0467a = (ca.a.EnumC0467a) p097j7.AbstractC6879v.M(aVar3.a());
            aVar2.g();
        } while (enumC0467a == ca.a.EnumC0467a.Virtual);
    }

    private static final p141o0.AbstractC6984n0 j(da.a aVar) {
        p141o0.AbstractC6984n0.a aVar2 = p141o0.AbstractC6984n0.f52247b;
        p087i7.u[] uVarArrF = f(aVar);
        p087i7.u[] uVarArr = (p087i7.u[]) java.util.Arrays.copyOf(uVarArrF, uVarArrF.length);
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "startX");
        float f6 = strB != null ? java.lang.Float.parseFloat(strB) : 0.0f;
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "startY");
        long jA = p131n0.h.a(f6, strB2 != null ? java.lang.Float.parseFloat(strB2) : 0.0f);
        java.lang.String strB3 = b(aVar, "http://schemas.android.com/apk/res/android", "endX");
        float f10 = strB3 != null ? java.lang.Float.parseFloat(strB3) : 0.0f;
        java.lang.String strB4 = b(aVar, "http://schemas.android.com/apk/res/android", "endY");
        long jA2 = p131n0.h.a(f10, strB4 != null ? java.lang.Float.parseFloat(strB4) : 0.0f);
        java.lang.String strB5 = b(aVar, "http://schemas.android.com/apk/res/android", "tileMode");
        return aVar2.a(uVarArr, jA, jA2, strB5 != null ? ca.b.f(strB5) : p141o0.j2.f52237a.a());
    }

    private static final void k(da.a aVar, u0.d.a aVar2) {
        p141o0.AbstractC6984n0 abstractC6984n0G;
        p141o0.AbstractC6984n0 abstractC6984n0G2;
        p141o0.f2 f2VarM;
        java.util.List listA = p201u0.o.a(b(aVar, "http://schemas.android.com/apk/res/android", "pathData"));
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "fillType");
        int iC = strB != null ? ca.b.c(strB) : p141o0.S1.f52156a.b();
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "name");
        if (strB2 == null) {
            strB2 = "";
        }
        java.lang.String str = strB2;
        java.lang.String strB3 = b(aVar, "http://schemas.android.com/apk/res/android", "fillColor");
        if (strB3 == null || (f2VarM = m(strB3)) == null) {
            da.a aVarA = a(aVar, "http://schemas.android.com/apk/res/android", "fillColor");
            abstractC6984n0G = aVarA != null ? g(aVarA) : null;
        } else {
            abstractC6984n0G = f2VarM;
        }
        java.lang.String strB4 = b(aVar, "http://schemas.android.com/apk/res/android", "fillAlpha");
        float f6 = strB4 != null ? java.lang.Float.parseFloat(strB4) : 1.0f;
        java.lang.String strB5 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeColor");
        if (strB5 == null || (abstractC6984n0G2 = m(strB5)) == null) {
            da.a aVarA2 = a(aVar, "http://schemas.android.com/apk/res/android", "strokeColor");
            abstractC6984n0G2 = aVarA2 != null ? g(aVarA2) : null;
        }
        java.lang.String strB6 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeAlpha");
        float f10 = strB6 != null ? java.lang.Float.parseFloat(strB6) : 1.0f;
        java.lang.String strB7 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeWidth");
        float f11 = strB7 != null ? java.lang.Float.parseFloat(strB7) : 1.0f;
        java.lang.String strB8 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeLineCap");
        int iD = strB8 != null ? ca.b.d(strB8) : p141o0.g2.f52226a.a();
        java.lang.String strB9 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeLineJoin");
        int iE = strB9 != null ? ca.b.e(strB9) : p141o0.h2.f52230a.b();
        java.lang.String strB10 = b(aVar, "http://schemas.android.com/apk/res/android", "strokeMiterLimit");
        float f12 = strB10 != null ? java.lang.Float.parseFloat(strB10) : 1.0f;
        java.lang.String strB11 = b(aVar, "http://schemas.android.com/apk/res/android", "trimPathStart");
        float f13 = strB11 != null ? java.lang.Float.parseFloat(strB11) : 0.0f;
        java.lang.String strB12 = b(aVar, "http://schemas.android.com/apk/res/android", "trimPathEnd");
        float f14 = strB12 != null ? java.lang.Float.parseFloat(strB12) : 1.0f;
        java.lang.String strB13 = b(aVar, "http://schemas.android.com/apk/res/android", "trimPathOffset");
        aVar2.c(listA, iC, str, abstractC6984n0G, f6, abstractC6984n0G2, f10, f11, iD, iE, f12, f13, f14, strB13 != null ? java.lang.Float.parseFloat(strB13) : 0.0f);
    }

    private static final p141o0.AbstractC6984n0 l(da.a aVar) {
        p141o0.AbstractC6984n0.a aVar2 = p141o0.AbstractC6984n0.f52247b;
        p087i7.u[] uVarArrF = f(aVar);
        p087i7.u[] uVarArr = (p087i7.u[]) java.util.Arrays.copyOf(uVarArrF, uVarArrF.length);
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "centerX");
        float f6 = strB != null ? java.lang.Float.parseFloat(strB) : 0.0f;
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "centerY");
        long jA = p131n0.h.a(f6, strB2 != null ? java.lang.Float.parseFloat(strB2) : 0.0f);
        java.lang.String strB3 = b(aVar, "http://schemas.android.com/apk/res/android", "gradientRadius");
        float f10 = strB3 != null ? java.lang.Float.parseFloat(strB3) : 0.0f;
        java.lang.String strB4 = b(aVar, "http://schemas.android.com/apk/res/android", "tileMode");
        return aVar2.b(uVarArr, jA, f10, strB4 != null ? ca.b.f(strB4) : p141o0.j2.f52237a.a());
    }

    private static final p141o0.f2 m(java.lang.String str) {
        return new p141o0.f2(p141o0.A0.b(ca.b.a(str)), null);
    }

    private static final p141o0.AbstractC6984n0 n(da.a aVar) {
        p141o0.AbstractC6984n0.a aVar2 = p141o0.AbstractC6984n0.f52247b;
        p087i7.u[] uVarArrF = f(aVar);
        p087i7.u[] uVarArr = (p087i7.u[]) java.util.Arrays.copyOf(uVarArrF, uVarArrF.length);
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "centerX");
        float f6 = strB != null ? java.lang.Float.parseFloat(strB) : 0.0f;
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "centerY");
        return aVar2.c(uVarArr, p131n0.h.a(f6, strB2 != null ? java.lang.Float.parseFloat(strB2) : 0.0f));
    }

    private static final void o(da.a aVar, u0.d.a aVar2, ca.a aVar3) {
        java.lang.String strE = aVar.e();
        int iHashCode = strE.hashCode();
        if (iHashCode == -1649314686) {
            if (strE.equals("clip-path")) {
                d(aVar, aVar2, aVar3);
            }
        } else if (iHashCode == 3433509) {
            if (strE.equals("path")) {
                k(aVar, aVar2);
            }
        } else if (iHashCode == 98629247 && strE.equals("group")) {
            i(aVar, aVar2, aVar3);
        }
    }

    private static final void p(da.a aVar, u0.d.a aVar2, ca.a aVar3) {
        R8.h hVarW = R8.k.w(c(aVar), ca.c.f.f24480D);
        p247y7.AbstractC7350t.d(hVarW, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        java.util.Iterator it = hVarW.iterator();
        while (it.hasNext()) {
            o((da.a) it.next(), aVar2, aVar3);
        }
    }

    public static final p201u0.d q(da.a aVar, Y0.e eVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        p247y7.AbstractC7350t.f(eVar, "density");
        ca.a aVar2 = new ca.a();
        float fB = ca.b.b(b(aVar, "http://schemas.android.com/apk/res/android", "width"), eVar);
        float fB2 = ca.b.b(b(aVar, "http://schemas.android.com/apk/res/android", "height"), eVar);
        java.lang.String strB = b(aVar, "http://schemas.android.com/apk/res/android", "viewportWidth");
        float f6 = strB != null ? java.lang.Float.parseFloat(strB) : 0.0f;
        java.lang.String strB2 = b(aVar, "http://schemas.android.com/apk/res/android", "viewportHeight");
        u0.d.a aVar3 = new u0.d.a(null, fB, fB2, f6, strB2 != null ? java.lang.Float.parseFloat(strB2) : 0.0f, 0L, 0, false, 225, null);
        p(aVar, aVar3, aVar2);
        return aVar3.f();
    }
}
