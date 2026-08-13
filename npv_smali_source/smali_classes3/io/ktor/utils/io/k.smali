.class public abstract Lio/ktor/utils/io/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lio/ktor/utils/io/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/ktor/utils/io/k$a;

    invoke-direct {v0}, Lio/ktor/utils/io/k$a;-><init>()V

    sput-object v0, Lio/ktor/utils/io/k;->a:Lio/ktor/utils/io/k$a;

    return-void
.end method

.method public static synthetic a(Lx7/a;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, Lio/ktor/utils/io/k;->f(Lx7/a;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/ktor/utils/io/a;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, Lio/ktor/utils/io/k;->n(Lio/ktor/utils/io/a;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lio/ktor/utils/io/g;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance p1, Lio/ktor/utils/io/k$b;

    invoke-direct {p1, p0}, Lio/ktor/utils/io/k$b;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lio/ktor/utils/io/k;->d(Lx7/l;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lio/ktor/utils/io/g;->k(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lx7/l;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/ktor/utils/io/k;->a:Lio/ktor/utils/io/k$a;

    invoke-static {p0, v0}, Lc9/a;->c(Lx7/l;Lm7/e;)V

    return-void
.end method

.method public static final e(Lio/ktor/utils/io/m;Lx7/a;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/ktor/utils/io/m;->a()LW8/z0;

    move-result-object p0

    new-instance v0, Lio/ktor/utils/io/j;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/j;-><init>(Lx7/a;)V

    invoke-interface {p0, v0}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    return-void
.end method

.method private static final f(Lx7/a;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final g(Lio/ktor/utils/io/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/ktor/utils/io/m;->a()LW8/z0;

    move-result-object p0

    invoke-interface {p0}, LW8/z0;->f1()Z

    move-result p0

    return p0
.end method

.method public static final h(Lio/ktor/utils/io/g;[BIILm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-interface {p0}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo9/p;->write([BII)V

    invoke-static {p0, p4}, Lio/ktor/utils/io/h;->a(Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    array-length p3, p1

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lio/ktor/utils/io/k;->h(Lio/ktor/utils/io/g;[BIILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lio/ktor/utils/io/g;Lo9/q;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-interface {p0}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v0

    invoke-interface {v0, p1}, Lo9/p;->X(Lo9/h;)J

    invoke-static {p0, p2}, Lio/ktor/utils/io/h;->a(Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final k(LW8/N;Lm7/i;Lio/ktor/utils/io/a;Lx7/p;)Lio/ktor/utils/io/s;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/ktor/utils/io/k$c;

    const/4 v0, 0x0

    invoke-direct {v4, p3, p2, v0}, Lio/ktor/utils/io/k$c;-><init>(Lx7/p;Lio/ktor/utils/io/a;Lm7/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p0

    new-instance p1, Lio/ktor/utils/io/i;

    invoke-direct {p1, p2}, Lio/ktor/utils/io/i;-><init>(Lio/ktor/utils/io/a;)V

    invoke-interface {p0, p1}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    new-instance p1, Lio/ktor/utils/io/s;

    invoke-direct {p1, p2, p0}, Lio/ktor/utils/io/s;-><init>(Lio/ktor/utils/io/d;LW8/z0;)V

    return-object p1
.end method

.method public static final l(LW8/N;Lm7/i;ZLx7/p;)Lio/ktor/utils/io/s;
    .locals 3

    const-string p2, "<this>"

    invoke-static {p0, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "coroutineContext"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "block"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lio/ktor/utils/io/a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, v2, v0, v1}, Lio/ktor/utils/io/a;-><init>(ZILy7/k;)V

    invoke-static {p0, p1, p2, p3}, Lio/ktor/utils/io/k;->k(LW8/N;Lm7/i;Lio/ktor/utils/io/a;Lx7/p;)Lio/ktor/utils/io/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lio/ktor/utils/io/k;->l(LW8/N;Lm7/i;ZLx7/p;)Lio/ktor/utils/io/s;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lio/ktor/utils/io/a;Ljava/lang/Throwable;)Li7/M;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/ktor/utils/io/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lio/ktor/utils/io/a;->k(Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
