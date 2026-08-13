.class public abstract synthetic LX7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LX7/p;Ln8/c;ZILjava/lang/Object;)Le8/u;
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-interface {p0, p1, p2}, LX7/p;->a(Ln8/c;Z)Le8/u;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: findPackage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
