.class public LN2/a;
.super LN2/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;LS2/a;)V
    .locals 0

    invoke-static {p1, p2}, LO2/h;->c(Landroid/content/Context;LS2/a;)LO2/h;

    move-result-object p1

    invoke-virtual {p1}, LO2/h;->a()LO2/a;

    move-result-object p1

    invoke-direct {p0, p1}, LN2/c;-><init>(LO2/d;)V

    return-void
.end method


# virtual methods
.method b(LQ2/p;)Z
    .locals 0

    iget-object p1, p1, LQ2/p;->j:LI2/b;

    invoke-virtual {p1}, LI2/b;->g()Z

    move-result p1

    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LN2/a;->i(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method

.method i(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
