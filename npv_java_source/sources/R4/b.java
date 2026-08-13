package R4;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.String[] f9481g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final java.text.DateFormat f9482h = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f9483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f9485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Date f9486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f9488f;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Date date, long j6, long j10) {
        this.f9483a = str;
        this.f9484b = str2;
        this.f9485c = str3;
        this.f9486d = date;
        this.f9487e = j6;
        this.f9488f = j10;
    }

    static R4.b a(T4.a.c cVar) {
        java.lang.String str = cVar.f12940d;
        if (str == null) {
            str = "";
        }
        return new R4.b(cVar.f12938b, java.lang.String.valueOf(cVar.f12939c), str, new java.util.Date(cVar.f12949m), cVar.f12941e, cVar.f12946j);
    }

    static R4.b b(java.util.Map map) throws R4.a {
        g(map);
        try {
            return new R4.b((java.lang.String) map.get("experimentId"), (java.lang.String) map.get("variantId"), map.containsKey("triggerEvent") ? (java.lang.String) map.get("triggerEvent") : "", f9482h.parse((java.lang.String) map.get("experimentStartTime")), java.lang.Long.parseLong((java.lang.String) map.get("triggerTimeoutMillis")), java.lang.Long.parseLong((java.lang.String) map.get("timeToLiveMillis")));
        } catch (java.lang.NumberFormatException e6) {
            throw new R4.a("Could not process experiment: one of the durations could not be converted into a long.", e6);
        } catch (java.text.ParseException e10) {
            throw new R4.a("Could not process experiment: parsing experiment start time failed.", e10);
        }
    }

    private static void g(java.util.Map map) throws R4.a {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : f9481g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new R4.a(java.lang.String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    java.lang.String c() {
        return this.f9483a;
    }

    long d() {
        return this.f9486d.getTime();
    }

    java.lang.String e() {
        return this.f9484b;
    }

    T4.a.c f(java.lang.String str) {
        T4.a.c cVar = new T4.a.c();
        cVar.f12937a = str;
        cVar.f12949m = d();
        cVar.f12938b = this.f9483a;
        cVar.f12939c = this.f9484b;
        cVar.f12940d = android.text.TextUtils.isEmpty(this.f9485c) ? null : this.f9485c;
        cVar.f12941e = this.f9487e;
        cVar.f12946j = this.f9488f;
        return cVar;
    }
}
