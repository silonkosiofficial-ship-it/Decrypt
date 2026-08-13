package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class u extends j$.time.format.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47876i = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.time.format.TextStyle f47877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f47878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.HashMap f47879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.HashMap f47880h;

    u(j$.time.format.TextStyle textStyle, boolean z6) {
        super(j$.time.temporal.n.k(), "ZoneText(" + textStyle + ")");
        this.f47879g = new java.util.HashMap();
        this.f47880h = new java.util.HashMap();
        this.f47877e = (j$.time.format.TextStyle) j$.util.Objects.requireNonNull(textStyle, "textStyle");
        this.f47878f = z6;
    }

    @Override // j$.time.format.t
    protected final j$.time.format.n a(j$.time.format.v vVar) {
        j$.time.format.n nVarF;
        j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.NARROW;
        j$.time.format.TextStyle textStyle2 = this.f47877e;
        if (textStyle2 == textStyle) {
            return super.a(vVar);
        }
        java.util.Locale localeI = vVar.i();
        boolean zK = vVar.k();
        java.util.Set setA = j$.time.zone.i.a();
        int size = setA.size();
        java.util.HashMap map = zK ? this.f47879g : this.f47880h;
        java.util.Map.Entry entry = (java.util.Map.Entry) map.get(localeI);
        if (entry == null || ((java.lang.Integer) entry.getKey()).intValue() != size || (nVarF = (j$.time.format.n) ((java.lang.ref.SoftReference) entry.getValue()).get()) == null) {
            nVarF = j$.time.format.n.f(vVar);
            java.lang.String[][] zoneStrings = java.text.DateFormatSymbols.getInstance(localeI).getZoneStrings();
            int length = zoneStrings.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                java.lang.String[] strArr = zoneStrings[i6];
                java.lang.String str = strArr[0];
                if (setA.contains(str)) {
                    nVarF.a(str, str);
                    java.lang.String strA = j$.time.format.E.a(str, localeI);
                    for (int i10 = textStyle2 != j$.time.format.TextStyle.FULL ? 2 : 1; i10 < strArr.length; i10 += 2) {
                        nVarF.a(strArr[i10], strA);
                    }
                }
                i6++;
            }
            map.put(localeI, new java.util.AbstractMap.SimpleImmutableEntry(java.lang.Integer.valueOf(size), new java.lang.ref.SoftReference(nVarF)));
        }
        return nVarF;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // j$.time.format.t, j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        boolean zH;
        java.lang.String[] strArr;
        j$.time.ZoneId zoneId = (j$.time.ZoneId) xVar.f(j$.time.temporal.n.l());
        if (zoneId == null) {
            return false;
        }
        java.lang.String id = zoneId.getId();
        if (!(zoneId instanceof j$.time.ZoneOffset)) {
            j$.time.temporal.TemporalAccessor temporalAccessorD = xVar.d();
            if (this.f47878f) {
                zH = 2;
            } else if (temporalAccessorD.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                zH = zoneId.getRules().h(j$.time.Instant.N(temporalAccessorD));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessorD.e(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (temporalAccessorD.e(aVar2)) {
                        j$.time.LocalDateTime localDateTimeW = j$.time.LocalDate.V(temporalAccessorD.u(aVar)).w(j$.time.LocalTime.Q(temporalAccessorD.u(aVar2)));
                        if (zoneId.getRules().f(localDateTimeW) == null) {
                            j$.time.zone.ZoneRules rules = zoneId.getRules();
                            j$.time.ZonedDateTime zonedDateTimeM = localDateTimeW.m(zoneId);
                            zonedDateTimeM.getClass();
                            zH = rules.h(j$.time.Instant.ofEpochSecond(zonedDateTimeM.L(), zonedDateTimeM.toLocalTime().getNano()));
                        } else {
                            zH = 2;
                        }
                    } else {
                        zH = 2;
                    }
                } else {
                    zH = 2;
                }
            }
            java.util.Locale localeC = xVar.c();
            j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.NARROW;
            java.lang.String str = null;
            java.util.Map concurrentHashMap = null;
            j$.time.format.TextStyle textStyle2 = this.f47877e;
            if (textStyle2 != textStyle) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f47876i;
                java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) concurrentHashMap2.get(id);
                if (softReference == null || (concurrentHashMap = (java.util.Map) softReference.get()) == null || (strArr = (java.lang.String[]) concurrentHashMap.get(localeC)) == null) {
                    java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(id);
                    java.lang.String[] strArr2 = {id, timeZone.getDisplayName(false, 1, localeC), timeZone.getDisplayName(false, 0, localeC), timeZone.getDisplayName(true, 1, localeC), timeZone.getDisplayName(true, 0, localeC), id, id};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
                    }
                    concurrentHashMap.put(localeC, strArr2);
                    concurrentHashMap2.put(id, new java.lang.ref.SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                int iN = textStyle2.n();
                if (zH != 0) {
                    str = zH != 1 ? strArr[iN + 5] : strArr[iN + 3];
                } else {
                    str = strArr[iN + 1];
                }
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
