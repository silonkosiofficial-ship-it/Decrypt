.class public final Li8/h$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:I

.field private F:I

.field private G:Li8/h$c;

.field private H:Li8/q;

.field private I:I

.field private J:Ljava/util/List;

.field private K:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    sget-object v0, Li8/h$c;->D:Li8/h$c;

    iput-object v0, p0, Li8/h$b;->G:Li8/h$c;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/h$b;->H:Li8/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-direct {p0}, Li8/h$b;->w()V

    return-void
.end method

.method static synthetic n()Li8/h$b;
    .locals 1

    invoke-static {}, Li8/h$b;->t()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Li8/h$b;
    .locals 1

    new-instance v0, Li8/h$b;

    invoke-direct {v0}, Li8/h$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 3

    .prologue
    iget v0, p0, Li8/h$b;->D:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/h$b;->J:Ljava/util/List;

    iget v0, p0, Li8/h$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/h$b;->D:I

    :cond_0
    return-void
.end method

.method private v()V
    .locals 3

    .prologue
    iget v0, p0, Li8/h$b;->D:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/h$b;->K:Ljava/util/List;

    iget v0, p0, Li8/h$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/h$b;->D:I

    :cond_0
    return-void
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Li8/h$c;)Li8/h$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/h$b;->D:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/h$b;->D:I

    iput-object p1, p0, Li8/h$b;->G:Li8/h$c;

    return-object p0
.end method

.method public B(I)Li8/h$b;
    .locals 1

    iget v0, p0, Li8/h$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/h$b;->D:I

    iput p1, p0, Li8/h$b;->E:I

    return-object p0
.end method

.method public C(I)Li8/h$b;
    .locals 1

    iget v0, p0, Li8/h$b;->D:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/h$b;->D:I

    iput p1, p0, Li8/h$b;->I:I

    return-object p0
.end method

.method public E(I)Li8/h$b;
    .locals 1

    iget v0, p0, Li8/h$b;->D:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/h$b;->D:I

    iput p1, p0, Li8/h$b;->F:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/h$b;->r()Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/h$b;->y(Lp8/e;Lp8/g;)Li8/h$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/h$b;->p()Li8/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/h;

    invoke-virtual {p0, p1}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Li8/h;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/h$b;->q()Li8/h;

    move-result-object v0

    invoke-virtual {v0}, Li8/h;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Li8/h;
    .locals 5

    .prologue
    new-instance v0, Li8/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/h;-><init>(Lp8/i$b;Li8/a;)V

    iget v1, p0, Li8/h$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/h$b;->E:I

    invoke-static {v0, v2}, Li8/h;->r(Li8/h;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/h$b;->F:I

    invoke-static {v0, v2}, Li8/h;->s(Li8/h;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Li8/h$b;->G:Li8/h$c;

    invoke-static {v0, v2}, Li8/h;->t(Li8/h;Li8/h$c;)Li8/h$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Li8/h$b;->H:Li8/q;

    invoke-static {v0, v2}, Li8/h;->u(Li8/h;Li8/q;)Li8/q;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v1, p0, Li8/h$b;->I:I

    invoke-static {v0, v1}, Li8/h;->v(Li8/h;I)I

    iget v1, p0, Li8/h$b;->D:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/h$b;->J:Ljava/util/List;

    iget v1, p0, Li8/h$b;->D:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Li8/h$b;->D:I

    :cond_5
    iget-object v1, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-static {v0, v1}, Li8/h;->x(Li8/h;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, Li8/h$b;->D:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/h$b;->K:Ljava/util/List;

    iget v1, p0, Li8/h$b;->D:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, Li8/h$b;->D:I

    :cond_6
    iget-object v1, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-static {v0, v1}, Li8/h;->z(Li8/h;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, Li8/h;->A(Li8/h;I)I

    return-object v0
.end method

.method public r()Li8/h$b;
    .locals 2

    invoke-static {}, Li8/h$b;->t()Li8/h$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/h$b;->q()Li8/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    move-result-object v0

    return-object v0
.end method

.method public x(Li8/h;)Li8/h$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/h;->F()Li8/h;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/h;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/h;->G()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/h$b;->B(I)Li8/h$b;

    :cond_1
    invoke-virtual {p1}, Li8/h;->Q()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/h;->L()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/h$b;->E(I)Li8/h$b;

    :cond_2
    invoke-virtual {p1}, Li8/h;->M()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/h;->E()Li8/h$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/h$b;->A(Li8/h$c;)Li8/h$b;

    :cond_3
    invoke-virtual {p1}, Li8/h;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/h;->H()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/h$b;->z(Li8/q;)Li8/h$b;

    :cond_4
    invoke-virtual {p1}, Li8/h;->P()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/h;->I()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/h$b;->C(I)Li8/h$b;

    :cond_5
    invoke-static {p1}, Li8/h;->w(Li8/h;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, Li8/h;->w(Li8/h;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h$b;->J:Ljava/util/List;

    iget v0, p0, Li8/h$b;->D:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Li8/h$b;->D:I

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Li8/h$b;->u()V

    iget-object v0, p0, Li8/h$b;->J:Ljava/util/List;

    invoke-static {p1}, Li8/h;->w(Li8/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_0
    invoke-static {p1}, Li8/h;->y(Li8/h;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1}, Li8/h;->y(Li8/h;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/h$b;->K:Ljava/util/List;

    iget v0, p0, Li8/h$b;->D:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Li8/h$b;->D:I

    goto :goto_1

    :cond_8
    invoke-direct {p0}, Li8/h$b;->v()V

    iget-object v0, p0, Li8/h$b;->K:Ljava/util/List;

    invoke-static {p1}, Li8/h;->y(Li8/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_1
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/h;->B(Li8/h;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public y(Lp8/e;Lp8/g;)Li8/h$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/h;->P:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/h;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/h$b;->x(Li8/h;)Li8/h$b;

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

    check-cast p2, Li8/h;
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

    invoke-virtual {p0, v0}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    :cond_1
    throw p1
.end method

.method public z(Li8/q;)Li8/h$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/h$b;->D:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/h$b;->H:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/h$b;->H:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/h$b;->H:Li8/q;

    iget p1, p0, Li8/h$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/h$b;->D:I

    return-object p0
.end method
