.class public final Lt8/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lt8/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)Lt8/g;
    .locals 5

    .prologue
    const-string v0, "argumentType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LF8/G;->a(LF8/E;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    move-object v2, p1

    move v3, v0

    :goto_0
    invoke-static {v2}, LL7/g;->c0(LF8/E;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, LF8/E;->U0()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/i0;

    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    const-string v4, "getType(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->w()LO7/h;

    move-result-object v2

    instance-of v4, v2, LO7/e;

    if-eqz v4, :cond_3

    invoke-static {v2}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lt8/p;

    new-instance v1, Lt8/p$b$a;

    invoke-direct {v1, p1}, Lt8/p$b$a;-><init>(LF8/E;)V

    invoke-direct {v0, v1}, Lt8/p;-><init>(Lt8/p$b;)V

    return-object v0

    :cond_2
    new-instance v1, Lt8/p;

    invoke-direct {v1, v0, v3}, Lt8/p;-><init>(Ln8/b;I)V

    goto :goto_1

    :cond_3
    instance-of p1, v2, LO7/f0;

    if-eqz p1, :cond_4

    new-instance v1, Lt8/p;

    sget-object p1, LL7/j$a;->b:Ln8/d;

    invoke-virtual {p1}, Ln8/d;->l()Ln8/c;

    move-result-object p1

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string v2, "topLevel(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Lt8/p;-><init>(Ln8/b;I)V

    :cond_4
    :goto_1
    return-object v1
.end method
