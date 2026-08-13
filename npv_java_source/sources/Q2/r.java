package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Q2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f8823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.g f8824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p143o2.w f8825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p143o2.w f8826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p143o2.w f8827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p143o2.w f8828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p143o2.w f8829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p143o2.w f8830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p143o2.w f8831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p143o2.w f8832j;

    class a extends p143o2.g {
        a(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p143o2.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p253z2.h hVar, Q2.p pVar) throws java.lang.Throwable {
            java.lang.String str = pVar.f8803a;
            if (str == null) {
                hVar.M0(1);
            } else {
                hVar.C(1, str);
            }
            hVar.l(2, Q2.v.j(pVar.f8804b));
            java.lang.String str2 = pVar.f8805c;
            if (str2 == null) {
                hVar.M0(3);
            } else {
                hVar.C(3, str2);
            }
            java.lang.String str3 = pVar.f8806d;
            if (str3 == null) {
                hVar.M0(4);
            } else {
                hVar.C(4, str3);
            }
            byte[] bArrK = androidx.work.b.k(pVar.f8807e);
            if (bArrK == null) {
                hVar.M0(5);
            } else {
                hVar.p0(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.b.k(pVar.f8808f);
            if (bArrK2 == null) {
                hVar.M0(6);
            } else {
                hVar.p0(6, bArrK2);
            }
            hVar.l(7, pVar.f8809g);
            hVar.l(8, pVar.f8810h);
            hVar.l(9, pVar.f8811i);
            hVar.l(10, pVar.f8813k);
            hVar.l(11, Q2.v.a(pVar.f8814l));
            hVar.l(12, pVar.f8815m);
            hVar.l(13, pVar.f8816n);
            hVar.l(14, pVar.f8817o);
            hVar.l(15, pVar.f8818p);
            hVar.l(16, pVar.f8819q ? 1L : 0L);
            hVar.l(17, Q2.v.i(pVar.f8820r));
            I2.b bVar = pVar.f8812j;
            if (bVar != null) {
                hVar.l(18, Q2.v.h(bVar.b()));
                hVar.l(19, bVar.g() ? 1L : 0L);
                hVar.l(20, bVar.h() ? 1L : 0L);
                hVar.l(21, bVar.f() ? 1L : 0L);
                hVar.l(22, bVar.i() ? 1L : 0L);
                hVar.l(23, bVar.c());
                hVar.l(24, bVar.d());
                byte[] bArrC = Q2.v.c(bVar.a());
                if (bArrC != null) {
                    hVar.p0(25, bArrC);
                    return;
                }
            } else {
                hVar.M0(18);
                hVar.M0(19);
                hVar.M0(20);
                hVar.M0(21);
                hVar.M0(22);
                hVar.M0(23);
                hVar.M0(24);
            }
            hVar.M0(25);
        }
    }

    class b extends p143o2.w {
        b(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class c extends p143o2.w {
        c(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class d extends p143o2.w {
        d(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    class e extends p143o2.w {
        e(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class f extends p143o2.w {
        f(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class g extends p143o2.w {
        g(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class h extends p143o2.w {
        h(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class i extends p143o2.w {
        i(p143o2.n nVar) {
            super(nVar);
        }

        @Override // p143o2.w
        public java.lang.String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(p143o2.n nVar) {
        this.f8823a = nVar;
        this.f8824b = new Q2.r.a(nVar);
        this.f8825c = new Q2.r.b(nVar);
        this.f8826d = new Q2.r.c(nVar);
        this.f8827e = new Q2.r.d(nVar);
        this.f8828f = new Q2.r.e(nVar);
        this.f8829g = new Q2.r.f(nVar);
        this.f8830h = new Q2.r.g(nVar);
        this.f8831i = new Q2.r.h(nVar);
        this.f8832j = new Q2.r.i(nVar);
    }

    @Override // Q2.q
    public void a(java.lang.String str) {
        this.f8823a.f();
        p253z2.h hVarB = this.f8825c.b();
        if (str == null) {
            hVarB.M0(1);
        } else {
            hVarB.C(1, str);
        }
        this.f8823a.g();
        try {
            hVarB.I();
            this.f8823a.N();
        } finally {
            this.f8823a.n();
            this.f8825c.h(hVarB);
        }
    }

    @Override // Q2.q
    public int b(I2.s sVar, java.lang.String... strArr) {
        this.f8823a.f();
        java.lang.StringBuilder sbB = p223w2.n.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        p223w2.n.a(sbB, strArr.length);
        sbB.append(")");
        p253z2.h hVarH = this.f8823a.h(sbB.toString());
        hVarH.l(1, Q2.v.j(sVar));
        int i6 = 2;
        for (java.lang.String str : strArr) {
            if (str == null) {
                hVarH.M0(i6);
            } else {
                hVarH.C(i6, str);
            }
            i6++;
        }
        this.f8823a.g();
        try {
            int I10 = hVarH.I();
            this.f8823a.N();
            return I10;
        } finally {
            this.f8823a.n();
        }
    }

    @Override // Q2.q
    public void c(Q2.p pVar) {
        this.f8823a.f();
        this.f8823a.g();
        try {
            this.f8824b.j(pVar);
            this.f8823a.N();
        } finally {
            this.f8823a.n();
        }
    }

    @Override // Q2.q
    public int d(java.lang.String str, long j6) {
        this.f8823a.f();
        p253z2.h hVarB = this.f8830h.b();
        hVarB.l(1, j6);
        if (str == null) {
            hVarB.M0(2);
        } else {
            hVarB.C(2, str);
        }
        this.f8823a.g();
        try {
            int I10 = hVarB.I();
            this.f8823a.N();
            return I10;
        } finally {
            this.f8823a.n();
            this.f8830h.h(hVarB);
        }
    }

    @Override // Q2.q
    public java.util.List e(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "id");
            int iE2 = p223w2.a.e(cursorE, "state");
            java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
            while (cursorE.moveToNext()) {
                Q2.p.b bVar = new Q2.p.b();
                bVar.f8821a = cursorE.getString(iE);
                bVar.f8822b = Q2.v.g(cursorE.getInt(iE2));
                arrayList.add(bVar);
            }
            cursorE.close();
            vVarG.r();
            return arrayList;
        } catch (java.lang.Throwable th) {
            cursorE.close();
            vVarG.r();
            throw th;
        }
    }

    @Override // Q2.q
    public java.util.List f(long j6) throws java.lang.Throwable {
        p143o2.v vVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        vVarG.l(1, j6);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                int i6 = iE14;
                java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
                while (cursorE.moveToNext()) {
                    java.lang.String string = cursorE.getString(iE9);
                    int i10 = iE9;
                    java.lang.String string2 = cursorE.getString(iE11);
                    int i11 = iE11;
                    I2.b bVar = new I2.b();
                    int i12 = iE;
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    int i13 = iE2;
                    int i14 = iE3;
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar = new Q2.p(string, string2);
                    pVar.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar.f8806d = cursorE.getString(iE12);
                    pVar.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    int i15 = i6;
                    pVar.f8808f = androidx.work.b.g(cursorE.getBlob(i15));
                    int i16 = iE15;
                    i6 = i15;
                    pVar.f8809g = cursorE.getLong(i16);
                    int i17 = iE12;
                    int i18 = iE16;
                    pVar.f8810h = cursorE.getLong(i18);
                    int i19 = iE4;
                    int i20 = iE17;
                    pVar.f8811i = cursorE.getLong(i20);
                    int i21 = iE18;
                    pVar.f8813k = cursorE.getInt(i21);
                    int i22 = iE19;
                    pVar.f8814l = Q2.v.d(cursorE.getInt(i22));
                    iE17 = i20;
                    int i23 = iE20;
                    pVar.f8815m = cursorE.getLong(i23);
                    int i24 = iE21;
                    pVar.f8816n = cursorE.getLong(i24);
                    iE21 = i24;
                    int i25 = iE22;
                    pVar.f8817o = cursorE.getLong(i25);
                    int i26 = iE23;
                    pVar.f8818p = cursorE.getLong(i26);
                    int i27 = iE24;
                    pVar.f8819q = cursorE.getInt(i27) != 0;
                    int i28 = iE25;
                    pVar.f8820r = Q2.v.f(cursorE.getInt(i28));
                    pVar.f8812j = bVar;
                    arrayList.add(pVar);
                    iE2 = i13;
                    iE25 = i28;
                    iE12 = i17;
                    iE15 = i16;
                    iE16 = i18;
                    iE18 = i21;
                    iE23 = i26;
                    iE9 = i10;
                    iE11 = i11;
                    iE = i12;
                    iE24 = i27;
                    iE22 = i25;
                    iE3 = i14;
                    iE20 = i23;
                    iE4 = i19;
                    iE19 = i22;
                }
                cursorE.close();
                vVar.r();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public java.util.List g(int i6) throws java.lang.Throwable {
        p143o2.v vVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        vVarG.l(1, i6);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                int i10 = iE14;
                java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
                while (cursorE.moveToNext()) {
                    java.lang.String string = cursorE.getString(iE9);
                    int i11 = iE9;
                    java.lang.String string2 = cursorE.getString(iE11);
                    int i12 = iE11;
                    I2.b bVar = new I2.b();
                    int i13 = iE;
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    int i14 = iE2;
                    int i15 = iE3;
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar = new Q2.p(string, string2);
                    pVar.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar.f8806d = cursorE.getString(iE12);
                    pVar.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    int i16 = i10;
                    pVar.f8808f = androidx.work.b.g(cursorE.getBlob(i16));
                    i10 = i16;
                    int i17 = iE15;
                    pVar.f8809g = cursorE.getLong(i17);
                    int i18 = iE12;
                    int i19 = iE16;
                    pVar.f8810h = cursorE.getLong(i19);
                    int i20 = iE4;
                    int i21 = iE17;
                    pVar.f8811i = cursorE.getLong(i21);
                    int i22 = iE18;
                    pVar.f8813k = cursorE.getInt(i22);
                    int i23 = iE19;
                    pVar.f8814l = Q2.v.d(cursorE.getInt(i23));
                    iE17 = i21;
                    int i24 = iE20;
                    pVar.f8815m = cursorE.getLong(i24);
                    int i25 = iE21;
                    pVar.f8816n = cursorE.getLong(i25);
                    iE21 = i25;
                    int i26 = iE22;
                    pVar.f8817o = cursorE.getLong(i26);
                    int i27 = iE23;
                    pVar.f8818p = cursorE.getLong(i27);
                    int i28 = iE24;
                    pVar.f8819q = cursorE.getInt(i28) != 0;
                    int i29 = iE25;
                    pVar.f8820r = Q2.v.f(cursorE.getInt(i29));
                    pVar.f8812j = bVar;
                    arrayList.add(pVar);
                    iE25 = i29;
                    iE2 = i14;
                    iE12 = i18;
                    iE15 = i17;
                    iE16 = i19;
                    iE18 = i22;
                    iE23 = i27;
                    iE9 = i11;
                    iE11 = i12;
                    iE = i13;
                    iE24 = i28;
                    iE22 = i26;
                    iE3 = i15;
                    iE20 = i24;
                    iE4 = i20;
                    iE19 = i23;
                }
                cursorE.close();
                vVar.r();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public java.util.List h() throws java.lang.Throwable {
        p143o2.v vVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                int i6 = iE14;
                java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
                while (cursorE.moveToNext()) {
                    java.lang.String string = cursorE.getString(iE9);
                    int i10 = iE9;
                    java.lang.String string2 = cursorE.getString(iE11);
                    int i11 = iE11;
                    I2.b bVar = new I2.b();
                    int i12 = iE;
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    int i13 = iE2;
                    int i14 = iE3;
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar = new Q2.p(string, string2);
                    pVar.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar.f8806d = cursorE.getString(iE12);
                    pVar.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    int i15 = i6;
                    pVar.f8808f = androidx.work.b.g(cursorE.getBlob(i15));
                    i6 = i15;
                    int i16 = iE15;
                    pVar.f8809g = cursorE.getLong(i16);
                    int i17 = iE13;
                    int i18 = iE16;
                    pVar.f8810h = cursorE.getLong(i18);
                    int i19 = iE4;
                    int i20 = iE17;
                    pVar.f8811i = cursorE.getLong(i20);
                    int i21 = iE18;
                    pVar.f8813k = cursorE.getInt(i21);
                    int i22 = iE19;
                    pVar.f8814l = Q2.v.d(cursorE.getInt(i22));
                    iE17 = i20;
                    int i23 = iE20;
                    pVar.f8815m = cursorE.getLong(i23);
                    int i24 = iE21;
                    pVar.f8816n = cursorE.getLong(i24);
                    iE21 = i24;
                    int i25 = iE22;
                    pVar.f8817o = cursorE.getLong(i25);
                    int i26 = iE23;
                    pVar.f8818p = cursorE.getLong(i26);
                    int i27 = iE24;
                    pVar.f8819q = cursorE.getInt(i27) != 0;
                    int i28 = iE25;
                    pVar.f8820r = Q2.v.f(cursorE.getInt(i28));
                    pVar.f8812j = bVar;
                    arrayList.add(pVar);
                    iE25 = i28;
                    iE2 = i13;
                    iE13 = i17;
                    iE15 = i16;
                    iE16 = i18;
                    iE18 = i21;
                    iE23 = i26;
                    iE9 = i10;
                    iE11 = i11;
                    iE = i12;
                    iE24 = i27;
                    iE22 = i25;
                    iE3 = i14;
                    iE20 = i23;
                    iE4 = i19;
                    iE19 = i22;
                }
                cursorE.close();
                vVar.r();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public void i(java.lang.String str, androidx.work.b bVar) throws java.lang.Throwable {
        this.f8823a.f();
        p253z2.h hVarB = this.f8826d.b();
        byte[] bArrK = androidx.work.b.k(bVar);
        if (bArrK == null) {
            hVarB.M0(1);
        } else {
            hVarB.p0(1, bArrK);
        }
        if (str == null) {
            hVarB.M0(2);
        } else {
            hVarB.C(2, str);
        }
        this.f8823a.g();
        try {
            hVarB.I();
            this.f8823a.N();
        } finally {
            this.f8823a.n();
            this.f8826d.h(hVarB);
        }
    }

    @Override // Q2.q
    public java.util.List j() throws java.lang.Throwable {
        p143o2.v vVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                int i6 = iE14;
                java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
                while (cursorE.moveToNext()) {
                    java.lang.String string = cursorE.getString(iE9);
                    int i10 = iE9;
                    java.lang.String string2 = cursorE.getString(iE11);
                    int i11 = iE11;
                    I2.b bVar = new I2.b();
                    int i12 = iE;
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    int i13 = iE2;
                    int i14 = iE3;
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar = new Q2.p(string, string2);
                    pVar.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar.f8806d = cursorE.getString(iE12);
                    pVar.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    int i15 = i6;
                    pVar.f8808f = androidx.work.b.g(cursorE.getBlob(i15));
                    i6 = i15;
                    int i16 = iE15;
                    pVar.f8809g = cursorE.getLong(i16);
                    int i17 = iE13;
                    int i18 = iE16;
                    pVar.f8810h = cursorE.getLong(i18);
                    int i19 = iE4;
                    int i20 = iE17;
                    pVar.f8811i = cursorE.getLong(i20);
                    int i21 = iE18;
                    pVar.f8813k = cursorE.getInt(i21);
                    int i22 = iE19;
                    pVar.f8814l = Q2.v.d(cursorE.getInt(i22));
                    iE17 = i20;
                    int i23 = iE20;
                    pVar.f8815m = cursorE.getLong(i23);
                    int i24 = iE21;
                    pVar.f8816n = cursorE.getLong(i24);
                    iE21 = i24;
                    int i25 = iE22;
                    pVar.f8817o = cursorE.getLong(i25);
                    int i26 = iE23;
                    pVar.f8818p = cursorE.getLong(i26);
                    int i27 = iE24;
                    pVar.f8819q = cursorE.getInt(i27) != 0;
                    int i28 = iE25;
                    pVar.f8820r = Q2.v.f(cursorE.getInt(i28));
                    pVar.f8812j = bVar;
                    arrayList.add(pVar);
                    iE25 = i28;
                    iE2 = i13;
                    iE13 = i17;
                    iE15 = i16;
                    iE16 = i18;
                    iE18 = i21;
                    iE23 = i26;
                    iE9 = i10;
                    iE11 = i11;
                    iE = i12;
                    iE24 = i27;
                    iE22 = i25;
                    iE3 = i14;
                    iE20 = i23;
                    iE4 = i19;
                    iE19 = i22;
                }
                cursorE.close();
                vVar.r();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public boolean k() {
        boolean z6 = false;
        p143o2.v vVarG = p143o2.v.g("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            if (cursorE.moveToFirst() && cursorE.getInt(0) != 0) {
                z6 = true;
            }
            return z6;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }

    @Override // Q2.q
    public java.util.List l(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
            while (cursorE.moveToNext()) {
                arrayList.add(cursorE.getString(0));
            }
            cursorE.close();
            vVarG.r();
            return arrayList;
        } catch (java.lang.Throwable th) {
            cursorE.close();
            vVarG.r();
            throw th;
        }
    }

    @Override // Q2.q
    public I2.s m(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            return cursorE.moveToFirst() ? Q2.v.g(cursorE.getInt(0)) : null;
        } finally {
            cursorE.close();
            vVarG.r();
        }
    }

    @Override // Q2.q
    public Q2.p n(java.lang.String str) throws java.lang.Throwable {
        p143o2.v vVar;
        Q2.p pVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                if (cursorE.moveToFirst()) {
                    java.lang.String string = cursorE.getString(iE9);
                    java.lang.String string2 = cursorE.getString(iE11);
                    I2.b bVar = new I2.b();
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar2 = new Q2.p(string, string2);
                    pVar2.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar2.f8806d = cursorE.getString(iE12);
                    pVar2.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    pVar2.f8808f = androidx.work.b.g(cursorE.getBlob(iE14));
                    pVar2.f8809g = cursorE.getLong(iE15);
                    pVar2.f8810h = cursorE.getLong(iE16);
                    pVar2.f8811i = cursorE.getLong(iE17);
                    pVar2.f8813k = cursorE.getInt(iE18);
                    pVar2.f8814l = Q2.v.d(cursorE.getInt(iE19));
                    pVar2.f8815m = cursorE.getLong(iE20);
                    pVar2.f8816n = cursorE.getLong(iE21);
                    pVar2.f8817o = cursorE.getLong(iE22);
                    pVar2.f8818p = cursorE.getLong(iE23);
                    pVar2.f8819q = cursorE.getInt(iE24) != 0;
                    pVar2.f8820r = Q2.v.f(cursorE.getInt(iE25));
                    pVar2.f8812j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                cursorE.close();
                vVar.r();
                return pVar;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public int o(java.lang.String str) {
        this.f8823a.f();
        p253z2.h hVarB = this.f8829g.b();
        if (str == null) {
            hVarB.M0(1);
        } else {
            hVarB.C(1, str);
        }
        this.f8823a.g();
        try {
            int I10 = hVarB.I();
            this.f8823a.N();
            return I10;
        } finally {
            this.f8823a.n();
            this.f8829g.h(hVarB);
        }
    }

    @Override // Q2.q
    public java.util.List p(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
            while (cursorE.moveToNext()) {
                arrayList.add(cursorE.getString(0));
            }
            cursorE.close();
            vVarG.r();
            return arrayList;
        } catch (java.lang.Throwable th) {
            cursorE.close();
            vVarG.r();
            throw th;
        }
    }

    @Override // Q2.q
    public java.util.List q(java.lang.String str) {
        p143o2.v vVarG = p143o2.v.g("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            vVarG.M0(1);
        } else {
            vVarG.C(1, str);
        }
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
            while (cursorE.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorE.getBlob(0)));
            }
            cursorE.close();
            vVarG.r();
            return arrayList;
        } catch (java.lang.Throwable th) {
            cursorE.close();
            vVarG.r();
            throw th;
        }
    }

    @Override // Q2.q
    public int r(java.lang.String str) {
        this.f8823a.f();
        p253z2.h hVarB = this.f8828f.b();
        if (str == null) {
            hVarB.M0(1);
        } else {
            hVarB.C(1, str);
        }
        this.f8823a.g();
        try {
            int I10 = hVarB.I();
            this.f8823a.N();
            return I10;
        } finally {
            this.f8823a.n();
            this.f8828f.h(hVarB);
        }
    }

    @Override // Q2.q
    public void s(java.lang.String str, long j6) {
        this.f8823a.f();
        p253z2.h hVarB = this.f8827e.b();
        hVarB.l(1, j6);
        if (str == null) {
            hVarB.M0(2);
        } else {
            hVarB.C(2, str);
        }
        this.f8823a.g();
        try {
            hVarB.I();
            this.f8823a.N();
        } finally {
            this.f8823a.n();
            this.f8827e.h(hVarB);
        }
    }

    @Override // Q2.q
    public java.util.List t(int i6) throws java.lang.Throwable {
        p143o2.v vVar;
        p143o2.v vVarG = p143o2.v.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        vVarG.l(1, i6);
        this.f8823a.f();
        android.database.Cursor cursorE = p223w2.b.e(this.f8823a, vVarG, false, null);
        try {
            int iE = p223w2.a.e(cursorE, "required_network_type");
            int iE2 = p223w2.a.e(cursorE, "requires_charging");
            int iE3 = p223w2.a.e(cursorE, "requires_device_idle");
            int iE4 = p223w2.a.e(cursorE, "requires_battery_not_low");
            int iE5 = p223w2.a.e(cursorE, "requires_storage_not_low");
            int iE6 = p223w2.a.e(cursorE, "trigger_content_update_delay");
            int iE7 = p223w2.a.e(cursorE, "trigger_max_content_delay");
            int iE8 = p223w2.a.e(cursorE, "content_uri_triggers");
            int iE9 = p223w2.a.e(cursorE, "id");
            int iE10 = p223w2.a.e(cursorE, "state");
            int iE11 = p223w2.a.e(cursorE, "worker_class_name");
            int iE12 = p223w2.a.e(cursorE, "input_merger_class_name");
            int iE13 = p223w2.a.e(cursorE, "input");
            int iE14 = p223w2.a.e(cursorE, "output");
            vVar = vVarG;
            try {
                int iE15 = p223w2.a.e(cursorE, "initial_delay");
                int iE16 = p223w2.a.e(cursorE, "interval_duration");
                int iE17 = p223w2.a.e(cursorE, "flex_duration");
                int iE18 = p223w2.a.e(cursorE, "run_attempt_count");
                int iE19 = p223w2.a.e(cursorE, "backoff_policy");
                int iE20 = p223w2.a.e(cursorE, "backoff_delay_duration");
                int iE21 = p223w2.a.e(cursorE, "period_start_time");
                int iE22 = p223w2.a.e(cursorE, "minimum_retention_duration");
                int iE23 = p223w2.a.e(cursorE, "schedule_requested_at");
                int iE24 = p223w2.a.e(cursorE, "run_in_foreground");
                int iE25 = p223w2.a.e(cursorE, "out_of_quota_policy");
                int i10 = iE14;
                java.util.ArrayList arrayList = new java.util.ArrayList(cursorE.getCount());
                while (cursorE.moveToNext()) {
                    java.lang.String string = cursorE.getString(iE9);
                    int i11 = iE9;
                    java.lang.String string2 = cursorE.getString(iE11);
                    int i12 = iE11;
                    I2.b bVar = new I2.b();
                    int i13 = iE;
                    bVar.k(Q2.v.e(cursorE.getInt(iE)));
                    bVar.m(cursorE.getInt(iE2) != 0);
                    bVar.n(cursorE.getInt(iE3) != 0);
                    bVar.l(cursorE.getInt(iE4) != 0);
                    bVar.o(cursorE.getInt(iE5) != 0);
                    int i14 = iE2;
                    int i15 = iE3;
                    bVar.p(cursorE.getLong(iE6));
                    bVar.q(cursorE.getLong(iE7));
                    bVar.j(Q2.v.b(cursorE.getBlob(iE8)));
                    Q2.p pVar = new Q2.p(string, string2);
                    pVar.f8804b = Q2.v.g(cursorE.getInt(iE10));
                    pVar.f8806d = cursorE.getString(iE12);
                    pVar.f8807e = androidx.work.b.g(cursorE.getBlob(iE13));
                    int i16 = i10;
                    pVar.f8808f = androidx.work.b.g(cursorE.getBlob(i16));
                    i10 = i16;
                    int i17 = iE15;
                    pVar.f8809g = cursorE.getLong(i17);
                    int i18 = iE12;
                    int i19 = iE16;
                    pVar.f8810h = cursorE.getLong(i19);
                    int i20 = iE4;
                    int i21 = iE17;
                    pVar.f8811i = cursorE.getLong(i21);
                    int i22 = iE18;
                    pVar.f8813k = cursorE.getInt(i22);
                    int i23 = iE19;
                    pVar.f8814l = Q2.v.d(cursorE.getInt(i23));
                    iE17 = i21;
                    int i24 = iE20;
                    pVar.f8815m = cursorE.getLong(i24);
                    int i25 = iE21;
                    pVar.f8816n = cursorE.getLong(i25);
                    iE21 = i25;
                    int i26 = iE22;
                    pVar.f8817o = cursorE.getLong(i26);
                    int i27 = iE23;
                    pVar.f8818p = cursorE.getLong(i27);
                    int i28 = iE24;
                    pVar.f8819q = cursorE.getInt(i28) != 0;
                    int i29 = iE25;
                    pVar.f8820r = Q2.v.f(cursorE.getInt(i29));
                    pVar.f8812j = bVar;
                    arrayList.add(pVar);
                    iE25 = i29;
                    iE2 = i14;
                    iE12 = i18;
                    iE15 = i17;
                    iE16 = i19;
                    iE18 = i22;
                    iE23 = i27;
                    iE9 = i11;
                    iE11 = i12;
                    iE = i13;
                    iE24 = i28;
                    iE22 = i26;
                    iE3 = i15;
                    iE20 = i24;
                    iE4 = i20;
                    iE19 = i23;
                }
                cursorE.close();
                vVar.r();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorE.close();
                vVar.r();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            vVar = vVarG;
        }
    }

    @Override // Q2.q
    public int u() {
        this.f8823a.f();
        p253z2.h hVarB = this.f8831i.b();
        this.f8823a.g();
        try {
            int I10 = hVarB.I();
            this.f8823a.N();
            return I10;
        } finally {
            this.f8823a.n();
            this.f8831i.h(hVarB);
        }
    }
}
