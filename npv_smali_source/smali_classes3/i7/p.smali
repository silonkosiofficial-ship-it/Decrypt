.class abstract Li7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/p$a;
    }
.end annotation


# direct methods
.method public static a(Li7/r;Lx7/a;)Li7/n;
    .locals 2

    .prologue
    const-string v0, "mode"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li7/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, Li7/N;

    invoke-direct {p0, p1}, Li7/N;-><init>(Lx7/a;)V

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Li7/y;

    invoke-direct {p0, p1}, Li7/y;-><init>(Lx7/a;)V

    goto :goto_0

    :cond_2
    new-instance p0, Li7/z;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v0}, Li7/z;-><init>(Lx7/a;Ljava/lang/Object;ILy7/k;)V

    :goto_0
    return-object p0
.end method

.method public static b(Lx7/a;)Li7/n;
    .locals 3

    const-string v0, "initializer"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li7/z;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Li7/z;-><init>(Lx7/a;Ljava/lang/Object;ILy7/k;)V

    return-object v0
.end method
