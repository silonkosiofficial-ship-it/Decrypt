.class public abstract LF8/p;
.super LF8/l0;
.source "SourceFile"


# instance fields
.field private final c:LF8/l0;


# direct methods
.method public constructor <init>(LF8/l0;)V
    .locals 1

    const-string v0, "substitution"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/l0;-><init>()V

    iput-object p1, p0, LF8/p;->c:LF8/l0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LF8/p;->c:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->a()Z

    move-result v0

    return v0
.end method

.method public d(LP7/g;)LP7/g;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/p;->c:LF8/l0;

    invoke-virtual {v0, p1}, LF8/l0;->d(LP7/g;)LP7/g;

    move-result-object p1

    return-object p1
.end method

.method public e(LF8/E;)LF8/i0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/p;->c:LF8/l0;

    invoke-virtual {v0, p1}, LF8/l0;->e(LF8/E;)LF8/i0;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, LF8/p;->c:LF8/l0;

    invoke-virtual {v0}, LF8/l0;->f()Z

    move-result v0

    return v0
.end method

.method public g(LF8/E;LF8/u0;)LF8/E;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/p;->c:LF8/l0;

    invoke-virtual {v0, p1, p2}, LF8/l0;->g(LF8/E;LF8/u0;)LF8/E;

    move-result-object p1

    return-object p1
.end method
