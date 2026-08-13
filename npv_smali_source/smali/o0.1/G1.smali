.class public abstract Lo0/G1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIIZLp0/c;)Lo0/E1;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lo0/Q;->a(IIIZLp0/c;)Lo0/E1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IIIZLp0/c;ILjava/lang/Object;)Lo0/E1;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    sget-object p2, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {p2}, Lo0/F1$a;->b()I

    move-result p2

    :cond_0
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_1

    const/4 p3, 0x1

    :cond_1
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_2

    sget-object p4, Lp0/g;->a:Lp0/g;

    invoke-virtual {p4}, Lp0/g;->w()Lp0/x;

    move-result-object p4

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lo0/G1;->a(IIIZLp0/c;)Lo0/E1;

    move-result-object p0

    return-object p0
.end method
