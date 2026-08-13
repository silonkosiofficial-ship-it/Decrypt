.class final LD/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/V;
.implements LD0/V$a;
.implements LD/D$a;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LD/D;

.field private final c:LV/s0;

.field private final d:LV/s0;

.field private final e:LV/w0;

.field private final f:LV/w0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LD/D;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/B;->a:Ljava/lang/Object;

    iput-object p2, p0, LD/B;->b:LD/D;

    const/4 p1, -0x1

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, LD/B;->c:LV/s0;

    const/4 p1, 0x0

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, LD/B;->d:LV/s0;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LD/B;->e:LV/w0;

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LD/B;->f:LV/w0;

    return-void
.end method

.method private final c()LD0/V$a;
    .locals 1

    iget-object v0, p0, LD/B;->e:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/V$a;

    return-object v0
.end method

.method private final e()I
    .locals 1

    iget-object v0, p0, LD/B;->d:LV/s0;

    invoke-interface {v0}, LV/Y;->d()I

    move-result v0

    return v0
.end method

.method private final f()LD0/V;
    .locals 1

    iget-object v0, p0, LD/B;->f:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/V;

    return-object v0
.end method

.method private final i(LD0/V$a;)V
    .locals 1

    iget-object v0, p0, LD/B;->e:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final k(I)V
    .locals 1

    iget-object v0, p0, LD/B;->d:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method

.method private final l(LD0/V;)V
    .locals 1

    iget-object v0, p0, LD/B;->f:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    if-lez v0, :cond_2

    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, LD/B;->k(I)V

    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LD/B;->b:LD/D;

    invoke-virtual {v0, p0}, LD/D;->C(LD/D$a;)V

    invoke-direct {p0}, LD/B;->c()LD0/V$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/V$a;->a()V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LD/B;->i(LD0/V$a;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Release should only be called once"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()LD0/V$a;
    .locals 1

    .prologue
    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LD/B;->b:LD/D;

    invoke-virtual {v0, p0}, LD/D;->s(LD/D$a;)V

    invoke-virtual {p0}, LD/B;->d()LD0/V;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/V;->b()LD0/V$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, LD/B;->i(LD0/V$a;)V

    :cond_1
    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, LD/B;->k(I)V

    return-object p0
.end method

.method public final d()LD0/V;
    .locals 1

    invoke-direct {p0}, LD/B;->f()LD0/V;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 2

    .prologue
    invoke-direct {p0}, LD/B;->e()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0}, LD/B;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getIndex()I
    .locals 1

    iget-object v0, p0, LD/B;->c:LV/s0;

    invoke-interface {v0}, LV/Y;->d()I

    move-result v0

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD/B;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, LD/B;->c:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method

.method public final j(LD0/V;)V
    .locals 6

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v0, v1}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v4

    :try_start_0
    invoke-direct {p0}, LD/B;->f()LD0/V;

    move-result-object v5

    if-eq p1, v5, :cond_3

    invoke-direct {p0, p1}, LD/B;->l(LD0/V;)V

    invoke-direct {p0}, LD/B;->e()I

    move-result v5

    if-lez v5, :cond_3

    invoke-direct {p0}, LD/B;->c()LD0/V$a;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5}, LD0/V$a;->a()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, LD0/V;->b()LD0/V$a;

    move-result-object v2

    :cond_2
    invoke-direct {p0, v2}, LD/B;->i(LD0/V$a;)V

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v4, v3}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :goto_2
    invoke-virtual {v0, v1, v4, v3}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1
.end method
