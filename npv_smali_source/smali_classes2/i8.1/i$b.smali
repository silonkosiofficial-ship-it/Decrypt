.class public final Li8/i$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Li8/q;

.field private K:I

.field private L:Ljava/util/List;

.field private M:Li8/q;

.field private N:I

.field private O:Ljava/util/List;

.field private P:Ljava/util/List;

.field private Q:Ljava/util/List;

.field private R:Li8/t;

.field private S:Ljava/util/List;

.field private T:Li8/e;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Li8/i$b;->G:I

    iput v0, p0, Li8/i$b;->H:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->J:Li8/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->M:Li8/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->R:Li8/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-static {}, Li8/e;->u()Li8/e;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->T:Li8/e;

    invoke-direct {p0}, Li8/i$b;->E()V

    return-void
.end method

.method private A()V
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/i$b;->L:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/i$b;->F:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/i$b;->Q:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/i$b;->F:I

    :cond_0
    return-void
.end method

.method private C()V
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/i$b;->S:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/i$b;->F:I

    :cond_0
    return-void
.end method

.method private E()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/i$b;
    .locals 1

    invoke-static {}, Li8/i$b;->x()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/i$b;
    .locals 1

    new-instance v0, Li8/i$b;

    invoke-direct {v0}, Li8/i$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/i$b;->P:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/i$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/i$b;->O:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/i$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public F(Li8/e;)Li8/i$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x2000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/i$b;->T:Li8/e;

    invoke-static {}, Li8/e;->u()Li8/e;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/i$b;->T:Li8/e;

    invoke-static {v0}, Li8/e;->z(Li8/e;)Li8/e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/e$b;->w(Li8/e;)Li8/e$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/e$b;->q()Li8/e;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/i$b;->T:Li8/e;

    iget p1, p0, Li8/i$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/i$b;->F:I

    return-object p0
.end method

.method public G(Li8/i;)Li8/i$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/i;->a0()Li8/i;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/i;->t0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/i;->c0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/i$b;->L(I)Li8/i$b;

    :cond_1
    invoke-virtual {p1}, Li8/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/i;->e0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/i$b;->O(I)Li8/i$b;

    :cond_2
    invoke-virtual {p1}, Li8/i;->u0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/i;->d0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/i$b;->M(I)Li8/i$b;

    :cond_3
    invoke-virtual {p1}, Li8/i;->y0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/i;->i0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/i$b;->J(Li8/q;)Li8/i$b;

    :cond_4
    invoke-virtual {p1}, Li8/i;->z0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/i;->j0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/i$b;->Q(I)Li8/i$b;

    :cond_5
    invoke-static {p1}, Li8/i;->F(Li8/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, Li8/i;->F(Li8/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->L:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Li8/i$b;->F:I

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Li8/i$b;->A()V

    iget-object v0, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-static {p1}, Li8/i;->F(Li8/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    invoke-virtual {p1}, Li8/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Li8/i;->f0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/i$b;->I(Li8/q;)Li8/i$b;

    :cond_8
    invoke-virtual {p1}, Li8/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Li8/i;->h0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/i$b;->P(I)Li8/i$b;

    :cond_9
    invoke-static {p1}, Li8/i;->J(Li8/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Li8/i;->J(Li8/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->O:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Li8/i$b;->F:I

    goto :goto_1

    :cond_a
    invoke-direct {p0}, Li8/i$b;->z()V

    iget-object v0, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-static {p1}, Li8/i;->J(Li8/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_1
    invoke-static {p1}, Li8/i;->L(Li8/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p1}, Li8/i;->L(Li8/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->P:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Li8/i$b;->F:I

    goto :goto_2

    :cond_c
    invoke-direct {p0}, Li8/i$b;->y()V

    iget-object v0, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-static {p1}, Li8/i;->L(Li8/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_2
    invoke-static {p1}, Li8/i;->N(Li8/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p1}, Li8/i;->N(Li8/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->Q:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Li8/i$b;->F:I

    goto :goto_3

    :cond_e
    invoke-direct {p0}, Li8/i$b;->B()V

    iget-object v0, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-static {p1}, Li8/i;->N(Li8/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_3
    invoke-virtual {p1}, Li8/i;->A0()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Li8/i;->n0()Li8/t;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/i$b;->K(Li8/t;)Li8/i$b;

    :cond_10
    invoke-static {p1}, Li8/i;->Q(Li8/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p1}, Li8/i;->Q(Li8/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i$b;->S:Ljava/util/List;

    iget v0, p0, Li8/i$b;->F:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Li8/i$b;->F:I

    goto :goto_4

    :cond_11
    invoke-direct {p0}, Li8/i$b;->C()V

    iget-object v0, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-static {p1}, Li8/i;->Q(Li8/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_12
    :goto_4
    invoke-virtual {p1}, Li8/i;->s0()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p1}, Li8/i;->Z()Li8/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/i$b;->F(Li8/e;)Li8/i$b;

    :cond_13
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/i;->U(Li8/i;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public H(Lp8/e;Lp8/g;)Li8/i$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/i;->Y:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/i;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/i$b;->G(Li8/i;)Li8/i$b;

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

    check-cast p2, Li8/i;
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

    invoke-virtual {p0, v0}, Li8/i$b;->G(Li8/i;)Li8/i$b;

    :cond_1
    throw p1
.end method

.method public I(Li8/q;)Li8/i$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/i$b;->M:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/i$b;->M:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/i$b;->M:Li8/q;

    iget p1, p0, Li8/i$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/i$b;->F:I

    return-object p0
.end method

.method public J(Li8/q;)Li8/i$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/i$b;->J:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/i$b;->J:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/i$b;->J:Li8/q;

    iget p1, p0, Li8/i$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/i$b;->F:I

    return-object p0
.end method

.method public K(Li8/t;)Li8/i$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/i$b;->F:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/i$b;->R:Li8/t;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/i$b;->R:Li8/t;

    invoke-static {v0}, Li8/t;->E(Li8/t;)Li8/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/t$b;->q()Li8/t;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/i$b;->R:Li8/t;

    iget p1, p0, Li8/i$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/i$b;->F:I

    return-object p0
.end method

.method public L(I)Li8/i$b;
    .locals 1

    iget v0, p0, Li8/i$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/i$b;->F:I

    iput p1, p0, Li8/i$b;->G:I

    return-object p0
.end method

.method public M(I)Li8/i$b;
    .locals 1

    iget v0, p0, Li8/i$b;->F:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/i$b;->F:I

    iput p1, p0, Li8/i$b;->I:I

    return-object p0
.end method

.method public O(I)Li8/i$b;
    .locals 1

    iget v0, p0, Li8/i$b;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/i$b;->F:I

    iput p1, p0, Li8/i$b;->H:I

    return-object p0
.end method

.method public P(I)Li8/i$b;
    .locals 1

    iget v0, p0, Li8/i$b;->F:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Li8/i$b;->F:I

    iput p1, p0, Li8/i$b;->N:I

    return-object p0
.end method

.method public Q(I)Li8/i$b;
    .locals 1

    iget v0, p0, Li8/i$b;->F:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/i$b;->F:I

    iput p1, p0, Li8/i$b;->K:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/i$b;->w()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/i$b;->H(Lp8/e;Lp8/g;)Li8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/i$b;->u()Li8/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/i;

    invoke-virtual {p0, p1}, Li8/i$b;->G(Li8/i;)Li8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/i;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/i$b;->v()Li8/i;

    move-result-object v0

    invoke-virtual {v0}, Li8/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/i;
    .locals 5

    .prologue
    new-instance v0, Li8/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/i;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/i$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/i$b;->G:I

    invoke-static {v0, v2}, Li8/i;->A(Li8/i;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/i$b;->H:I

    invoke-static {v0, v2}, Li8/i;->B(Li8/i;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Li8/i$b;->I:I

    invoke-static {v0, v2}, Li8/i;->C(Li8/i;I)I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Li8/i$b;->J:Li8/q;

    invoke-static {v0, v2}, Li8/i;->D(Li8/i;Li8/q;)Li8/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Li8/i$b;->K:I

    invoke-static {v0, v2}, Li8/i;->E(Li8/i;I)I

    iget v2, p0, Li8/i$b;->F:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/i$b;->L:Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, Li8/i$b;->F:I

    :cond_5
    iget-object v2, p0, Li8/i$b;->L:Ljava/util/List;

    invoke-static {v0, v2}, Li8/i;->G(Li8/i;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget-object v2, p0, Li8/i$b;->M:Li8/q;

    invoke-static {v0, v2}, Li8/i;->H(Li8/i;Li8/q;)Li8/q;

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, Li8/i$b;->N:I

    invoke-static {v0, v2}, Li8/i;->I(Li8/i;I)I

    iget v2, p0, Li8/i$b;->F:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/i$b;->O:Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Li8/i$b;->F:I

    :cond_8
    iget-object v2, p0, Li8/i$b;->O:Ljava/util/List;

    invoke-static {v0, v2}, Li8/i;->K(Li8/i;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/i$b;->P:Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, Li8/i$b;->F:I

    :cond_9
    iget-object v2, p0, Li8/i$b;->P:Ljava/util/List;

    invoke-static {v0, v2}, Li8/i;->M(Li8/i;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/i$b;->Q:Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Li8/i$b;->F:I

    :cond_a
    iget-object v2, p0, Li8/i$b;->Q:Ljava/util/List;

    invoke-static {v0, v2}, Li8/i;->O(Li8/i;Ljava/util/List;)Ljava/util/List;

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x80

    :cond_b
    iget-object v2, p0, Li8/i$b;->R:Li8/t;

    invoke-static {v0, v2}, Li8/i;->P(Li8/i;Li8/t;)Li8/t;

    iget v2, p0, Li8/i$b;->F:I

    const/16 v4, 0x1000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_c

    iget-object v2, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/i$b;->S:Ljava/util/List;

    iget v2, p0, Li8/i$b;->F:I

    and-int/lit16 v2, v2, -0x1001

    iput v2, p0, Li8/i$b;->F:I

    :cond_c
    iget-object v2, p0, Li8/i$b;->S:Ljava/util/List;

    invoke-static {v0, v2}, Li8/i;->R(Li8/i;Ljava/util/List;)Ljava/util/List;

    const/16 v2, 0x2000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    or-int/lit16 v3, v3, 0x100

    :cond_d
    iget-object v1, p0, Li8/i$b;->T:Li8/e;

    invoke-static {v0, v1}, Li8/i;->S(Li8/i;Li8/e;)Li8/e;

    invoke-static {v0, v3}, Li8/i;->T(Li8/i;I)I

    return-object v0
.end method

.method public w()Li8/i$b;
    .locals 2

    invoke-static {}, Li8/i$b;->x()Li8/i$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/i$b;->v()Li8/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/i$b;->G(Li8/i;)Li8/i$b;

    move-result-object v0

    return-object v0
.end method
