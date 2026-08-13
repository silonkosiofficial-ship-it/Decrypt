.class public abstract synthetic Lx/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx/A;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static b(Lx/A;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic c(Lx/A;Lv/L;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lv/L;->C:Lv/L;

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: scroll"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
