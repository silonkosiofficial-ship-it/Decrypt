.class public final Li8/q$c;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private F:I

.field private G:Ljava/util/List;

.field private H:Z

.field private I:I

.field private J:Li8/q;

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:Li8/q;

.field private Q:I

.field private R:Li8/q;

.field private S:I

.field private T:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/q$c;->J:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/q$c;->P:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/q$c;->R:Li8/q;

    invoke-direct {p0}, Li8/q$c;->z()V

    return-void
.end method

.method static synthetic t()Li8/q$c;
    .locals 1

    invoke-static {}, Li8/q$c;->x()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/q$c;
    .locals 1

    new-instance v0, Li8/q$c;

    invoke-direct {v0}, Li8/q$c;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/q$c;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/q$c;->G:Ljava/util/List;

    iget v0, p0, Li8/q$c;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/q$c;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Li8/q;)Li8/q$c;
    .locals 3

    .prologue
    iget v0, p0, Li8/q$c;->F:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/q$c;->R:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/q$c;->R:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/q$c;->R:Li8/q;

    iget p1, p0, Li8/q$c;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/q$c;->F:I

    return-object p0
.end method

.method public B(Li8/q;)Li8/q$c;
    .locals 3

    .prologue
    iget v0, p0, Li8/q$c;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/q$c;->J:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/q$c;->J:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/q$c;->J:Li8/q;

    iget p1, p0, Li8/q$c;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/q$c;->F:I

    return-object p0
.end method

.method public C(Li8/q;)Li8/q$c;
    .locals 2

    .prologue
    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Li8/q;->A(Li8/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Li8/q;->A(Li8/q;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/q$c;->G:Ljava/util/List;

    iget v0, p0, Li8/q$c;->F:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Li8/q$c;->F:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Li8/q$c;->y()V

    iget-object v0, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-static {p1}, Li8/q;->A(Li8/q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-virtual {p1}, Li8/q;->r0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/q;->d0()Z

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->L(Z)Li8/q$c;

    :cond_3
    invoke-virtual {p1}, Li8/q;->o0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/q;->a0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->J(I)Li8/q$c;

    :cond_4
    invoke-virtual {p1}, Li8/q;->p0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/q;->b0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/q$c;->B(Li8/q;)Li8/q$c;

    :cond_5
    invoke-virtual {p1}, Li8/q;->q0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Li8/q;->c0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->K(I)Li8/q$c;

    :cond_6
    invoke-virtual {p1}, Li8/q;->m0()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Li8/q;->W()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->H(I)Li8/q$c;

    :cond_7
    invoke-virtual {p1}, Li8/q;->v0()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Li8/q;->i0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->P(I)Li8/q$c;

    :cond_8
    invoke-virtual {p1}, Li8/q;->w0()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Li8/q;->j0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->Q(I)Li8/q$c;

    :cond_9
    invoke-virtual {p1}, Li8/q;->u0()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Li8/q;->h0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->O(I)Li8/q$c;

    :cond_a
    invoke-virtual {p1}, Li8/q;->s0()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Li8/q;->e0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/q$c;->F(Li8/q;)Li8/q$c;

    :cond_b
    invoke-virtual {p1}, Li8/q;->t0()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Li8/q;->f0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->M(I)Li8/q$c;

    :cond_c
    invoke-virtual {p1}, Li8/q;->k0()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Li8/q;->R()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/q$c;->A(Li8/q;)Li8/q$c;

    :cond_d
    invoke-virtual {p1}, Li8/q;->l0()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Li8/q;->S()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->G(I)Li8/q$c;

    :cond_e
    invoke-virtual {p1}, Li8/q;->n0()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Li8/q;->Z()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$c;->I(I)Li8/q$c;

    :cond_f
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/q;->Q(Li8/q;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public E(Lp8/e;Lp8/g;)Li8/q$c;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/q;->X:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Lp8/k;->a()Lp8/p;

    move-result-object p2

    check-cast p2, Li8/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    :cond_1
    throw p1
.end method

.method public F(Li8/q;)Li8/q$c;
    .locals 3

    .prologue
    iget v0, p0, Li8/q$c;->F:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/q$c;->P:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/q$c;->P:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/q$c;->P:Li8/q;

    iget p1, p0, Li8/q$c;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/q$c;->F:I

    return-object p0
.end method

.method public G(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->S:I

    return-object p0
.end method

.method public H(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->L:I

    return-object p0
.end method

.method public I(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->T:I

    return-object p0
.end method

.method public J(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->I:I

    return-object p0
.end method

.method public K(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->K:I

    return-object p0
.end method

.method public L(Z)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/q$c;->F:I

    iput-boolean p1, p0, Li8/q$c;->H:Z

    return-object p0
.end method

.method public M(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->Q:I

    return-object p0
.end method

.method public O(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->O:I

    return-object p0
.end method

.method public P(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->M:I

    return-object p0
.end method

.method public Q(I)Li8/q$c;
    .locals 1

    iget v0, p0, Li8/q$c;->F:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Li8/q$c;->F:I

    iput p1, p0, Li8/q$c;->N:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/q$c;->w()Li8/q$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/q$c;->E(Lp8/e;Lp8/g;)Li8/q$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/q$c;->u()Li8/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/q;

    invoke-virtual {p0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/q;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/q$c;->v()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/q;
    .locals 5

    .prologue
    new-instance v0, Li8/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/q;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/q$c;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/q$c;->G:Ljava/util/List;

    iget v2, p0, Li8/q$c;->F:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Li8/q$c;->F:I

    :cond_0
    iget-object v2, p0, Li8/q$c;->G:Ljava/util/List;

    invoke-static {v0, v2}, Li8/q;->B(Li8/q;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-boolean v2, p0, Li8/q$c;->H:Z

    invoke-static {v0, v2}, Li8/q;->C(Li8/q;Z)Z

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget v2, p0, Li8/q$c;->I:I

    invoke-static {v0, v2}, Li8/q;->D(Li8/q;I)I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, Li8/q$c;->J:Li8/q;

    invoke-static {v0, v2}, Li8/q;->E(Li8/q;Li8/q;)Li8/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, Li8/q$c;->K:I

    invoke-static {v0, v2}, Li8/q;->F(Li8/q;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget v2, p0, Li8/q$c;->L:I

    invoke-static {v0, v2}, Li8/q;->G(Li8/q;I)I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v2, p0, Li8/q$c;->M:I

    invoke-static {v0, v2}, Li8/q;->H(Li8/q;I)I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, Li8/q$c;->N:I

    invoke-static {v0, v2}, Li8/q;->I(Li8/q;I)I

    and-int/lit16 v2, v1, 0x100

    const/16 v4, 0x100

    if-ne v2, v4, :cond_8

    or-int/lit16 v3, v3, 0x80

    :cond_8
    iget v2, p0, Li8/q$c;->O:I

    invoke-static {v0, v2}, Li8/q;->J(Li8/q;I)I

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget-object v2, p0, Li8/q$c;->P:Li8/q;

    invoke-static {v0, v2}, Li8/q;->K(Li8/q;Li8/q;)Li8/q;

    and-int/lit16 v2, v1, 0x400

    const/16 v4, 0x400

    if-ne v2, v4, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v2, p0, Li8/q$c;->Q:I

    invoke-static {v0, v2}, Li8/q;->L(Li8/q;I)I

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x400

    :cond_b
    iget-object v2, p0, Li8/q$c;->R:Li8/q;

    invoke-static {v0, v2}, Li8/q;->M(Li8/q;Li8/q;)Li8/q;

    and-int/lit16 v2, v1, 0x1000

    const/16 v4, 0x1000

    if-ne v2, v4, :cond_c

    or-int/lit16 v3, v3, 0x800

    :cond_c
    iget v2, p0, Li8/q$c;->S:I

    invoke-static {v0, v2}, Li8/q;->N(Li8/q;I)I

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    or-int/lit16 v3, v3, 0x1000

    :cond_d
    iget v1, p0, Li8/q$c;->T:I

    invoke-static {v0, v1}, Li8/q;->O(Li8/q;I)I

    invoke-static {v0, v3}, Li8/q;->P(Li8/q;I)I

    return-object v0
.end method

.method public w()Li8/q$c;
    .locals 2

    invoke-static {}, Li8/q$c;->x()Li8/q$c;

    move-result-object v0

    invoke-virtual {p0}, Li8/q$c;->v()Li8/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object v0

    return-object v0
.end method
