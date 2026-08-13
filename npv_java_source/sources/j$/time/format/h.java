package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class h implements j$.time.format.f {
    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        java.lang.Long lE = xVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.TemporalAccessor temporalAccessorD = xVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        java.lang.Long lValueOf = temporalAccessorD.e(aVar) ? java.lang.Long.valueOf(xVar.d().u(aVar)) : null;
        int i6 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iN = aVar.N(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j6 = jLongValue - 253402300800L;
            long jL = j$.com.android.tools.r8.a.l(j6, 315569520000L) + 1;
            j$.time.LocalDateTime localDateTimeT = j$.time.LocalDateTime.T(j$.com.android.tools.r8.a.k(j6, 315569520000L) - 62167219200L, 0, j$.time.ZoneOffset.UTC);
            if (jL > 0) {
                sb.append('+');
                sb.append(jL);
            }
            sb.append(localDateTimeT);
            if (localDateTimeT.P() == 0) {
                sb.append(":00");
            }
        } else {
            long j10 = jLongValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            j$.time.LocalDateTime localDateTimeT2 = j$.time.LocalDateTime.T(j12 - 62167219200L, 0, j$.time.ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeT2);
            if (localDateTimeT2.P() == 0) {
                sb.append(":00");
            }
            if (j11 < 0) {
                if (localDateTimeT2.getYear() == -10000) {
                    sb.replace(length, length + 2, java.lang.Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb.insert(length, j11);
                } else {
                    sb.insert(length + 1, java.lang.Math.abs(j11));
                }
            }
        }
        if (iN > 0) {
            sb.append('.');
            int i10 = 100000000;
            while (true) {
                if (iN <= 0 && i6 % 3 == 0 && i6 >= -2) {
                    break;
                }
                int i11 = iN / i10;
                sb.append((char) (i11 + 48));
                iN -= i11 * i10;
                i10 /= 10;
                i6++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10;
        int i11;
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.m(aVar, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.m(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i12 = 0;
        dateTimeFormatterBuilder.b(aVar4, 0, 9, true);
        dateTimeFormatterBuilder.e('Z');
        j$.time.format.C6707e c6707eG = dateTimeFormatterBuilder.toFormatter().g();
        j$.time.format.v vVarD = vVar.d();
        int iP = c6707eG.p(vVarD, charSequence, i6);
        if (iP < 0) {
            return iP;
        }
        long jLongValue = vVarD.j(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = vVarD.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVarD.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVarD.j(aVar).intValue();
        int iIntValue4 = vVarD.j(aVar2).intValue();
        java.lang.Long lJ = vVarD.j(aVar3);
        java.lang.Long lJ2 = vVarD.j(aVar4);
        int iIntValue5 = lJ != null ? lJ.intValue() : 0;
        int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i10 = 0;
            i11 = iIntValue5;
            i12 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.p();
            i10 = iIntValue3;
            i11 = 59;
        } else {
            i10 = iIntValue3;
            i11 = iIntValue5;
        }
        try {
            return vVar.o(aVar4, iIntValue6, i6, vVar.o(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.m(jLongValue / 10000, 315569520000L) + j$.time.chrono.AbstractC6701g.n(j$.time.LocalDateTime.of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i10, iIntValue4, i11, 0).V(i12), j$.time.ZoneOffset.UTC), i6, iP));
        } catch (java.lang.RuntimeException unused) {
            return ~i6;
        }
    }

    public final java.lang.String toString() {
        return "Instant()";
    }
}
