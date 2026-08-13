.class public final Li8/r$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:I

.field private I:Ljava/util/List;

.field private J:Li8/q;

.field private K:I

.field private L:Li8/q;

.field private M:I

.field private N:Ljava/util/List;

.field private O:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Li8/r$b;->G:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->J:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->L:Li8/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-direct {p0}, Li8/r$b;->B()V

    return-void
.end method

.method private A()V
    .locals 3

    .prologue
    iget v0, p0, Li8/r$b;->F:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/r$b;->O:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/r$b;->F:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/r$b;
    .locals 1

    invoke-static {}, Li8/r$b;->x()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/r$b;
    .locals 1

    new-instance v0, Li8/r$b;

    invoke-direct {v0}, Li8/r$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/r$b;->F:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/r$b;->N:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/r$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/r$b;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/r$b;->I:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/r$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public C(Li8/q;)Li8/r$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/r$b;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/r$b;->L:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/r$b;->L:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/r$b;->L:Li8/q;

    iget p1, p0, Li8/r$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/r$b;->F:I

    return-object p0
.end method

.method public E(Li8/r;)Li8/r$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/r;->R()Li8/r;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/r;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/r;->V()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/r$b;->I(I)Li8/r$b;

    :cond_1
    invoke-virtual {p1}, Li8/r;->h0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/r;->W()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/r$b;->J(I)Li8/r$b;

    :cond_2
    invoke-static {p1}, Li8/r;->C(Li8/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Li8/r;->C(Li8/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->I:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Li8/r$b;->F:I

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Li8/r$b;->z()V

    iget-object v0, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-static {p1}, Li8/r;->C(Li8/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_0
    invoke-virtual {p1}, Li8/r;->i0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/r;->a0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/r$b;->G(Li8/q;)Li8/r$b;

    :cond_5
    invoke-virtual {p1}, Li8/r;->j0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Li8/r;->b0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/r$b;->K(I)Li8/r$b;

    :cond_6
    invoke-virtual {p1}, Li8/r;->d0()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Li8/r;->T()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/r$b;->C(Li8/q;)Li8/r$b;

    :cond_7
    invoke-virtual {p1}, Li8/r;->e0()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Li8/r;->U()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/r$b;->H(I)Li8/r$b;

    :cond_8
    invoke-static {p1}, Li8/r;->I(Li8/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p1}, Li8/r;->I(Li8/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->N:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Li8/r$b;->F:I

    goto :goto_1

    :cond_9
    invoke-direct {p0}, Li8/r$b;->y()V

    iget-object v0, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-static {p1}, Li8/r;->I(Li8/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_1
    invoke-static {p1}, Li8/r;->K(Li8/r;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Li8/r;->K(Li8/r;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r$b;->O:Ljava/util/List;

    iget v0, p0, Li8/r$b;->F:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Li8/r$b;->F:I

    goto :goto_2

    :cond_b
    invoke-direct {p0}, Li8/r$b;->A()V

    iget-object v0, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-static {p1}, Li8/r;->K(Li8/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_2
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/r;->N(Li8/r;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public F(Lp8/e;Lp8/g;)Li8/r$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/r;->S:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/r;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/r$b;->E(Li8/r;)Li8/r$b;

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

    check-cast p2, Li8/r;
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

    invoke-virtual {p0, v0}, Li8/r$b;->E(Li8/r;)Li8/r$b;

    :cond_1
    throw p1
.end method

.method public G(Li8/q;)Li8/r$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/r$b;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/r$b;->J:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/r$b;->J:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/r$b;->J:Li8/q;

    iget p1, p0, Li8/r$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/r$b;->F:I

    return-object p0
.end method

.method public H(I)Li8/r$b;
    .locals 1

    iget v0, p0, Li8/r$b;->F:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Li8/r$b;->F:I

    iput p1, p0, Li8/r$b;->M:I

    return-object p0
.end method

.method public I(I)Li8/r$b;
    .locals 1

    iget v0, p0, Li8/r$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/r$b;->F:I

    iput p1, p0, Li8/r$b;->G:I

    return-object p0
.end method

.method public J(I)Li8/r$b;
    .locals 1

    iget v0, p0, Li8/r$b;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/r$b;->F:I

    iput p1, p0, Li8/r$b;->H:I

    return-object p0
.end method

.method public K(I)Li8/r$b;
    .locals 1

    iget v0, p0, Li8/r$b;->F:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/r$b;->F:I

    iput p1, p0, Li8/r$b;->K:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/r$b;->w()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/r$b;->F(Lp8/e;Lp8/g;)Li8/r$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/r$b;->u()Li8/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/r;

    invoke-virtual {p0, p1}, Li8/r$b;->E(Li8/r;)Li8/r$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/r;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/r$b;->v()Li8/r;

    move-result-object v0

    invoke-virtual {v0}, Li8/r;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/r;
    .locals 5

    .prologue
    new-instance v0, Li8/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/r;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/r$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/r$b;->G:I

    invoke-static {v0, v2}, Li8/r;->A(Li8/r;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/r$b;->H:I

    invoke-static {v0, v2}, Li8/r;->B(Li8/r;I)I

    iget v2, p0, Li8/r$b;->F:I

    const/4 v4, 0x4

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/r$b;->I:Ljava/util/List;

    iget v2, p0, Li8/r$b;->F:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, Li8/r$b;->F:I

    :cond_2
    iget-object v2, p0, Li8/r$b;->I:Ljava/util/List;

    invoke-static {v0, v2}, Li8/r;->D(Li8/r;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v2, p0, Li8/r$b;->J:Li8/q;

    invoke-static {v0, v2}, Li8/r;->E(Li8/r;Li8/q;)Li8/q;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x8

    :cond_4
    iget v2, p0, Li8/r$b;->K:I

    invoke-static {v0, v2}, Li8/r;->F(Li8/r;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x10

    :cond_5
    iget-object v2, p0, Li8/r$b;->L:Li8/q;

    invoke-static {v0, v2}, Li8/r;->G(Li8/r;Li8/q;)Li8/q;

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget v1, p0, Li8/r$b;->M:I

    invoke-static {v0, v1}, Li8/r;->H(Li8/r;I)I

    iget v1, p0, Li8/r$b;->F:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    iget-object v1, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/r$b;->N:Ljava/util/List;

    iget v1, p0, Li8/r$b;->F:I

    and-int/lit16 v1, v1, -0x81

    iput v1, p0, Li8/r$b;->F:I

    :cond_7
    iget-object v1, p0, Li8/r$b;->N:Ljava/util/List;

    invoke-static {v0, v1}, Li8/r;->J(Li8/r;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, Li8/r$b;->F:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/r$b;->O:Ljava/util/List;

    iget v1, p0, Li8/r$b;->F:I

    and-int/lit16 v1, v1, -0x101

    iput v1, p0, Li8/r$b;->F:I

    :cond_8
    iget-object v1, p0, Li8/r$b;->O:Ljava/util/List;

    invoke-static {v0, v1}, Li8/r;->L(Li8/r;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, Li8/r;->M(Li8/r;I)I

    return-object v0
.end method

.method public w()Li8/r$b;
    .locals 2

    invoke-static {}, Li8/r$b;->x()Li8/r$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/r$b;->v()Li8/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/r$b;->E(Li8/r;)Li8/r$b;

    move-result-object v0

    return-object v0
.end method
