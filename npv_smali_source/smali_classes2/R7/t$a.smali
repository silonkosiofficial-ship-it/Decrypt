.class public final LR7/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LR7/t$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO7/e;LF8/l0;LG8/g;)Ly8/h;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSubstitution"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LR7/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LR7/t;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2, p3}, LR7/t;->M(LF8/l0;LG8/g;)Ly8/h;

    move-result-object p3

    if-nez p3, :cond_2

    :cond_1
    invoke-interface {p1, p2}, LO7/e;->f0(LF8/l0;)Ly8/h;

    move-result-object p3

    const-string p1, "getMemberScope(...)"

    invoke-static {p3, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p3
.end method

.method public final b(LO7/e;LG8/g;)Ly8/h;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LR7/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LR7/t;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    invoke-interface {p1}, LO7/e;->M0()Ly8/h;

    move-result-object p2

    const-string p1, "getUnsubstitutedMemberScope(...)"

    invoke-static {p2, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p2
.end method
