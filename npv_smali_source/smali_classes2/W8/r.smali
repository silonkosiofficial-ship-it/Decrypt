.class final LW8/r;
.super LW8/E0;
.source "SourceFile"


# instance fields
.field public final G:LW8/n;


# direct methods
.method public constructor <init>(LW8/n;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/r;->G:LW8/n;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LW8/r;->G:LW8/n;

    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object v0

    invoke-virtual {p1, v0}, LW8/n;->v(LW8/z0;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LW8/n;->P(Ljava/lang/Throwable;)V

    return-void
.end method
