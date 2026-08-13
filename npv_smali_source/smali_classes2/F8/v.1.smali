.class public abstract LF8/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LF8/v;LO7/f0;LF8/w;LF8/h0;LF8/E;ILjava/lang/Object;)LF8/i0;
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-virtual {p3, p1, p2}, LF8/h0;->c(LO7/f0;LF8/w;)LF8/E;

    move-result-object p4

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LF8/v;->a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: computeProjection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;
    .locals 1

    const-string v0, "parameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "typeAttr"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "typeParameterUpperBoundEraser"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "erasedUpperBound"

    invoke-static {p4, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LF8/k0;

    sget-object p2, LF8/u0;->I:LF8/u0;

    invoke-direct {p1, p2, p4}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1
.end method
