.class final LW8/t;
.super LW8/E0;
.source "SourceFile"

# interfaces
.implements LW8/s;


# instance fields
.field public final G:LW8/u;


# direct methods
.method public constructor <init>(LW8/u;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/t;->G:LW8/u;

    return-void
.end method


# virtual methods
.method public g(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    invoke-virtual {v0, p1}, LW8/F0;->K(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()LW8/z0;
    .locals 1

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LW8/t;->G:LW8/u;

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    invoke-interface {p1, v0}, LW8/u;->r0(LW8/O0;)V

    return-void
.end method
