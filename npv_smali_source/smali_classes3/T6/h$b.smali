.class public final LT6/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LT6/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT6/h;
    .locals 1

    invoke-static {}, LT6/h;->d()LT6/h;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)LT6/h;
    .locals 8

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LT6/h$b;->a()LT6/h;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LT6/n;->c:LT6/n$a;

    invoke-static {p1}, LT6/u;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT6/l;

    invoke-virtual {v0}, LT6/l;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LT6/l;->a()Ljava/util/List;

    move-result-object v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x2f

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    invoke-static {v7}, LS8/r;->u1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, LT6/h;->f:LT6/h$b;

    invoke-virtual {p1}, LT6/h$b;->a()LT6/h;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, LT6/a;

    invoke-direct {v0, p1}, LT6/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {v7, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LS8/r;->u1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eqz v5, :cond_5

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v7, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LS8/r;->u1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x20

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v2, v5, v6}, LS8/r;->b0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {v1, v4, v2, v5, v6}, LS8/r;->b0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x2f

    invoke-static {v1, v4, v2, v5, v6}, LS8/r;->b0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance p1, LT6/h;

    invoke-direct {p1, v3, v1, v0}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    :cond_3
    new-instance v0, LT6/a;

    invoke-direct {v0, p1}, LT6/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, LT6/a;

    invoke-direct {v0, p1}, LT6/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, LT6/a;

    invoke-direct {v0, p1}, LT6/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method
