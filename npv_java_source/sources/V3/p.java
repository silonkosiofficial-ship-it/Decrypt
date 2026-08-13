package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f15125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15126b;

    public static java.lang.String a() throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        if (f15125a == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                f15125a = android.app.Application.getProcessName();
            } else {
                int iMyPid = f15126b;
                if (iMyPid == 0) {
                    iMyPid = android.os.Process.myPid();
                    f15126b = iMyPid;
                }
                java.lang.String strTrim = null;
                strTrim = null;
                strTrim = null;
                java.io.BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        java.lang.String str = "/proc/" + iMyPid + "/cmdline";
                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str));
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                java.lang.String line = bufferedReader.readLine();
                                Q3.AbstractC1477p.l(line);
                                strTrim = line.trim();
                            } catch (java.io.IOException unused) {
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                V3.l.a(bufferedReader2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (java.io.IOException unused2) {
                        bufferedReader = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                    V3.l.a(bufferedReader);
                }
                f15125a = strTrim;
            }
        }
        return f15125a;
    }
}
