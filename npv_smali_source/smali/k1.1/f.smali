.class public final Lk1/f;
.super Lj1/e;
.source "SourceFile"


# instance fields
.field private A0:I

.field private B0:I

.field private C0:I

.field private D0:I

.field private E0:I

.field private F0:I

.field private G0:I

.field private H0:I

.field private I0:I

.field private J0:I

.field private K0:I

.field private L0:I

.field private M0:I

.field private N0:F

.field private O0:F

.field private P0:F

.field private Q0:F

.field private s0:Lm1/g;

.field private t0:Ljava/util/HashMap;

.field private u0:Ljava/util/HashMap;

.field private v0:Ljava/util/HashMap;

.field private w0:I

.field private x0:I

.field private y0:I

.field private z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;Lj1/g$e;)V
    .locals 1

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lj1/e;-><init>(Lj1/g;Lj1/g$e;)V

    const/4 p1, -0x1

    iput p1, p0, Lk1/f;->x0:I

    iput p1, p0, Lk1/f;->y0:I

    iput p1, p0, Lk1/f;->z0:I

    iput p1, p0, Lk1/f;->A0:I

    iput p1, p0, Lk1/f;->B0:I

    iput p1, p0, Lk1/f;->C0:I

    const/4 v0, 0x2

    iput v0, p0, Lk1/f;->D0:I

    iput v0, p0, Lk1/f;->E0:I

    iput p1, p0, Lk1/f;->L0:I

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lk1/f;->N0:F

    iput p1, p0, Lk1/f;->O0:F

    iput p1, p0, Lk1/f;->P0:F

    iput p1, p0, Lk1/f;->Q0:F

    sget-object p1, Lj1/g$e;->J:Lj1/g$e;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lk1/f;->M0:I

    :cond_0
    return-void
.end method


# virtual methods
.method public V0()Lm1/j;
    .locals 1

    .prologue
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    if-nez v0, :cond_0

    new-instance v0, Lm1/g;

    invoke-direct {v0}, Lm1/g;-><init>()V

    iput-object v0, p0, Lk1/f;->s0:Lm1/g;

    :cond_0
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final Z0(Ljava/lang/String;FFF)V
    .locals 2

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-super {p0, v0}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lk1/f;->t0:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/f;->t0:Ljava/util/HashMap;

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget-object v0, p0, Lk1/f;->t0:Ljava/util/HashMap;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lk1/f;->u0:Ljava/util/HashMap;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk1/f;->u0:Ljava/util/HashMap;

    :cond_2
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget-object p3, p0, Lk1/f;->u0:Ljava/util/HashMap;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lk1/f;->v0:Ljava/util/HashMap;

    if-nez p2, :cond_4

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk1/f;->v0:Ljava/util/HashMap;

    :cond_4
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget-object p3, p0, Lk1/f;->v0:Ljava/util/HashMap;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public final a1(F)V
    .locals 0

    iput p1, p0, Lk1/f;->P0:F

    return-void
.end method

.method public apply()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lk1/f;->V0()Lm1/j;

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-virtual {p0, v0}, Lj1/a;->b(Lm1/e;)V

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/f;->M0:I

    invoke-virtual {v0, v1}, Lm1/g;->k3(I)V

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/f;->w0:I

    invoke-virtual {v0, v1}, Lm1/g;->p3(I)V

    iget v0, p0, Lk1/f;->L0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->L0:I

    invoke-virtual {v0, v2}, Lm1/g;->j3(I)V

    :cond_0
    iget v0, p0, Lk1/f;->H0:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->H0:I

    invoke-virtual {v0, v2}, Lm1/l;->t2(I)V

    :cond_1
    iget v0, p0, Lk1/f;->J0:I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->J0:I

    invoke-virtual {v0, v2}, Lm1/l;->v2(I)V

    :cond_2
    iget v0, p0, Lk1/f;->I0:I

    if-eqz v0, :cond_3

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->I0:I

    invoke-virtual {v0, v2}, Lm1/l;->u2(I)V

    :cond_3
    iget v0, p0, Lk1/f;->K0:I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->K0:I

    invoke-virtual {v0, v2}, Lm1/l;->s2(I)V

    :cond_4
    iget v0, p0, Lk1/f;->G0:I

    if-eqz v0, :cond_5

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->G0:I

    invoke-virtual {v0, v2}, Lm1/g;->d3(I)V

    :cond_5
    iget v0, p0, Lk1/f;->F0:I

    if-eqz v0, :cond_6

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->F0:I

    invoke-virtual {v0, v2}, Lm1/g;->n3(I)V

    :cond_6
    invoke-virtual {p0}, Lj1/a;->G()F

    move-result v0

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v0, v0, v2

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj1/a;->G()F

    move-result v3

    invoke-virtual {v0, v3}, Lm1/g;->c3(F)V

    :goto_0
    iget v0, p0, Lk1/f;->P0:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lk1/f;->P0:F

    invoke-virtual {v0, v3}, Lm1/g;->X2(F)V

    :goto_1
    iget v0, p0, Lk1/f;->Q0:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_9

    goto :goto_2

    :cond_9
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lk1/f;->Q0:F

    invoke-virtual {v0, v3}, Lm1/g;->f3(F)V

    :goto_2
    invoke-virtual {p0}, Lj1/a;->b0()F

    move-result v0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj1/a;->b0()F

    move-result v3

    invoke-virtual {v0, v3}, Lm1/g;->m3(F)V

    :goto_3
    iget v0, p0, Lk1/f;->N0:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lk1/f;->N0:F

    invoke-virtual {v0, v3}, Lm1/g;->Z2(F)V

    :goto_4
    iget v0, p0, Lk1/f;->O0:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->O0:F

    invoke-virtual {v0, v2}, Lm1/g;->h3(F)V

    :goto_5
    iget v0, p0, Lk1/f;->E0:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_d

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v3, p0, Lk1/f;->E0:I

    invoke-virtual {v0, v3}, Lm1/g;->b3(I)V

    :cond_d
    iget v0, p0, Lk1/f;->D0:I

    if-eq v0, v2, :cond_e

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->D0:I

    invoke-virtual {v0, v2}, Lm1/g;->l3(I)V

    :cond_e
    iget v0, p0, Lk1/f;->x0:I

    if-eq v0, v1, :cond_f

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->x0:I

    invoke-virtual {v0, v2}, Lm1/g;->o3(I)V

    :cond_f
    iget v0, p0, Lk1/f;->y0:I

    if-eq v0, v1, :cond_10

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->y0:I

    invoke-virtual {v0, v2}, Lm1/g;->a3(I)V

    :cond_10
    iget v0, p0, Lk1/f;->z0:I

    if-eq v0, v1, :cond_11

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->z0:I

    invoke-virtual {v0, v2}, Lm1/g;->i3(I)V

    :cond_11
    iget v0, p0, Lk1/f;->A0:I

    if-eq v0, v1, :cond_12

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->A0:I

    invoke-virtual {v0, v2}, Lm1/g;->e3(I)V

    :cond_12
    iget v0, p0, Lk1/f;->B0:I

    if-eq v0, v1, :cond_13

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/f;->B0:I

    invoke-virtual {v0, v2}, Lm1/g;->Y2(I)V

    :cond_13
    iget v0, p0, Lk1/f;->C0:I

    if-eq v0, v1, :cond_14

    iget-object v0, p0, Lk1/f;->s0:Lm1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/f;->C0:I

    invoke-virtual {v0, v1}, Lm1/g;->g3(I)V

    :cond_14
    invoke-virtual {p0}, Lj1/e;->U0()V

    return-void
.end method

.method public final b1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->B0:I

    return-void
.end method

.method public final c1(F)V
    .locals 0

    iput p1, p0, Lk1/f;->N0:F

    return-void
.end method

.method public final d1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->y0:I

    return-void
.end method

.method public final e1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->E0:I

    return-void
.end method

.method public final f1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->G0:I

    return-void
.end method

.method public final g1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->A0:I

    return-void
.end method

.method public final h1(F)V
    .locals 0

    iput p1, p0, Lk1/f;->Q0:F

    return-void
.end method

.method public final i1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->C0:I

    return-void
.end method

.method public final j1(F)V
    .locals 0

    iput p1, p0, Lk1/f;->O0:F

    return-void
.end method

.method public final k1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->z0:I

    return-void
.end method

.method public final l1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->L0:I

    return-void
.end method

.method public final m1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->M0:I

    return-void
.end method

.method public final n1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->K0:I

    return-void
.end method

.method public final o1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->H0:I

    return-void
.end method

.method public final p1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->I0:I

    return-void
.end method

.method public final q1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->J0:I

    return-void
.end method

.method public final r1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->D0:I

    return-void
.end method

.method public final s1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->F0:I

    return-void
.end method

.method public final t1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->x0:I

    return-void
.end method

.method public final u1(I)V
    .locals 0

    iput p1, p0, Lk1/f;->w0:I

    return-void
.end method
