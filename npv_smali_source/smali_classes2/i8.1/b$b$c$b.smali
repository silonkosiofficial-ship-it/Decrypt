.class public final Li8/b$b$c$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/b$b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:Li8/b$b$c$c;

.field private F:J

.field private G:F

.field private H:D

.field private I:I

.field private J:I

.field private K:I

.field private L:Li8/b;

.field private M:Ljava/util/List;

.field private N:I

.field private O:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    sget-object v0, Li8/b$b$c$c;->D:Li8/b$b$c$c;

    iput-object v0, p0, Li8/b$b$c$b;->E:Li8/b$b$c$c;

    invoke-static {}, Li8/b;->z()Li8/b;

    move-result-object v0

    iput-object v0, p0, Li8/b$b$c$b;->L:Li8/b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-direct {p0}, Li8/b$b$c$b;->v()V

    return-void
.end method

.method static synthetic n()Li8/b$b$c$b;
    .locals 1

    invoke-static {}, Li8/b$b$c$b;->t()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Li8/b$b$c$b;
    .locals 1

    new-instance v0, Li8/b$b$c$b;

    invoke-direct {v0}, Li8/b$b$c$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 3

    .prologue
    iget v0, p0, Li8/b$b$c$b;->D:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/b$b$c$b;->D:I

    :cond_0
    return-void
.end method

.method private v()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->J:I

    return-object p0
.end method

.method public B(D)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput-wide p1, p0, Li8/b$b$c$b;->H:D

    return-object p0
.end method

.method public C(I)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->K:I

    return-object p0
.end method

.method public E(I)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->O:I

    return-object p0
.end method

.method public F(F)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->G:F

    return-object p0
.end method

.method public G(J)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput-wide p1, p0, Li8/b$b$c$b;->F:J

    return-object p0
.end method

.method public H(I)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->I:I

    return-object p0
.end method

.method public I(Li8/b$b$c$c;)Li8/b$b$c$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput-object p1, p0, Li8/b$b$c$b;->E:Li8/b$b$c$c;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/b$b$c$b;->r()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/b$b$c$b;->y(Lp8/e;Lp8/g;)Li8/b$b$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/b$b$c$b;->p()Li8/b$b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/b$b$c;

    invoke-virtual {p0, p1}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Li8/b$b$c;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/b$b$c$b;->q()Li8/b$b$c;

    move-result-object v0

    invoke-virtual {v0}, Li8/b$b$c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Li8/b$b$c;
    .locals 6

    .prologue
    new-instance v0, Li8/b$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/b$b$c;-><init>(Lp8/i$b;Li8/a;)V

    iget v1, p0, Li8/b$b$c$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Li8/b$b$c$b;->E:Li8/b$b$c$c;

    invoke-static {v0, v2}, Li8/b$b$c;->r(Li8/b$b$c;Li8/b$b$c$c;)Li8/b$b$c$c;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-wide v4, p0, Li8/b$b$c$b;->F:J

    invoke-static {v0, v4, v5}, Li8/b$b$c;->s(Li8/b$b$c;J)J

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Li8/b$b$c$b;->G:F

    invoke-static {v0, v2}, Li8/b$b$c;->t(Li8/b$b$c;F)F

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-wide v4, p0, Li8/b$b$c$b;->H:D

    invoke-static {v0, v4, v5}, Li8/b$b$c;->u(Li8/b$b$c;D)D

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Li8/b$b$c$b;->I:I

    invoke-static {v0, v2}, Li8/b$b$c;->v(Li8/b$b$c;I)I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v2, p0, Li8/b$b$c$b;->J:I

    invoke-static {v0, v2}, Li8/b$b$c;->w(Li8/b$b$c;I)I

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x40

    :cond_6
    iget v2, p0, Li8/b$b$c$b;->K:I

    invoke-static {v0, v2}, Li8/b$b$c;->x(Li8/b$b$c;I)I

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit16 v3, v3, 0x80

    :cond_7
    iget-object v2, p0, Li8/b$b$c$b;->L:Li8/b;

    invoke-static {v0, v2}, Li8/b$b$c;->y(Li8/b$b$c;Li8/b;)Li8/b;

    iget v2, p0, Li8/b$b$c$b;->D:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    iget v2, p0, Li8/b$b$c$b;->D:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Li8/b$b$c$b;->D:I

    :cond_8
    iget-object v2, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-static {v0, v2}, Li8/b$b$c;->A(Li8/b$b$c;Ljava/util/List;)Ljava/util/List;

    and-int/lit16 v2, v1, 0x200

    const/16 v4, 0x200

    if-ne v2, v4, :cond_9

    or-int/lit16 v3, v3, 0x100

    :cond_9
    iget v2, p0, Li8/b$b$c$b;->N:I

    invoke-static {v0, v2}, Li8/b$b$c;->B(Li8/b$b$c;I)I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    or-int/lit16 v3, v3, 0x200

    :cond_a
    iget v1, p0, Li8/b$b$c$b;->O:I

    invoke-static {v0, v1}, Li8/b$b$c;->C(Li8/b$b$c;I)I

    invoke-static {v0, v3}, Li8/b$b$c;->D(Li8/b$b$c;I)I

    return-object v0
.end method

.method public r()Li8/b$b$c$b;
    .locals 2

    invoke-static {}, Li8/b$b$c$b;->t()Li8/b$b$c$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/b$b$c$b;->q()Li8/b$b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public w(Li8/b;)Li8/b$b$c$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/b$b$c$b;->D:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/b$b$c$b;->L:Li8/b;

    invoke-static {}, Li8/b;->z()Li8/b;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/b$b$c$b;->L:Li8/b;

    invoke-static {v0}, Li8/b;->E(Li8/b;)Li8/b$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/b$c;->w(Li8/b;)Li8/b$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/b$c;->q()Li8/b;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/b$b$c$b;->L:Li8/b;

    iget p1, p0, Li8/b$b$c$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/b$b$c$b;->D:I

    return-object p0
.end method

.method public x(Li8/b$b$c;)Li8/b$b$c$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/b$b$c;->L()Li8/b$b$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/b$b$c;->c0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/b$b$c;->S()Li8/b$b$c$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->I(Li8/b$b$c$c;)Li8/b$b$c$b;

    :cond_1
    invoke-virtual {p1}, Li8/b$b$c;->a0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/b$b$c;->Q()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Li8/b$b$c$b;->G(J)Li8/b$b$c$b;

    :cond_2
    invoke-virtual {p1}, Li8/b$b$c;->Z()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/b$b$c;->P()F

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->F(F)Li8/b$b$c$b;

    :cond_3
    invoke-virtual {p1}, Li8/b$b$c;->W()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/b$b$c;->M()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Li8/b$b$c$b;->B(D)Li8/b$b$c$b;

    :cond_4
    invoke-virtual {p1}, Li8/b$b$c;->b0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/b$b$c;->R()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->H(I)Li8/b$b$c$b;

    :cond_5
    invoke-virtual {p1}, Li8/b$b$c;->V()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Li8/b$b$c;->K()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->A(I)Li8/b$b$c$b;

    :cond_6
    invoke-virtual {p1}, Li8/b$b$c;->X()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Li8/b$b$c;->N()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->C(I)Li8/b$b$c$b;

    :cond_7
    invoke-virtual {p1}, Li8/b$b$c;->T()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Li8/b$b$c;->F()Li8/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->w(Li8/b;)Li8/b$b$c$b;

    :cond_8
    invoke-static {p1}, Li8/b$b$c;->z(Li8/b$b$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p1}, Li8/b$b$c;->z(Li8/b$b$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    iget v0, p0, Li8/b$b$c$b;->D:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Li8/b$b$c$b;->D:I

    goto :goto_0

    :cond_9
    invoke-direct {p0}, Li8/b$b$c$b;->u()V

    iget-object v0, p0, Li8/b$b$c$b;->M:Ljava/util/List;

    invoke-static {p1}, Li8/b$b$c;->z(Li8/b$b$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_0
    invoke-virtual {p1}, Li8/b$b$c;->U()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Li8/b$b$c;->G()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->z(I)Li8/b$b$c$b;

    :cond_b
    invoke-virtual {p1}, Li8/b$b$c;->Y()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Li8/b$b$c;->O()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->E(I)Li8/b$b$c$b;

    :cond_c
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/b$b$c;->E(Li8/b$b$c;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public y(Lp8/e;Lp8/g;)Li8/b$b$c$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/b$b$c;->T:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/b$b$c;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

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

    check-cast p2, Li8/b$b$c;
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

    invoke-virtual {p0, v0}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

    :cond_1
    throw p1
.end method

.method public z(I)Li8/b$b$c$b;
    .locals 1

    iget v0, p0, Li8/b$b$c$b;->D:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Li8/b$b$c$b;->D:I

    iput p1, p0, Li8/b$b$c$b;->N:I

    return-object p0
.end method
