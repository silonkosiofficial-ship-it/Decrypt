.class public abstract LF0/d0;
.super LF0/T;
.source "SourceFile"

# interfaces
.implements LD0/G;
.implements LD0/t;
.implements LF0/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/d0$e;,
        LF0/d0$f;
    }
.end annotation


# static fields
.field public static final n0:LF0/d0$e;

.field private static final o0:Lx7/l;

.field private static final p0:Lx7/l;

.field private static final q0:Landroidx/compose/ui/graphics/d;

.field private static final r0:LF0/A;

.field private static final s0:[F

.field private static final t0:LF0/d0$f;

.field private static final u0:LF0/d0$f;


# instance fields
.field private final R:LF0/J;

.field private S:Z

.field private T:Z

.field private U:LF0/d0;

.field private V:LF0/d0;

.field private W:Z

.field private X:Z

.field private Y:Lx7/l;

.field private Z:LY0/e;

.field private a0:LY0/v;

.field private b0:F

.field private c0:LD0/K;

.field private d0:Ljava/util/Map;

.field private e0:J

.field private f0:F

.field private g0:Ln0/e;

.field private h0:LF0/A;

.field private final i0:Lx7/p;

.field private final j0:Lx7/a;

.field private k0:Z

.field private l0:LF0/m0;

.field private m0:Lr0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/d0$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/d0$e;-><init>(Ly7/k;)V

    sput-object v0, LF0/d0;->n0:LF0/d0$e;

    sget-object v0, LF0/d0$d;->D:LF0/d0$d;

    sput-object v0, LF0/d0;->o0:Lx7/l;

    sget-object v0, LF0/d0$c;->D:LF0/d0$c;

    sput-object v0, LF0/d0;->p0:Lx7/l;

    new-instance v0, Landroidx/compose/ui/graphics/d;

    invoke-direct {v0}, Landroidx/compose/ui/graphics/d;-><init>()V

    sput-object v0, LF0/d0;->q0:Landroidx/compose/ui/graphics/d;

    new-instance v0, LF0/A;

    invoke-direct {v0}, LF0/A;-><init>()V

    sput-object v0, LF0/d0;->r0:LF0/A;

    const/4 v0, 0x1

    invoke-static {v1, v0, v1}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v0

    sput-object v0, LF0/d0;->s0:[F

    new-instance v0, LF0/d0$a;

    invoke-direct {v0}, LF0/d0$a;-><init>()V

    sput-object v0, LF0/d0;->t0:LF0/d0$f;

    new-instance v0, LF0/d0$b;

    invoke-direct {v0}, LF0/d0$b;-><init>()V

    sput-object v0, LF0/d0;->u0:LF0/d0$f;

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 2

    invoke-direct {p0}, LF0/T;-><init>()V

    iput-object p1, p0, LF0/d0;->R:LF0/J;

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->K()LY0/e;

    move-result-object p1

    iput-object p1, p0, LF0/d0;->Z:LY0/e;

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object p1

    iput-object p1, p0, LF0/d0;->a0:LY0/v;

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, LF0/d0;->b0:F

    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LF0/d0;->e0:J

    new-instance p1, LF0/d0$g;

    invoke-direct {p1, p0}, LF0/d0$g;-><init>(LF0/d0;)V

    iput-object p1, p0, LF0/d0;->i0:Lx7/p;

    new-instance p1, LF0/d0$j;

    invoke-direct {p1, p0}, LF0/d0$j;-><init>(LF0/d0;)V

    iput-object p1, p0, LF0/d0;->j0:Lx7/a;

    return-void
.end method

.method private final B2(J)J
    .locals 3

    .prologue
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    neg-float v0, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LD0/X;->D0()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    :goto_0
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    cmpg-float p2, p1, v1

    if-gez p2, :cond_1

    neg-float p1, p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LD0/X;->x0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    :goto_1
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public static final synthetic E1(LF0/d0;Lo0/q0;Lr0/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF0/d0;->Y1(Lo0/q0;Lr0/c;)V

    return-void
.end method

.method public static final synthetic F1()Landroidx/compose/ui/graphics/d;
    .locals 1

    sget-object v0, LF0/d0;->q0:Landroidx/compose/ui/graphics/d;

    return-object v0
.end method

.method public static final synthetic G1(LF0/d0;)LF0/A;
    .locals 0

    iget-object p0, p0, LF0/d0;->h0:LF0/A;

    return-object p0
.end method

.method public static final synthetic H1()Lx7/l;
    .locals 1

    sget-object v0, LF0/d0;->p0:Lx7/l;

    return-object v0
.end method

.method public static final synthetic I1()LF0/d0$f;
    .locals 1

    sget-object v0, LF0/d0;->t0:LF0/d0$f;

    return-object v0
.end method

.method public static final synthetic J1()LF0/d0$f;
    .locals 1

    sget-object v0, LF0/d0;->u0:LF0/d0$f;

    return-object v0
.end method

.method public static final synthetic K1(LF0/d0;)LF0/q0;
    .locals 0

    invoke-direct {p0}, LF0/d0;->m2()LF0/q0;

    move-result-object p0

    return-object p0
.end method

.method private final K2(JFLx7/l;Lr0/c;)V
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p5, :cond_3

    const/4 v3, 0x1

    if-nez p4, :cond_0

    move p4, v3

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    if-nez p4, :cond_1

    const-string p4, "both ways to create layers shouldn\'t be used together"

    invoke-static {p4}, LC0/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-object p4, p0, LF0/d0;->m0:Lr0/c;

    if-eq p4, p5, :cond_2

    iput-object v2, p0, LF0/d0;->m0:Lr0/c;

    invoke-static {p0, v2, v1, v0, v2}, LF0/d0;->d3(LF0/d0;Lx7/l;ZILjava/lang/Object;)V

    iput-object p5, p0, LF0/d0;->m0:Lr0/c;

    :cond_2
    iget-object p4, p0, LF0/d0;->l0:LF0/m0;

    if-nez p4, :cond_5

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p4

    invoke-static {p4}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object p4

    iget-object v0, p0, LF0/d0;->i0:Lx7/p;

    iget-object v1, p0, LF0/d0;->j0:Lx7/a;

    invoke-interface {p4, v0, v1, p5}, LF0/o0;->v(Lx7/p;Lx7/a;Lr0/c;)LF0/m0;

    move-result-object p4

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v0

    invoke-interface {p4, v0, v1}, LF0/m0;->g(J)V

    invoke-interface {p4, p1, p2}, LF0/m0;->i(J)V

    iput-object p4, p0, LF0/d0;->l0:LF0/m0;

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p4

    invoke-virtual {p4, v3}, LF0/J;->B1(Z)V

    iget-object p4, p0, LF0/d0;->j0:Lx7/a;

    invoke-interface {p4}, Lx7/a;->b()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object p5, p0, LF0/d0;->m0:Lr0/c;

    if-eqz p5, :cond_4

    iput-object v2, p0, LF0/d0;->m0:Lr0/c;

    invoke-static {p0, v2, v1, v0, v2}, LF0/d0;->d3(LF0/d0;Lx7/l;ZILjava/lang/Object;)V

    :cond_4
    invoke-static {p0, p4, v1, v0, v2}, LF0/d0;->d3(LF0/d0;Lx7/l;ZILjava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide p4

    invoke-static {p4, p5, p1, p2}, LY0/p;->g(JJ)Z

    move-result p4

    if-nez p4, :cond_8

    invoke-virtual {p0, p1, p2}, LF0/d0;->R2(J)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p4

    invoke-virtual {p4}, LF0/J;->V()LF0/O;

    move-result-object p4

    invoke-virtual {p4}, LF0/O;->I()LF0/O$b;

    move-result-object p4

    invoke-virtual {p4}, LF0/O$b;->B1()V

    iget-object p4, p0, LF0/d0;->l0:LF0/m0;

    if-eqz p4, :cond_6

    invoke-interface {p4, p1, p2}, LF0/m0;->i(J)V

    goto :goto_2

    :cond_6
    iget-object p1, p0, LF0/d0;->V:LF0/d0;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LF0/d0;->y2()V

    :cond_7
    :goto_2
    invoke-virtual {p0, p0}, LF0/T;->v1(LF0/d0;)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->n0()LF0/o0;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p2

    invoke-interface {p1, p2}, LF0/o0;->w(LF0/J;)V

    :cond_8
    iput p3, p0, LF0/d0;->f0:F

    invoke-virtual {p0}, LF0/T;->y1()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, LF0/d0;->q1()LD0/K;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/T;->i1(LD0/K;)V

    :cond_9
    return-void
.end method

.method public static final synthetic L1()LF0/A;
    .locals 1

    sget-object v0, LF0/d0;->r0:LF0/A;

    return-object v0
.end method

.method public static final synthetic M1(LF0/d0;Z)Landroidx/compose/ui/d$c;
    .locals 0

    invoke-direct {p0, p1}, LF0/d0;->t2(Z)Landroidx/compose/ui/d$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N1(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LF0/d0;->u2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V

    return-void
.end method

.method public static synthetic N2(LF0/d0;Ln0/e;ZZILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LF0/d0;->M2(Ln0/e;ZZ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: rectInParent"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic O1(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LF0/d0;->v2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    return-void
.end method

.method public static final synthetic P1(LF0/d0;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/d0;->k0:Z

    return-void
.end method

.method public static final synthetic Q1(LF0/d0;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LD0/X;->a1(J)V

    return-void
.end method

.method public static final synthetic R1(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LF0/d0;->V2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    return-void
.end method

.method private final S1(LF0/d0;Ln0/e;Z)V
    .locals 1

    .prologue
    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    if-eqz v0, :cond_1

    invoke-direct {v0, p1, p2, p3}, LF0/d0;->S1(LF0/d0;Ln0/e;Z)V

    :cond_1
    invoke-direct {p0, p2, p3}, LF0/d0;->d2(Ln0/e;Z)V

    return-void
.end method

.method private final T1(LF0/d0;JZ)J
    .locals 2

    .prologue
    if-ne p1, p0, :cond_0

    return-wide p2

    :cond_0
    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    if-eqz v0, :cond_2

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {v0, p1, p2, p3, p4}, LF0/d0;->T1(LF0/d0;JZ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p4}, LF0/d0;->b2(JZ)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3, p4}, LF0/d0;->b2(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final V2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V
    .locals 12

    .prologue
    move-object v10, p1

    if-nez v10, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LF0/d0;->x2(LF0/d0$f;JLF0/v;ZZ)V

    goto :goto_0

    :cond_0
    move-object v3, p2

    invoke-interface {p2, p1}, LF0/d0$f;->d(Landroidx/compose/ui/d$c;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v11, LF0/d0$k;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LF0/d0$k;-><init>(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    move-object/from16 v0, p5

    invoke-virtual {v0, p1, v9, v8, v11}, LF0/v;->U(Landroidx/compose/ui/d$c;FZLx7/a;)V

    goto :goto_0

    :cond_1
    move-object/from16 v0, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-interface {p2}, LF0/d0$f;->a()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v2

    invoke-static {p1, v1, v2}, LF0/e0;->a(LF0/j;II)Landroidx/compose/ui/d$c;

    move-result-object v2

    move-object v1, p0

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, LF0/d0;->V2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    :goto_0
    return-void
.end method

.method private final W2(LD0/t;)LF0/d0;
    .locals 1

    .prologue
    instance-of v0, p1, LD0/E;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LD0/E;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LF0/d0;

    :cond_2
    return-object v0
.end method

.method private final Y1(Lo0/q0;Lr0/c;)V
    .locals 8

    .prologue
    const/4 v0, 0x4

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p0, v0}, LF0/d0;->s2(I)Landroidx/compose/ui/d$c;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-virtual {p0, p1, p2}, LF0/d0;->J2(Lo0/q0;Lr0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->c0()LF0/L;

    move-result-object v1

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/u;->d(J)J

    move-result-wide v3

    move-object v2, p1

    move-object v5, p0

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, LF0/L;->f(Lo0/q0;JLF0/d0;Landroidx/compose/ui/d$c;Lr0/c;)V

    :goto_0
    return-void
.end method

.method public static synthetic Y2(LF0/d0;JZILjava/lang/Object;)J
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LF0/d0;->X2(JZ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final a3(LF0/d0;[F)V
    .locals 6

    .prologue
    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, p1, p2}, LF0/d0;->a3(LF0/d0;[F)V

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/p;->g(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, LF0/d0;->s0:[F

    invoke-static {p1}, Lo0/J1;->h([F)V

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v0

    int-to-float v0, v0

    neg-float v1, v0

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/p;->i(J)I

    move-result v0

    int-to-float v0, v0

    neg-float v2, v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lo0/J1;->q([FFFFILjava/lang/Object;)V

    invoke-static {p2, p1}, Lo0/J1;->n([F[F)V

    :cond_0
    iget-object p1, p0, LF0/d0;->l0:LF0/m0;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, LF0/m0;->h([F)V

    :cond_1
    return-void
.end method

.method private final b3(LF0/d0;[F)V
    .locals 10

    .prologue
    move-object v0, p0

    :goto_0
    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, LF0/d0;->l0:LF0/m0;

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, LF0/m0;->a([F)V

    :cond_0
    invoke-virtual {v0}, LF0/d0;->t1()J

    move-result-wide v1

    sget-object v3, LY0/p;->b:LY0/p$a;

    invoke-virtual {v3}, LY0/p$a;->a()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/p;->g(JJ)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, LF0/d0;->s0:[F

    invoke-static {v3}, Lo0/J1;->h([F)V

    invoke-static {v1, v2}, LY0/p;->h(J)I

    move-result v4

    int-to-float v5, v4

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v1

    int-to-float v6, v1

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v9}, Lo0/J1;->q([FFFFILjava/lang/Object;)V

    invoke-static {p2, v3}, Lo0/J1;->n([F[F)V

    :cond_1
    iget-object v0, v0, LF0/d0;->V:LF0/d0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic c2(LF0/d0;JZILjava/lang/Object;)J
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LF0/d0;->b2(JZ)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final d2(Ln0/e;Z)V
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v0

    invoke-virtual {p1}, Ln0/e;->b()F

    move-result v1

    int-to-float v0, v0

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ln0/e;->i(F)V

    invoke-virtual {p1}, Ln0/e;->c()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ln0/e;->j(F)V

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    invoke-virtual {p1}, Ln0/e;->d()F

    move-result v1

    int-to-float v0, v0

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ln0/e;->k(F)V

    invoke-virtual {p1}, Ln0/e;->a()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Ln0/e;->h(F)V

    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, LF0/m0;->k(Ln0/e;Z)V

    iget-boolean v0, p0, LF0/d0;->X:Z

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, p2, v0}, Ln0/e;->e(FFFF)V

    invoke-virtual {p1}, Ln0/e;->f()Z

    :cond_0
    return-void
.end method

.method public static synthetic d3(LF0/d0;Lx7/l;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LF0/d0;->c3(Lx7/l;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerBlock"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final e3(Z)V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/d0;->m0:Lr0/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_3

    iget-object v1, p0, LF0/d0;->Y:Lx7/l;

    if-eqz v1, :cond_2

    sget-object v2, LF0/d0;->q0:Landroidx/compose/ui/graphics/d;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->N()V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v3

    invoke-virtual {v3}, LF0/J;->K()LY0/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/d;->Q(LY0/e;)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v3

    invoke-virtual {v3}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/compose/ui/graphics/d;->R(LY0/v;)V

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/u;->d(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/graphics/d;->S(J)V

    invoke-direct {p0}, LF0/d0;->m2()LF0/q0;

    move-result-object v3

    sget-object v4, LF0/d0;->o0:Lx7/l;

    new-instance v5, LF0/d0$l;

    invoke-direct {v5, v1}, LF0/d0$l;-><init>(Lx7/l;)V

    invoke-virtual {v3, p0, v4, v5}, LF0/q0;->i(LF0/p0;Lx7/l;Lx7/a;)V

    iget-object v1, p0, LF0/d0;->h0:LF0/A;

    if-nez v1, :cond_1

    new-instance v1, LF0/A;

    invoke-direct {v1}, LF0/A;-><init>()V

    iput-object v1, p0, LF0/d0;->h0:LF0/A;

    :cond_1
    invoke-virtual {v1, v2}, LF0/A;->b(Landroidx/compose/ui/graphics/c;)V

    invoke-interface {v0, v2}, LF0/m0;->e(Landroidx/compose/ui/graphics/d;)V

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->s()Z

    move-result v0

    iput-boolean v0, p0, LF0/d0;->X:Z

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/d;->f()F

    move-result v0

    iput v0, p0, LF0/d0;->b0:F

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->n0()LF0/o0;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-interface {p1, v0}, LF0/o0;->w(LF0/J;)V

    goto :goto_1

    :cond_2
    const-string p1, "updateLayerParameters requires a non-null layerBlock"

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_3
    iget-object p1, p0, LF0/d0;->Y:Lx7/l;

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_5

    const-string p1, "null layer with a non-null layerBlock"

    invoke-static {p1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic f3(LF0/d0;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, LF0/d0;->e3(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateLayerParameters"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final m2()LF0/q0;
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    return-object v0
.end method

.method private final r2(I)Z
    .locals 2

    .prologue
    invoke-static {p1}, LF0/g0;->i(I)Z

    move-result v0

    invoke-direct {p0, v0}, LF0/d0;->t2(Z)Landroidx/compose/ui/d$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LF0/k;->e(LF0/j;I)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move v1, v0

    :cond_0
    return v1
.end method

.method private final t2(Z)Landroidx/compose/ui/d$c;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->k0()LF0/b0;

    move-result-object p1

    invoke-virtual {p1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, LF0/d0;->V:LF0/d0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_0

    :cond_2
    iget-object p1, p0, LF0/d0;->V:LF0/d0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final u2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V
    .locals 11

    .prologue
    move-object v9, p1

    if-nez v9, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LF0/d0;->x2(LF0/d0$f;JLF0/v;ZZ)V

    goto :goto_0

    :cond_0
    new-instance v10, LF0/d0$h;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LF0/d0$h;-><init>(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V

    move-object/from16 v0, p5

    move/from16 v1, p7

    invoke-virtual {v0, p1, v1, v10}, LF0/v;->O(Landroidx/compose/ui/d$c;ZLx7/a;)V

    :goto_0
    return-void
.end method

.method private final v2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V
    .locals 12

    .prologue
    move-object v10, p1

    if-nez v10, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, LF0/d0;->x2(LF0/d0$f;JLF0/v;ZZ)V

    goto :goto_0

    :cond_0
    new-instance v11, LF0/d0$i;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LF0/d0$i;-><init>(LF0/d0;Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    move-object/from16 v0, p5

    move/from16 v1, p7

    move/from16 v2, p8

    invoke-virtual {v0, p1, v2, v1, v11}, LF0/v;->P(Landroidx/compose/ui/d$c;FZLx7/a;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final A2()Z
    .locals 2

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    iget v0, p0, LF0/d0;->b0:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->A2()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public B1()V
    .locals 4

    .prologue
    iget-object v0, p0, LF0/d0;->m0:Lr0/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v1

    iget v3, p0, LF0/d0;->f0:F

    invoke-virtual {p0, v1, v2, v3, v0}, LF0/d0;->M0(JFLr0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    iget v2, p0, LF0/d0;->f0:F

    iget-object v3, p0, LF0/d0;->Y:Lx7/l;

    invoke-virtual {p0, v0, v1, v2, v3}, LF0/d0;->R0(JFLx7/l;)V

    :goto_0
    return-void
.end method

.method public C(J)J
    .locals 1

    invoke-virtual {p0, p1, p2}, LF0/d0;->h0(J)J

    move-result-wide p1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LF0/o0;->c(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final C2()V
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->S()V

    return-void
.end method

.method public D2()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/m0;->invalidate()V

    :cond_0
    return-void
.end method

.method public final E2()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/d0;->Y:Lx7/l;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LF0/d0;->c3(Lx7/l;Z)V

    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/m0;->invalidate()V

    :cond_0
    return-void
.end method

.method protected F2(II)V
    .locals 9

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LY0/u;->a(II)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LF0/m0;->g(J)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->y2()V

    :cond_1
    :goto_0
    invoke-static {p1, p2}, LY0/u;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LD0/X;->Y0(J)V

    iget-object p1, p0, LF0/d0;->Y:Lx7/l;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, LF0/d0;->e3(Z)V

    :cond_2
    const/4 p1, 0x4

    invoke-static {p1}, LF0/f0;->a(I)I

    move-result p1

    invoke-static {p1}, LF0/g0;->i(I)Z

    move-result v0

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-nez v1, :cond_4

    goto/16 :goto_7

    :cond_4
    :goto_1
    invoke-static {p0, v0}, LF0/d0;->M1(LF0/d0;Z)Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_c

    const/4 v2, 0x0

    move-object v3, v0

    move-object v4, v2

    :goto_3
    if-eqz v3, :cond_c

    instance-of v5, v3, LF0/s;

    if-eqz v5, :cond_5

    check-cast v3, LF0/s;

    invoke-interface {v3}, LF0/s;->m0()V

    goto :goto_6

    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, p1

    if-eqz v5, :cond_b

    instance-of v5, v3, LF0/m;

    if-eqz v5, :cond_b

    move-object v5, v3

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    move v6, p2

    :goto_4
    const/4 v7, 0x1

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, p1

    if-eqz v8, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_6

    move-object v3, v5

    goto :goto_5

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, LX/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/d$c;

    invoke-direct {v4, v7, p2}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_7
    if-eqz v3, :cond_8

    invoke-virtual {v4, v3}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_8
    invoke-virtual {v4, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_4

    :cond_a
    if-ne v6, v7, :cond_b

    goto :goto_3

    :cond_b
    :goto_6
    invoke-static {v4}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v3

    goto :goto_3

    :cond_c
    if-eq v0, v1, :cond_d

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_2

    :cond_d
    :goto_7
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->n0()LF0/o0;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p2

    invoke-interface {p1, p2}, LF0/o0;->w(LF0/J;)V

    :cond_e
    return-void
.end method

.method public G(LD0/t;J)J
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, LF0/d0;->m0(LD0/t;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final G2()V
    .locals 15

    .prologue
    const/4 v0, 0x1

    const/16 v1, 0x80

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    invoke-direct {p0, v2}, LF0/d0;->r2(I)Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->d()Lf0/k;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lf0/k;->h()Lx7/l;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v6

    :try_start_0
    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {v1}, LF0/g0;->i(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v8

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v8

    if-nez v8, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_1
    invoke-static {p0, v7}, LF0/d0;->M1(LF0/d0;Z)Landroidx/compose/ui/d$c;

    move-result-object v7

    :goto_2
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->q1()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_a

    move-object v10, v4

    move-object v9, v7

    :goto_3
    if-eqz v9, :cond_a

    instance-of v11, v9, LF0/C;

    if-eqz v11, :cond_3

    check-cast v9, LF0/C;

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v11

    invoke-interface {v9, v11, v12}, LF0/C;->M(J)V

    goto :goto_6

    :cond_3
    invoke-virtual {v9}, Landroidx/compose/ui/d$c;->v1()I

    move-result v11

    and-int/2addr v11, v1

    if-eqz v11, :cond_9

    instance-of v11, v9, LF0/m;

    if-eqz v11, :cond_9

    move-object v11, v9

    check-cast v11, LF0/m;

    invoke-virtual {v11}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_4
    if-eqz v11, :cond_8

    invoke-virtual {v11}, Landroidx/compose/ui/d$c;->v1()I

    move-result v14

    and-int/2addr v14, v1

    if-eqz v14, :cond_7

    add-int/2addr v13, v0

    if-ne v13, v0, :cond_4

    move-object v9, v11

    goto :goto_5

    :cond_4
    if-nez v10, :cond_5

    new-instance v10, LX/b;

    const/16 v14, 0x10

    new-array v14, v14, [Landroidx/compose/ui/d$c;

    invoke-direct {v10, v14, v12}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v9, :cond_6

    invoke-virtual {v10, v9}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v9, v4

    :cond_6
    invoke-virtual {v10, v11}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_7
    :goto_5
    invoke-virtual {v11}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v11

    goto :goto_4

    :cond_8
    if-ne v13, v0, :cond_9

    goto :goto_3

    :cond_9
    :goto_6
    invoke-static {v10}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v9

    goto :goto_3

    :cond_a
    if-eq v7, v8, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_b
    :goto_7
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    goto :goto_9

    :goto_8
    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v0

    :cond_c
    :goto_9
    return-void
.end method

.method public final H()LD0/t;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LF0/d0;->C2()V

    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    return-object v0
.end method

.method public final H2()V
    .locals 11

    .prologue
    const/16 v0, 0x80

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {v0}, LF0/g0;->i(I)Z

    move-result v1

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {p0, v1}, LF0/d0;->M1(LF0/d0;Z)Landroidx/compose/ui/d$c;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, LF0/C;

    if-eqz v6, :cond_2

    check-cast v4, LF0/C;

    invoke-interface {v4, p0}, LF0/C;->m1(LD0/t;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    instance-of v6, v4, LF0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LX/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v9, v7}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_3

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v1, v2, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public final I2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/d0;->W:Z

    iget-object v0, p0, LF0/d0;->j0:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    invoke-virtual {p0}, LF0/d0;->O2()V

    return-void
.end method

.method public abstract J2(Lo0/q0;Lr0/c;)V
.end method

.method public K()Z
    .locals 1

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    return v0
.end method

.method public final L2(JFLx7/l;Lr0/c;)V
    .locals 8

    invoke-virtual {p0}, LD0/X;->u0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide v3

    move-object v2, p0

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, LF0/d0;->K2(JFLx7/l;Lr0/c;)V

    return-void
.end method

.method public M([F)V
    .locals 2

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-static {p0}, LD0/u;->d(LD0/t;)LD0/t;

    move-result-object v1

    invoke-direct {p0, v1}, LF0/d0;->W2(LD0/t;)LF0/d0;

    move-result-object v1

    invoke-direct {p0, v1, p1}, LF0/d0;->b3(LF0/d0;[F)V

    invoke-interface {v0, p1}, Lz0/Q;->k([F)V

    return-void
.end method

.method protected M0(JFLr0/c;)V
    .locals 11

    .prologue
    iget-boolean v0, p0, LF0/d0;->S:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/d0;->j2()LF0/U;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF0/U;->t1()J

    move-result-wide v1

    const/4 v4, 0x0

    move-object v0, p0

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LF0/d0;->K2(JFLx7/l;Lr0/c;)V

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    move-object v5, p0

    move-wide v6, p1

    move v8, p3

    move-object v10, p4

    invoke-direct/range {v5 .. v10}, LF0/d0;->K2(JFLx7/l;Lr0/c;)V

    :goto_0
    return-void
.end method

.method public final M2(Ln0/e;ZZ)V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, LF0/d0;->X:Z

    if-eqz v1, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LF0/d0;->k2()J

    move-result-wide p2

    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result p2

    div-float/2addr p2, v2

    neg-float p3, v1

    neg-float v2, p2

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v1

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/t;->f(J)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, p2

    invoke-virtual {p1, p3, v2, v3, v1}, Ln0/e;->e(FFFF)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, LF0/d0;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result p3

    int-to-float p3, p3

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, p2, p3}, Ln0/e;->e(FFFF)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Ln0/e;->f()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-interface {v0, p1, p2}, LF0/m0;->k(Ln0/e;Z)V

    :cond_3
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result p2

    invoke-virtual {p1}, Ln0/e;->b()F

    move-result p3

    int-to-float p2, p2

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ln0/e;->i(F)V

    invoke-virtual {p1}, Ln0/e;->c()F

    move-result p3

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ln0/e;->j(F)V

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-virtual {p1}, Ln0/e;->d()F

    move-result p3

    int-to-float p2, p2

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ln0/e;->k(F)V

    invoke-virtual {p1}, Ln0/e;->a()F

    move-result p3

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Ln0/e;->h(F)V

    return-void
.end method

.method public N(LD0/t;Z)Ln0/i;
    .locals 9

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LD0/t;->K()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutCoordinates "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not attached!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1}, LF0/d0;->W2(LD0/t;)LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->C2()V

    invoke-virtual {p0, v0}, LF0/d0;->a2(LF0/d0;)LF0/d0;

    move-result-object v1

    invoke-virtual {p0}, LF0/d0;->l2()Ln0/e;

    move-result-object v8

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Ln0/e;->i(F)V

    invoke-virtual {v8, v2}, Ln0/e;->k(F)V

    invoke-interface {p1}, LD0/t;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v8, v2}, Ln0/e;->j(F)V

    invoke-interface {p1}, LD0/t;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v8, p1}, Ln0/e;->h(F)V

    :goto_0
    if-eq v0, v1, :cond_3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    move-object v3, v8

    move v4, p2

    invoke-static/range {v2 .. v7}, LF0/d0;->N2(LF0/d0;Ln0/e;ZZILjava/lang/Object;)V

    invoke-virtual {v8}, Ln0/e;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {p1}, Ln0/i$a;->a()Ln0/i;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, v0, LF0/d0;->V:LF0/d0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v1, v8, p2}, LF0/d0;->S1(LF0/d0;Ln0/e;Z)V

    invoke-static {v8}, Ln0/f;->a(Ln0/e;)Ln0/i;

    move-result-object p1

    return-object p1
.end method

.method public final O2()V
    .locals 4

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/d0;->m0:Lr0/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, LF0/d0;->m0:Lr0/c;

    :cond_0
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v0, v1}, LF0/d0;->d3(LF0/d0;Lx7/l;ZILjava/lang/Object;)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final P2(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/d0;->S:Z

    return-void
.end method

.method public Q2(LD0/K;)V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/d0;->c0:LD0/K;

    if-eq p1, v0, :cond_5

    iput-object p1, p0, LF0/d0;->c0:LD0/K;

    if-eqz v0, :cond_0

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result v1

    invoke-interface {v0}, LD0/K;->getWidth()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result v1

    invoke-interface {v0}, LD0/K;->getHeight()I

    move-result v0

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result v0

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, LF0/d0;->F2(II)V

    :cond_1
    iget-object v0, p0, LF0/d0;->d0:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    :cond_3
    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LF0/d0;->d0:Ljava/util/Map;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LF0/d0;->e2()LF0/b;

    move-result-object v0

    invoke-interface {v0}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->m()V

    iget-object v0, p0, LF0/d0;->d0:Ljava/util/Map;

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LF0/d0;->d0:Ljava/util/Map;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_5
    return-void
.end method

.method public R()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LF0/d0;->W:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected R0(JFLx7/l;)V
    .locals 6

    .prologue
    iget-boolean v0, p0, LF0/d0;->S:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/U;->t1()J

    move-result-wide v1

    const/4 v5, 0x0

    move-object v0, p0

    :goto_0
    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LF0/d0;->K2(JFLx7/l;Lr0/c;)V

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    goto :goto_0

    :goto_1
    return-void
.end method

.method protected R2(J)V
    .locals 0

    iput-wide p1, p0, LF0/d0;->e0:J

    return-void
.end method

.method public final S2(LF0/d0;)V
    .locals 0

    iput-object p1, p0, LF0/d0;->U:LF0/d0;

    return-void
.end method

.method public final T2(LF0/d0;)V
    .locals 0

    iput-object p1, p0, LF0/d0;->V:LF0/d0;

    return-void
.end method

.method protected final U1(J)J
    .locals 2

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v0

    invoke-virtual {p0}, LD0/X;->D0()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-virtual {p0}, LD0/X;->x0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, Ln0/n;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final U2()Z
    .locals 11

    .prologue
    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {v1}, LF0/g0;->i(I)Z

    move-result v1

    invoke-direct {p0, v1}, LF0/d0;->t2(Z)Landroidx/compose/ui/d$c;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v3

    invoke-interface {v1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "visitLocalDescendants called on an unattached node"

    invoke-static {v4}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v4

    and-int/2addr v4, v3

    if-eqz v4, :cond_a

    :goto_0
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v3

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    move-object v5, v1

    move-object v6, v4

    :goto_1
    if-eqz v5, :cond_9

    instance-of v7, v5, LF0/v0;

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    check-cast v5, LF0/v0;

    invoke-interface {v5}, LF0/v0;->Y0()Z

    move-result v5

    if-eqz v5, :cond_8

    return v8

    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v3

    if-eqz v7, :cond_8

    instance-of v7, v5, LF0/m;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, LF0/m;

    invoke-virtual {v7}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v7

    move v9, v2

    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v3

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v8, :cond_3

    move-object v5, v7

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, LX/b;

    new-array v10, v0, [Landroidx/compose/ui/d$c;

    invoke-direct {v6, v10, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v5, v4

    :cond_5
    invoke-virtual {v6, v7}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_7
    if-ne v9, v8, :cond_8

    goto :goto_1

    :cond_8
    invoke-static {v6}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_0

    :cond_a
    return v2
.end method

.method protected final V1(JJ)F
    .locals 3

    .prologue
    invoke-virtual {p0}, LD0/X;->D0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ln0/m;->i(J)F

    move-result v1

    cmpl-float v0, v0, v1

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ltz v0, :cond_0

    invoke-virtual {p0}, LD0/X;->x0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ln0/m;->g(J)F

    move-result v2

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p3, p4}, LF0/d0;->U1(J)J

    move-result-wide p3

    invoke-static {p3, p4}, Ln0/m;->i(J)F

    move-result v0

    invoke-static {p3, p4}, Ln0/m;->g(J)F

    move-result p3

    invoke-direct {p0, p1, p2}, LF0/d0;->B2(J)J

    move-result-wide p1

    const/4 p4, 0x0

    cmpl-float v2, v0, p4

    if-gtz v2, :cond_1

    cmpl-float p4, p3, p4

    if-lez p4, :cond_2

    :cond_1
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p4

    cmpg-float p4, p4, v0

    if-gtz p4, :cond_2

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p4

    cmpg-float p3, p4, p3

    if-gtz p3, :cond_2

    invoke-static {p1, p2}, Ln0/g;->l(J)F

    move-result v1

    :cond_2
    return v1
.end method

.method public W(J)J
    .locals 3

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LD0/u;->d(LD0/t;)LD0/t;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-static {v1}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v1

    invoke-interface {v1, p1, p2}, LF0/o0;->d(J)J

    move-result-wide p1

    invoke-static {v0}, LD0/u;->e(LD0/t;)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ln0/g;->q(JJ)J

    move-result-wide p1

    invoke-virtual {p0, v0, p1, p2}, LF0/d0;->G(LD0/t;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final W1(Lo0/q0;Lr0/c;)V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LF0/m0;->b(Lo0/q0;Lr0/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v1

    int-to-float v1, v1

    invoke-interface {p1, v0, v1}, Lo0/q0;->d(FF)V

    invoke-direct {p0, p1, p2}, LF0/d0;->Y1(Lo0/q0;Lr0/c;)V

    neg-float p2, v0

    neg-float v0, v1

    invoke-interface {p1, p2, v0}, Lo0/q0;->d(FF)V

    :goto_0
    return-void
.end method

.method protected final X1(Lo0/q0;Lo0/N1;)V
    .locals 5

    new-instance v0, Ln0/i;

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float/2addr v1, v2

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v2

    invoke-direct {v0, v2, v2, v1, v3}, Ln0/i;-><init>(FFFF)V

    invoke-interface {p1, v0, p2}, Lo0/q0;->k(Ln0/i;Lo0/N1;)V

    return-void
.end method

.method public X2(JZ)J
    .locals 2

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, LF0/m0;->f(JZ)J

    move-result-wide p1

    :cond_0
    if-nez p3, :cond_1

    invoke-virtual {p0}, LF0/T;->x1()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/q;->c(JJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public Y(LD0/t;[F)V
    .locals 1

    invoke-direct {p0, p1}, LF0/d0;->W2(LD0/t;)LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LF0/d0;->C2()V

    invoke-virtual {p0, p1}, LF0/d0;->a2(LF0/d0;)LF0/d0;

    move-result-object v0

    invoke-static {p2}, Lo0/J1;->h([F)V

    invoke-direct {p1, v0, p2}, LF0/d0;->b3(LF0/d0;[F)V

    invoke-direct {p0, v0, p2}, LF0/d0;->a3(LF0/d0;[F)V

    return-void
.end method

.method public Z()Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->k0()LF0/b0;

    move-result-object v0

    const/16 v1, 0x40

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, LF0/b0;->q(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v3

    invoke-virtual {v3}, LF0/J;->k0()LF0/b0;

    move-result-object v3

    invoke-virtual {v3}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v4, v5

    if-eqz v4, :cond_7

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v4

    move-object v6, v2

    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_7

    instance-of v7, v5, LF0/r0;

    if-eqz v7, :cond_0

    check-cast v5, LF0/r0;

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v7

    invoke-virtual {v7}, LF0/J;->K()LY0/e;

    move-result-object v7

    iget-object v8, v0, Ly7/O;->C:Ljava/lang/Object;

    invoke-interface {v5, v7, v8}, LF0/r0;->G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_4

    :cond_0
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v4

    if-eqz v7, :cond_6

    instance-of v7, v5, LF0/m;

    if-eqz v7, :cond_6

    move-object v7, v5

    check-cast v7, LF0/m;

    invoke-virtual {v7}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    const/4 v10, 0x1

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_4

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_1

    move-object v5, v7

    goto :goto_3

    :cond_1
    if-nez v6, :cond_2

    new-instance v6, LX/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/d$c;

    invoke-direct {v6, v10, v8}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v6, v5}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v5, v2

    :cond_3
    invoke-virtual {v6, v7}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_5
    if-ne v9, v10, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v6}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_7
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v3

    goto :goto_0

    :cond_8
    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    return-object v0

    :cond_9
    return-object v2
.end method

.method public abstract Z1()V
.end method

.method public final Z2()Ln0/i;
    .locals 6

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0}, LD0/u;->d(LD0/t;)LD0/t;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->l2()Ln0/e;

    move-result-object v1

    invoke-virtual {p0}, LF0/d0;->k2()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LF0/d0;->U1(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v4

    neg-float v4, v4

    invoke-virtual {v1, v4}, Ln0/e;->i(F)V

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v4

    neg-float v4, v4

    invoke-virtual {v1, v4}, Ln0/e;->k(F)V

    invoke-virtual {p0}, LD0/X;->D0()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v1, v4}, Ln0/e;->j(F)V

    invoke-virtual {p0}, LD0/X;->x0()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    add-float/2addr v4, v2

    invoke-virtual {v1, v4}, Ln0/e;->h(F)V

    move-object v2, p0

    :goto_1
    if-eq v2, v0, :cond_2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v1, v3, v4}, LF0/d0;->M2(Ln0/e;ZZ)V

    invoke-virtual {v1}, Ln0/e;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v2, LF0/d0;->V:LF0/d0;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ln0/f;->a(Ln0/e;)Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final a()J
    .locals 2

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a2(LF0/d0;)LF0/d0;
    .locals 4

    .prologue
    invoke-virtual {p1}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v2

    invoke-interface {v1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "visitLocalAncestors called on an unattached node"

    invoke-static {v3}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_1

    if-ne v1, v0, :cond_1

    return-object p1

    :cond_2
    return-object p0

    :cond_3
    :goto_0
    invoke-virtual {v0}, LF0/J;->L()I

    move-result v2

    invoke-virtual {v1}, LF0/J;->L()I

    move-result v3

    if-le v2, v3, :cond_4

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v1}, LF0/J;->L()I

    move-result v2

    invoke-virtual {v0}, LF0/J;->L()I

    move-result v3

    if-le v2, v3, :cond_5

    invoke-virtual {v1}, LF0/J;->o0()LF0/J;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    :goto_2
    if-eq v0, v1, :cond_7

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    invoke-virtual {v1}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "layouts are not part of the same hierarchy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v2

    if-ne v1, v2, :cond_8

    move-object p1, p0

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    if-ne v0, v1, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v0}, LF0/J;->P()LF0/d0;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public final b0()LD0/t;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LF0/d0;->C2()V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->m0()LF0/d0;

    move-result-object v0

    iget-object v0, v0, LF0/d0;->V:LF0/d0;

    return-object v0
.end method

.method public b2(JZ)J
    .locals 2

    .prologue
    if-nez p3, :cond_0

    invoke-virtual {p0}, LF0/T;->x1()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/q;->b(JJ)J

    move-result-wide p1

    :goto_0
    iget-object p3, p0, LF0/d0;->l0:LF0/m0;

    if-eqz p3, :cond_1

    const/4 v0, 0x1

    invoke-interface {p3, p1, p2, v0}, LF0/m0;->f(JZ)J

    move-result-wide p1

    :cond_1
    return-wide p1
.end method

.method public final c3(Lx7/l;Z)V
    .locals 11

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget-object v2, p0, LF0/d0;->m0:Lr0/c;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-nez v2, :cond_2

    const-string v2, "layerBlock can\'t be provided when explicitLayer is provided"

    invoke-static {v2}, LC0/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v2

    if-nez p2, :cond_4

    iget-object p2, p0, LF0/d0;->Y:Lx7/l;

    if-ne p2, p1, :cond_4

    iget-object p2, p0, LF0/d0;->Z:LY0/e;

    invoke-virtual {v2}, LF0/J;->K()LY0/e;

    move-result-object v3

    invoke-static {p2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, LF0/d0;->a0:LY0/v;

    invoke-virtual {v2}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object v3

    if-eq p2, v3, :cond_3

    goto :goto_2

    :cond_3
    move p2, v0

    goto :goto_3

    :cond_4
    :goto_2
    move p2, v1

    :goto_3
    invoke-virtual {v2}, LF0/J;->K()LY0/e;

    move-result-object v3

    iput-object v3, p0, LF0/d0;->Z:LY0/e;

    invoke-virtual {v2}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object v3

    iput-object v3, p0, LF0/d0;->a0:LY0/v;

    invoke-virtual {v2}, LF0/J;->K0()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    if-eqz p1, :cond_6

    iput-object p1, p0, LF0/d0;->Y:Lx7/l;

    iget-object p1, p0, LF0/d0;->l0:LF0/m0;

    if-nez p1, :cond_5

    invoke-static {v2}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v5

    iget-object v6, p0, LF0/d0;->i0:Lx7/p;

    iget-object v7, p0, LF0/d0;->j0:Lx7/a;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LF0/n0;->a(LF0/o0;Lx7/p;Lx7/a;Lr0/c;ILjava/lang/Object;)LF0/m0;

    move-result-object p1

    invoke-virtual {p0}, LD0/X;->z0()J

    move-result-wide v5

    invoke-interface {p1, v5, v6}, LF0/m0;->g(J)V

    invoke-virtual {p0}, LF0/d0;->t1()J

    move-result-wide v5

    invoke-interface {p1, v5, v6}, LF0/m0;->i(J)V

    iput-object p1, p0, LF0/d0;->l0:LF0/m0;

    invoke-static {p0, v0, v1, v4}, LF0/d0;->f3(LF0/d0;ZILjava/lang/Object;)V

    invoke-virtual {v2, v1}, LF0/J;->B1(Z)V

    iget-object p1, p0, LF0/d0;->j0:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    goto :goto_4

    :cond_5
    if-eqz p2, :cond_8

    invoke-static {p0, v0, v1, v4}, LF0/d0;->f3(LF0/d0;ZILjava/lang/Object;)V

    goto :goto_4

    :cond_6
    iput-object v4, p0, LF0/d0;->Y:Lx7/l;

    iget-object p1, p0, LF0/d0;->l0:LF0/m0;

    if-eqz p1, :cond_7

    invoke-interface {p1}, LF0/m0;->destroy()V

    invoke-virtual {v2, v1}, LF0/J;->B1(Z)V

    iget-object p1, p0, LF0/d0;->j0:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v2}, LF0/J;->n0()LF0/o0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1, v2}, LF0/o0;->w(LF0/J;)V

    :cond_7
    iput-object v4, p0, LF0/d0;->l0:LF0/m0;

    iput-boolean v0, p0, LF0/d0;->k0:Z

    :cond_8
    :goto_4
    return-void
.end method

.method public e2()LF0/b;
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->r()LF0/b;

    move-result-object v0

    return-object v0
.end method

.method public final f2()Z
    .locals 1

    iget-boolean v0, p0, LF0/d0;->T:Z

    return v0
.end method

.method public final g2()Z
    .locals 1

    iget-boolean v0, p0, LF0/d0;->k0:Z

    return v0
.end method

.method protected final g3(J)Z
    .locals 3

    .prologue
    invoke-static {p1, p2}, Ln0/h;->b(J)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_1

    iget-boolean v2, p0, LF0/d0;->X:Z

    if-eqz v2, :cond_1

    invoke-interface {v0, p1, p2}, LF0/m0;->d(J)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public getDensity()F
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public h0(J)J
    .locals 7

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LF0/d0;->C2()V

    move-wide v2, p1

    move-object p1, p0

    :goto_0
    if-eqz p1, :cond_1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF0/d0;->Y2(LF0/d0;JZILjava/lang/Object;)J

    move-result-wide v2

    iget-object p1, p1, LF0/d0;->V:LF0/d0;

    goto :goto_0

    :cond_1
    return-wide v2
.end method

.method public final h2()J
    .locals 2

    invoke-virtual {p0}, LD0/X;->E0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i2()LF0/m0;
    .locals 1

    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    return-object v0
.end method

.method public abstract j2()LF0/U;
.end method

.method public k1()LF0/T;
    .locals 1

    iget-object v0, p0, LF0/d0;->U:LF0/d0;

    return-object v0
.end method

.method public final k2()J
    .locals 3

    iget-object v0, p0, LF0/d0;->Z:LY0/e;

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->s0()Landroidx/compose/ui/platform/A1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/platform/A1;->e()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LY0/e;->b1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method protected final l2()Ln0/e;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/d0;->g0:Ln0/e;

    if-nez v0, :cond_0

    new-instance v0, Ln0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ln0/e;-><init>(FFFF)V

    iput-object v0, p0, LF0/d0;->g0:Ln0/e;

    :cond_0
    return-object v0
.end method

.method public m0(LD0/t;JZ)J
    .locals 1

    .prologue
    instance-of v0, p1, LD0/E;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LD0/E;

    invoke-virtual {v0}, LD0/E;->b()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->C2()V

    invoke-static {p2, p3}, Ln0/g;->u(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3, p4}, LD0/t;->m0(LD0/t;JZ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->u(J)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-direct {p0, p1}, LF0/d0;->W2(LD0/t;)LF0/d0;

    move-result-object p1

    invoke-virtual {p1}, LF0/d0;->C2()V

    invoke-virtual {p0, p1}, LF0/d0;->a2(LF0/d0;)LF0/d0;

    move-result-object v0

    :goto_0
    if-eq p1, v0, :cond_1

    invoke-virtual {p1, p2, p3, p4}, LF0/d0;->X2(JZ)J

    move-result-wide p2

    iget-object p1, p1, LF0/d0;->V:LF0/d0;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, p2, p3, p4}, LF0/d0;->T1(LF0/d0;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public m1()LD0/t;
    .locals 0

    return-object p0
.end method

.method public n1()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/d0;->c0:LD0/K;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n2()Landroidx/compose/ui/d$c;
.end method

.method public o1()LF0/J;
    .locals 1

    iget-object v0, p0, LF0/d0;->R:LF0/J;

    return-object v0
.end method

.method public final o2()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/d0;->U:LF0/d0;

    return-object v0
.end method

.method public final p2()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    return-object v0
.end method

.method public q1()LD0/K;
    .locals 2

    .prologue
    iget-object v0, p0, LF0/d0;->c0:LD0/K;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q2()F
    .locals 1

    iget v0, p0, LF0/d0;->f0:F

    return v0
.end method

.method public r1()LF0/T;
    .locals 1

    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    return-object v0
.end method

.method public s(J)J
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/d0;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lz0/Q;->s(J)J

    move-result-wide p1

    invoke-static {p0}, LD0/u;->d(LD0/t;)LD0/t;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, LF0/d0;->G(LD0/t;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final s2(I)Landroidx/compose/ui/d$c;
    .locals 3

    .prologue
    invoke-static {p1}, LF0/g0;->i(I)Z

    move-result v0

    invoke-virtual {p0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p0, v0}, LF0/d0;->M1(LF0/d0;Z)Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, p1

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    if-eq v0, v1, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public t1()J
    .locals 2

    iget-wide v0, p0, LF0/d0;->e0:J

    return-wide v0
.end method

.method public v0()F
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method

.method public final w2(LF0/d0$f;JLF0/v;ZZ)V
    .locals 10

    .prologue
    move-object v9, p0

    move-wide v3, p2

    move-object v5, p4

    invoke-interface {p1}, LF0/d0$f;->a()I

    move-result v0

    invoke-virtual {p0, v0}, LF0/d0;->s2(I)Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {p0, p2, p3}, LF0/d0;->g3(J)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p5, :cond_6

    invoke-virtual {p0}, LF0/d0;->k2()J

    move-result-wide v6

    invoke-virtual {p0, p2, p3, v6, v7}, LF0/d0;->V1(JJ)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    invoke-virtual {p4, v8, v0}, LF0/v;->R(FZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v7, 0x0

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    :goto_0
    invoke-direct/range {v0 .. v8}, LF0/d0;->v2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    goto/16 :goto_3

    :cond_0
    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p6}, LF0/d0;->x2(LF0/d0$f;JLF0/v;ZZ)V

    goto :goto_3

    :cond_1
    invoke-virtual {p0, p2, p3}, LF0/d0;->z2(J)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v7}, LF0/d0;->u2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZ)V

    goto :goto_3

    :cond_2
    if-nez p5, :cond_3

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    :goto_1
    move v8, v0

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, LF0/d0;->k2()J

    move-result-wide v6

    invoke-virtual {p0, p2, p3, v6, v7}, LF0/d0;->V1(JJ)F

    move-result v0

    goto :goto_1

    :goto_2
    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    move/from16 v7, p6

    invoke-virtual {p4, v8, v7}, LF0/v;->R(FZ)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    goto :goto_0

    :cond_4
    move/from16 v7, p6

    :cond_5
    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v8}, LF0/d0;->V2(Landroidx/compose/ui/d$c;LF0/d0$f;JLF0/v;ZZF)V

    :cond_6
    :goto_3
    return-void
.end method

.method public x2(LF0/d0$f;JLF0/v;ZZ)V
    .locals 7

    .prologue
    iget-object v6, p0, LF0/d0;->U:LF0/d0;

    if-eqz v6, :cond_0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-wide v1, p2

    invoke-static/range {v0 .. v5}, LF0/d0;->c2(LF0/d0;JZILjava/lang/Object;)J

    move-result-wide v2

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, LF0/d0;->w2(LF0/d0$f;JLF0/v;ZZ)V

    :cond_0
    return-void
.end method

.method public y2()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/d0;->l0:LF0/m0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF0/m0;->invalidate()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF0/d0;->V:LF0/d0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->y2()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected final z2(J)Z
    .locals 2

    .prologue
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float v1, v0, p2

    if-ltz v1, :cond_0

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    invoke-virtual {p0}, LD0/X;->D0()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    invoke-virtual {p0}, LD0/X;->x0()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
