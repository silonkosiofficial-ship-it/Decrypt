.class public abstract LV/O0;
.super LV/w;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LV/w;-><init>(Lx7/a;Ly7/k;)V

    return-void
.end method

.method private final f(LV/P0;)LV/M1;
    .locals 2

    .prologue
    invoke-virtual {p1}, LV/P0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LV/P;

    invoke-virtual {p1}, LV/P0;->f()LV/w0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LV/P0;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LV/P0;->e()LV/u1;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object p1

    :cond_0
    invoke-static {v1, p1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object v1

    :cond_1
    invoke-direct {v0, v1}, LV/P;-><init>(LV/w0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LV/P0;->c()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, LV/F;

    invoke-virtual {p1}, LV/P0;->c()Lx7/l;

    move-result-object p1

    invoke-direct {v0, p1}, LV/F;-><init>(Lx7/l;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LV/P0;->f()LV/w0;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, LV/P;

    invoke-virtual {p1}, LV/P0;->f()LV/w0;

    move-result-object p1

    invoke-direct {v0, p1}, LV/P;-><init>(LV/w0;)V

    goto :goto_0

    :cond_4
    new-instance v0, LV/I1;

    invoke-virtual {p1}, LV/P0;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, LV/I1;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b(LV/P0;LV/M1;)LV/M1;
    .locals 3

    .prologue
    instance-of v0, p2, LV/P;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LV/P0;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v1, p2

    check-cast v1, LV/P;

    invoke-virtual {v1}, LV/P;->b()LV/w0;

    move-result-object p2

    invoke-virtual {p1}, LV/P0;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, LV/w0;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, LV/I1;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LV/P0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LV/P0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast p2, LV/I1;

    invoke-virtual {p2}, LV/I1;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    move-object v1, p2

    goto :goto_1

    :cond_1
    instance-of v0, p2, LV/F;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LV/P0;->c()Lx7/l;

    move-result-object v0

    check-cast p2, LV/F;

    invoke-virtual {p2}, LV/F;->b()Lx7/l;

    move-result-object v2

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, LV/O0;->f(LV/P0;)LV/M1;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public abstract c(Ljava/lang/Object;)LV/P0;
.end method

.method public final d(Ljava/lang/Object;)LV/P0;
    .locals 0

    invoke-virtual {p0, p1}, LV/O0;->c(Ljava/lang/Object;)LV/P0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;)LV/P0;
    .locals 0

    invoke-virtual {p0, p1}, LV/O0;->c(Ljava/lang/Object;)LV/P0;

    move-result-object p1

    invoke-virtual {p1}, LV/P0;->h()LV/P0;

    move-result-object p1

    return-object p1
.end method
