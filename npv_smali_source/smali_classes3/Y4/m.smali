.class public LY4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:LF5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Y4.m"

    sput-object v0, LY4/m;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LQ4/f;)V
    .locals 2

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, LQ4/f;->n()LQ4/o;

    move-result-object v1

    invoke-static {p1}, LV4/e;->c(LQ4/f;)LV4/e;

    move-result-object p1

    check-cast p1, LY4/h;

    invoke-virtual {p1}, LY4/h;->j()LF5/b;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, LY4/m;-><init>(Landroid/content/Context;LQ4/o;LF5/b;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;LQ4/o;LF5/b;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LY4/m;->a:Landroid/content/Context;

    invoke-virtual {p2}, LQ4/o;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY4/m;->b:Ljava/lang/String;

    invoke-virtual {p2}, LQ4/o;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY4/m;->c:Ljava/lang/String;

    invoke-virtual {p2}, LQ4/o;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY4/m;->d:Ljava/lang/String;

    if-eqz p1, :cond_0

    iput-object p3, p0, LY4/m;->e:LF5/b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "FirebaseOptions#getProjectId cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private d()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LY4/m;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LV3/a;->a(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LY4/m;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not get fingerprint hash for package: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LY4/m;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    nop

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-static {v1, v2}, LV3/k;->b([BZ)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_0
    sget-object v2, LY4/m;->f:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No such package: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LY4/m;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    nop

    return-object v0
.end method

.method private static f(I)Ljava/lang/String;
    .locals 1

    .prologue
    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const-string p0, "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s"

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown token type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string p0, "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s"

    return-object p0
.end method

.method private static final g(I)Z
    .locals 1

    .prologue
    const/16 v0, 0xc8

    if-lt p0, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private h(Ljava/net/URL;[BLY4/n;Z)Ljava/lang/String;
    .locals 5

    .prologue
    invoke-virtual {p0, p1}, LY4/m;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    array-length v0, p2

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LY4/m;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "X-Firebase-Client"

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_0
    :goto_0
    const-string v0, "X-Android-Package"

    iget-object v1, p0, LY4/m;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "X-Android-Cert"

    invoke-direct {p0}, LY4/m;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    array-length v2, p2

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    array-length v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v2, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    invoke-static {p2}, LY4/m;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    const-string v4, "UTF-8"

    invoke-direct {v3, v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    goto :goto_3

    :cond_2
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, LY4/m;->g(I)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz p4, :cond_3

    invoke-virtual {p3}, LY4/n;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_3
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :cond_4
    :try_start_5
    invoke-virtual {p3, p2}, LY4/n;->d(I)V

    invoke-static {v0}, LY4/l;->a(Ljava/lang/String;)LY4/l;

    move-result-object p2

    new-instance p3, LQ4/m;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error returned from API. code: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LY4/l;->b()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " body: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LY4/l;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, LQ4/m;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p3

    :try_start_7
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_3
    move-exception p2

    :try_start_8
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception p3

    :try_start_9
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_6
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method


# virtual methods
.method a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 0

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    return-object p1
.end method

.method public b([BILY4/n;)LY4/a;
    .locals 7

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p3}, LY4/n;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/net/URL;

    invoke-static {p2}, LY4/m;->f(I)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, LY4/m;->d:Ljava/lang/String;

    iget-object v3, p0, LY4/m;->c:Ljava/lang/String;

    iget-object v4, p0, LY4/m;->b:Ljava/lang/String;

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    aput-object v3, v5, v0

    const/4 v2, 0x2

    aput-object v4, v5, v2

    invoke-static {p2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, p1, p3, v0}, LY4/m;->h(Ljava/net/URL;[BLY4/n;Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LY4/a;->a(Ljava/lang/String;)LY4/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, LQ4/m;

    const-string p2, "Too many attempts."

    invoke-direct {p1, p2}, LQ4/m;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c([BLY4/n;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p2}, LY4/n;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, LY4/m;->d:Ljava/lang/String;

    iget-object v3, p0, LY4/m;->c:Ljava/lang/String;

    iget-object v4, p0, LY4/m;->b:Ljava/lang/String;

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v0

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const-string v2, "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s"

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, p1, p2, v0}, LY4/m;->h(Ljava/net/URL;[BLY4/n;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, LQ4/m;

    const-string p2, "Too many attempts."

    invoke-direct {p1, p2}, LQ4/m;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method e()Ljava/lang/String;
    .locals 3

    .prologue
    iget-object v0, p0, LY4/m;->e:LF5/b;

    invoke-interface {v0}, LF5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE5/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, LE5/i;->a()Ll4/l;

    move-result-object v0

    invoke-static {v0}, Ll4/o;->a(Ll4/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LY4/m;->f:Ljava/lang/String;

    const-string v2, "Unable to get heartbeats!"

    nop

    :cond_0
    return-object v1
.end method
