package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class s extends j$.time.format.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f47870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47871h;

    s(char c6, int i6, int i10, int i11, int i12) {
        super(null, i10, i11, j$.time.format.D.NOT_NEGATIVE, i12);
        this.f47870g = c6;
        this.f47871h = i6;
    }

    private j$.time.format.j g(java.util.Locale locale) {
        j$.time.temporal.s sVarH;
        j$.time.temporal.WeekFields weekFieldsOf = j$.time.temporal.WeekFields.of(locale);
        char c6 = this.f47870g;
        if (c6 == 'W') {
            sVarH = weekFieldsOf.h();
        } else {
            if (c6 == 'Y') {
                j$.time.temporal.s sVarG = weekFieldsOf.g();
                int i6 = this.f47871h;
                if (i6 == 2) {
                    return new j$.time.format.p(sVarG, this.f47842e);
                }
                return new j$.time.format.j(sVarG, i6, 19, i6 < 4 ? j$.time.format.D.NORMAL : j$.time.format.D.EXCEEDS_PAD, this.f47842e);
            }
            if (c6 == 'c' || c6 == 'e') {
                sVarH = weekFieldsOf.d();
            } else {
                if (c6 != 'w') {
                    throw new java.lang.IllegalStateException("unreachable");
                }
                sVarH = weekFieldsOf.i();
            }
        }
        return new j$.time.format.j(sVarH, this.f47839b, this.f47840c, j$.time.format.D.NOT_NEGATIVE, this.f47842e);
    }

    @Override // j$.time.format.j
    final j$.time.format.j e() {
        if (this.f47842e == -1) {
            return this;
        }
        return new j$.time.format.s(this.f47870g, this.f47871h, this.f47839b, this.f47840c, -1);
    }

    @Override // j$.time.format.j
    final j$.time.format.j f(int i6) {
        return new j$.time.format.s(this.f47870g, this.f47871h, this.f47839b, this.f47840c, this.f47842e + i6);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        return g(xVar.c()).n(xVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        return g(vVar.i()).p(vVar, charSequence, i6);
    }

    @Override // j$.time.format.j
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append("Localized(");
        int i6 = this.f47871h;
        char c6 = this.f47870g;
        if (c6 == 'Y') {
            if (i6 == 1) {
                str2 = "WeekBasedYear";
            } else if (i6 == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb.append("WeekBasedYear,");
                sb.append(i6);
                sb.append(",19,");
                sb.append(i6 < 4 ? j$.time.format.D.NORMAL : j$.time.format.D.EXCEEDS_PAD);
            }
            sb.append(str2);
        } else {
            if (c6 == 'W') {
                str = "WeekOfMonth";
            } else if (c6 == 'c' || c6 == 'e') {
                str = "DayOfWeek";
            } else {
                if (c6 == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb.append(",");
                sb.append(i6);
            }
            sb.append(str);
            sb.append(",");
            sb.append(i6);
        }
        sb.append(")");
        return sb.toString();
    }
}
