.class public final Landroidx/compose/ui/graphics/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/graphics/c;


# instance fields
.field private C:I

.field private D:F

.field private E:F

.field private F:F

.field private G:F

.field private H:F

.field private I:F

.field private J:J

.field private K:J

.field private L:F

.field private M:F

.field private N:F

.field private O:F

.field private P:J

.field private Q:Lo0/e2;

.field private R:Z

.field private S:I

.field private T:J

.field private U:LY0/e;

.field private V:LY0/v;

.field private W:Lo0/L1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/compose/ui/graphics/d;->D:F

    iput v0, p0, Landroidx/compose/ui/graphics/d;->E:F

    iput v0, p0, Landroidx/compose/ui/graphics/d;->F:F

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->J:J

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->K:J

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, p0, Landroidx/compose/ui/graphics/d;->O:F

    sget-object v1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->P:J

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/graphics/d;->Q:Lo0/e2;

    sget-object v1, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v1

    iput v1, p0, Landroidx/compose/ui/graphics/d;->S:I

    sget-object v1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v1}, Ln0/m$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->T:J

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LY0/g;->b(FFILjava/lang/Object;)LY0/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    sget-object v0, LY0/v;->C:LY0/v;

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->V:LY0/v;

    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/d;->R:Z

    if-eq v0, p1, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput-boolean p1, p0, Landroidx/compose/ui/graphics/d;->R:Z

    :cond_0
    return-void
.end method

.method public B()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->L:F

    return v0
.end method

.method public synthetic B0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->g(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public final C()LY0/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->V:LY0/v;

    return-object v0
.end method

.method public D(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->K:J

    invoke-static {v0, v1, p1, p2}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->K:J

    :cond_0
    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->E:F

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    return v0
.end method

.method public final G()Lo0/L1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->W:Lo0/L1;

    return-object v0
.end method

.method public H()Lo0/Z1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public J()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->I:F

    return v0
.end method

.method public K()Lo0/e2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->Q:Lo0/e2;

    return-object v0
.end method

.method public synthetic K0(J)I
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->a(LY0/e;J)I

    move-result p1

    return p1
.end method

.method public M()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->K:J

    return-wide v0
.end method

.method public final N()V
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->h(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->g(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->b(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->j(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->e(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->p(F)V

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/d;->w(J)V

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/d;->D(J)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->n(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->c(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->d(F)V

    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->m(F)V

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/d;->T0(J)V

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->l0(Lo0/e2;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->A(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/compose/ui/graphics/d;->l(Lo0/Z1;)V

    sget-object v2, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/compose/ui/graphics/d;->q(I)V

    sget-object v2, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v2}, Ln0/m$a;->a()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/graphics/d;->S(J)V

    iput-object v1, p0, Landroidx/compose/ui/graphics/d;->W:Lo0/L1;

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    return-void
.end method

.method public N0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->P:J

    return-wide v0
.end method

.method public synthetic O(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/m;->b(LY0/n;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic P(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->e(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Q(LY0/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    return-void
.end method

.method public final R(LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->V:LY0/v;

    return-void
.end method

.method public S(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->T:J

    return-void
.end method

.method public synthetic S0(F)I
    .locals 0

    invoke-static {p0, p1}, LY0/d;->b(LY0/e;F)I

    move-result p1

    return p1
.end method

.method public final T()V
    .locals 5

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/d;->K()Lo0/e2;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/d;->i()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/compose/ui/graphics/d;->V:LY0/v;

    iget-object v4, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    invoke-interface {v0, v1, v2, v3, v4}, Lo0/e2;->a(JLY0/v;LY0/e;)Lo0/L1;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->W:Lo0/L1;

    return-void
.end method

.method public T0(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->P:J

    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->P:J

    :cond_0
    return-void
.end method

.method public synthetic X(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/m;->a(LY0/n;J)F

    move-result p1

    return p1
.end method

.method public b(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->F:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->F:F

    :goto_0
    return-void
.end method

.method public synthetic b1(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->h(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->M:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->M:F

    :goto_0
    return-void
.end method

.method public d(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->N:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->N:F

    :goto_0
    return-void
.end method

.method public e(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->H:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->H:F

    :goto_0
    return-void
.end method

.method public f()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->F:F

    return v0
.end method

.method public g(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->E:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->E:F

    :goto_0
    return-void
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public h(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->D:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->D:F

    :goto_0
    return-void
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->T:J

    return-wide v0
.end method

.method public j(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->G:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->G:F

    :goto_0
    return-void
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->J:J

    return-wide v0
.end method

.method public synthetic k0(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/d;->i(LY0/e;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public l(Lo0/Z1;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/compose/ui/graphics/d;->C:I

    const/high16 v0, 0x20000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/ui/graphics/d;->C:I

    :cond_0
    return-void
.end method

.method public l0(Lo0/e2;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->Q:Lo0/e2;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->Q:Lo0/e2;

    :cond_0
    return-void
.end method

.method public m(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->O:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->O:F

    :goto_0
    return-void
.end method

.method public n(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->L:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->L:F

    :goto_0
    return-void
.end method

.method public o()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->D:F

    return v0
.end method

.method public synthetic o0(I)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->d(LY0/e;I)F

    move-result p1

    return p1
.end method

.method public p(F)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->I:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->I:F

    :goto_0
    return-void
.end method

.method public q(I)V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/compose/ui/graphics/d;->S:I

    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->S:I

    :cond_0
    return-void
.end method

.method public synthetic q0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->c(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public r()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->M:F

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/d;->R:Z

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->S:I

    return v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->N:F

    return v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->H:F

    return v0
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method

.method public w(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->J:J

    invoke-static {v0, v1, p1, p2}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Landroidx/compose/ui/graphics/d;->C:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->J:J

    :cond_0
    return-void
.end method

.method public x()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->O:F

    return v0
.end method

.method public final y()LY0/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->U:LY0/e;

    return-object v0
.end method

.method public z()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->G:F

    return v0
.end method
