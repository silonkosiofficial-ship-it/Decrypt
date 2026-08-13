.class final Ls3/h1;
.super Ls3/z;
.source "SourceFile"


# instance fields
.field final synthetic E:Ls3/i1;


# direct methods
.method constructor <init>(Ls3/i1;)V
    .locals 0

    iput-object p1, p0, Ls3/h1;->E:Ls3/i1;

    invoke-direct {p0}, Ls3/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lk3/m;)V
    .locals 2

    iget-object v0, p0, Ls3/h1;->E:Ls3/i1;

    invoke-static {v0}, Ls3/i1;->g(Ls3/i1;)Lk3/w;

    move-result-object v1

    invoke-virtual {v0}, Ls3/i1;->i()Ls3/Y0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk3/w;->c(Ls3/Y0;)V

    invoke-super {p0, p1}, Ls3/z;->g(Lk3/m;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Ls3/h1;->E:Ls3/i1;

    invoke-static {v0}, Ls3/i1;->g(Ls3/i1;)Lk3/w;

    move-result-object v1

    invoke-virtual {v0}, Ls3/i1;->i()Ls3/Y0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk3/w;->c(Ls3/Y0;)V

    invoke-super {p0}, Ls3/z;->k()V

    return-void
.end method
