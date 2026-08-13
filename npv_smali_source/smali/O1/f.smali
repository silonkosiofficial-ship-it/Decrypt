.class public abstract LO1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LX9/Q;)LM1/n;
    .locals 1

    const-string v0, "path"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LX9/Q;->r()LX9/Q;

    move-result-object p0

    invoke-virtual {p0}, LX9/Q;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LM1/o;->a(Ljava/lang/String;)LM1/n;

    move-result-object p0

    return-object p0
.end method
