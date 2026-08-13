.class public abstract Lj2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LW8/V;Ljava/lang/Object;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj2/b;->d(LW8/V;Ljava/lang/Object;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LW8/V;Ljava/lang/Object;)LP4/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj2/a;

    invoke-direct {v0, p0, p1}, Lj2/a;-><init>(LW8/V;Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)LP4/d;

    move-result-object p0

    const-string p1, "getFuture { completer ->\u2026        }\n    }\n    tag\n}"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "Deferred.asListenableFuture"

    :cond_0
    invoke-static {p0, p1}, Lj2/b;->b(LW8/V;Ljava/lang/Object;)LP4/d;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LW8/V;Ljava/lang/Object;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this_asListenableFuture"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj2/b$a;

    invoke-direct {v0, p2, p0}, Lj2/b$a;-><init>(Landroidx/concurrent/futures/c$a;LW8/V;)V

    invoke-interface {p0, v0}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    return-object p1
.end method
