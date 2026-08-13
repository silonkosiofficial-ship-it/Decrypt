.class public abstract LH7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Li7/i;)LF7/f;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lkotlin/Metadata;

    invoke-static {v0, v1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->wuzl(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lkotlin/Metadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    if-nez v3, :cond_1

    move-object v2, v1

    :cond_1
    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-interface {v0}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lm8/i;->j([Ljava/lang/String;[Ljava/lang/String;)Li7/u;

    move-result-object v1

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lm8/f;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Li8/i;

    new-instance v7, Lm8/e;

    invoke-interface {v0}, Lkotlin/Metadata;->mv()[I

    move-result-object v1

    invoke-interface {v0}, Lkotlin/Metadata;->xi()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-direct {v7, v1, v0}, Lm8/e;-><init>([IZ)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    new-instance v6, Lk8/g;

    invoke-virtual {v4}, Li8/i;->n0()Li8/t;

    move-result-object p0

    const-string v0, "getTypeTable(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, p0}, Lk8/g;-><init>(Li8/t;)V

    sget-object v8, LH7/d$a;->L:LH7/d$a;

    invoke-static/range {v3 .. v8}, LI7/M;->h(Ljava/lang/Class;Lp8/p;Lk8/c;Lk8/g;Lk8/a;Lx7/p;)LO7/a;

    move-result-object p0

    check-cast p0, LO7/Z;

    new-instance v0, LI7/o;

    sget-object v1, LI7/f;->F:LI7/f;

    invoke-direct {v0, v1, p0}, LI7/o;-><init>(LI7/n;LO7/y;)V

    return-object v0
.end method
