.class public final Landroidx/lifecycle/m;
.super Landroidx/lifecycle/l;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field private final C:Landroidx/lifecycle/k;

.field private final D:Lm7/i;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;Lm7/i;)V
    .locals 1

    .prologue
    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/l;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/m;->C:Landroidx/lifecycle/k;

    iput-object p2, p0, Landroidx/lifecycle/m;->D:Lm7/i;

    invoke-virtual {p0}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/k$b;->C:Landroidx/lifecycle/k$b;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Landroidx/lifecycle/m;->getCoroutineContext()Lm7/i;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, LW8/C0;->f(Lm7/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/m;->C:Landroidx/lifecycle/k;

    return-object v0
.end method

.method public final b()V
    .locals 7

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-virtual {v0}, LW8/J0;->z1()LW8/J0;

    move-result-object v2

    new-instance v4, Landroidx/lifecycle/m$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Landroidx/lifecycle/m$a;-><init>(Landroidx/lifecycle/m;Lm7/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/m;->D:Lm7/i;

    return-object v0
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/k$b;->C:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Landroidx/lifecycle/m;->a()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    invoke-virtual {p0}, Landroidx/lifecycle/m;->getCoroutineContext()Lm7/i;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, LW8/C0;->f(Lm7/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
