.class public abstract Lo2/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, Lo2/C$a;->D:Lo2/C$a;

    invoke-interface {p0, p1, v0, p2}, Lo2/k;->b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
