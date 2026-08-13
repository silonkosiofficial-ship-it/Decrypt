.class public final Li8/g$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    invoke-direct {p0}, Li8/g$b;->y()V

    return-void
.end method

.method static synthetic t()Li8/g$b;
    .locals 1

    invoke-static {}, Li8/g$b;->x()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/g$b;
    .locals 1

    new-instance v0, Li8/g$b;

    invoke-direct {v0}, Li8/g$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Lp8/e;Lp8/g;)Li8/g$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/g;->K:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/g;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/g$b;->z(Li8/g;)Li8/g$b;

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

    check-cast p2, Li8/g;
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

    invoke-virtual {p0, v0}, Li8/g$b;->z(Li8/g;)Li8/g$b;

    :cond_1
    throw p1
.end method

.method public B(I)Li8/g$b;
    .locals 1

    iget v0, p0, Li8/g$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/g$b;->F:I

    iput p1, p0, Li8/g$b;->G:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/g$b;->w()Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/g$b;->A(Lp8/e;Lp8/g;)Li8/g$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/g$b;->u()Li8/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/g;

    invoke-virtual {p0, p1}, Li8/g$b;->z(Li8/g;)Li8/g$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/g;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/g$b;->v()Li8/g;

    move-result-object v0

    invoke-virtual {v0}, Li8/g;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/g;
    .locals 3

    .prologue
    new-instance v0, Li8/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/g;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/g$b;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v1, p0, Li8/g$b;->G:I

    invoke-static {v0, v1}, Li8/g;->A(Li8/g;I)I

    invoke-static {v0, v2}, Li8/g;->B(Li8/g;I)I

    return-object v0
.end method

.method public w()Li8/g$b;
    .locals 2

    invoke-static {}, Li8/g$b;->x()Li8/g$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/g$b;->v()Li8/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/g$b;->z(Li8/g;)Li8/g$b;

    move-result-object v0

    return-object v0
.end method

.method public z(Li8/g;)Li8/g$b;
    .locals 1

    .prologue
    invoke-static {}, Li8/g;->D()Li8/g;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/g;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/g;->F()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/g$b;->B(I)Li8/g$b;

    :cond_1
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/g;->C(Li8/g;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method
