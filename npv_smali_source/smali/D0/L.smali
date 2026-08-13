.class public abstract synthetic LD0/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LD0/M;IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, LD0/M;->O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object p3

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: layout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
