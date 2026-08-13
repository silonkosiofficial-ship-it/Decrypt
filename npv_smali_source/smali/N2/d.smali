.class public LN2/d;
.super LN2/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;LS2/a;)V
    .locals 0

    invoke-static {p1, p2}, LO2/h;->c(Landroid/content/Context;LS2/a;)LO2/h;

    move-result-object p1

    invoke-virtual {p1}, LO2/h;->d()LO2/f;

    move-result-object p1

    invoke-direct {p0, p1}, LN2/c;-><init>(LO2/d;)V

    return-void
.end method


# virtual methods
.method b(LQ2/p;)Z
    .locals 1

    .prologue
    iget-object p1, p1, LQ2/p;->j:LI2/b;

    invoke-virtual {p1}, LI2/b;->b()LI2/k;

    move-result-object p1

    sget-object v0, LI2/k;->D:LI2/k;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LM2/b;

    invoke-virtual {p0, p1}, LN2/d;->i(LM2/b;)Z

    move-result p1

    return p1
.end method

.method i(LM2/b;)Z
    .locals 3

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x1

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, LM2/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LM2/b;->d()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2

    :cond_2
    invoke-virtual {p1}, LM2/b;->a()Z

    move-result p1

    xor-int/2addr p1, v2

    return p1
.end method
