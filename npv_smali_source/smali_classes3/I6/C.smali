.class public abstract LI6/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfa/d;

.field private static final b:LJ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "io.ktor.client.plugins.HttpRequestLifecycle"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/C;->a:Lfa/d;

    new-instance v0, LI6/z;

    invoke-direct {v0}, LI6/z;-><init>()V

    const-string v1, "RequestLifecycle"

    invoke-static {v1, v0}, LJ6/i;->c(Ljava/lang/String;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/C;->b:LJ6/b;

    return-void
.end method

.method public static synthetic a(LW8/y;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LI6/C;->g(LW8/y;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LW8/f0;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LI6/C;->h(LW8/f0;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/C;->d(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LJ6/d;)Li7/M;
    .locals 3

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI6/U;->a:LI6/U;

    new-instance v1, LI6/C$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LI6/C$a;-><init>(LJ6/d;Lm7/e;)V

    invoke-virtual {p0, v0, v1}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic e(LW8/y;LW8/z0;)V
    .locals 0

    invoke-static {p0, p1}, LI6/C;->f(LW8/y;LW8/z0;)V

    return-void
.end method

.method private static final f(LW8/y;LW8/z0;)V
    .locals 1

    new-instance v0, LI6/A;

    invoke-direct {v0, p0}, LI6/A;-><init>(LW8/y;)V

    invoke-interface {p1, v0}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    move-result-object p1

    new-instance v0, LI6/B;

    invoke-direct {v0, p1}, LI6/B;-><init>(LW8/f0;)V

    invoke-interface {p0, v0}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    return-void
.end method

.method private static final g(LW8/y;Ljava/lang/Throwable;)Li7/M;
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    sget-object v0, LI6/C;->a:Lfa/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cancelling request because engine Job failed with error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lfa/d;->g(Ljava/lang/String;)V

    const-string v0, "Engine failed"

    invoke-static {p0, v0, p1}, LW8/C0;->c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object p1, LI6/C;->a:Lfa/d;

    const-string v0, "Cancelling request because engine Job completed"

    invoke-interface {p1, v0}, Lfa/d;->g(Ljava/lang/String;)V

    invoke-interface {p0}, LW8/y;->K0()Z

    :goto_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final h(LW8/f0;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-interface {p0}, LW8/f0;->e()V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final i()LJ6/b;
    .locals 1

    sget-object v0, LI6/C;->b:LJ6/b;

    return-object v0
.end method
