.class public abstract synthetic LC/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LC/E;ILx7/l;Lx7/p;Lx7/l;Lx7/r;ILjava/lang/Object;)V
    .locals 7

    .prologue
    if-nez p7, :cond_3

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    sget-object p4, LC/D$a;->D:LC/D$a;

    :cond_2
    move-object v5, p4

    move-object v1, p0

    move v2, p1

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, LC/E;->a(ILx7/l;Lx7/p;Lx7/l;Lx7/r;)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: items"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
