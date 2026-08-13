.class public abstract LI6/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfa/d;

.field private static final b:LJ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "io.ktor.client.plugins.HttpTimeout"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/I;->a:Lfa/d;

    sget-object v0, LI6/I$a;->J:LI6/I$a;

    new-instance v1, LI6/H;

    invoke-direct {v1}, LI6/H;-><init>()V

    const-string v2, "HttpTimeout"

    invoke-static {v2, v0, v1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/I;->b:LJ6/b;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/I;->c(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LO6/e;Ljava/lang/Throwable;)LH6/a;
    .locals 3

    .prologue
    const-string v0, "request"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH6/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connect timeout has expired [url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LO6/e;->h()LT6/g0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", connect_timeout="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, LI6/F;->a:LI6/F;

    invoke-virtual {p0, v2}, LO6/e;->c(LF6/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI6/G;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LI6/G;->b()Ljava/lang/Long;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "unknown"

    :cond_1
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " ms]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LH6/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method private static final c(LJ6/d;)Li7/M;
    .locals 6

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/G;

    invoke-virtual {v0}, LI6/G;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/G;

    invoke-virtual {v1}, LI6/G;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI6/G;

    invoke-virtual {v2}, LI6/G;->d()Ljava/lang/Long;

    move-result-object v2

    sget-object v3, LJ6/k;->a:LJ6/k;

    new-instance v4, LI6/I$b;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v2, v5}, LI6/I$b;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lm7/e;)V

    invoke-virtual {p0, v3, v4}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final d(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Z
    .locals 0

    .prologue
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final e(LO6/e;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;
    .locals 2

    .prologue
    const-string v0, "request"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Socket timeout has expired [url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LO6/e;->h()LT6/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", socket_timeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LI6/F;->a:LI6/F;

    invoke-virtual {p0, v1}, LO6/e;->c(LF6/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI6/G;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LI6/G;->d()Ljava/lang/Long;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "unknown"

    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] ms"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, LH6/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LI6/I;->d(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic g()Lfa/d;
    .locals 1

    sget-object v0, LI6/I;->a:Lfa/d;

    return-object v0
.end method

.method public static final h(J)J
    .locals 2

    .prologue
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const-wide/16 p0, 0x0

    :cond_0
    return-wide p0
.end method

.method public static final i()LJ6/b;
    .locals 1

    sget-object v0, LI6/I;->b:LJ6/b;

    return-object v0
.end method
