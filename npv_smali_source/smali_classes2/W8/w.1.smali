.class final LW8/w;
.super LW8/F0;
.source "SourceFile"

# interfaces
.implements LW8/v;


# direct methods
.method public constructor <init>(LW8/z0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LW8/F0;-><init>(Z)V

    invoke-virtual {p0, p1}, LW8/F0;->i0(LW8/z0;)V

    return-void
.end method


# virtual methods
.method public R0(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->t0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public X()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d1(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->v(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    return-object p1
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, LW8/A;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    invoke-virtual {p0, v0}, LW8/F0;->t0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW8/F0;->S()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
