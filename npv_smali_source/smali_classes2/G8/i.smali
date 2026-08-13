.class public final LG8/i;
.super LF8/M;
.source "SourceFile"

# interfaces
.implements LJ8/d;


# instance fields
.field private final D:LJ8/b;

.field private final E:LG8/j;

.field private final F:LF8/t0;

.field private final G:LF8/a0;

.field private final H:Z

.field private final I:Z


# direct methods
.method public constructor <init>(LJ8/b;LF8/t0;LF8/i0;LO7/f0;)V
    .locals 10

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projection"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameter"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG8/j;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, LG8/j;-><init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;ILy7/k;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v9}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZILy7/k;)V

    return-void
.end method

.method public constructor <init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/M;-><init>()V

    iput-object p1, p0, LG8/i;->D:LJ8/b;

    iput-object p2, p0, LG8/i;->E:LG8/j;

    iput-object p3, p0, LG8/i;->F:LF8/t0;

    iput-object p4, p0, LG8/i;->G:LF8/a0;

    iput-boolean p5, p0, LG8/i;->H:Z

    iput-boolean p6, p0, LG8/i;->I:Z

    return-void
.end method

.method public synthetic constructor <init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZILy7/k;)V
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    sget-object p4, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p4}, LF8/a0$a;->i()LF8/a0;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move v5, p8

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move v6, p8

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZ)V

    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public V0()LF8/a0;
    .locals 1

    iget-object v0, p0, LG8/i;->G:LF8/a0;

    return-object v0
.end method

.method public bridge synthetic W0()LF8/e0;
    .locals 1

    invoke-virtual {p0}, LG8/i;->g1()LG8/j;

    move-result-object v0

    return-object v0
.end method

.method public X0()Z
    .locals 1

    iget-boolean v0, p0, LG8/i;->H:Z

    return v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LG8/i;->k1(LG8/g;)LG8/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LG8/i;->j1(Z)LG8/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LG8/i;->k1(LG8/g;)LG8/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LG8/i;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d1(Z)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, LG8/i;->j1(Z)LG8/i;

    move-result-object p1

    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 8

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG8/i;

    iget-object v2, p0, LG8/i;->D:LJ8/b;

    invoke-virtual {p0}, LG8/i;->g1()LG8/j;

    move-result-object v3

    iget-object v4, p0, LG8/i;->F:LF8/t0;

    invoke-virtual {p0}, LG8/i;->X0()Z

    move-result v6

    iget-boolean v7, p0, LG8/i;->I:Z

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZ)V

    return-object v0
.end method

.method public final f1()LJ8/b;
    .locals 1

    iget-object v0, p0, LG8/i;->D:LJ8/b;

    return-object v0
.end method

.method public g1()LG8/j;
    .locals 1

    iget-object v0, p0, LG8/i;->E:LG8/j;

    return-object v0
.end method

.method public final h1()LF8/t0;
    .locals 1

    iget-object v0, p0, LG8/i;->F:LF8/t0;

    return-object v0
.end method

.method public final i1()Z
    .locals 1

    iget-boolean v0, p0, LG8/i;->I:Z

    return v0
.end method

.method public j1(Z)LG8/i;
    .locals 10

    new-instance v9, LG8/i;

    iget-object v1, p0, LG8/i;->D:LJ8/b;

    invoke-virtual {p0}, LG8/i;->g1()LG8/j;

    move-result-object v2

    iget-object v3, p0, LG8/i;->F:LF8/t0;

    invoke-virtual {p0}, LG8/i;->V0()LF8/a0;

    move-result-object v4

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v5, p1

    invoke-direct/range {v0 .. v8}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZILy7/k;)V

    return-object v9
.end method

.method public k1(LG8/g;)LG8/i;
    .locals 10

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LG8/i;->D:LJ8/b;

    invoke-virtual {p0}, LG8/i;->g1()LG8/j;

    move-result-object v0

    invoke-virtual {v0, p1}, LG8/j;->f(LG8/g;)LG8/j;

    move-result-object v3

    iget-object v0, p0, LG8/i;->F:LF8/t0;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, LG8/i;->V0()LF8/a0;

    move-result-object v5

    invoke-virtual {p0}, LG8/i;->X0()Z

    move-result v6

    new-instance p1, LG8/i;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZILy7/k;)V

    return-object p1
.end method

.method public u()Ly8/h;
    .locals 3

    sget-object v0, LH8/g;->D:LH8/g;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, LH8/k;->a(LH8/g;Z[Ljava/lang/String;)LH8/f;

    move-result-object v0

    return-object v0
.end method
