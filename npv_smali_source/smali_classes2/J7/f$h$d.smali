.class public final LJ7/f$h$d;
.super LJ7/f$h;
.source "SourceFile"

# interfaces
.implements LJ7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/f$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final g:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 3

    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "boundReceiverComponents"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericParameterTypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p2

    invoke-static {v0, v1}, Lj7/n;->V([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/reflect/Type;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v0, v2}, LJ7/f$h;-><init>(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;Ly7/k;)V

    iput-object p2, p0, LJ7/f$h$d;->g:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJ7/f$h$d;->g:[Ljava/lang/Object;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, LJ7/f$h$d;->g:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/f;->a([Ljava/lang/Object;)V

    new-instance v0, Ly7/U;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly7/U;-><init>(I)V

    iget-object v1, p0, LJ7/f$h$d;->g:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ly7/U;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ly7/U;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly7/U;->c()I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ly7/U;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LJ7/f$h;->d(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
