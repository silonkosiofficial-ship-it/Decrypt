.class public final Landroidx/compose/ui/platform/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/m0;


# instance fields
.field private C:Lr0/c;

.field private final D:Lo0/C1;

.field private final E:Landroidx/compose/ui/platform/r;

.field private F:Lx7/p;

.field private G:Lx7/a;

.field private H:J

.field private I:Z

.field private final J:[F

.field private K:[F

.field private L:Z

.field private M:LY0/e;

.field private N:LY0/v;

.field private final O:Lq0/a;

.field private P:I

.field private Q:J

.field private R:Lo0/L1;

.field private S:Lo0/Q1;

.field private T:Lo0/N1;

.field private U:Z

.field private final V:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr0/c;Lo0/C1;Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    iput-object p2, p0, Landroidx/compose/ui/platform/z0;->D:Lo0/C1;

    iput-object p3, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    iput-object p4, p0, Landroidx/compose/ui/platform/z0;->F:Lx7/p;

    iput-object p5, p0, Landroidx/compose/ui/platform/z0;->G:Lx7/a;

    const p1, 0x7fffffff

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/z0;->H:J

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, p1, p2}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->J:[F

    const/4 p1, 0x0

    const/4 p3, 0x2

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-static {p4, p1, p3, p2}, LY0/g;->b(FFILjava/lang/Object;)LY0/e;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->M:LY0/e;

    sget-object p1, LY0/v;->C:LY0/v;

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->N:LY0/v;

    new-instance p1, Lq0/a;

    invoke-direct {p1}, Lq0/a;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->O:Lq0/a;

    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/z0;->Q:J

    new-instance p1, Landroidx/compose/ui/platform/z0$a;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/z0$a;-><init>(Landroidx/compose/ui/platform/z0;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->V:Lx7/l;

    return-void
.end method

.method public static final synthetic l(Landroidx/compose/ui/platform/z0;)Lx7/p;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/z0;->F:Lx7/p;

    return-object p0
.end method

.method private final m(Lo0/q0;)V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0}, Lr0/c;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0}, Lr0/c;->n()Lo0/L1;

    move-result-object v0

    instance-of v1, v0, Lo0/L1$b;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lo0/L1$b;

    invoke-virtual {v0}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v0

    invoke-static {p1, v0, v2, v3, v4}, Lo0/p0;->e(Lo0/q0;Ln0/i;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lo0/L1$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->S:Lo0/Q1;

    if-nez v1, :cond_1

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->S:Lo0/Q1;

    :cond_1
    invoke-interface {v1}, Lo0/Q1;->a()V

    check-cast v0, Lo0/L1$c;

    invoke-virtual {v0}, Lo0/L1$c;->b()Ln0/k;

    move-result-object v0

    invoke-static {v1, v0, v4, v3, v4}, Lo0/P1;->c(Lo0/Q1;Ln0/k;Lo0/Q1$b;ILjava/lang/Object;)V

    invoke-static {p1, v1, v2, v3, v4}, Lo0/p0;->c(Lo0/q0;Lo0/Q1;IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lo0/L1$a;

    if-eqz v1, :cond_3

    check-cast v0, Lo0/L1$a;

    invoke-virtual {v0}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object v0

    invoke-static {p1, v0, v2, v3, v4}, Lo0/p0;->c(Lo0/q0;Lo0/Q1;IILjava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private final n()[F
    .locals 3

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->o()[F

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->K:[F

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v2, v1, v2}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->K:[F

    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/platform/I0;->a([F[F)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v2, v1

    :cond_1
    return-object v2
.end method

.method private final o()[F
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->r()V

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->J:[F

    return-object v0
.end method

.method private final p(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/z0;->L:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/z0;->L:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/r;->x0(LF0/m0;Z)V

    :cond_0
    return-void
.end method

.method private final q()V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/R1;->a:Landroidx/compose/ui/platform/R1;

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/R1;->a(Landroidx/compose/ui/platform/r;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void
.end method

.method private final r()V
    .locals 13

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0}, Lr0/c;->o()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/h;->d(J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v1, v2}, LY0/u;->d(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/n;->b(J)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr0/c;->o()J

    move-result-wide v1

    :goto_0
    iget-object v3, p0, Landroidx/compose/ui/platform/z0;->J:[F

    invoke-static {v3}, Lo0/J1;->h([F)V

    iget-object v3, p0, Landroidx/compose/ui/platform/z0;->J:[F

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v4, v5, v4}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v12

    invoke-static {v1, v2}, Ln0/g;->m(J)F

    move-result v6

    neg-float v7, v6

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v6

    neg-float v8, v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lo0/J1;->q([FFFFILjava/lang/Object;)V

    invoke-static {v3, v12}, Lo0/J1;->n([F[F)V

    iget-object v3, p0, Landroidx/compose/ui/platform/z0;->J:[F

    invoke-static {v4, v5, v4}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v12

    invoke-virtual {v0}, Lr0/c;->x()F

    move-result v7

    invoke-virtual {v0}, Lr0/c;->y()F

    move-result v8

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lo0/J1;->q([FFFFILjava/lang/Object;)V

    invoke-virtual {v0}, Lr0/c;->p()F

    move-result v6

    invoke-static {v12, v6}, Lo0/J1;->i([FF)V

    invoke-virtual {v0}, Lr0/c;->q()F

    move-result v6

    invoke-static {v12, v6}, Lo0/J1;->j([FF)V

    invoke-virtual {v0}, Lr0/c;->r()F

    move-result v6

    invoke-static {v12, v6}, Lo0/J1;->k([FF)V

    invoke-virtual {v0}, Lr0/c;->s()F

    move-result v7

    invoke-virtual {v0}, Lr0/c;->t()F

    move-result v8

    move-object v6, v12

    invoke-static/range {v6 .. v11}, Lo0/J1;->m([FFFFILjava/lang/Object;)V

    invoke-static {v3, v12}, Lo0/J1;->n([F[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->J:[F

    invoke-static {v4, v5, v4}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v3

    invoke-static {v1, v2}, Ln0/g;->m(J)F

    move-result v7

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v8

    move-object v6, v3

    invoke-static/range {v6 .. v11}, Lo0/J1;->q([FFFFILjava/lang/Object;)V

    invoke-static {v0, v3}, Lo0/J1;->n([F[F)V

    return-void
.end method

.method private final s()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->R:Lo0/L1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-static {v1, v0}, Lr0/f;->b(Lr0/c;Lo0/L1;)V

    instance-of v0, v0, Lo0/L1$a;

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->G:Lx7/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    :cond_1
    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->o()[F

    move-result-object v0

    invoke-static {p1, v0}, Lo0/J1;->n([F[F)V

    return-void
.end method

.method public b(Lo0/q0;Lr0/c;)V
    .locals 7

    .prologue
    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/z0;->j()V

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0}, Lr0/c;->u()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/compose/ui/platform/z0;->U:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->O:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v0, p2}, Lq0/d;->e(Lr0/c;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/z0;->O:Lq0/a;

    iget-object p2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-static {p1, p2}, Lr0/f;->a(Lq0/g;Lr0/c;)V

    goto/16 :goto_2

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p2}, Lr0/c;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/p;->h(J)I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v1}, Lr0/c;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v1

    int-to-float v6, v1

    iget-wide v1, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v1

    int-to-float v1, v1

    add-float v3, p2, v1

    iget-wide v1, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result v1

    int-to-float v1, v1

    add-float v4, v6, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v1}, Lr0/c;->i()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->T:Lo0/N1;

    if-nez v1, :cond_2

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->T:Lo0/N1;

    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v2}, Lr0/c;->i()F

    move-result v2

    invoke-interface {v1, v2}, Lo0/N1;->b(F)V

    invoke-interface {v1}, Lo0/N1;->w()Landroid/graphics/Paint;

    move-result-object v5

    move v1, p2

    move v2, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lo0/q0;->m()V

    :goto_1
    invoke-interface {p1, p2, v6}, Lo0/q0;->d(FF)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->o()[F

    move-result-object p2

    invoke-interface {p1, p2}, Lo0/q0;->o([F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p2}, Lr0/c;->k()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/z0;->m(Lo0/q0;)V

    :cond_4
    iget-object p2, p0, Landroidx/compose/ui/platform/z0;->F:Lx7/p;

    if-eqz p2, :cond_5

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {p1}, Lo0/q0;->s()V

    :goto_2
    return-void
.end method

.method public c(Lx7/p;Lx7/a;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->D:Lo0/C1;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v1}, Lr0/c;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lo0/C1;->b()Lr0/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/z0;->I:Z

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->F:Lx7/p;

    iput-object p2, p0, Landroidx/compose/ui/platform/z0;->G:Lx7/a;

    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/z0;->Q:J

    iput-boolean v0, p0, Landroidx/compose/ui/platform/z0;->U:Z

    const p1, 0x7fffffff

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/z0;->H:J

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/z0;->R:Lo0/L1;

    iput v0, p0, Landroidx/compose/ui/platform/z0;->P:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "layer should have been released before reuse"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currently reuse is only supported when we manage the layer lifecycle"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(J)Z
    .locals 7

    .prologue
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v2

    iget-object p1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Lr0/c;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Lr0/c;->n()Lo0/L1;

    move-result-object v0

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/r1;->c(Lo0/L1;FFLo0/Q1;Lo0/Q1;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public destroy()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/z0;->F:Lx7/p;

    iput-object v0, p0, Landroidx/compose/ui/platform/z0;->G:Lx7/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/z0;->I:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/z0;->p(Z)V

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->D:Lo0/C1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-interface {v0, v1}, Lo0/C1;->a(Lr0/c;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/r;->G0(LF0/m0;)Z

    :cond_0
    return-void
.end method

.method public e(Landroidx/compose/ui/graphics/d;)V
    .locals 6

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/z0;->P:I

    or-int/2addr v0, v1

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->C()LY0/v;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->N:LY0/v;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->y()LY0/e;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->M:LY0/e;

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->N0()J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/compose/ui/platform/z0;->Q:J

    :cond_0
    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->o()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->X(F)V

    :cond_1
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->E()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->Y(F)V

    :cond_2
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->f()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->J(F)V

    :cond_3
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_4

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->d0(F)V

    :cond_4
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_5

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->v()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->e0(F)V

    :cond_5
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_6

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->Z(F)V

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_6

    iget-boolean v2, p0, Landroidx/compose/ui/platform/z0;->U:Z

    if-nez v2, :cond_6

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->G:Lx7/a;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Lx7/a;->b()Ljava/lang/Object;

    :cond_6
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_7

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->k()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lr0/c;->K(J)V

    :cond_7
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_8

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->M()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lr0/c;->b0(J)V

    :cond_8
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_9

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->u()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->V(F)V

    :cond_9
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_a

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->B()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->T(F)V

    :cond_a
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_b

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->r()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->U(F)V

    :cond_b
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_c

    iget-object v2, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->x()F

    move-result v3

    invoke-virtual {v2, v3}, Lr0/c;->L(F)V

    :cond_c
    if-eqz v1, :cond_e

    iget-wide v1, p0, Landroidx/compose/ui/platform/z0;->Q:J

    sget-object v3, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v2}, Ln0/g$a;->b()J

    move-result-wide v2

    :goto_0
    invoke-virtual {v1, v2, v3}, Lr0/c;->P(J)V

    goto :goto_1

    :cond_d
    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    iget-wide v2, p0, Landroidx/compose/ui/platform/z0;->Q:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v2

    iget-wide v3, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget-wide v3, p0, Landroidx/compose/ui/platform/z0;->Q:J

    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v3

    iget-wide v4, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v4, v5}, LY0/t;->f(J)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v2, v3}, Ln0/h;->a(FF)J

    move-result-wide v2

    goto :goto_0

    :cond_e
    :goto_1
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_f

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->s()Z

    move-result v2

    invoke-virtual {v1, v2}, Lr0/c;->M(Z)V

    :cond_f
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->H()Lo0/Z1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lr0/c;->S(Lo0/Z1;)V

    :cond_10
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->t()I

    move-result v2

    sget-object v3, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v2, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v2}, Lr0/b$a;->a()I

    move-result v2

    goto :goto_2

    :cond_11
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->c()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v2, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v2}, Lr0/b$a;->c()I

    move-result v2

    goto :goto_2

    :cond_12
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/a$a;->b()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v2

    if-eqz v2, :cond_13

    sget-object v2, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v2}, Lr0/b$a;->b()I

    move-result v2

    :goto_2
    invoke-virtual {v1, v2}, Lr0/c;->N(I)V

    goto :goto_3

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not supported composition strategy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    :goto_3
    iget-object v1, p0, Landroidx/compose/ui/platform/z0;->R:Lo0/L1;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->G()Lo0/L1;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->G()Lo0/L1;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/z0;->R:Lo0/L1;

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->s()V

    const/4 v1, 0x1

    goto :goto_4

    :cond_15
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/z0;->P:I

    if-nez v0, :cond_16

    if-eqz v1, :cond_17

    :cond_16
    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->q()V

    :cond_17
    return-void
.end method

.method public f(JZ)J
    .locals 0

    .prologue
    if-eqz p3, :cond_1

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->n()[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->o()[F

    move-result-object p3

    invoke-static {p3, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public g(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {p1, p2, v0, v1}, LY0/t;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-virtual {p0}, Landroidx/compose/ui/platform/z0;->invalidate()V

    :cond_0
    return-void
.end method

.method public h([F)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->n()[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lo0/J1;->n([F[F)V

    :cond_0
    return-void
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0, p1, p2}, Lr0/c;->c0(J)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->q()V

    return-void
.end method

.method public invalidate()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/z0;->L:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/ui/platform/z0;->I:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->E:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/z0;->p(Z)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 9

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/z0;->L:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Landroidx/compose/ui/platform/z0;->Q:J

    sget-object v2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    invoke-virtual {v0}, Lr0/c;->v()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v0, v1, v2, v3}, LY0/t;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    iget-wide v1, p0, Landroidx/compose/ui/platform/z0;->Q:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iget-wide v2, p0, Landroidx/compose/ui/platform/z0;->Q:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v2

    iget-wide v3, p0, Landroidx/compose/ui/platform/z0;->H:J

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v1, v2}, Ln0/h;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lr0/c;->P(J)V

    :cond_0
    iget-object v3, p0, Landroidx/compose/ui/platform/z0;->C:Lr0/c;

    iget-object v4, p0, Landroidx/compose/ui/platform/z0;->M:LY0/e;

    iget-object v5, p0, Landroidx/compose/ui/platform/z0;->N:LY0/v;

    iget-wide v6, p0, Landroidx/compose/ui/platform/z0;->H:J

    iget-object v8, p0, Landroidx/compose/ui/platform/z0;->V:Lx7/l;

    invoke-virtual/range {v3 .. v8}, Lr0/c;->E(LY0/e;LY0/v;JLx7/l;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/z0;->p(Z)V

    :cond_1
    return-void
.end method

.method public k(Ln0/e;Z)V
    .locals 0

    .prologue
    if-eqz p2, :cond_1

    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->n()[F

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Ln0/e;->g(FFFF)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Lo0/J1;->g([FLn0/e;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/z0;->o()[F

    move-result-object p2

    invoke-static {p2, p1}, Lo0/J1;->g([FLn0/e;)V

    :goto_0
    return-void
.end method
