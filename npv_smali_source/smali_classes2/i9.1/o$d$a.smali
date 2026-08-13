.class public abstract Li9/o$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/o$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Li9/o$d;Li9/K;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Li9/K;->D:Li9/K;

    :cond_0
    invoke-interface {p0, p1}, Li9/o$d;->y(Li9/K;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: hour"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(Li9/o$d;Li9/K;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Li9/K;->D:Li9/K;

    :cond_0
    invoke-interface {p0, p1}, Li9/o$d;->m(Li9/K;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: minute"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic c(Li9/o$d;Li9/K;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Li9/K;->D:Li9/K;

    :cond_0
    invoke-interface {p0, p1}, Li9/o$d;->z(Li9/K;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: second"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Li9/o$d;I)V
    .locals 0

    invoke-interface {p0, p1, p1}, Li9/o$d;->j(II)V

    return-void
.end method
