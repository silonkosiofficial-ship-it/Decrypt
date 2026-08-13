package E5;

/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f2245a;

    public k(android.content.Context context, java.lang.String str) {
        this.f2245a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j6 = this.f2245a.getLong("fire-count", 0L);
            java.lang.String key = "";
            java.lang.String str = null;
            for (java.util.Map.Entry<java.lang.String, ?> entry : this.f2245a.getAll().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    for (java.lang.String str2 : (java.util.Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet(this.f2245a.getStringSet(key, new java.util.HashSet()));
            hashSet.remove(str);
            this.f2245a.edit().putStringSet(key, hashSet).putLong("fire-count", j6 - 1).commit();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private synchronized java.lang.String d(long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return j$.util.DateRetargetClass.toInstant(new java.util.Date(j6)).atOffset(j$.time.ZoneOffset.UTC).toLocalDateTime().format(j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.UK).format(new java.util.Date(j6));
    }

    private synchronized java.lang.String e(java.lang.String str) {
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.f2245a.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((java.lang.String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void f(java.lang.String str) {
        try {
            java.lang.String strE = e(str);
            if (strE == null) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet(this.f2245a.getStringSet(strE, new java.util.HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f2245a.edit().remove(strE) : this.f2245a.edit().putStringSet(strE, hashSet)).commit();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private synchronized void i(java.lang.String str, java.lang.String str2) {
        f(str2);
        java.util.HashSet hashSet = new java.util.HashSet(this.f2245a.getStringSet(str, new java.util.HashSet()));
        hashSet.add(str2);
        this.f2245a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        try {
            android.content.SharedPreferences.Editor editorEdit = this.f2245a.edit();
            int i6 = 0;
            for (java.util.Map.Entry<java.lang.String, ?> entry : this.f2245a.getAll().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    java.util.Set set = (java.util.Set) entry.getValue();
                    java.lang.String strD = d(java.lang.System.currentTimeMillis());
                    java.lang.String key = entry.getKey();
                    if (set.contains(strD)) {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        hashSet.add(strD);
                        i6++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i6 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i6);
            }
            editorEdit.commit();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    synchronized java.util.List c() {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry<java.lang.String, ?> entry : this.f2245a.getAll().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    java.util.HashSet hashSet = new java.util.HashSet((java.util.Set) entry.getValue());
                    hashSet.remove(d(java.lang.System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(E5.l.a(entry.getKey(), new java.util.ArrayList(hashSet)));
                    }
                }
            }
            h(java.lang.System.currentTimeMillis());
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized void g(long j6, java.lang.String str) {
        java.lang.String strD = d(j6);
        if (this.f2245a.getString("last-used-date", "").equals(strD)) {
            java.lang.String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j10 = this.f2245a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.f2245a.getLong("fire-count", 0L);
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.f2245a.getStringSet(str, new java.util.HashSet()));
        hashSet.add(strD);
        this.f2245a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", strD).commit();
    }

    synchronized void h(long j6) {
        this.f2245a.edit().putLong("fire-global", j6).commit();
    }
}
