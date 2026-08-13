.class public final Lt8/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/n$a$a;,
        Lt8/n$a$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lt8/n$a;-><init>()V

    return-void
.end method

.method private final a(Ljava/util/Collection;Lt8/n$a$a;)LF8/M;
    .locals 3

    .prologue
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/M;

    check-cast v0, LF8/M;

    sget-object v2, Lt8/n;->f:Lt8/n$a;

    invoke-direct {v2, v0, v1, p2}, Lt8/n$a;->c(LF8/M;LF8/M;Lt8/n$a$a;)LF8/M;

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast v0, LF8/M;

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Empty collection can\'t be reduced."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final c(LF8/M;LF8/M;Lt8/n$a$a;)LF8/M;
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    instance-of v3, v1, Lt8/n;

    if-eqz v3, :cond_1

    instance-of v4, v2, Lt8/n;

    if-eqz v4, :cond_1

    check-cast v1, Lt8/n;

    check-cast v2, Lt8/n;

    invoke-direct {p0, v1, v2, p3}, Lt8/n$a;->e(Lt8/n;Lt8/n;Lt8/n$a$a;)LF8/M;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    check-cast v1, Lt8/n;

    invoke-direct {p0, v1, p2}, Lt8/n$a;->d(Lt8/n;LF8/M;)LF8/M;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of p2, v2, Lt8/n;

    if-eqz p2, :cond_3

    check-cast v2, Lt8/n;

    invoke-direct {p0, v2, p1}, Lt8/n$a;->d(Lt8/n;LF8/M;)LF8/M;

    move-result-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method private final d(Lt8/n;LF8/M;)LF8/M;
    .locals 0

    .prologue
    invoke-virtual {p1}, Lt8/n;->f()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method private final e(Lt8/n;Lt8/n;Lt8/n$a$a;)LF8/M;
    .locals 6

    .prologue
    sget-object v0, Lt8/n$a$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    invoke-virtual {p1}, Lt8/n;->f()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p2}, Lt8/n;->f()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p3, p2}, Lj7/v;->Z0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    :goto_0
    move-object v4, p2

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lt8/n;->f()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p2}, Lt8/n;->f()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p3, p2}, Lj7/v;->n0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    :goto_1
    new-instance p2, Lt8/n;

    invoke-static {p1}, Lt8/n;->d(Lt8/n;)J

    move-result-wide v1

    invoke-static {p1}, Lt8/n;->b(Lt8/n;)LO7/G;

    move-result-object v3

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lt8/n;-><init>(JLO7/G;Ljava/util/Set;Ly7/k;)V

    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1}, LF8/a0$a;->i()LF8/a0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LF8/F;->e(LF8/a0;Lt8/n;Z)LF8/M;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Ljava/util/Collection;)LF8/M;
    .locals 1

    const-string v0, "types"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt8/n$a$a;->D:Lt8/n$a$a;

    invoke-direct {p0, p1, v0}, Lt8/n$a;->a(Ljava/util/Collection;Lt8/n$a$a;)LF8/M;

    move-result-object p1

    return-object p1
.end method
