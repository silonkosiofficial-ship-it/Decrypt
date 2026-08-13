.class public abstract synthetic LR0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LR0/h$b;LR0/h;LR0/q;IIILjava/lang/Object;)LV/G1;
    .locals 0

    .prologue
    if-nez p6, :cond_4

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    sget-object p2, LR0/q;->D:LR0/q$a;

    invoke-virtual {p2}, LR0/q$a;->d()LR0/q;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    sget-object p3, LR0/o;->b:LR0/o$a;

    invoke-virtual {p3}, LR0/o$a;->b()I

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    sget-object p4, LR0/p;->b:LR0/p$a;

    invoke-virtual {p4}, LR0/p$a;->a()I

    move-result p4

    :cond_3
    invoke-interface {p0, p1, p2, p3, p4}, LR0/h$b;->a(LR0/h;LR0/q;II)LV/G1;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
