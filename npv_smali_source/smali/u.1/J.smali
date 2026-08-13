.class public abstract synthetic Lu/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu/K;FFF)F
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lu/K;->c(FFF)J

    move-result-wide v1

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Lu/K;->b(JFFF)F

    move-result p0

    return p0
.end method

.method public static bridge synthetic b(Lu/K;Lu/x0;)Lu/B0;
    .locals 0

    invoke-interface {p0, p1}, Lu/K;->a(Lu/x0;)Lu/I0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lu/K;Lu/x0;)Lu/I0;
    .locals 0

    new-instance p1, Lu/I0;

    invoke-direct {p1, p0}, Lu/I0;-><init>(Lu/K;)V

    return-object p1
.end method
