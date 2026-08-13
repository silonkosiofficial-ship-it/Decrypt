.class public abstract La9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/g;[LZ8/f;Lx7/a;Lx7/q;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    new-instance v6, La9/l$a;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, La9/l$a;-><init>([LZ8/f;Lx7/a;Lx7/q;LZ8/g;Lm7/e;)V

    invoke-static {v6, p4}, La9/o;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
