.class public abstract synthetic LB/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LB/A;Ljava/lang/Object;Ljava/lang/Object;Lx7/q;ILjava/lang/Object;)V
    .locals 1

    .prologue
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, LB/A;->c(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: item"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(LB/A;ILx7/l;Lx7/l;Lx7/r;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    sget-object p3, LB/z$a;->D:LB/z$a;

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, LB/A;->d(ILx7/l;Lx7/l;Lx7/r;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: items"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic c(LB/A;Ljava/lang/Object;Ljava/lang/Object;Lx7/q;ILjava/lang/Object;)V
    .locals 1

    .prologue
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, LB/A;->b(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: stickyHeader"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
