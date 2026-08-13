.class public final Li8/v$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:I

.field private F:I

.field private G:Li8/v$c;

.field private H:I

.field private I:I

.field private J:Li8/v$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    sget-object v0, Li8/v$c;->E:Li8/v$c;

    iput-object v0, p0, Li8/v$b;->G:Li8/v$c;

    sget-object v0, Li8/v$d;->D:Li8/v$d;

    iput-object v0, p0, Li8/v$b;->J:Li8/v$d;

    invoke-direct {p0}, Li8/v$b;->u()V

    return-void
.end method

.method static synthetic n()Li8/v$b;
    .locals 1

    invoke-static {}, Li8/v$b;->t()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Li8/v$b;
    .locals 1

    new-instance v0, Li8/v$b;

    invoke-direct {v0}, Li8/v$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)Li8/v$b;
    .locals 1

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/v$b;->D:I

    iput p1, p0, Li8/v$b;->E:I

    return-object p0
.end method

.method public B(I)Li8/v$b;
    .locals 1

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/v$b;->D:I

    iput p1, p0, Li8/v$b;->F:I

    return-object p0
.end method

.method public C(Li8/v$d;)Li8/v$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Li8/v$b;->D:I

    iput-object p1, p0, Li8/v$b;->J:Li8/v$d;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/v$b;->r()Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/v$b;->w(Lp8/e;Lp8/g;)Li8/v$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/v$b;->p()Li8/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/v;

    invoke-virtual {p0, p1}, Li8/v$b;->v(Li8/v;)Li8/v$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Li8/v;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/v$b;->q()Li8/v;

    move-result-object v0

    invoke-virtual {v0}, Li8/v;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Li8/v;
    .locals 5

    .prologue
    new-instance v0, Li8/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/v;-><init>(Lp8/i$b;Li8/a;)V

    iget v1, p0, Li8/v$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/v$b;->E:I

    invoke-static {v0, v2}, Li8/v;->r(Li8/v;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/v$b;->F:I

    invoke-static {v0, v2}, Li8/v;->s(Li8/v;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Li8/v$b;->G:Li8/v$c;

    invoke-static {v0, v2}, Li8/v;->t(Li8/v;Li8/v$c;)Li8/v$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget v2, p0, Li8/v$b;->H:I

    invoke-static {v0, v2}, Li8/v;->u(Li8/v;I)I

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Li8/v$b;->I:I

    invoke-static {v0, v2}, Li8/v;->v(Li8/v;I)I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    or-int/lit8 v3, v3, 0x20

    :cond_5
    iget-object v1, p0, Li8/v$b;->J:Li8/v$d;

    invoke-static {v0, v1}, Li8/v;->w(Li8/v;Li8/v$d;)Li8/v$d;

    invoke-static {v0, v3}, Li8/v;->x(Li8/v;I)I

    return-object v0
.end method

.method public r()Li8/v$b;
    .locals 2

    invoke-static {}, Li8/v$b;->t()Li8/v$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/v$b;->q()Li8/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/v$b;->v(Li8/v;)Li8/v$b;

    move-result-object v0

    return-object v0
.end method

.method public v(Li8/v;)Li8/v$b;
    .locals 1

    .prologue
    invoke-static {}, Li8/v;->z()Li8/v;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/v;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/v;->D()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/v$b;->A(I)Li8/v$b;

    :cond_1
    invoke-virtual {p1}, Li8/v;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/v;->E()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/v$b;->B(I)Li8/v$b;

    :cond_2
    invoke-virtual {p1}, Li8/v;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/v;->B()Li8/v$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/v$b;->y(Li8/v$c;)Li8/v$b;

    :cond_3
    invoke-virtual {p1}, Li8/v;->G()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/v;->A()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/v$b;->x(I)Li8/v$b;

    :cond_4
    invoke-virtual {p1}, Li8/v;->I()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/v;->C()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/v$b;->z(I)Li8/v$b;

    :cond_5
    invoke-virtual {p1}, Li8/v;->L()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Li8/v;->F()Li8/v$d;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/v$b;->C(Li8/v$d;)Li8/v$b;

    :cond_6
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/v;->y(Li8/v;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public w(Lp8/e;Lp8/g;)Li8/v$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/v;->O:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/v;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/v$b;->v(Li8/v;)Li8/v$b;

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

    check-cast p2, Li8/v;
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

    invoke-virtual {p0, v0}, Li8/v$b;->v(Li8/v;)Li8/v$b;

    :cond_1
    throw p1
.end method

.method public x(I)Li8/v$b;
    .locals 1

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li8/v$b;->D:I

    iput p1, p0, Li8/v$b;->H:I

    return-object p0
.end method

.method public y(Li8/v$c;)Li8/v$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/v$b;->D:I

    iput-object p1, p0, Li8/v$b;->G:Li8/v$c;

    return-object p0
.end method

.method public z(I)Li8/v$b;
    .locals 1

    iget v0, p0, Li8/v$b;->D:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li8/v$b;->D:I

    iput p1, p0, Li8/v$b;->I:I

    return-object p0
.end method
