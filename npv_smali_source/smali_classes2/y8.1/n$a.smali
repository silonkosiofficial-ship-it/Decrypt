.class public final Ly8/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/n;
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

    invoke-direct {p0}, Ly8/n$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/Collection;)Ly8/h;
    .locals 2

    .prologue
    const-string v0, "message"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-virtual {v1}, LF8/E;->u()Ly8/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, LO8/a;->b(Ljava/lang/Iterable;)LP8/f;

    move-result-object p2

    sget-object v0, Ly8/b;->d:Ly8/b$a;

    invoke-virtual {v0, p1, p2}, Ly8/b$a;->b(Ljava/lang/String;Ljava/util/List;)Ly8/h;

    move-result-object v0

    invoke-virtual {p2}, LP8/f;->size()I

    move-result p2

    const/4 v1, 0x1

    if-gt p2, v1, :cond_1

    return-object v0

    :cond_1
    new-instance p2, Ly8/n;

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1}, Ly8/n;-><init>(Ljava/lang/String;Ly8/h;Ly7/k;)V

    return-object p2
.end method
