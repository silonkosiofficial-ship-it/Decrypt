.class public final Li8/l$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:Ljava/util/List;

.field private H:Ljava/util/List;

.field private I:Ljava/util/List;

.field private J:Li8/t;

.field private K:Li8/w;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->J:Li8/t;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->K:Li8/w;

    invoke-direct {p0}, Li8/l$b;->B()V

    return-void
.end method

.method private A()V
    .locals 3

    .prologue
    iget v0, p0, Li8/l$b;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/l$b;->I:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/l$b;->F:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/l$b;
    .locals 1

    invoke-static {}, Li8/l$b;->x()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/l$b;
    .locals 1

    new-instance v0, Li8/l$b;

    invoke-direct {v0}, Li8/l$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/l$b;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/l$b;->G:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/l$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/l$b;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/l$b;->H:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/l$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public C(Li8/l;)Li8/l$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/l;->K()Li8/l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Li8/l;->A(Li8/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Li8/l;->A(Li8/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->G:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Li8/l$b;->F:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Li8/l$b;->y()V

    iget-object v0, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-static {p1}, Li8/l;->A(Li8/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    :goto_0
    invoke-static {p1}, Li8/l;->C(Li8/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Li8/l;->C(Li8/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->H:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Li8/l$b;->F:I

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Li8/l$b;->z()V

    iget-object v0, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-static {p1}, Li8/l;->C(Li8/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_1
    invoke-static {p1}, Li8/l;->E(Li8/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Li8/l;->E(Li8/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l$b;->I:Ljava/util/List;

    iget v0, p0, Li8/l$b;->F:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Li8/l$b;->F:I

    goto :goto_2

    :cond_5
    invoke-direct {p0}, Li8/l$b;->A()V

    iget-object v0, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-static {p1}, Li8/l;->E(Li8/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_2
    invoke-virtual {p1}, Li8/l;->X()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Li8/l;->V()Li8/t;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/l$b;->F(Li8/t;)Li8/l$b;

    :cond_7
    invoke-virtual {p1}, Li8/l;->Y()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Li8/l;->W()Li8/w;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/l$b;->G(Li8/w;)Li8/l$b;

    :cond_8
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/l;->J(Li8/l;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public E(Lp8/e;Lp8/g;)Li8/l$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/l;->O:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/l;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/l$b;->C(Li8/l;)Li8/l$b;

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

    check-cast p2, Li8/l;
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

    invoke-virtual {p0, v0}, Li8/l$b;->C(Li8/l;)Li8/l$b;

    :cond_1
    throw p1
.end method

.method public F(Li8/t;)Li8/l$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/l$b;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/l$b;->J:Li8/t;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/l$b;->J:Li8/t;

    invoke-static {v0}, Li8/t;->E(Li8/t;)Li8/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/t$b;->q()Li8/t;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/l$b;->J:Li8/t;

    iget p1, p0, Li8/l$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/l$b;->F:I

    return-object p0
.end method

.method public G(Li8/w;)Li8/l$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/l$b;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/l$b;->K:Li8/w;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/l$b;->K:Li8/w;

    invoke-static {v0}, Li8/w;->z(Li8/w;)Li8/w$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/w$b;->w(Li8/w;)Li8/w$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/w$b;->q()Li8/w;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/l$b;->K:Li8/w;

    iget p1, p0, Li8/l$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/l$b;->F:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/l$b;->w()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/l$b;->E(Lp8/e;Lp8/g;)Li8/l$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/l$b;->u()Li8/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/l;

    invoke-virtual {p0, p1}, Li8/l$b;->C(Li8/l;)Li8/l$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/l;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/l$b;->v()Li8/l;

    move-result-object v0

    invoke-virtual {v0}, Li8/l;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/l;
    .locals 5

    .prologue
    new-instance v0, Li8/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/l;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/l$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/l$b;->G:Ljava/util/List;

    iget v2, p0, Li8/l$b;->F:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Li8/l$b;->F:I

    :cond_0
    iget-object v2, p0, Li8/l$b;->G:Ljava/util/List;

    invoke-static {v0, v2}, Li8/l;->B(Li8/l;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/l$b;->F:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/l$b;->H:Ljava/util/List;

    iget v2, p0, Li8/l$b;->F:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Li8/l$b;->F:I

    :cond_1
    iget-object v2, p0, Li8/l$b;->H:Ljava/util/List;

    invoke-static {v0, v2}, Li8/l;->D(Li8/l;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/l$b;->F:I

    const/4 v4, 0x4

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    iget-object v2, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/l$b;->I:Ljava/util/List;

    iget v2, p0, Li8/l$b;->F:I

    and-int/lit8 v2, v2, -0x5

    iput v2, p0, Li8/l$b;->F:I

    :cond_2
    iget-object v2, p0, Li8/l$b;->I:Ljava/util/List;

    invoke-static {v0, v2}, Li8/l;->F(Li8/l;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Li8/l$b;->J:Li8/t;

    invoke-static {v0, v2}, Li8/l;->G(Li8/l;Li8/t;)Li8/t;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x2

    :cond_4
    iget-object v1, p0, Li8/l$b;->K:Li8/w;

    invoke-static {v0, v1}, Li8/l;->H(Li8/l;Li8/w;)Li8/w;

    invoke-static {v0, v3}, Li8/l;->I(Li8/l;I)I

    return-object v0
.end method

.method public w()Li8/l$b;
    .locals 2

    invoke-static {}, Li8/l$b;->x()Li8/l$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/l$b;->v()Li8/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/l$b;->C(Li8/l;)Li8/l$b;

    move-result-object v0

    return-object v0
.end method
