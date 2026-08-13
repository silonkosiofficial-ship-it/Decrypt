.class public final LF0/x;
.super LF0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/x$a;,
        LF0/x$b;
    }
.end annotation


# static fields
.field public static final x0:LF0/x$a;

.field private static final y0:Lo0/N1;


# instance fields
.field private final v0:LF0/C0;

.field private w0:LF0/U;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF0/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/x$a;-><init>(Ly7/k;)V

    sput-object v0, LF0/x;->x0:LF0/x$a;

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->e()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lo0/N1;->G(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lo0/N1;->I(F)V

    sget-object v1, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v1}, Lo0/O1$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->F(I)V

    sput-object v0, LF0/x;->y0:Lo0/N1;

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, LF0/d0;-><init>(LF0/J;)V

    new-instance v0, LF0/C0;

    invoke-direct {v0}, LF0/C0;-><init>()V

    iput-object v0, p0, LF0/x;->v0:LF0/C0;

    invoke-virtual {p0}, LF0/x;->h3()LF0/C0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {p1}, LF0/J;->b0()LF0/J;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, LF0/x$b;

    invoke-direct {p1, p0}, LF0/x$b;-><init>(LF0/x;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LF0/x;->w0:LF0/U;

    return-void
.end method

.method private final i3()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/T;->z1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LF0/d0;->H2()V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->d0()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->F1()V

    return-void
.end method


# virtual methods
.method public J2(Lo0/q0;Lr0/c;)V
    .locals 6

    .prologue
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->v0()LX/b;

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

    invoke-virtual {v4}, LF0/J;->k()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, p1, p2}, LF0/J;->B(Lo0/q0;Lr0/c;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    invoke-interface {v0}, LF0/o0;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, LF0/x;->y0:Lo0/N1;

    invoke-virtual {p0, p1, p2}, LF0/d0;->X1(Lo0/q0;Lo0/N1;)V

    :cond_3
    return-void
.end method

.method protected M0(JFLr0/c;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LF0/d0;->M0(JFLr0/c;)V

    invoke-direct {p0}, LF0/x;->i3()V

    return-void
.end method

.method protected R0(JFLx7/l;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, LF0/d0;->R0(JFLx7/l;)V

    invoke-direct {p0}, LF0/x;->i3()V

    return-void
.end method

.method public S(I)I
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->b1(I)I

    move-result p1

    return p1
.end method

.method public T(I)I
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->X0(I)I

    move-result p1

    return p1
.end method

.method public U(J)LD0/X;
    .locals 5

    .prologue
    invoke-virtual {p0}, LF0/d0;->f2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF0/x;->j2()LF0/U;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF0/U;->J1()J

    move-result-wide p1

    :cond_0
    invoke-static {p0, p1, p2}, LF0/d0;->Q1(LF0/d0;J)V

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->w0()LX/b;

    move-result-object v0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_1
    aget-object v3, v0, v2

    check-cast v3, LF0/J;

    invoke-virtual {v3}, LF0/J;->d0()LF0/O$b;

    move-result-object v3

    sget-object v4, LF0/J$g;->E:LF0/J$g;

    invoke-virtual {v3, v4}, LF0/O$b;->L1(LF0/J$g;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_1

    :cond_2
    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->f0()LD0/I;

    move-result-object v0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->G()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/d0;->Q2(LD0/K;)V

    invoke-virtual {p0}, LF0/d0;->G2()V

    return-object p0
.end method

.method public Z1()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/x;->j2()LF0/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LF0/x$b;

    invoke-direct {v0, p0}, LF0/x$b;-><init>(LF0/x;)V

    invoke-virtual {p0, v0}, LF0/x;->j3(LF0/U;)V

    :cond_0
    return-void
.end method

.method public f1(LD0/a;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/x;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LF0/T;->f1(LD0/a;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/d0;->e2()LF0/b;

    move-result-object v0

    invoke-interface {v0}, LF0/b;->y()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/high16 p1, -0x80000000

    :goto_0
    return p1
.end method

.method public h3()LF0/C0;
    .locals 1

    iget-object v0, p0, LF0/x;->v0:LF0/C0;

    return-object v0
.end method

.method public j2()LF0/U;
    .locals 1

    iget-object v0, p0, LF0/x;->w0:LF0/U;

    return-object v0
.end method

.method protected j3(LF0/U;)V
    .locals 0

    iput-object p1, p0, LF0/x;->w0:LF0/U;

    return-void
.end method

.method public n0(I)I
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->a1(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic n2()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, LF0/x;->h3()LF0/C0;

    move-result-object v0

    return-object v0
.end method

.method public t(I)I
    .locals 1

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0, p1}, LF0/J;->W0(I)I

    move-result p1

    return p1
.end method

.method public x2(LF0/d0$f;JLF0/v;ZZ)V
    .locals 15

    .prologue
    move-object v0, p0

    move-wide/from16 v8, p2

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    move-object/from16 v10, p1

    invoke-interface {v10, v1}, LF0/d0$f;->c(LF0/J;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0, v8, v9}, LF0/d0;->g3(J)Z

    move-result v1

    if-eqz v1, :cond_0

    move/from16 v11, p6

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p0}, LF0/d0;->k2()J

    move-result-wide v4

    invoke-virtual {p0, v8, v9, v4, v5}, LF0/d0;->V1(JJ)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    move v11, v3

    goto :goto_0

    :cond_1
    move/from16 v11, p6

    :goto_1
    if-eqz v3, :cond_6

    invoke-static/range {p4 .. p4}, LF0/v;->e(LF0/v;)I

    move-result v12

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->v0()LX/b;

    move-result-object v1

    invoke-virtual {v1}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_4

    sub-int/2addr v3, v2

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v13

    move v14, v3

    :cond_2
    aget-object v1, v13, v14

    move-object v2, v1

    check-cast v2, LF0/J;

    invoke-virtual {v2}, LF0/J;->k()Z

    move-result v1

    if-eqz v1, :cond_5

    move-object/from16 v1, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move v7, v11

    invoke-interface/range {v1 .. v7}, LF0/d0$f;->b(LF0/J;JLF0/v;ZZ)V

    invoke-virtual/range {p4 .. p4}, LF0/v;->N()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual/range {p4 .. p4}, LF0/v;->E()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p4 .. p4}, LF0/v;->d()V

    goto :goto_3

    :cond_4
    :goto_2
    move-object/from16 v1, p4

    goto :goto_4

    :cond_5
    :goto_3
    add-int/lit8 v14, v14, -0x1

    if-gez v14, :cond_2

    goto :goto_2

    :goto_4
    invoke-static {v1, v12}, LF0/v;->g(LF0/v;I)V

    :cond_6
    return-void
.end method
