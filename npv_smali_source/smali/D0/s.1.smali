.class public abstract synthetic LD0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LD0/t;LD0/t;ZILjava/lang/Object;)Ln0/i;
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-interface {p0, p1, p2}, LD0/t;->N(LD0/t;Z)Ln0/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: localBoundingBoxOf"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
