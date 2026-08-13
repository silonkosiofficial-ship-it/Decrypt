.class public final Li8/s$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:I

.field private I:Z

.field private J:Li8/s$c;

.field private K:Ljava/util/List;

.field private L:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    sget-object v0, Li8/s$c;->F:Li8/s$c;

    iput-object v0, p0, Li8/s$b;->J:Li8/s$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-direct {p0}, Li8/s$b;->A()V

    return-void
.end method

.method private A()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/s$b;
    .locals 1

    invoke-static {}, Li8/s$b;->x()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/s$b;
    .locals 1

    new-instance v0, Li8/s$b;

    invoke-direct {v0}, Li8/s$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/s$b;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/s$b;->L:Ljava/util/List;

    iget v0, p0, Li8/s$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/s$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/s$b;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/s$b;->K:Ljava/util/List;

    iget v0, p0, Li8/s$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/s$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public B(Li8/s;)Li8/s$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/s;->K()Li8/s;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/s;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/s;->M()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/s$b;->E(I)Li8/s$b;

    :cond_1
    invoke-virtual {p1}, Li8/s;->V()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/s;->N()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/s$b;->F(I)Li8/s$b;

    :cond_2
    invoke-virtual {p1}, Li8/s;->W()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/s;->O()Z

    move-result v0

    invoke-virtual {p0, v0}, Li8/s$b;->G(Z)Li8/s$b;

    :cond_3
    invoke-virtual {p1}, Li8/s;->X()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/s;->T()Li8/s$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/s$b;->H(Li8/s$c;)Li8/s$b;

    :cond_4
    invoke-static {p1}, Li8/s;->E(Li8/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Li8/s;->E(Li8/s;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s$b;->K:Ljava/util/List;

    iget v0, p0, Li8/s$b;->F:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Li8/s$b;->F:I

    goto :goto_0

    :cond_5
    invoke-direct {p0}, Li8/s$b;->z()V

    iget-object v0, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-static {p1}, Li8/s;->E(Li8/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_0
    invoke-static {p1}, Li8/s;->G(Li8/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Li8/s;->G(Li8/s;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s$b;->L:Ljava/util/List;

    iget v0, p0, Li8/s$b;->F:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Li8/s$b;->F:I

    goto :goto_1

    :cond_7
    invoke-direct {p0}, Li8/s$b;->y()V

    iget-object v0, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-static {p1}, Li8/s;->G(Li8/s;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_1
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/s;->J(Li8/s;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public C(Lp8/e;Lp8/g;)Li8/s$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/s;->Q:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/s;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/s$b;->B(Li8/s;)Li8/s$b;

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

    check-cast p2, Li8/s;
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

    invoke-virtual {p0, v0}, Li8/s$b;->B(Li8/s;)Li8/s$b;

    :cond_1
    throw p1
.end method

.method public E(I)Li8/s$b;
    .locals 1

    iget v0, p0, Li8/s$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/s$b;->F:I

    iput p1, p0, Li8/s$b;->G:I

    return-object p0
.end method

.method public F(I)Li8/s$b;
    .locals 1

    iget v0, p0, Li8/s$b;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/s$b;->F:I

    iput p1, p0, Li8/s$b;->H:I

    return-object p0
.end method

.method public G(Z)Li8/s$b;
    .locals 1

    iget v0, p0, Li8/s$b;->F:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/s$b;->F:I

    iput-boolean p1, p0, Li8/s$b;->I:Z

    return-object p0
.end method

.method public H(Li8/s$c;)Li8/s$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/s$b;->F:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li8/s$b;->F:I

    iput-object p1, p0, Li8/s$b;->J:Li8/s$c;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/s$b;->w()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/s$b;->C(Lp8/e;Lp8/g;)Li8/s$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/s$b;->u()Li8/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/s;

    invoke-virtual {p0, p1}, Li8/s$b;->B(Li8/s;)Li8/s$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/s;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/s$b;->v()Li8/s;

    move-result-object v0

    invoke-virtual {v0}, Li8/s;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/s;
    .locals 5

    .prologue
    new-instance v0, Li8/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/s;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/s$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/s$b;->G:I

    invoke-static {v0, v2}, Li8/s;->A(Li8/s;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/s$b;->H:I

    invoke-static {v0, v2}, Li8/s;->B(Li8/s;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-boolean v2, p0, Li8/s$b;->I:Z

    invoke-static {v0, v2}, Li8/s;->C(Li8/s;Z)Z

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v1, p0, Li8/s$b;->J:Li8/s$c;

    invoke-static {v0, v1}, Li8/s;->D(Li8/s;Li8/s$c;)Li8/s$c;

    iget v1, p0, Li8/s$b;->F:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/s$b;->K:Ljava/util/List;

    iget v1, p0, Li8/s$b;->F:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Li8/s$b;->F:I

    :cond_4
    iget-object v1, p0, Li8/s$b;->K:Ljava/util/List;

    invoke-static {v0, v1}, Li8/s;->F(Li8/s;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, Li8/s$b;->F:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/s$b;->L:Ljava/util/List;

    iget v1, p0, Li8/s$b;->F:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Li8/s$b;->F:I

    :cond_5
    iget-object v1, p0, Li8/s$b;->L:Ljava/util/List;

    invoke-static {v0, v1}, Li8/s;->H(Li8/s;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, Li8/s;->I(Li8/s;I)I

    return-object v0
.end method

.method public w()Li8/s$b;
    .locals 2

    invoke-static {}, Li8/s$b;->x()Li8/s$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/s$b;->v()Li8/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/s$b;->B(Li8/s;)Li8/s$b;

    move-result-object v0

    return-object v0
.end method
