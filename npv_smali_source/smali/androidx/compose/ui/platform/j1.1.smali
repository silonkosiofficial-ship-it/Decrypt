.class public final Landroidx/compose/ui/platform/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/m0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/j1$b;
    }
.end annotation


# static fields
.field public static final P:Landroidx/compose/ui/platform/j1$b;

.field public static final Q:I

.field private static final R:Lx7/p;


# instance fields
.field private final C:Landroidx/compose/ui/platform/r;

.field private D:Lx7/p;

.field private E:Lx7/a;

.field private F:Z

.field private final G:Landroidx/compose/ui/platform/P0;

.field private H:Z

.field private I:Z

.field private J:Lo0/N1;

.field private final K:Landroidx/compose/ui/platform/K0;

.field private final L:Lo0/r0;

.field private M:J

.field private final N:Landroidx/compose/ui/platform/s0;

.field private O:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/j1$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/j1$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/platform/j1;->P:Landroidx/compose/ui/platform/j1$b;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/j1;->Q:I

    sget-object v0, Landroidx/compose/ui/platform/j1$a;->D:Landroidx/compose/ui/platform/j1$a;

    sput-object v0, Landroidx/compose/ui/platform/j1;->R:Lx7/p;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;Lx7/p;Lx7/a;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->D:Lx7/p;

    iput-object p3, p0, Landroidx/compose/ui/platform/j1;->E:Lx7/a;

    new-instance p2, Landroidx/compose/ui/platform/P0;

    invoke-direct {p2}, Landroidx/compose/ui/platform/P0;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    new-instance p2, Landroidx/compose/ui/platform/K0;

    sget-object p3, Landroidx/compose/ui/platform/j1;->R:Lx7/p;

    invoke-direct {p2, p3}, Landroidx/compose/ui/platform/K0;-><init>(Lx7/p;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    new-instance p2, Lo0/r0;

    invoke-direct {p2}, Lo0/r0;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->L:Lo0/r0;

    sget-object p2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Landroidx/compose/ui/platform/j1;->M:J

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    if-lt p2, p3, :cond_0

    new-instance p2, Landroidx/compose/ui/platform/h1;

    invoke-direct {p2, p1}, Landroidx/compose/ui/platform/h1;-><init>(Landroidx/compose/ui/platform/r;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/compose/ui/platform/U0;

    invoke-direct {p2, p1}, Landroidx/compose/ui/platform/U0;-><init>(Landroidx/compose/ui/platform/r;)V

    :goto_0
    const/4 p1, 0x1

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/s0;->F(Z)Z

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/s0;->u(Z)V

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    return-void
.end method

.method private final l(Lo0/q0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/P0;->a(Lo0/q0;)V

    :cond_1
    return-void
.end method

.method private final m(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/j1;->F:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/j1;->F:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/r;->x0(LF0/m0;Z)V

    :cond_0
    return-void
.end method

.method private final n()V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/R1;->a:Landroidx/compose/ui/platform/R1;

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/R1;->a(Landroidx/compose/ui/platform/r;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/K0;->b(Ljava/lang/Object;)[F

    move-result-object v0

    invoke-static {p1, v0}, Lo0/J1;->n([F[F)V

    return-void
.end method

.method public b(Lo0/q0;Lr0/c;)V
    .locals 8

    .prologue
    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p2

    const/4 v6, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/j1;->j()V

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/s0;->J()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-lez p2, :cond_0

    const/4 v6, 0x1

    :cond_0
    iput-boolean v6, p0, Landroidx/compose/ui/platform/j1;->I:Z

    if-eqz v6, :cond_1

    invoke-interface {p1}, Lo0/q0;->v()V

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p2, v0}, Landroidx/compose/ui/platform/s0;->s(Landroid/graphics/Canvas;)V

    iget-boolean p2, p0, Landroidx/compose/ui/platform/j1;->I:Z

    if-eqz p2, :cond_6

    invoke-interface {p1}, Lo0/q0;->n()V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/s0;->f()I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->B()I

    move-result v1

    int-to-float v7, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->o()I

    move-result v1

    int-to-float v3, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->r()I

    move-result v1

    int-to-float v4, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->a()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->J:Lo0/N1;

    if-nez v1, :cond_3

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/j1;->J:Lo0/N1;

    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/s0;->a()F

    move-result v2

    invoke-interface {v1, v2}, Lo0/N1;->b(F)V

    invoke-interface {v1}, Lo0/N1;->w()Landroid/graphics/Paint;

    move-result-object v5

    move v1, p2

    move v2, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Lo0/q0;->m()V

    :goto_0
    invoke-interface {p1, p2, v7}, Lo0/q0;->d(FF)V

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/K0;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-interface {p1, p2}, Lo0/q0;->o([F)V

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/j1;->l(Lo0/q0;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->D:Lx7/p;

    if-eqz p2, :cond_5

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-direct {p0, v6}, Landroidx/compose/ui/platform/j1;->m(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public c(Lx7/p;Lx7/a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/j1;->m(Z)V

    iput-boolean v0, p0, Landroidx/compose/ui/platform/j1;->H:Z

    iput-boolean v0, p0, Landroidx/compose/ui/platform/j1;->I:Z

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/j1;->M:J

    iput-object p1, p0, Landroidx/compose/ui/platform/j1;->D:Lx7/p;

    iput-object p2, p0, Landroidx/compose/ui/platform/j1;->E:Lx7/a;

    return-void
.end method

.method public d(J)Z
    .locals 4

    .prologue
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/s0;->A()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    cmpg-float p2, p1, v0

    if-gtz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/s0;->getWidth()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p1}, Landroidx/compose/ui/platform/s0;->getHeight()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/P0;->f(J)Z

    move-result p1

    return p1

    :cond_2
    return v3
.end method

.method public destroy()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->i()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/j1;->D:Lx7/p;

    iput-object v0, p0, Landroidx/compose/ui/platform/j1;->E:Lx7/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/j1;->H:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/j1;->m(Z)V

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->I0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/r;->G0(LF0/m0;)Z

    return-void
.end method

.method public e(Landroidx/compose/ui/graphics/d;)V
    .locals 13

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/j1;->O:I

    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->N0()J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/compose/ui/platform/j1;->M:J

    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/s0;->D()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/P0;->e()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_2

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->o()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->h(F)V

    :cond_2
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_3

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->E()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->g(F)V

    :cond_3
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_4

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->f()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->b(F)V

    :cond_4
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_5

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->j(F)V

    :cond_5
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_6

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->v()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->e(F)V

    :cond_6
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_7

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->x(F)V

    :cond_7
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_8

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->k()J

    move-result-wide v6

    invoke-static {v6, v7}, Lo0/A0;->k(J)I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->C(I)V

    :cond_8
    and-int/lit16 v5, v0, 0x80

    if-eqz v5, :cond_9

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->M()J

    move-result-wide v6

    invoke-static {v6, v7}, Lo0/A0;->k(J)I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->H(I)V

    :cond_9
    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_a

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->u()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->d(F)V

    :cond_a
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_b

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->B()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->n(F)V

    :cond_b
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_c

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->r()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->c(F)V

    :cond_c
    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_d

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->x()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->m(F)V

    :cond_d
    if-eqz v1, :cond_e

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-wide v5, p0, Landroidx/compose/ui/platform/j1;->M:J

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v6}, Landroidx/compose/ui/platform/s0;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-interface {v1, v5}, Landroidx/compose/ui/platform/s0;->t(F)V

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-wide v5, p0, Landroidx/compose/ui/platform/j1;->M:J

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v6}, Landroidx/compose/ui/platform/s0;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-interface {v1, v5}, Landroidx/compose/ui/platform/s0;->w(F)V

    :cond_e
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->s()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->K()Lo0/e2;

    move-result-object v1

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v5

    if-eq v1, v5, :cond_f

    move v1, v4

    goto :goto_1

    :cond_f
    move v1, v3

    :goto_1
    and-int/lit16 v5, v0, 0x6000

    if-eqz v5, :cond_11

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v5, v1}, Landroidx/compose/ui/platform/s0;->E(Z)V

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->s()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->K()Lo0/e2;

    move-result-object v6

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v7

    if-ne v6, v7, :cond_10

    move v6, v4

    goto :goto_2

    :cond_10
    move v6, v3

    :goto_2
    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->u(Z)V

    :cond_11
    const/high16 v5, 0x20000

    and-int/2addr v5, v0

    if-eqz v5, :cond_12

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->H()Lo0/Z1;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->l(Lo0/Z1;)V

    :cond_12
    const v5, 0x8000

    and-int/2addr v5, v0

    if-eqz v5, :cond_13

    iget-object v5, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->t()I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/s0;->q(I)V

    :cond_13
    iget-object v6, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->G()Lo0/L1;

    move-result-object v7

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->f()F

    move-result v8

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v10

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->i()J

    move-result-wide v11

    move v9, v1

    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/platform/P0;->h(Lo0/L1;FZFJ)Z

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/P0;->c()Z

    move-result v6

    if-eqz v6, :cond_14

    iget-object v6, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-object v7, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v7}, Landroidx/compose/ui/platform/P0;->b()Landroid/graphics/Outline;

    move-result-object v7

    invoke-interface {v6, v7}, Landroidx/compose/ui/platform/s0;->z(Landroid/graphics/Outline;)V

    :cond_14
    if-eqz v1, :cond_15

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/P0;->e()Z

    move-result v1

    if-nez v1, :cond_15

    move v3, v4

    :cond_15
    if-ne v2, v3, :cond_17

    if-eqz v3, :cond_16

    if-eqz v5, :cond_16

    goto :goto_3

    :cond_16
    invoke-direct {p0}, Landroidx/compose/ui/platform/j1;->n()V

    goto :goto_4

    :cond_17
    :goto_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/j1;->invalidate()V

    :goto_4
    iget-boolean v1, p0, Landroidx/compose/ui/platform/j1;->I:Z

    if-nez v1, :cond_18

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->J()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_18

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->E:Lx7/a;

    if-eqz v1, :cond_18

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_18
    and-int/lit16 v0, v0, 0x1f1b

    if-eqz v0, :cond_19

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/K0;->c()V

    :cond_19
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/j1;->O:I

    return-void
.end method

.method public f(JZ)J
    .locals 1

    .prologue
    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/K0;->a(Ljava/lang/Object;)[F

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
    iget-object p3, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/K0;->b(Ljava/lang/Object;)[F

    move-result-object p3

    invoke-static {p3, p1, p2}, Lo0/J1;->f([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public g(J)V
    .locals 4

    .prologue
    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result v0

    invoke-static {p1, p2}, LY0/t;->f(J)I

    move-result p1

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-wide v1, p0, Landroidx/compose/ui/platform/j1;->M:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v1

    int-to-float v2, v0

    mul-float/2addr v1, v2

    invoke-interface {p2, v1}, Landroidx/compose/ui/platform/s0;->t(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-wide v1, p0, Landroidx/compose/ui/platform/j1;->M:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v1

    int-to-float v2, p1

    mul-float/2addr v1, v2

    invoke-interface {p2, v1}, Landroidx/compose/ui/platform/s0;->w(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/s0;->f()I

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/s0;->B()I

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v3}, Landroidx/compose/ui/platform/s0;->f()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->B()I

    move-result v0

    add-int/2addr v0, p1

    invoke-interface {p2, v1, v2, v3, v0}, Landroidx/compose/ui/platform/s0;->v(IIII)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/P0;->b()Landroid/graphics/Outline;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/compose/ui/platform/s0;->z(Landroid/graphics/Outline;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/j1;->invalidate()V

    iget-object p1, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/K0;->c()V

    :cond_0
    return-void
.end method

.method public h([F)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/K0;->a(Ljava/lang/Object;)[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lo0/J1;->n([F[F)V

    :cond_0
    return-void
.end method

.method public i(J)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->f()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/s0;->B()I

    move-result v1

    invoke-static {p1, p2}, LY0/p;->h(J)I

    move-result v2

    invoke-static {p1, p2}, LY0/p;->i(J)I

    move-result p1

    if-ne v0, v2, :cond_0

    if-eq v1, p1, :cond_3

    :cond_0
    if-eq v0, v2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    sub-int/2addr v2, v0

    invoke-interface {p2, v2}, Landroidx/compose/ui/platform/s0;->p(I)V

    :cond_1
    if-eq v1, p1, :cond_2

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    sub-int/2addr p1, v1

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/s0;->y(I)V

    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/platform/j1;->n()V

    iget-object p1, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/K0;->c()V

    :cond_3
    return-void
.end method

.method public invalidate()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/j1;->F:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/ui/platform/j1;->H:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->C:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/j1;->m(Z)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 5

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/j1;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->k()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/s0;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/P0;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->G:Landroidx/compose/ui/platform/P0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/P0;->d()Lo0/Q1;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/platform/j1;->D:Lx7/p;

    if-eqz v1, :cond_2

    iget-object v2, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    iget-object v3, p0, Landroidx/compose/ui/platform/j1;->L:Lo0/r0;

    new-instance v4, Landroidx/compose/ui/platform/j1$c;

    invoke-direct {v4, v1}, Landroidx/compose/ui/platform/j1$c;-><init>(Lx7/p;)V

    invoke-interface {v2, v3, v0, v4}, Landroidx/compose/ui/platform/s0;->G(Lo0/r0;Lo0/Q1;Lx7/l;)V

    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/j1;->m(Z)V

    :cond_3
    return-void
.end method

.method public k(Ln0/e;Z)V
    .locals 1

    .prologue
    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/K0;->a(Ljava/lang/Object;)[F

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Ln0/e;->g(FFFF)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Lo0/J1;->g([FLn0/e;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/j1;->K:Landroidx/compose/ui/platform/K0;

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->N:Landroidx/compose/ui/platform/s0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/K0;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-static {p2, p1}, Lo0/J1;->g([FLn0/e;)V

    :goto_0
    return-void
.end method
