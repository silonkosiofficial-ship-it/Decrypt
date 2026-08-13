.class final Lv/y;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"


# instance fields
.field private P:Lz/l;

.field private Q:Lz/d;

.field private final R:Z


# direct methods
.method public constructor <init>(Lz/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lv/y;->P:Lz/l;

    return-void
.end method

.method private final T1()V
    .locals 3

    .prologue
    iget-object v0, p0, Lv/y;->P:Lz/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lv/y;->Q:Lz/d;

    if-eqz v1, :cond_0

    new-instance v2, Lz/e;

    invoke-direct {v2, v1}, Lz/e;-><init>(Lz/d;)V

    invoke-interface {v0, v2}, Lz/l;->a(Lz/i;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lv/y;->Q:Lz/d;

    return-void
.end method

.method private final U1(Lz/l;Lz/i;)V
    .locals 8

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/z0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lv/y$b;

    invoke-direct {v2, p1, p2}, Lv/y$b;-><init>(Lz/l;Lz/i;)V

    invoke-interface {v0, v2}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v2

    new-instance v5, Lv/y$a;

    invoke-direct {v5, p1, p2, v0, v1}, Lv/y$a;-><init>(Lz/l;Lz/i;LW8/f0;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2}, Lz/l;->a(Lz/i;)Z

    :goto_1
    return-void
.end method


# virtual methods
.method public final V1(Z)V
    .locals 3

    .prologue
    iget-object v0, p0, Lv/y;->P:Lz/l;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv/y;->Q:Lz/d;

    if-eqz p1, :cond_0

    new-instance v2, Lz/e;

    invoke-direct {v2, p1}, Lz/e;-><init>(Lz/d;)V

    invoke-direct {p0, v0, v2}, Lv/y;->U1(Lz/l;Lz/i;)V

    iput-object v1, p0, Lv/y;->Q:Lz/d;

    :cond_0
    new-instance p1, Lz/d;

    invoke-direct {p1}, Lz/d;-><init>()V

    invoke-direct {p0, v0, p1}, Lv/y;->U1(Lz/l;Lz/i;)V

    iput-object p1, p0, Lv/y;->Q:Lz/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lv/y;->Q:Lz/d;

    if-eqz p1, :cond_2

    new-instance v2, Lz/e;

    invoke-direct {v2, p1}, Lz/e;-><init>(Lz/d;)V

    invoke-direct {p0, v0, v2}, Lv/y;->U1(Lz/l;Lz/i;)V

    iput-object v1, p0, Lv/y;->Q:Lz/d;

    :cond_2
    :goto_0
    return-void
.end method

.method public final W1(Lz/l;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lv/y;->P:Lz/l;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lv/y;->T1()V

    iput-object p1, p0, Lv/y;->P:Lz/l;

    :cond_0
    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lv/y;->R:Z

    return v0
.end method
