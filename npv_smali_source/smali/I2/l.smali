.class public final LI2/l;
.super LI2/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/l$a;
    }
.end annotation


# direct methods
.method constructor <init>(LI2/l$a;)V
    .locals 2

    iget-object v0, p1, LI2/u$a;->b:Ljava/util/UUID;

    iget-object v1, p1, LI2/u$a;->c:LQ2/p;

    iget-object p1, p1, LI2/u$a;->d:Ljava/util/Set;

    invoke-direct {p0, v0, v1, p1}, LI2/u;-><init>(Ljava/util/UUID;LQ2/p;Ljava/util/Set;)V

    return-void
.end method

.method public static d(Ljava/lang/Class;)LI2/l;
    .locals 1

    new-instance v0, LI2/l$a;

    invoke-direct {v0, p0}, LI2/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, LI2/u$a;->b()LI2/u;

    move-result-object p0

    check-cast p0, LI2/l;

    return-object p0
.end method
