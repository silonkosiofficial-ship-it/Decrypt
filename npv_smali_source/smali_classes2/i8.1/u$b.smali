.class public final Li8/u$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:I

.field private I:Li8/q;

.field private J:I

.field private K:Li8/q;

.field private L:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/u$b;->I:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/u$b;->K:Li8/q;

    invoke-direct {p0}, Li8/u$b;->y()V

    return-void
.end method

.method static synthetic t()Li8/u$b;
    .locals 1

    invoke-static {}, Li8/u$b;->x()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/u$b;
    .locals 1

    new-instance v0, Li8/u$b;

    invoke-direct {v0}, Li8/u$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Lp8/e;Lp8/g;)Li8/u$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/u;->P:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/u;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/u$b;->z(Li8/u;)Li8/u$b;

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

    check-cast p2, Li8/u;
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

    invoke-virtual {p0, v0}, Li8/u$b;->z(Li8/u;)Li8/u$b;

    :cond_1
    throw p1
.end method

.method public B(Li8/q;)Li8/u$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/u$b;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/u$b;->I:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/u$b;->I:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/u$b;->I:Li8/q;

    iget p1, p0, Li8/u$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/u$b;->F:I

    return-object p0
.end method

.method public C(Li8/q;)Li8/u$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/u$b;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/u$b;->K:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/u$b;->K:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/u$b;->K:Li8/q;

    iget p1, p0, Li8/u$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/u$b;->F:I

    return-object p0
.end method

.method public E(I)Li8/u$b;
    .locals 1

    iget v0, p0, Li8/u$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/u$b;->F:I

    iput p1, p0, Li8/u$b;->G:I

    return-object p0
.end method

.method public F(I)Li8/u$b;
    .locals 1

    iget v0, p0, Li8/u$b;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/u$b;->F:I

    iput p1, p0, Li8/u$b;->H:I

    return-object p0
.end method

.method public G(I)Li8/u$b;
    .locals 1

    iget v0, p0, Li8/u$b;->F:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li8/u$b;->F:I

    iput p1, p0, Li8/u$b;->J:I

    return-object p0
.end method

.method public H(I)Li8/u$b;
    .locals 1

    iget v0, p0, Li8/u$b;->F:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Li8/u$b;->F:I

    iput p1, p0, Li8/u$b;->L:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/u$b;->w()Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/u$b;->A(Lp8/e;Lp8/g;)Li8/u$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/u$b;->u()Li8/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/u;

    invoke-virtual {p0, p1}, Li8/u$b;->z(Li8/u;)Li8/u$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/u;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/u$b;->v()Li8/u;

    move-result-object v0

    invoke-virtual {v0}, Li8/u;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/u;
    .locals 5

    .prologue
    new-instance v0, Li8/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/u;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/u$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/u$b;->G:I

    invoke-static {v0, v2}, Li8/u;->A(Li8/u;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/u$b;->H:I

    invoke-static {v0, v2}, Li8/u;->B(Li8/u;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Li8/u$b;->I:Li8/q;

    invoke-static {v0, v2}, Li8/u;->C(Li8/u;Li8/q;)Li8/q;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, Li8/u$b;->J:I

    invoke-static {v0, v2}, Li8/u;->D(Li8/u;I)I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v2, p0, Li8/u$b;->K:Li8/q;

    invoke-static {v0, v2}, Li8/u;->E(Li8/u;Li8/q;)Li8/q;

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget v1, p0, Li8/u$b;->L:I

    invoke-static {v0, v1}, Li8/u;->F(Li8/u;I)I

    invoke-static {v0, v3}, Li8/u;->G(Li8/u;I)I

    return-object v0
.end method

.method public w()Li8/u$b;
    .locals 2

    invoke-static {}, Li8/u$b;->x()Li8/u$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/u$b;->v()Li8/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/u$b;->z(Li8/u;)Li8/u$b;

    move-result-object v0

    return-object v0
.end method

.method public z(Li8/u;)Li8/u$b;
    .locals 1

    .prologue
    invoke-static {}, Li8/u;->I()Li8/u;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/u;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/u;->K()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/u$b;->E(I)Li8/u$b;

    :cond_1
    invoke-virtual {p1}, Li8/u;->R()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/u;->L()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/u$b;->F(I)Li8/u$b;

    :cond_2
    invoke-virtual {p1}, Li8/u;->S()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/u;->M()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/u$b;->B(Li8/q;)Li8/u$b;

    :cond_3
    invoke-virtual {p1}, Li8/u;->T()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/u;->N()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/u$b;->G(I)Li8/u$b;

    :cond_4
    invoke-virtual {p1}, Li8/u;->U()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/u;->O()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/u$b;->C(Li8/q;)Li8/u$b;

    :cond_5
    invoke-virtual {p1}, Li8/u;->V()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Li8/u;->P()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/u$b;->H(I)Li8/u$b;

    :cond_6
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/u;->H(Li8/u;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method
