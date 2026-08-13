.class final LF8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:LG8/g;

.field private final b:Li7/n;

.field final synthetic c:LF8/f;


# direct methods
.method public constructor <init>(LF8/f;LG8/g;)V
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LF8/f$a;->c:LF8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LF8/f$a;->a:LG8/g;

    sget-object p2, Li7/r;->D:Li7/r;

    new-instance v0, LF8/f$a$a;

    invoke-direct {v0, p0, p1}, LF8/f$a$a;-><init>(LF8/f$a;LF8/f;)V

    invoke-static {p2, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LF8/f$a;->b:Li7/n;

    return-void
.end method

.method public static final synthetic b(LF8/f$a;)LG8/g;
    .locals 0

    iget-object p0, p0, LF8/f$a;->a:LG8/g;

    return-object p0
.end method

.method private final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF8/f$a;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public d()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, LF8/f$a;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-virtual {v0, p1}, LF8/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-virtual {v0}, LF8/l;->hashCode()I

    move-result v0

    return v0
.end method

.method public t()LL7/g;
    .locals 2

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-interface {v0}, LF8/e0;->t()LL7/g;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LF8/f$a;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public v(LG8/g;)LF8/e0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-virtual {v0, p1}, LF8/f;->v(LG8/g;)LF8/e0;

    move-result-object p1

    return-object p1
.end method

.method public w()LO7/h;
    .locals 1

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-virtual {v0}, LF8/l;->w()LO7/h;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public y()Z
    .locals 1

    iget-object v0, p0, LF8/f$a;->c:LF8/f;

    invoke-interface {v0}, LF8/e0;->y()Z

    move-result v0

    return v0
.end method
