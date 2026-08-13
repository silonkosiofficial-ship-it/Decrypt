.class public abstract LJ0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LW8/z0;)V
    .locals 0

    invoke-static {p0}, LJ0/f;->d(LW8/z0;)V

    return-void
.end method

.method public static final synthetic b(LW8/N;Landroid/os/CancellationSignal;Lx7/p;)LW8/z0;
    .locals 0

    invoke-static {p0, p1, p2}, LJ0/f;->c(LW8/N;Landroid/os/CancellationSignal;Lx7/p;)LW8/z0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LW8/N;Landroid/os/CancellationSignal;Lx7/p;)LW8/z0;
    .locals 6

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p0

    new-instance p2, LJ0/f$a;

    invoke-direct {p2, p1}, LJ0/f$a;-><init>(Landroid/os/CancellationSignal;)V

    invoke-interface {p0, p2}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    new-instance p2, LJ0/e;

    invoke-direct {p2, p0}, LJ0/e;-><init>(LW8/z0;)V

    invoke-virtual {p1, p2}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    return-object p0
.end method

.method private static final d(LW8/z0;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
