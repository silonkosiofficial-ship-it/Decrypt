.class public final Li8/d$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:Ljava/util/List;

.field private I:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Li8/d$b;->G:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-direct {p0}, Li8/d$b;->A()V

    return-void
.end method

.method private A()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/d$b;
    .locals 1

    invoke-static {}, Li8/d$b;->x()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/d$b;
    .locals 1

    new-instance v0, Li8/d$b;

    invoke-direct {v0}, Li8/d$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/d$b;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/d$b;->H:Ljava/util/List;

    iget v0, p0, Li8/d$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/d$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/d$b;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/d$b;->I:Ljava/util/List;

    iget v0, p0, Li8/d$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/d$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public B(Li8/d;)Li8/d$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/d;->H()Li8/d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/d;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/d;->J()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/d$b;->E(I)Li8/d$b;

    :cond_1
    invoke-static {p1}, Li8/d;->B(Li8/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Li8/d;->B(Li8/d;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d$b;->H:Ljava/util/List;

    iget v0, p0, Li8/d$b;->F:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Li8/d$b;->F:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Li8/d$b;->y()V

    iget-object v0, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-static {p1}, Li8/d;->B(Li8/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    invoke-static {p1}, Li8/d;->D(Li8/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Li8/d;->D(Li8/d;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d$b;->I:Ljava/util/List;

    iget v0, p0, Li8/d$b;->F:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Li8/d$b;->F:I

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Li8/d$b;->z()V

    iget-object v0, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-static {p1}, Li8/d;->D(Li8/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/d;->G(Li8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public C(Lp8/e;Lp8/g;)Li8/d$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/d;->M:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/d;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/d$b;->B(Li8/d;)Li8/d$b;

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

    check-cast p2, Li8/d;
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

    invoke-virtual {p0, v0}, Li8/d$b;->B(Li8/d;)Li8/d$b;

    :cond_1
    throw p1
.end method

.method public E(I)Li8/d$b;
    .locals 1

    iget v0, p0, Li8/d$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/d$b;->F:I

    iput p1, p0, Li8/d$b;->G:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/d$b;->w()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/d$b;->C(Lp8/e;Lp8/g;)Li8/d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/d$b;->u()Li8/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/d;

    invoke-virtual {p0, p1}, Li8/d$b;->B(Li8/d;)Li8/d$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/d;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/d$b;->v()Li8/d;

    move-result-object v0

    invoke-virtual {v0}, Li8/d;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/d;
    .locals 4

    .prologue
    new-instance v0, Li8/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/d;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/d$b;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v1, p0, Li8/d$b;->G:I

    invoke-static {v0, v1}, Li8/d;->A(Li8/d;I)I

    iget v1, p0, Li8/d$b;->F:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/d$b;->H:Ljava/util/List;

    iget v1, p0, Li8/d$b;->F:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Li8/d$b;->F:I

    :cond_1
    iget-object v1, p0, Li8/d$b;->H:Ljava/util/List;

    invoke-static {v0, v1}, Li8/d;->C(Li8/d;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, Li8/d$b;->F:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/d$b;->I:Ljava/util/List;

    iget v1, p0, Li8/d$b;->F:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Li8/d$b;->F:I

    :cond_2
    iget-object v1, p0, Li8/d$b;->I:Ljava/util/List;

    invoke-static {v0, v1}, Li8/d;->E(Li8/d;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v2}, Li8/d;->F(Li8/d;I)I

    return-object v0
.end method

.method public w()Li8/d$b;
    .locals 2

    invoke-static {}, Li8/d$b;->x()Li8/d$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/d$b;->v()Li8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/d$b;->B(Li8/d;)Li8/d$b;

    move-result-object v0

    return-object v0
.end method
