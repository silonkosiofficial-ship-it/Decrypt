.class public final LF8/a0;
.super LM8/e;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/a0$a;
    }
.end annotation


# static fields
.field public static final D:LF8/a0$a;

.field private static final E:LF8/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/a0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/a0$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/a0;->D:LF8/a0$a;

    new-instance v0, LF8/a0;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LF8/a0;-><init>(Ljava/util/List;)V

    sput-object v0, LF8/a0;->E:LF8/a0;

    return-void
.end method

.method private constructor <init>(LF8/Y;)V
    .locals 0

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LF8/a0;-><init>(Ljava/util/List;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 2

    .prologue
    invoke-direct {p0}, LM8/e;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/Y;

    invoke-virtual {v0}, LF8/Y;->b()LF7/c;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, LM8/a;->f(LF7/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LF8/a0;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic o()LF8/a0;
    .locals 1

    sget-object v0, LF8/a0;->E:LF8/a0;

    return-object v0
.end method


# virtual methods
.method public final C(LF8/Y;)Z
    .locals 1

    .prologue
    const-string v0, "attribute"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1}, LF8/Y;->b()LF7/c;

    move-result-object p1

    invoke-virtual {v0, p1}, LM8/s;->d(LF7/c;)I

    move-result p1

    invoke-virtual {p0}, LM8/e;->d()LM8/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LM8/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final D(LF8/a0;)LF8/a0;
    .locals 5

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LF8/a0;->D:LF8/a0$a;

    invoke-static {v1}, LF8/a0$a;->g(LF8/a0$a;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, LM8/e;->d()LM8/c;

    move-result-object v3

    invoke-virtual {v3, v2}, LM8/c;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/Y;

    invoke-virtual {p1}, LM8/e;->d()LM8/c;

    move-result-object v4

    invoke-virtual {v4, v2}, LM8/c;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/Y;

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, LF8/Y;->c(LF8/Y;)LF8/Y;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, LF8/Y;->c(LF8/Y;)LF8/Y;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1, v0}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final E(LF8/Y;)LF8/a0;
    .locals 1

    .prologue
    const-string v0, "attribute"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LF8/a0;->C(LF8/Y;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LF8/a0;

    invoke-direct {v0, p1}, LF8/a0;-><init>(LF8/Y;)V

    return-object v0

    :cond_1
    invoke-static {p0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0, p1}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    return-object p1
.end method

.method public final M(LF8/Y;)LF8/a0;
    .locals 4

    .prologue
    const-string v0, "attribute"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LM8/e;->d()LM8/c;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LF8/Y;

    invoke-static {v3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0}, LM8/e;->d()LM8/c;

    move-result-object v0

    invoke-virtual {v0}, LM8/c;->d()I

    move-result v0

    if-ne p1, v0, :cond_3

    return-object p0

    :cond_3
    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1, v1}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    return-object p1
.end method

.method protected e()LM8/s;
    .locals 1

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    return-object v0
.end method

.method public final s(LF8/a0;)LF8/a0;
    .locals 5

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LF8/a0;->D:LF8/a0$a;

    invoke-static {v1}, LF8/a0$a;->g(LF8/a0$a;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, LM8/e;->d()LM8/c;

    move-result-object v3

    invoke-virtual {v3, v2}, LM8/c;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/Y;

    invoke-virtual {p1}, LM8/e;->d()LM8/c;

    move-result-object v4

    invoke-virtual {v4, v2}, LM8/c;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/Y;

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, LF8/Y;->a(LF8/Y;)LF8/Y;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, LF8/Y;->a(LF8/Y;)LF8/Y;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1, v0}, LF8/a0$a;->h(Ljava/util/List;)LF8/a0;

    move-result-object p1

    :goto_2
    return-object p1
.end method
