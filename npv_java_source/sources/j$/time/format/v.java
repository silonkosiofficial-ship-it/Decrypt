package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.time.format.DateTimeFormatter f47881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47882b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47883c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.ArrayList f47884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.ArrayList f47885e;

    v(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f47884d = arrayList;
        this.f47885e = null;
        this.f47881a = dateTimeFormatter;
        arrayList.add(new j$.time.format.B());
    }

    static boolean c(char c6, char c10) {
        return c6 == c10 || java.lang.Character.toUpperCase(c6) == java.lang.Character.toUpperCase(c10) || java.lang.Character.toLowerCase(c6) == java.lang.Character.toLowerCase(c10);
    }

    private j$.time.format.B e() {
        java.util.ArrayList arrayList = this.f47884d;
        return (j$.time.format.B) arrayList.get(arrayList.size() - 1);
    }

    final void a(j$.time.format.o oVar) {
        if (this.f47885e == null) {
            this.f47885e = new java.util.ArrayList();
        }
        this.f47885e.add(oVar);
    }

    final boolean b(char c6, char c10) {
        if (this.f47882b) {
            return c6 == c10;
        }
        return c(c6, c10);
    }

    final j$.time.format.v d() {
        j$.time.format.v vVar = new j$.time.format.v(this.f47881a);
        vVar.f47882b = this.f47882b;
        vVar.f47883c = this.f47883c;
        return vVar;
    }

    final void f(boolean z6) {
        java.util.ArrayList arrayList = this.f47884d;
        arrayList.remove(z6 ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    final j$.time.format.DecimalStyle g() {
        return this.f47881a.c();
    }

    final j$.time.chrono.Chronology h() {
        j$.time.chrono.Chronology chronology = e().f47785c;
        if (chronology != null) {
            return chronology;
        }
        j$.time.chrono.Chronology chronologyB = this.f47881a.b();
        return chronologyB == null ? j$.time.chrono.q.f47758e : chronologyB;
    }

    final java.util.Locale i() {
        return this.f47881a.d();
    }

    final java.lang.Long j(j$.time.temporal.s sVar) {
        return (java.lang.Long) e().f47783a.get(sVar);
    }

    final boolean k() {
        return this.f47882b;
    }

    final boolean l() {
        return this.f47883c;
    }

    final void m(boolean z6) {
        this.f47882b = z6;
    }

    final void n(j$.time.ZoneId zoneId) {
        j$.util.Objects.requireNonNull(zoneId, "zone");
        e().f47784b = zoneId;
    }

    final int o(j$.time.temporal.s sVar, long j6, int i6, int i10) {
        j$.util.Objects.requireNonNull(sVar, "field");
        java.lang.Long l6 = (java.lang.Long) e().f47783a.put(sVar, java.lang.Long.valueOf(j6));
        return (l6 == null || l6.longValue() == j6) ? i10 : ~i6;
    }

    final void p() {
        e().f47786d = true;
    }

    final void q(boolean z6) {
        this.f47883c = z6;
    }

    final void r() {
        java.util.ArrayList arrayList = this.f47884d;
        j$.time.format.B bE = e();
        bE.getClass();
        j$.time.format.B b6 = new j$.time.format.B();
        b6.f47783a.putAll(bE.f47783a);
        b6.f47784b = bE.f47784b;
        b6.f47785c = bE.f47785c;
        b6.f47786d = bE.f47786d;
        arrayList.add(b6);
    }

    final boolean s(java.lang.CharSequence charSequence, int i6, java.lang.CharSequence charSequence2, int i10, int i11) {
        if (i6 + i11 > charSequence.length() || i10 + i11 > charSequence2.length()) {
            return false;
        }
        if (this.f47882b) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (charSequence.charAt(i6 + i12) != charSequence2.charAt(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            char cCharAt = charSequence.charAt(i6 + i13);
            char cCharAt2 = charSequence2.charAt(i10 + i13);
            if (cCharAt != cCharAt2 && java.lang.Character.toUpperCase(cCharAt) != java.lang.Character.toUpperCase(cCharAt2) && java.lang.Character.toLowerCase(cCharAt) != java.lang.Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    final j$.time.temporal.TemporalAccessor t(j$.time.format.C c6, java.util.Set set) {
        j$.time.format.B bE = e();
        bE.f47785c = h();
        j$.time.ZoneId zoneIdE = bE.f47784b;
        if (zoneIdE == null) {
            zoneIdE = this.f47881a.e();
        }
        bE.f47784b = zoneIdE;
        bE.h(c6, set);
        return bE;
    }

    public final java.lang.String toString() {
        return e().toString();
    }
}
