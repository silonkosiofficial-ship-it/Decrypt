.class public final LF0/O$b;
.super LD0/X;
.source "SourceFile"

# interfaces
.implements LD0/G;
.implements LF0/b;
.implements LF0/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/O$b$a;
    }
.end annotation


# instance fields
.field private H:Z

.field private I:I

.field private J:I

.field private K:Z

.field private L:Z

.field private M:LF0/J$g;

.field private N:Z

.field private O:J

.field private P:Lx7/l;

.field private Q:Lr0/c;

.field private R:F

.field private S:Z

.field private T:Ljava/lang/Object;

.field private U:Z

.field private V:Z

.field private final W:LF0/a;

.field private final X:LX/b;

.field private Y:Z

.field private Z:Z

.field private final a0:Lx7/a;

.field private b0:F

.field private c0:Z

.field private d0:Lx7/l;

.field private e0:Lr0/c;

.field private f0:J

.field private g0:F

.field private final h0:Lx7/a;

.field private i0:Z

.field private j0:Z

.field final synthetic k0:LF0/O;


# direct methods
.method public constructor <init>(LF0/O;)V
    .locals 5

    iput-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-direct {p0}, LD0/X;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, LF0/O$b;->I:I

    iput v0, p0, LF0/O$b;->J:I

    sget-object v0, LF0/J$g;->E:LF0/J$g;

    iput-object v0, p0, LF0/O$b;->M:LF0/J$g;

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, LF0/O$b;->O:J

    const/4 v1, 0x1

    iput-boolean v1, p0, LF0/O$b;->S:Z

    new-instance v2, LF0/K;

    invoke-direct {v2, p0}, LF0/K;-><init>(LF0/b;)V

    iput-object v2, p0, LF0/O$b;->W:LF0/a;

    new-instance v2, LX/b;

    const/16 v3, 0x10

    new-array v3, v3, [LF0/O$b;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v2, p0, LF0/O$b;->X:LX/b;

    iput-boolean v1, p0, LF0/O$b;->Y:Z

    new-instance v1, LF0/O$b$b;

    invoke-direct {v1, p0}, LF0/O$b$b;-><init>(LF0/O$b;)V

    iput-object v1, p0, LF0/O$b;->a0:Lx7/a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LF0/O$b;->f0:J

    new-instance v0, LF0/O$b$c;

    invoke-direct {v0, p1, p0}, LF0/O$b$c;-><init>(LF0/O;LF0/O$b;)V

    iput-object v0, p0, LF0/O$b;->h0:Lx7/a;

    return-void
.end method

.method private final A1()V
    .locals 4

    .prologue
    invoke-virtual {p0}, LF0/O$b;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LF0/O$b;->M1(Z)V

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v2

    invoke-virtual {v1}, LF0/J;->P()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->o2()LF0/d0;

    move-result-object v1

    :goto_0
    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LF0/d0;->O2()V

    invoke-virtual {v2}, LF0/d0;->o2()LF0/d0;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->w0()LX/b;

    move-result-object v1

    invoke-virtual {v1}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v1

    :cond_1
    aget-object v3, v1, v0

    check-cast v3, LF0/J;

    invoke-virtual {v3}, LF0/J;->d0()LF0/O$b;

    move-result-object v3

    invoke-direct {v3}, LF0/O$b;->A1()V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v2, :cond_1

    :cond_2
    return-void
.end method

.method private final C1()V
    .locals 11

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->e0()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, LF0/J;->g0()LF0/J$g;

    move-result-object v5

    sget-object v6, LF0/J$g;->C:LF0/J$g;

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v5, v6, v5}, LF0/J;->l1(LF0/J;LY0/b;ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v5

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final D1()V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->U()LF0/J$g;

    move-result-object v1

    sget-object v2, LF0/J$g;->E:LF0/J$g;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v2

    sget-object v3, LF0/O$b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, LF0/J;->U()LF0/J$g;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, LF0/J$g;->D:LF0/J$g;

    goto :goto_0

    :cond_1
    sget-object v0, LF0/J$g;->C:LF0/J$g;

    :goto_0
    invoke-virtual {v1, v0}, LF0/J;->D1(LF0/J$g;)V

    :cond_2
    return-void
.end method

.method private final G1(JFLx7/l;Lr0/c;)V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->L0()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "place is called on a deactivated node"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    sget-object v2, LF0/J$e;->E:LF0/J$e;

    invoke-static {v0, v2}, LF0/O;->l(LF0/O;LF0/J$e;)V

    iput-wide p1, p0, LF0/O$b;->O:J

    iput p3, p0, LF0/O$b;->R:F

    iput-object p4, p0, LF0/O$b;->P:Lx7/l;

    iput-object p5, p0, LF0/O$b;->Q:Lr0/c;

    iput-boolean v1, p0, LF0/O$b;->L:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/O$b;->c0:Z

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-static {v1}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v1

    iget-object v2, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v2}, LF0/O;->A()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, LF0/O$b;->k()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v1

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LF0/d0;->L2(JFLx7/l;Lr0/c;)V

    invoke-virtual {p0}, LF0/O$b;->F1()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v2

    invoke-virtual {v2, v0}, LF0/a;->r(Z)V

    iget-object v2, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v2, v0}, LF0/O;->Y(Z)V

    iput-object p4, p0, LF0/O$b;->d0:Lx7/l;

    iput-wide p1, p0, LF0/O$b;->f0:J

    iput p3, p0, LF0/O$b;->g0:F

    iput-object p5, p0, LF0/O$b;->e0:Lr0/c;

    invoke-interface {v1}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object p1

    iget-object p2, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {p2}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object p2

    iget-object p3, p0, LF0/O$b;->h0:Lx7/a;

    invoke-virtual {p1, p2, v0, p3}, LF0/q0;->c(LF0/J;ZLx7/a;)V

    :goto_0
    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    sget-object p2, LF0/J$e;->G:LF0/J$e;

    invoke-static {p1, p2}, LF0/O;->l(LF0/O;LF0/J$e;)V

    return-void
.end method

.method private final H1(JFLx7/l;Lr0/c;)V
    .locals 10

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O$b;->V:Z

    iget-wide v1, p0, LF0/O$b;->O:J

    invoke-static {p1, p2, v1, v2}, LY0/p;->g(JJ)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, LF0/O$b;->i0:Z

    if-eqz v1, :cond_3

    :cond_0
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->u()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->v()Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, LF0/O$b;->i0:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1, v0}, LF0/O;->j(LF0/O;Z)V

    iput-boolean v2, p0, LF0/O$b;->i0:Z

    :cond_2
    invoke-virtual {p0}, LF0/O$b;->B1()V

    :cond_3
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-static {v1}, LF0/P;->a(LF0/J;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->K()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->p2()LF0/d0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LF0/T;->s1()LD0/X$a;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    move-object v3, v1

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-static {v1}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getPlacementScope()LD0/X$a;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->H()LF0/O$a;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LF0/J;->V()LF0/O;

    move-result-object v1

    invoke-static {v1, v2}, LF0/O;->o(LF0/O;I)V

    :cond_6
    const v1, 0x7fffffff

    invoke-virtual {v4, v1}, LF0/O$a;->F1(I)V

    invoke-static {p1, p2}, LY0/p;->h(J)I

    move-result v5

    invoke-static {p1, p2}, LY0/p;->i(J)I

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_7
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->H()LF0/O$a;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LF0/O$a;->q1()Z

    move-result v1

    if-nez v1, :cond_8

    move v2, v0

    :cond_8
    xor-int/2addr v0, v2

    if-nez v0, :cond_9

    const-string v0, "Error: Placement happened before lookahead."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_9
    invoke-direct/range {p0 .. p5}, LF0/O$b;->G1(JFLx7/l;Lr0/c;)V

    return-void
.end method

.method private final N1(LF0/J;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, LF0/O$b;->M:LF0/J$g;

    sget-object v2, LF0/J$g;->E:LF0/J$g;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, LF0/J;->E()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v3

    :goto_1
    if-nez p1, :cond_2

    const-string p1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    invoke-static {p1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object p1

    sget-object v1, LF0/O$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v3, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    sget-object p1, LF0/J$g;->D:LF0/J$g;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object p1, LF0/J$g;->C:LF0/J$g;

    :goto_2
    iput-object p1, p0, LF0/O$b;->M:LF0/J$g;

    goto :goto_3

    :cond_5
    sget-object p1, LF0/J$g;->E:LF0/J$g;

    goto :goto_2

    :goto_3
    return-void
.end method

.method public static final synthetic e1(LF0/O$b;)V
    .locals 0

    invoke-direct {p0}, LF0/O$b;->m1()V

    return-void
.end method

.method public static final synthetic f1(LF0/O$b;)V
    .locals 0

    invoke-direct {p0}, LF0/O$b;->n1()V

    return-void
.end method

.method public static final synthetic h1(LF0/O$b;)Lr0/c;
    .locals 0

    iget-object p0, p0, LF0/O$b;->e0:Lr0/c;

    return-object p0
.end method

.method public static final synthetic i1(LF0/O$b;)Lx7/l;
    .locals 0

    iget-object p0, p0, LF0/O$b;->d0:Lx7/l;

    return-object p0
.end method

.method public static final synthetic j1(LF0/O$b;)J
    .locals 2

    iget-wide v0, p0, LF0/O$b;->f0:J

    return-wide v0
.end method

.method public static final synthetic k1(LF0/O$b;)F
    .locals 0

    iget p0, p0, LF0/O$b;->g0:F

    return p0
.end method

.method private final m1()V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v1

    invoke-virtual {v1}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->d0()LF0/O$b;

    move-result-object v5

    iget v5, v5, LF0/O$b;->I:I

    invoke-virtual {v4}, LF0/J;->p0()I

    move-result v6

    if-eq v5, v6, :cond_1

    invoke-virtual {v0}, LF0/J;->h1()V

    invoke-virtual {v0}, LF0/J;->D0()V

    invoke-virtual {v4}, LF0/J;->p0()I

    move-result v5

    const v6, 0x7fffffff

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, LF0/J;->d0()LF0/O$b;

    move-result-object v4

    invoke-direct {v4}, LF0/O$b;->A1()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final n1()V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LF0/O;->p(LF0/O;I)V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    move v3, v1

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->d0()LF0/O$b;

    move-result-object v4

    iget v5, v4, LF0/O$b;->J:I

    iput v5, v4, LF0/O$b;->I:I

    const v5, 0x7fffffff

    iput v5, v4, LF0/O$b;->J:I

    iput-boolean v1, v4, LF0/O$b;->V:Z

    iget-object v5, v4, LF0/O$b;->M:LF0/J$g;

    sget-object v6, LF0/J$g;->D:LF0/J$g;

    if-ne v5, v6, :cond_1

    sget-object v5, LF0/J$g;->E:LF0/J$g;

    iput-object v5, v4, LF0/O$b;->M:LF0/J$g;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final z1()V
    .locals 8

    .prologue
    invoke-virtual {p0}, LF0/O$b;->k()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LF0/O$b;->M1(Z)V

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    if-nez v0, :cond_1

    invoke-virtual {v1}, LF0/J;->e0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v7}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LF0/J;->Z()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v7}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    invoke-virtual {v1}, LF0/J;->P()LF0/d0;

    move-result-object v2

    invoke-virtual {v2}, LF0/d0;->o2()LF0/d0;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LF0/d0;->g2()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, LF0/d0;->y2()V

    :cond_2
    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    :cond_4
    aget-object v4, v0, v3

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->p0()I

    move-result v5

    const v6, 0x7fffffff

    if-eq v5, v6, :cond_5

    invoke-virtual {v4}, LF0/J;->d0()LF0/O$b;

    move-result-object v5

    invoke-direct {v5}, LF0/O$b;->z1()V

    invoke-virtual {v1, v4}, LF0/J;->x1(LF0/J;)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_4

    :cond_6
    return-void
.end method


# virtual methods
.method public final B1()V
    .locals 8

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->s()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->V()LF0/O;

    move-result-object v5

    invoke-virtual {v5}, LF0/O;->v()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, LF0/O;->u()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    invoke-virtual {v5}, LF0/O;->A()Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v2, v7, v6}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v5}, LF0/O;->I()LF0/O$b;

    move-result-object v4

    invoke-virtual {v4}, LF0/O$b;->B1()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_3
    return-void
.end method

.method public final E1()V
    .locals 1

    const v0, 0x7fffffff

    iput v0, p0, LF0/O$b;->J:I

    iput v0, p0, LF0/O$b;->I:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LF0/O$b;->M1(Z)V

    return-void
.end method

.method public F()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->P()LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public final F1()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O$b;->c0:Z

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->o0()LF0/J;

    move-result-object v1

    invoke-virtual {p0}, LF0/O$b;->F()LF0/d0;

    move-result-object v2

    invoke-virtual {v2}, LF0/d0;->q2()F

    move-result v2

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v3}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v3

    invoke-virtual {v3}, LF0/J;->m0()LF0/d0;

    move-result-object v4

    invoke-virtual {v3}, LF0/J;->P()LF0/d0;

    move-result-object v3

    :goto_0
    if-eq v4, v3, :cond_0

    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v4, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LF0/F;

    invoke-virtual {v4}, LF0/d0;->q2()F

    move-result v5

    add-float/2addr v2, v5

    invoke-virtual {v4}, LF0/d0;->o2()LF0/d0;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget v3, p0, LF0/O$b;->b0:F

    cmpg-float v3, v2, v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    iput v2, p0, LF0/O$b;->b0:F

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LF0/J;->h1()V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LF0/J;->D0()V

    :cond_3
    :goto_1
    invoke-virtual {p0}, LF0/O$b;->k()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LF0/J;->D0()V

    :cond_4
    invoke-direct {p0}, LF0/O$b;->z1()V

    iget-boolean v2, p0, LF0/O$b;->H:Z

    if-eqz v2, :cond_5

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    invoke-static {v1, v3, v0, v2}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V

    :cond_5
    if-eqz v1, :cond_8

    iget-boolean v2, p0, LF0/O$b;->H:Z

    if-nez v2, :cond_9

    invoke-virtual {v1}, LF0/J;->X()LF0/J$e;

    move-result-object v2

    sget-object v4, LF0/J$e;->E:LF0/J$e;

    if-ne v2, v4, :cond_9

    iget v2, p0, LF0/O$b;->J:I

    const v4, 0x7fffffff

    if-ne v2, v4, :cond_6

    move v3, v0

    :cond_6
    if-nez v3, :cond_7

    const-string v2, "Place was called on a node which was placed already"

    invoke-static {v2}, LC0/a;->b(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v1}, LF0/J;->V()LF0/O;

    move-result-object v2

    invoke-static {v2}, LF0/O;->e(LF0/O;)I

    move-result v2

    iput v2, p0, LF0/O$b;->J:I

    invoke-virtual {v1}, LF0/J;->V()LF0/O;

    move-result-object v1

    invoke-static {v1}, LF0/O;->e(LF0/O;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, LF0/O;->p(LF0/O;I)V

    goto :goto_2

    :cond_8
    iput v3, p0, LF0/O$b;->J:I

    :cond_9
    :goto_2
    invoke-virtual {p0}, LF0/O$b;->d0()V

    return-void
.end method

.method public final I1(J)Z
    .locals 6

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->L0()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "measure is called on a deactivated node"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    iget-object v2, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v2}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v2

    invoke-virtual {v2}, LF0/J;->o0()LF0/J;

    move-result-object v2

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v3}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v3

    iget-object v4, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v4}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v4

    invoke-virtual {v4}, LF0/J;->E()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LF0/J;->E()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v5

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v1

    :goto_1
    invoke-virtual {v3, v2}, LF0/J;->A1(Z)V

    iget-object v2, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v2}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v2

    invoke-virtual {v2}, LF0/J;->e0()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, LD0/X;->E0()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, LY0/b;->f(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {p1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object p1

    const/4 p2, 0x2

    const/4 v1, 0x0

    invoke-static {v0, p1, v5, p2, v1}, LF0/n0;->b(LF0/o0;LF0/J;ZILjava/lang/Object;)V

    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {p1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->z1()V

    return v5

    :cond_4
    :goto_2
    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0, v5}, LF0/a;->s(Z)V

    sget-object v0, LF0/O$b$d;->D:LF0/O$b$d;

    invoke-virtual {p0, v0}, LF0/O$b;->c0(Lx7/l;)V

    iput-boolean v1, p0, LF0/O$b;->K:Z

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->a()J

    move-result-wide v2

    invoke-virtual {p0, p1, p2}, LD0/X;->a1(J)V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0, p1, p2}, LF0/O;->h(LF0/O;J)V

    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {p1}, LF0/O;->K()LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LF0/d0;->a()J

    move-result-wide p1

    invoke-static {p1, p2, v2, v3}, LY0/t;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {p1}, LF0/O;->K()LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p1

    invoke-virtual {p0}, LD0/X;->I0()I

    move-result p2

    if-ne p1, p2, :cond_6

    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {p1}, LF0/O;->K()LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result p1

    invoke-virtual {p0}, LD0/X;->w0()I

    move-result p2

    if-eq p1, p2, :cond_5

    goto :goto_3

    :cond_5
    move v1, v5

    :cond_6
    :goto_3
    iget-object p1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {p1}, LF0/O;->K()LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p1

    iget-object p2, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {p2}, LF0/O;->K()LF0/d0;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p2

    invoke-static {p1, p2}, LY0/u;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LD0/X;->Y0(J)V

    return v1
.end method

.method public J()LF0/b;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O;->r()LF0/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final J1()V
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LF0/O$b;->H:Z

    iget-boolean v2, p0, LF0/O$b;->L:Z

    if-nez v2, :cond_0

    const-string v2, "replace called on unplaced item"

    invoke-static {v2}, LC0/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, LF0/O$b;->k()Z

    move-result v2

    iget-wide v4, p0, LF0/O$b;->O:J

    iget v6, p0, LF0/O$b;->R:F

    iget-object v7, p0, LF0/O$b;->P:Lx7/l;

    iget-object v8, p0, LF0/O$b;->Q:Lr0/c;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, LF0/O$b;->G1(JFLx7/l;Lr0/c;)V

    if-eqz v2, :cond_1

    iget-boolean v2, p0, LF0/O$b;->c0:Z

    if-nez v2, :cond_1

    iget-object v2, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v2}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v2

    invoke-virtual {v2}, LF0/J;->o0()LF0/J;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    invoke-static {v2, v1, v0, v3}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    iput-boolean v1, p0, LF0/O$b;->H:Z

    return-void

    :goto_1
    iput-boolean v1, p0, LF0/O$b;->H:Z

    throw v0
.end method

.method public final K1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O$b;->Y:Z

    return-void
.end method

.method public final L1(LF0/J$g;)V
    .locals 0

    iput-object p1, p0, LF0/O$b;->M:LF0/J$g;

    return-void
.end method

.method protected M0(JFLr0/c;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LF0/O$b;->H1(JFLx7/l;Lr0/c;)V

    return-void
.end method

.method public M1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O$b;->U:Z

    return-void
.end method

.method public final O1()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/O$b;->Z()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->Z()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, LF0/O$b;->S:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    iput-boolean v1, p0, LF0/O$b;->S:Z

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->Z()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LF0/O$b;->T:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public Q(LD0/a;)I
    .locals 4

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, LF0/J$e;->C:LF0/J$e;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LF0/a;->u(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v1

    :cond_2
    sget-object v0, LF0/J$e;->E:LF0/J$e;

    if-ne v1, v0, :cond_3

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LF0/a;->t(Z)V

    :cond_3
    :goto_1
    iput-boolean v3, p0, LF0/O$b;->N:Z

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/T;->Q(LD0/a;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/O$b;->N:Z

    return p1
.end method

.method protected R0(JFLx7/l;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LF0/O$b;->H1(JFLx7/l;Lr0/c;)V

    return-void
.end method

.method public S(I)I
    .locals 1

    invoke-direct {p0}, LF0/O$b;->D1()V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-interface {v0, p1}, LD0/n;->S(I)I

    move-result p1

    return p1
.end method

.method public T(I)I
    .locals 1

    invoke-direct {p0}, LF0/O$b;->D1()V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-interface {v0, p1}, LD0/n;->T(I)I

    move-result p1

    return p1
.end method

.method public U(J)LD0/X;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->U()LF0/J$g;

    move-result-object v0

    sget-object v1, LF0/J$g;->E:LF0/J$g;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->v()V

    :cond_0
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/P;->a(LF0/J;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->H()LF0/O$a;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LF0/O$a;->E1(LF0/J$g;)V

    invoke-virtual {v0, p1, p2}, LF0/O$a;->U(J)LD0/X;

    :cond_1
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-direct {p0, v0}, LF0/O$b;->N1(LF0/J;)V

    invoke-virtual {p0, p1, p2}, LF0/O$b;->I1(J)Z

    return-object p0
.end method

.method public Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF0/O$b;->T:Ljava/lang/Object;

    return-object v0
.end method

.method public c0(Lx7/l;)V
    .locals 4

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    invoke-virtual {v3}, LF0/J;->V()LF0/O;

    move-result-object v3

    invoke-virtual {v3}, LF0/O;->r()LF0/b;

    move-result-object v3

    invoke-interface {p1, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method

.method public d0()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O$b;->Z:Z

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1}, LF0/a;->o()V

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->A()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LF0/O$b;->C1()V

    :cond_0
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->b(LF0/O;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-boolean v1, p0, LF0/O$b;->N:Z

    if-nez v1, :cond_3

    invoke-virtual {p0}, LF0/O$b;->F()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/T;->y1()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->A()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1, v2}, LF0/O;->j(LF0/O;Z)V

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->B()LF0/J$e;

    move-result-object v1

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    sget-object v4, LF0/J$e;->E:LF0/J$e;

    invoke-static {v3, v4}, LF0/O;->l(LF0/O;LF0/J$e;)V

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v3, v2}, LF0/O;->Z(Z)V

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v3}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v3

    invoke-static {v3}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v4

    invoke-interface {v4}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v4

    iget-object v5, p0, LF0/O$b;->a0:Lx7/a;

    invoke-virtual {v4, v3, v2, v5}, LF0/q0;->e(LF0/J;ZLx7/a;)V

    iget-object v3, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v3, v1}, LF0/O;->l(LF0/O;LF0/J$e;)V

    invoke-virtual {p0}, LF0/O$b;->F()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/T;->y1()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->v()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LF0/O$b;->requestLayout()V

    :cond_2
    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1, v2}, LF0/O;->k(LF0/O;Z)V

    :cond_3
    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1}, LF0/a;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v1

    invoke-virtual {v1, v0}, LF0/a;->q(Z)V

    :cond_4
    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->n()V

    :cond_5
    iput-boolean v2, p0, LF0/O$b;->Z:Z

    return-void
.end method

.method public f()LF0/a;
    .locals 1

    iget-object v0, p0, LF0/O$b;->W:LF0/a;

    return-object v0
.end method

.method public g0(Z)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/T;->x1()Z

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v1}, LF0/O;->K()LF0/d0;

    move-result-object v1

    invoke-virtual {v1, v0}, LF0/T;->g0(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O$b;->i0:Z

    :cond_0
    iput-boolean p1, p0, LF0/O$b;->j0:Z

    return-void
.end method

.method public i0()V
    .locals 7

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    return-void
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LF0/O$b;->U:Z

    return v0
.end method

.method public n0(I)I
    .locals 1

    invoke-direct {p0}, LF0/O$b;->D1()V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-interface {v0, p1}, LD0/n;->n0(I)I

    move-result p1

    return p1
.end method

.method public final o1()Ljava/util/List;
    .locals 8

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K1()V

    iget-boolean v0, p0, LF0/O$b;->Y:Z

    if-nez v0, :cond_0

    :goto_0
    iget-object v0, p0, LF0/O$b;->X:LX/b;

    invoke-virtual {v0}, LX/b;->i()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    iget-object v1, p0, LF0/O$b;->X:LX/b;

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v2

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_3

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    move v5, v4

    :cond_1
    aget-object v6, v2, v5

    check-cast v6, LF0/J;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v7

    invoke-virtual {v6}, LF0/J;->V()LF0/O;

    move-result-object v6

    invoke-virtual {v6}, LF0/O;->I()LF0/O$b;

    move-result-object v6

    if-gt v7, v5, :cond_2

    invoke-virtual {v1, v6}, LX/b;->d(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v5, v6}, LX/b;->J(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v3, :cond_1

    :cond_3
    invoke-virtual {v0}, LF0/J;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1}, LX/b;->t()I

    move-result v2

    invoke-virtual {v1, v0, v2}, LX/b;->E(II)V

    iput-boolean v4, p0, LF0/O$b;->Y:Z

    goto :goto_0
.end method

.method public final q1()LY0/b;
    .locals 2

    .prologue
    iget-boolean v0, p0, LF0/O$b;->K:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LD0/X;->E0()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->a(J)LY0/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final r1()Z
    .locals 1

    iget-boolean v0, p0, LF0/O$b;->Z:Z

    return v0
.end method

.method public requestLayout()V
    .locals 4

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V

    return-void
.end method

.method public final s1()LF0/J$g;
    .locals 1

    iget-object v0, p0, LF0/O$b;->M:LF0/J$g;

    return-object v0
.end method

.method public t(I)I
    .locals 1

    invoke-direct {p0}, LF0/O$b;->D1()V

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-interface {v0, p1}, LD0/n;->t(I)I

    move-result p1

    return p1
.end method

.method public final t1()I
    .locals 1

    iget v0, p0, LF0/O$b;->J:I

    return v0
.end method

.method public final u1()F
    .locals 1

    iget v0, p0, LF0/O$b;->b0:F

    return v0
.end method

.method public final v1(Z)V
    .locals 9

    .prologue
    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    iget-object v1, p0, LF0/O$b;->k0:LF0/O;

    invoke-static {v1}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->U()LF0/J$g;

    move-result-object v1

    if-eqz v0, :cond_4

    sget-object v2, LF0/J$g;->E:LF0/J$g;

    if-eq v1, v2, :cond_4

    :cond_0
    move-object v3, v0

    invoke-virtual {v3}, LF0/J;->U()LF0/J$g;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {v3}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_1
    sget-object v0, LF0/O$b$a;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-virtual {v3, p1}, LF0/J;->t1(Z)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Intrinsics isn\'t used by the parent"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    invoke-static/range {v3 .. v8}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final w1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O$b;->S:Z

    return-void
.end method

.method public final x1()Z
    .locals 1

    iget-boolean v0, p0, LF0/O$b;->V:Z

    return v0
.end method

.method public y()Ljava/util/Map;
    .locals 3

    .prologue
    iget-boolean v0, p0, LF0/O$b;->N:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->B()LF0/J$e;

    move-result-object v0

    sget-object v2, LF0/J$e;->C:LF0/J$e;

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LF0/a;->s(Z)V

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    invoke-virtual {v0}, LF0/O;->O()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LF0/a;->r(Z)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LF0/O$b;->F()LF0/d0;

    move-result-object v0

    invoke-virtual {v0, v1}, LF0/T;->C1(Z)V

    invoke-virtual {p0}, LF0/O$b;->d0()V

    invoke-virtual {p0}, LF0/O$b;->F()LF0/d0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF0/T;->C1(Z)V

    invoke-virtual {p0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final y1()V
    .locals 2

    iget-object v0, p0, LF0/O$b;->k0:LF0/O;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LF0/O;->i(LF0/O;Z)V

    return-void
.end method
