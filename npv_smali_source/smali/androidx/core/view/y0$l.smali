.class Landroidx/core/view/y0$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# static fields
.field static final b:Landroidx/core/view/y0;


# instance fields
.field final a:Landroidx/core/view/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/core/view/y0$b;

    invoke-direct {v0}, Landroidx/core/view/y0$b;-><init>()V

    invoke-virtual {v0}, Landroidx/core/view/y0$b;->a()Landroidx/core/view/y0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/view/y0;->a()Landroidx/core/view/y0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/view/y0;->b()Landroidx/core/view/y0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/view/y0;->c()Landroidx/core/view/y0;

    move-result-object v0

    sput-object v0, Landroidx/core/view/y0$l;->b:Landroidx/core/view/y0;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/y0$l;->a:Landroidx/core/view/y0;

    return-void
.end method


# virtual methods
.method a()Landroidx/core/view/y0;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/y0$l;->a:Landroidx/core/view/y0;

    return-object v0
.end method

.method b()Landroidx/core/view/y0;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/y0$l;->a:Landroidx/core/view/y0;

    return-object v0
.end method

.method c()Landroidx/core/view/y0;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/y0$l;->a:Landroidx/core/view/y0;

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method e(Landroidx/core/view/y0;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/core/view/y0$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/core/view/y0$l;

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->p()Z

    move-result v1

    invoke-virtual {p1}, Landroidx/core/view/y0$l;->p()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->o()Z

    move-result v1

    invoke-virtual {p1}, Landroidx/core/view/y0$l;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v3

    invoke-static {v1, v3}, LB1/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->j()Landroidx/core/graphics/f;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/y0$l;->j()Landroidx/core/graphics/f;

    move-result-object v3

    invoke-static {v1, v3}, LB1/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->f()Landroidx/core/view/r;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/y0$l;->f()Landroidx/core/view/r;

    move-result-object p1

    invoke-static {v1, p1}, LB1/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method f()Landroidx/core/view/r;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method g(I)Landroidx/core/graphics/f;
    .locals 0

    sget-object p1, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    return-object p1
.end method

.method h(I)Landroidx/core/graphics/f;
    .locals 1

    .prologue
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_0

    sget-object p1, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to query the maximum insets for IME"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 7

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->j()Landroidx/core/graphics/f;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->f()Landroidx/core/view/r;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    invoke-static {v5}, LB1/c;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()Landroidx/core/graphics/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v0

    return-object v0
.end method

.method j()Landroidx/core/graphics/f;
    .locals 1

    sget-object v0, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    return-object v0
.end method

.method k()Landroidx/core/graphics/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v0

    return-object v0
.end method

.method l()Landroidx/core/graphics/f;
    .locals 1

    sget-object v0, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    return-object v0
.end method

.method m()Landroidx/core/graphics/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/core/view/y0$l;->l()Landroidx/core/graphics/f;

    move-result-object v0

    return-object v0
.end method

.method n(IIII)Landroidx/core/view/y0;
    .locals 0

    sget-object p1, Landroidx/core/view/y0$l;->b:Landroidx/core/view/y0;

    return-object p1
.end method

.method o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method q(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public r([Landroidx/core/graphics/f;)V
    .locals 0

    return-void
.end method

.method s(Landroidx/core/graphics/f;)V
    .locals 0

    return-void
.end method

.method t(Landroidx/core/view/y0;)V
    .locals 0

    return-void
.end method

.method public u(Landroidx/core/graphics/f;)V
    .locals 0

    return-void
.end method
