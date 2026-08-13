.class public abstract LY0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FF)LY0/e;
    .locals 1

    new-instance v0, LY0/f;

    invoke-direct {v0, p0, p1}, LY0/f;-><init>(FF)V

    return-object v0
.end method

.method public static synthetic b(FFILjava/lang/Object;)LY0/e;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    invoke-static {p0, p1}, LY0/g;->a(FF)LY0/e;

    move-result-object p0

    return-object p0
.end method
