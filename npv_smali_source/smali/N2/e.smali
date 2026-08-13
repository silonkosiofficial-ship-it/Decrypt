.class public LN2/e;
.super LN2/c;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "NetworkMeteredCtrlr"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LN2/e;->e:Ljava/lang/String;

    return-void
.end method

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

    sget-object v0, LI2/k;->G:LI2/k;

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

    invoke-virtual {p0, p1}, LN2/e;->i(LM2/b;)Z

    move-result p1

    return p1
.end method

.method i(LM2/b;)Z
    .locals 5

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v0

    sget-object v1, LN2/e;->e:Ljava/lang/String;

    const-string v4, "Metered network constraint is not supported before API 26, only checking for connected state."

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v4, v3}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p1}, LM2/b;->a()Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_0
    invoke-virtual {p1}, LM2/b;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LM2/b;->b()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :cond_2
    :goto_0
    return v2
.end method
