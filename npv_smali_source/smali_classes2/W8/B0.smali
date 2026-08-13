.class public LW8/B0;
.super LW8/F0;
.source "SourceFile"

# interfaces
.implements LW8/y;


# instance fields
.field private final E:Z


# direct methods
.method public constructor <init>(LW8/z0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LW8/F0;-><init>(Z)V

    invoke-virtual {p0, p1}, LW8/F0;->i0(LW8/z0;)V

    invoke-direct {p0}, LW8/B0;->g1()Z

    move-result p1

    iput-boolean p1, p0, LW8/B0;->E:Z

    return-void
.end method

.method private final g1()Z
    .locals 4

    .prologue
    invoke-virtual {p0}, LW8/F0;->a0()LW8/s;

    move-result-object v0

    instance-of v1, v0, LW8/t;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LW8/t;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, LW8/F0;->V()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, LW8/F0;->a0()LW8/s;

    move-result-object v0

    instance-of v3, v0, LW8/t;

    if-eqz v3, :cond_3

    check-cast v0, LW8/t;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public K0()Z
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p0, v0}, LW8/F0;->t0(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, LW8/B0;->E:Z

    return v0
.end method

.method public X()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, LW8/A;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    invoke-virtual {p0, v0}, LW8/F0;->t0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
