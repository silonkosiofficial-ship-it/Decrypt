.class public final LI7/r;
.super LI7/x;
.source "SourceFile"

# interfaces
.implements LF7/n;
.implements LF7/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/r$a;
    }
.end annotation


# instance fields
.field private final S:Li7/n;


# direct methods
.method public constructor <init>(LI7/n;LO7/U;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LI7/x;-><init>(LI7/n;LO7/U;)V

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/s;

    invoke-direct {p2, p0}, LI7/s;-><init>(LI7/r;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/r;->S:Li7/n;

    return-void
.end method


# virtual methods
.method public N()LI7/r$a;
    .locals 1

    iget-object v0, p0, LI7/r;->S:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/r$a;

    return-object v0
.end method

.method public O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, LI7/r;->N()LI7/r$a;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    invoke-virtual {v0, v1}, LI7/j;->z([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic i()LF7/g$a;
    .locals 1

    invoke-virtual {p0}, LI7/r;->N()LI7/r$a;

    move-result-object v0

    return-object v0
.end method
