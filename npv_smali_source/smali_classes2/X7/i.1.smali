.class public final LX7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/i;

    invoke-direct {v0}, LX7/i;-><init>()V

    sput-object v0, LX7/i;->a:LX7/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(LO7/b;)Z
    .locals 4

    .prologue
    sget-object v0, LX7/g;->a:LX7/g;

    invoke-virtual {v0}, LX7/g;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lv8/c;->h(LO7/m;)Ln8/c;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, LL7/g;->g0(LO7/m;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/b;

    sget-object v3, LX7/i;->a:LX7/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, LX7/i;->b(LO7/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    return v1
.end method


# virtual methods
.method public final a(LO7/b;)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LL7/g;->g0(LO7/m;)Z

    invoke-static {p1}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p1

    sget-object v0, LX7/i$a;->D:LX7/i$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v1, v3}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v3

    :cond_0
    sget-object v0, LX7/g;->a:LX7/g;

    invoke-virtual {v0}, LX7/g;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/f;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v3

    :cond_1
    return-object v3
.end method

.method public final b(LO7/b;)Z
    .locals 2

    .prologue
    const-string v0, "callableMemberDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/g;->a:LX7/g;

    invoke-virtual {v0}, LX7/g;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, LX7/i;->c(LO7/b;)Z

    move-result p1

    return p1
.end method
