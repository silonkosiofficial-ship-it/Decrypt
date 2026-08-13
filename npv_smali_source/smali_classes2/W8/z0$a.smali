.class public abstract LW8/z0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LW8/z0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lm7/i$b$a;->a(Lm7/i$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(LW8/z0;Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->b(Lm7/i$b;Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LW8/z0;ZZLx7/l;ILjava/lang/Object;)LW8/f0;
    .locals 0

    .prologue
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, LW8/z0;->E0(ZZLx7/l;)LW8/f0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(LW8/z0;Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->c(Lm7/i$b;Lm7/i$c;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(LW8/z0;Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->d(Lm7/i$b;Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method
