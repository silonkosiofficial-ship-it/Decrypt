package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements p129m9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51243c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Unexpected end of input: yet to parse " + p129m9.h.this.d();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.M f51245D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p129m9.h f51246E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p247y7.M m6, p129m9.h hVar) {
            super(0);
            this.f51245D = m6;
            this.f51246E = hVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Only found " + this.f51245D.f57252C + " digits in a row, but need to parse " + this.f51246E.d();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51247D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p129m9.h f51248E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f51249F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p129m9.g f51250G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.String str, p129m9.h hVar, int i6, p129m9.g gVar) {
            super(0);
            this.f51247D = str;
            this.f51248E = hVar;
            this.f51249F = i6;
            this.f51250G = gVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "Can not interpret the string '" + this.f51247D + "' as " + ((p129m9.e) this.f51248E.c().get(this.f51249F)).c() + ": " + this.f51250G.a();
        }
    }

    public h(java.util.List list) {
        boolean z6;
        boolean z10;
        int i6;
        p247y7.AbstractC7350t.f(list, "consumers");
        this.f51241a = list;
        java.util.Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer numB = ((p129m9.e) it.next()).b();
            if (numB != null) {
                iIntValue = numB.intValue();
            }
            i10 += iIntValue;
        }
        this.f51242b = i10;
        java.util.List list2 = this.f51241a;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((p129m9.e) it2.next()).b() == null) {
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        this.f51243c = z6;
        java.util.List list3 = this.f51241a;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z10 = true;
                    break;
                }
                java.lang.Integer numB2 = ((p129m9.e) it3.next()).b();
                if (!((numB2 != null ? numB2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.List list4 = this.f51241a;
        if ((list4 instanceof java.util.Collection) && list4.isEmpty()) {
            i6 = 0;
        } else {
            java.util.Iterator it4 = list4.iterator();
            i6 = 0;
            while (it4.hasNext()) {
                if ((((p129m9.e) it4.next()).b() == null) && (i6 = i6 + 1) < 0) {
                    p097j7.AbstractC6879v.v();
                }
            }
        }
        if (i6 <= 1) {
            return;
        }
        java.util.List list5 = this.f51241a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list5) {
            if (((p129m9.e) obj).b() == null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        java.util.Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((p129m9.e) it5.next()).c());
        }
        throw new java.lang.IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String d() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.util.List<p129m9.e> list = this.f51241a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (p129m9.e eVar : list) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Integer numB = eVar.b();
            sb2.append(numB == null ? "at least one digit" : numB + " digits");
            sb2.append(" for ");
            sb2.append(eVar.c());
            arrayList.add(sb2.toString());
        }
        if (this.f51243c) {
            sb = new java.lang.StringBuilder();
            str = "a number with at least ";
        } else {
            sb = new java.lang.StringBuilder();
            str = "a number with exactly ";
        }
        sb.append(str);
        sb.append(this.f51242b);
        sb.append(" digits: ");
        sb.append(arrayList);
        return sb.toString();
    }

    @Override // p129m9.o
    public java.lang.Object a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (this.f51242b + i6 > charSequence.length()) {
            return p129m9.k.f51253a.a(i6, new m9.h.a());
        }
        p247y7.M m6 = new p247y7.M();
        while (m6.f57252C + i6 < charSequence.length() && p099j9.f.b(charSequence.charAt(m6.f57252C + i6))) {
            m6.f57252C++;
        }
        if (m6.f57252C < this.f51242b) {
            return p129m9.k.f51253a.a(i6, new m9.h.b(m6, this));
        }
        int size = this.f51241a.size();
        int i10 = 0;
        while (i10 < size) {
            java.lang.Integer numB = ((p129m9.e) this.f51241a.get(i10)).b();
            int iIntValue = (numB != null ? numB.intValue() : (m6.f57252C - this.f51242b) + 1) + i6;
            p129m9.g gVarA = ((p129m9.e) this.f51241a.get(i10)).a(obj, charSequence, i6, iIntValue);
            if (gVarA != null) {
                return p129m9.k.f51253a.a(i6, new m9.h.c(charSequence.subSequence(i6, iIntValue).toString(), this, i10, gVarA));
            }
            i10++;
            i6 = iIntValue;
        }
        return p129m9.k.f51253a.b(i6);
    }

    public final java.util.List c() {
        return this.f51241a;
    }

    public java.lang.String toString() {
        return d();
    }
}
