.class public final Ly8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/b;
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

    invoke-direct {p0}, Ly8/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Iterable;)Ly8/h;
    .locals 3

    .prologue
    const-string v0, "debugName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP8/f;

    invoke-direct {v0}, LP8/f;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly8/h;

    sget-object v2, Ly8/h$b;->b:Ly8/h$b;

    if-eq v1, v2, :cond_0

    instance-of v2, v1, Ly8/b;

    if-eqz v2, :cond_1

    check-cast v1, Ly8/b;

    invoke-static {v1}, Ly8/b;->h(Ly8/b;)[Ly8/h;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/v;->D(Ljava/util/Collection;[Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, LP8/f;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, v0}, Ly8/b$a;->b(Ljava/lang/String;Ljava/util/List;)Ly8/h;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/util/List;)Ly8/h;
    .locals 3

    .prologue
    const-string v0, "debugName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    new-instance v0, Ly8/b;

    check-cast p2, Ljava/util/Collection;

    new-array v1, v2, [Ly8/h;

    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ly8/h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Ly8/b;-><init>(Ljava/lang/String;[Ly8/h;Ly7/k;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ly8/h;

    goto :goto_0

    :cond_1
    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    :goto_0
    return-object v0
.end method
