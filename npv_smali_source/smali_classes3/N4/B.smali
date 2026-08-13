.class public abstract LN4/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(LN4/A;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, LN4/A;

    if-eqz v0, :cond_1

    check-cast p1, LN4/A;

    invoke-interface {p0}, LN4/A;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, LN4/A;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
