.class public abstract LO7/r;
.super LO7/u;
.source "SourceFile"


# instance fields
.field private final a:LO7/n0;


# direct methods
.method public constructor <init>(LO7/n0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LO7/u;-><init>()V

    iput-object p1, p0, LO7/r;->a:LO7/n0;

    return-void
.end method


# virtual methods
.method public b()LO7/n0;
    .locals 1

    iget-object v0, p0, LO7/r;->a:LO7/n0;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LO7/r;->b()LO7/n0;

    move-result-object v0

    invoke-virtual {v0}, LO7/n0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()LO7/u;
    .locals 2

    invoke-virtual {p0}, LO7/r;->b()LO7/n0;

    move-result-object v0

    invoke-virtual {v0}, LO7/n0;->d()LO7/n0;

    move-result-object v0

    invoke-static {v0}, LO7/t;->j(LO7/n0;)LO7/u;

    move-result-object v0

    const-string v1, "toDescriptorVisibility(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
