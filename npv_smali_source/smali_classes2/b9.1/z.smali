.class public Lb9/z;
.super LW8/a;
.source "SourceFile"

# interfaces
.implements Lo7/e;


# instance fields
.field public final F:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/i;Lm7/e;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LW8/a;-><init>(Lm7/i;ZZ)V

    iput-object p2, p0, Lb9/z;->F:Lm7/e;

    return-void
.end method


# virtual methods
.method public final e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected g1(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-static {p1, v0}, LW8/C;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method protected final k0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected u(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v0

    iget-object v1, p0, Lb9/z;->F:Lm7/e;

    invoke-static {p1, v1}, LW8/C;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lb9/i;->b(Lm7/e;Ljava/lang/Object;)V

    return-void
.end method
