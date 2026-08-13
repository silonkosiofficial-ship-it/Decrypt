package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r implements p109k9.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.D f49858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f49859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49860c;

    private final class a implements p129m9.a {
        public a() {
        }

        @Override // p129m9.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String c(java.lang.Object obj, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "newValue");
            java.lang.Integer num = (java.lang.Integer) p109k9.r.this.g().b().c(obj, java.lang.Integer.valueOf(p109k9.r.this.f49859b.indexOf(str) + p109k9.r.this.g().g()));
            if (num == null) {
                return null;
            }
            p109k9.r rVar = p109k9.r.this;
            return (java.lang.String) rVar.f49859b.get(num.intValue() - rVar.g().g());
        }

        @Override // p129m9.a
        public java.lang.String getName() {
            return p109k9.r.this.f49860c;
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj, p109k9.r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(java.lang.Object obj) {
            return ((p109k9.r) this.f57287D).h(obj);
        }
    }

    public r(p109k9.D d6, java.util.List list, java.lang.String str) {
        p247y7.AbstractC7350t.f(d6, "field");
        p247y7.AbstractC7350t.f(list, "values");
        p247y7.AbstractC7350t.f(str, "name");
        this.f49858a = d6;
        this.f49859b = list;
        this.f49860c = str;
        if (list.size() == (d6.f() - d6.g()) + 1) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The number of values (" + list.size() + ") in " + list + " does not match the range of the field (" + ((d6.f() - d6.g()) + 1) + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String h(java.lang.Object obj) {
        int iIntValue = ((java.lang.Number) this.f49858a.b().b(obj)).intValue();
        java.lang.String str = (java.lang.String) p097j7.AbstractC6879v.l0(this.f49859b, iIntValue - this.f49858a.g());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.f49858a.getName() + " does not have a corresponding string representation";
    }

    @Override // p109k9.l
    public p119l9.e a() {
        return new p119l9.j(new k9.r.b(this));
    }

    @Override // p109k9.l
    public p129m9.q b() {
        return new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.u(this.f49859b, new k9.r.a(), "one of " + this.f49859b + " for " + this.f49860c)), p097j7.AbstractC6879v.m());
    }

    @Override // p109k9.l
    public /* bridge */ /* synthetic */ p109k9.n c() {
        return this.f49858a;
    }

    public final p109k9.D g() {
        return this.f49858a;
    }
}
