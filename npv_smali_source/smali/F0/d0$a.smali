.class public final LF0/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/d0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    return v0
.end method

.method public b(LF0/J;JLF0/v;ZZ)V
    .locals 0

    invoke-virtual/range {p1 .. p6}, LF0/J;->x0(JLF0/v;ZZ)V

    return-void
.end method

.method public c(LF0/J;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public d(Landroidx/compose/ui/d$c;)Z
    .locals 9

    .prologue
    const/16 v0, 0x10

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz p1, :cond_7

    instance-of v5, p1, LF0/v0;

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    check-cast p1, LF0/v0;

    invoke-interface {p1}, LF0/v0;->n0()Z

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, p1, LF0/m;

    if-eqz v5, :cond_6

    move-object v5, p1

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    move v7, v4

    :goto_1
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, v1

    if-eqz v8, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_1

    move-object p1, v5

    goto :goto_2

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LX/b;

    new-array v8, v0, [Landroidx/compose/ui/d$c;

    invoke-direct {v3, v8, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {v3, p1}, LX/b;->d(Ljava/lang/Object;)Z

    move-object p1, v2

    :cond_3
    invoke-virtual {v3, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_5
    if-ne v7, v6, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v3}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_7
    return v4
.end method
