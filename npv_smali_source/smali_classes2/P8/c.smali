.class public abstract LP8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LB8/l;)Lm8/e;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LB8/l;->d()Lk8/a;

    move-result-object p0

    instance-of v0, p0, Lm8/e;

    if-eqz v0, :cond_0

    check-cast p0, Lm8/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lm8/e;->i:Lm8/e;

    :cond_1
    return-object p0
.end method
