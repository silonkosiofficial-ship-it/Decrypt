.class public final Lz9/v;
.super Lz9/n;
.source "SourceFile"


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Lz9/A;Z)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lz9/n;-><init>(Lz9/A;)V

    iput-boolean p2, p0, Lz9/v;->c:Z

    return-void
.end method


# virtual methods
.method public e(B)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/v;->c:Z

    invoke-static {p1}, Li7/C;->g(B)B

    move-result p1

    invoke-static {p1}, Li7/C;->n(B)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lz9/n;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz9/n;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/v;->c:Z

    invoke-static {p1}, Li7/E;->g(I)I

    move-result p1

    if-eqz v0, :cond_0

    invoke-static {p1}, Lz9/r;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/n;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lz9/s;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/n;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public j(J)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/v;->c:Z

    invoke-static {p1, p2}, Li7/G;->g(J)J

    move-result-wide p1

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lz9/p;->a(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/n;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lz9/q;->a(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/n;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public l(S)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/v;->c:Z

    invoke-static {p1}, Li7/J;->g(S)S

    move-result p1

    invoke-static {p1}, Li7/J;->n(S)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lz9/n;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz9/n;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
