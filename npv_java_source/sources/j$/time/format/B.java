package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class B implements j$.time.temporal.TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j$.time.ZoneId f47784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.time.chrono.Chronology f47785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f47786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j$.time.format.C f47787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j$.time.chrono.ChronoLocalDate f47788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j$.time.LocalTime f47789g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.HashMap f47783a = new java.util.HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.time.m f47790h = j$.time.m.f47904d;

    B() {
    }

    private void B(j$.time.temporal.s sVar, j$.time.temporal.s sVar2, java.lang.Long l6) {
        java.lang.Long l10 = (java.lang.Long) this.f47783a.put(sVar2, l6);
        if (l10 == null || l10.longValue() == l6.longValue()) {
            return;
        }
        throw new j$.time.DateTimeException("Conflict found: " + sVar2 + " " + l10 + " differs from " + sVar2 + " " + l6 + " while resolving  " + sVar);
    }

    private void g(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.util.Iterator it = this.f47783a.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            j$.time.temporal.s sVar = (j$.time.temporal.s) entry.getKey();
            if (temporalAccessor.e(sVar)) {
                try {
                    long jU = temporalAccessor.u(sVar);
                    long jLongValue = ((java.lang.Long) entry.getValue()).longValue();
                    if (jU != jLongValue) {
                        throw new j$.time.DateTimeException("Conflict found: Field " + sVar + " " + jU + " differs from " + sVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (java.lang.RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void l() {
        java.util.HashMap map = this.f47783a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            j$.time.ZoneId zoneId = this.f47784b;
            if (zoneId != null) {
                o(zoneId);
                return;
            }
            java.lang.Long l6 = (java.lang.Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l6 != null) {
                o(j$.time.ZoneOffset.ofTotalSeconds(l6.intValue()));
            }
        }
    }

    private void o(j$.time.ZoneId zoneId) {
        java.util.HashMap map = this.f47783a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        j$.time.chrono.ChronoZonedDateTime chronoZonedDateTimeG = this.f47785c.G(j$.time.Instant.P(((java.lang.Long) map.remove(aVar)).longValue()), zoneId);
        y(chronoZonedDateTimeG.b());
        B(aVar, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(chronoZonedDateTimeG.toLocalTime().toSecondOfDay()));
    }

    private void r(long j6, long j10, long j11, long j12) {
        j$.time.LocalTime localTimeOf;
        j$.time.m mVarB;
        if (this.f47787e == j$.time.format.C.LENIENT) {
            long jG = j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.m(j6, 3600000000000L), j$.com.android.tools.r8.a.m(j10, 60000000000L)), j$.com.android.tools.r8.a.m(j11, 1000000000L)), j12);
            int iL = (int) j$.com.android.tools.r8.a.l(jG, 86400000000000L);
            localTimeOf = j$.time.LocalTime.Q(j$.com.android.tools.r8.a.k(jG, 86400000000000L));
            mVarB = j$.time.m.b(iL);
        } else {
            int iN = j$.time.temporal.a.MINUTE_OF_HOUR.N(j10);
            int iN2 = j$.time.temporal.a.NANO_OF_SECOND.N(j12);
            if (this.f47787e == j$.time.format.C.SMART && j6 == 24 && iN == 0 && j11 == 0 && iN2 == 0) {
                localTimeOf = j$.time.LocalTime.MIDNIGHT;
                mVarB = j$.time.m.b(1);
            } else {
                localTimeOf = j$.time.LocalTime.of(j$.time.temporal.a.HOUR_OF_DAY.N(j6), iN, j$.time.temporal.a.SECOND_OF_MINUTE.N(j11), iN2);
                mVarB = j$.time.m.f47904d;
            }
        }
        v(localTimeOf, mVarB);
    }

    private void t() {
        j$.time.temporal.s sVar;
        long jG;
        java.util.HashMap map = this.f47783a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((java.lang.Long) map.remove(aVar)).longValue();
            j$.time.format.C c6 = this.f47787e;
            if (c6 == j$.time.format.C.STRICT || (c6 == j$.time.format.C.SMART && jLongValue != 0)) {
                aVar.O(jLongValue);
            }
            j$.time.temporal.s sVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            B(aVar, sVar2, java.lang.Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar2)) {
            long jLongValue2 = ((java.lang.Long) map.remove(aVar2)).longValue();
            j$.time.format.C c10 = this.f47787e;
            if (c10 == j$.time.format.C.STRICT || (c10 == j$.time.format.C.SMART && jLongValue2 != 0)) {
                aVar2.O(jLongValue2);
            }
            B(aVar2, j$.time.temporal.a.HOUR_OF_AMPM, java.lang.Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar3)) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar4)) {
                long jLongValue3 = ((java.lang.Long) map.remove(aVar3)).longValue();
                long jLongValue4 = ((java.lang.Long) map.remove(aVar4)).longValue();
                if (this.f47787e == j$.time.format.C.LENIENT) {
                    sVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jG = j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.m(jLongValue3, 12), jLongValue4);
                } else {
                    aVar3.O(jLongValue3);
                    aVar4.O(jLongValue3);
                    sVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jG = (jLongValue3 * 12) + jLongValue4;
                }
                B(aVar3, sVar, java.lang.Long.valueOf(jG));
            }
        }
        j$.time.temporal.a aVar5 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar5)) {
            long jLongValue5 = ((java.lang.Long) map.remove(aVar5)).longValue();
            if (this.f47787e != j$.time.format.C.LENIENT) {
                aVar5.O(jLongValue5);
            }
            B(aVar5, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue5 / 3600000000000L));
            B(aVar5, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue5 / 60000000000L) % 60));
            B(aVar5, j$.time.temporal.a.SECOND_OF_MINUTE, java.lang.Long.valueOf((jLongValue5 / 1000000000) % 60));
            B(aVar5, j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue6 = ((java.lang.Long) map.remove(aVar6)).longValue();
            if (this.f47787e != j$.time.format.C.LENIENT) {
                aVar6.O(jLongValue6);
            }
            B(aVar6, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue6 / 1000000));
            B(aVar6, j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue7 = ((java.lang.Long) map.remove(aVar7)).longValue();
            if (this.f47787e != j$.time.format.C.LENIENT) {
                aVar7.O(jLongValue7);
            }
            B(aVar7, j$.time.temporal.a.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue7 / 1000));
            B(aVar7, j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue8 = ((java.lang.Long) map.remove(aVar8)).longValue();
            if (this.f47787e != j$.time.format.C.LENIENT) {
                aVar8.O(jLongValue8);
            }
            B(aVar8, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue8 / 3600));
            B(aVar8, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue8 / 60) % 60));
            B(aVar8, j$.time.temporal.a.SECOND_OF_MINUTE, java.lang.Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue9 = ((java.lang.Long) map.remove(aVar9)).longValue();
            if (this.f47787e != j$.time.format.C.LENIENT) {
                aVar9.O(jLongValue9);
            }
            B(aVar9, j$.time.temporal.a.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue9 / 60));
            B(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, java.lang.Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar10)) {
            long jLongValue10 = ((java.lang.Long) map.get(aVar10)).longValue();
            j$.time.format.C c11 = this.f47787e;
            j$.time.format.C c12 = j$.time.format.C.LENIENT;
            if (c11 != c12) {
                aVar10.O(jLongValue10);
            }
            j$.time.temporal.a aVar11 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar11)) {
                long jLongValue11 = ((java.lang.Long) map.remove(aVar11)).longValue();
                if (this.f47787e != c12) {
                    aVar11.O(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                B(aVar11, aVar10, java.lang.Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue12 = ((java.lang.Long) map.remove(aVar12)).longValue();
                if (this.f47787e != c12) {
                    aVar12.O(jLongValue12);
                }
                B(aVar12, aVar10, java.lang.Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar13 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar13)) {
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar14)) {
                j$.time.temporal.a aVar15 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar15) && map.containsKey(aVar10)) {
                    r(((java.lang.Long) map.remove(aVar13)).longValue(), ((java.lang.Long) map.remove(aVar14)).longValue(), ((java.lang.Long) map.remove(aVar15)).longValue(), ((java.lang.Long) map.remove(aVar10)).longValue());
                }
            }
        }
    }

    private void v(j$.time.LocalTime localTime, j$.time.m mVar) {
        j$.time.LocalTime localTime2 = this.f47789g;
        if (localTime2 == null) {
            this.f47789g = localTime;
        } else {
            if (!localTime2.equals(localTime)) {
                throw new j$.time.DateTimeException("Conflict found: Fields resolved to different times: " + this.f47789g + " " + localTime);
            }
            j$.time.m mVar2 = this.f47790h;
            mVar2.getClass();
            j$.time.m mVar3 = j$.time.m.f47904d;
            if (mVar2 != mVar3 && mVar != mVar3 && !this.f47790h.equals(mVar)) {
                throw new j$.time.DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f47790h + " " + mVar);
            }
        }
        this.f47790h = mVar;
    }

    private void y(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate2 = this.f47788f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new j$.time.DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f47788f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (this.f47785c.equals(chronoLocalDate.a())) {
                this.f47788f = chronoLocalDate;
                return;
            }
            throw new j$.time.DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f47785c);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (this.f47783a.containsKey(sVar)) {
            return true;
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47788f;
        if (chronoLocalDate != null && chronoLocalDate.e(sVar)) {
            return true;
        }
        j$.time.LocalTime localTime = this.f47789g;
        if (localTime == null || !localTime.e(sVar)) {
            return (sVar == null || (sVar instanceof j$.time.temporal.a) || !sVar.u(this)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void h(j$.time.format.C c6, java.util.Set set) {
        j$.time.temporal.s sVar;
        j$.time.chrono.ChronoZonedDateTime chronoZonedDateTimeM;
        j$.time.temporal.a aVar;
        java.lang.Long lValueOf;
        j$.time.temporal.s sVar2;
        java.util.HashMap map = this.f47783a;
        if (set != null) {
            map.keySet().retainAll(set);
        }
        this.f47787e = c6;
        l();
        y(this.f47785c.E(map, this.f47787e));
        t();
        if (map.size() > 0) {
            int i6 = 0;
            loop0: while (i6 < 50) {
                java.util.Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    sVar2 = (j$.time.temporal.s) ((java.util.Map.Entry) it.next()).getKey();
                    j$.time.temporal.TemporalAccessor temporalAccessorP = sVar2.p(map, this, this.f47787e);
                    if (temporalAccessorP != null) {
                        if (temporalAccessorP instanceof j$.time.chrono.ChronoZonedDateTime) {
                            j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime = (j$.time.chrono.ChronoZonedDateTime) temporalAccessorP;
                            j$.time.ZoneId zoneId = this.f47784b;
                            if (zoneId == null) {
                                this.f47784b = chronoZonedDateTime.s();
                            } else if (!zoneId.equals(chronoZonedDateTime.s())) {
                                throw new j$.time.DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f47784b);
                            }
                            temporalAccessorP = chronoZonedDateTime.A();
                        }
                        if (!(temporalAccessorP instanceof j$.time.chrono.ChronoLocalDateTime)) {
                            if (!(temporalAccessorP instanceof j$.time.chrono.ChronoLocalDate)) {
                                if (!(temporalAccessorP instanceof j$.time.LocalTime)) {
                                    throw new j$.time.DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                                v((j$.time.LocalTime) temporalAccessorP, j$.time.m.f47904d);
                                break;
                            }
                            y((j$.time.chrono.ChronoLocalDate) temporalAccessorP);
                            break;
                        }
                        j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime = (j$.time.chrono.ChronoLocalDateTime) temporalAccessorP;
                        v(chronoLocalDateTime.toLocalTime(), j$.time.m.f47904d);
                        y(chronoLocalDateTime.b());
                        break;
                    }
                } while (map.containsKey(sVar2));
                i6++;
            }
            if (i6 == 50) {
                throw new j$.time.DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i6 > 0) {
                l();
                y(this.f47785c.E(map, this.f47787e));
                t();
            }
        }
        if (this.f47789g == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar2)) {
                long jLongValue = ((java.lang.Long) map.remove(aVar2)).longValue();
                j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar3)) {
                    long jLongValue2 = (((java.lang.Long) map.get(aVar3)).longValue() % 1000) + (jLongValue * 1000);
                    B(aVar2, aVar3, java.lang.Long.valueOf(jLongValue2));
                    map.remove(aVar3);
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = java.lang.Long.valueOf(jLongValue2 * 1000);
                } else {
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = java.lang.Long.valueOf(jLongValue * 1000000);
                }
                map.put(aVar, lValueOf);
            } else {
                java.lang.Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(((java.lang.Long) map.remove(obj)).longValue() * 1000));
                }
            }
            java.lang.Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            java.lang.Long l6 = (java.lang.Long) map.get(obj2);
            if (l6 != null) {
                java.lang.Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                java.lang.Long l10 = (java.lang.Long) map.get(obj3);
                java.lang.Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                java.lang.Long l11 = (java.lang.Long) map.get(obj4);
                java.lang.Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                java.lang.Long l12 = (java.lang.Long) map.get(obj5);
                if ((l10 != null || (l11 == null && l12 == null)) && (l10 == null || l11 != null || l12 == null)) {
                    r(l6.longValue(), l10 != null ? l10.longValue() : 0L, l11 != null ? l11.longValue() : 0L, l12 != null ? l12.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                    if (this.f47787e != j$.time.format.C.LENIENT && map.size() > 0) {
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            sVar = (j$.time.temporal.s) entry.getKey();
                            if (!(sVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) sVar).P()) {
                                ((j$.time.temporal.a) sVar).O(((java.lang.Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            } else if (this.f47787e != j$.time.format.C.LENIENT) {
                while (r0.hasNext()) {
                    sVar = (j$.time.temporal.s) entry.getKey();
                    if (!(sVar instanceof j$.time.temporal.a)) {
                    }
                }
            }
        } else if (this.f47787e != j$.time.format.C.LENIENT) {
            while (r0.hasNext()) {
                sVar = (j$.time.temporal.s) entry.getKey();
                if (!(sVar instanceof j$.time.temporal.a)) {
                }
            }
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47788f;
        if (chronoLocalDate != null) {
            g(chronoLocalDate);
        }
        j$.time.LocalTime localTime = this.f47789g;
        if (localTime != null) {
            g(localTime);
            if (this.f47788f != null && map.size() > 0) {
                g(this.f47788f.w(this.f47789g));
            }
        }
        if (this.f47788f != null && this.f47789g != null) {
            j$.time.m mVar = this.f47790h;
            mVar.getClass();
            j$.time.m mVar2 = j$.time.m.f47904d;
            if (mVar != mVar2) {
                this.f47788f = this.f47788f.C(this.f47790h);
                this.f47790h = mVar2;
            }
        }
        if (this.f47789g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar4)) {
                long jLongValue3 = ((java.lang.Long) map.get(aVar4)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / 1000000));
            } else {
                map.put(aVar4, 0L);
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
            }
        }
        if (this.f47788f == null || this.f47789g == null) {
            return;
        }
        java.lang.Long l13 = (java.lang.Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l13 != null) {
            chronoZonedDateTimeM = this.f47788f.w(this.f47789g).m(j$.time.ZoneOffset.ofTotalSeconds(l13.intValue()));
        } else if (this.f47784b == null) {
            return;
        } else {
            chronoZonedDateTimeM = this.f47788f.w(this.f47789g).m(this.f47784b);
        }
        map.put(j$.time.temporal.a.INSTANT_SECONDS, java.lang.Long.valueOf(chronoZonedDateTimeM.L()));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int n(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(this.f47783a);
        sb.append(',');
        sb.append(this.f47785c);
        if (this.f47784b != null) {
            sb.append(',');
            sb.append(this.f47784b);
        }
        if (this.f47788f != null || this.f47789g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47788f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f47789g != null) {
                    sb.append('T');
                    sb.append(this.f47789g);
                }
            } else {
                sb.append(this.f47789g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        j$.util.Objects.requireNonNull(sVar, "field");
        java.lang.Long l6 = (java.lang.Long) this.f47783a.get(sVar);
        if (l6 != null) {
            return l6.longValue();
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47788f;
        if (chronoLocalDate != null && chronoLocalDate.e(sVar)) {
            return this.f47788f.u(sVar);
        }
        j$.time.LocalTime localTime = this.f47789g;
        if (localTime != null && localTime.e(sVar)) {
            return this.f47789g.u(sVar);
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.l()) {
            return this.f47784b;
        }
        if (temporalQuery == j$.time.temporal.n.e()) {
            return this.f47785c;
        }
        if (temporalQuery == j$.time.temporal.n.f()) {
            j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47788f;
            if (chronoLocalDate != null) {
                return j$.time.LocalDate.O(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return this.f47789g;
        }
        if (temporalQuery != j$.time.temporal.n.i()) {
            if (temporalQuery != j$.time.temporal.n.k() && temporalQuery == j$.time.temporal.n.j()) {
                return null;
            }
            return temporalQuery.queryFrom(this);
        }
        java.lang.Long l6 = (java.lang.Long) this.f47783a.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l6 != null) {
            return j$.time.ZoneOffset.ofTotalSeconds(l6.intValue());
        }
        j$.time.ZoneId zoneId = this.f47784b;
        return zoneId instanceof j$.time.ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
    }
}
