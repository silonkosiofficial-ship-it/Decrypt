.class public abstract Lm7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lm7/f;Lm7/i$c;)Lm7/i$b;
    .locals 2

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lm7/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lm7/b;

    invoke-interface {p0}, Lm7/i$b;->getKey()Lm7/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm7/b;->a(Lm7/i$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lm7/b;->b(Lm7/i$b;)Lm7/i$b;

    move-result-object p0

    instance-of p1, p0, Lm7/i$b;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Lm7/f;->A:Lm7/f$b;

    if-ne v0, p1, :cond_2

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lm7/f;Lm7/i$c;)Lm7/i;
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lm7/b;

    if-eqz v0, :cond_1

    check-cast p1, Lm7/b;

    invoke-interface {p0}, Lm7/i$b;->getKey()Lm7/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm7/b;->a(Lm7/i$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lm7/b;->b(Lm7/i$b;)Lm7/i$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Lm7/j;->C:Lm7/j;

    :cond_0
    return-object p0

    :cond_1
    sget-object v0, Lm7/f;->A:Lm7/f$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Lm7/j;->C:Lm7/j;

    :cond_2
    return-object p0
.end method
