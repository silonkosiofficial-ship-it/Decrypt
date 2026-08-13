.class abstract synthetic Lh2/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lh2/F;Lx7/p;)Lh2/F;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/F;

    invoke-virtual {p0}, Lh2/F;->b()LZ8/f;

    move-result-object v1

    new-instance v2, Lh2/J$a;

    invoke-direct {v2, v1, p1}, Lh2/J$a;-><init>(LZ8/f;Lx7/p;)V

    invoke-virtual {p0}, Lh2/F;->d()Lh2/X;

    move-result-object v3

    invoke-virtual {p0}, Lh2/F;->c()Lh2/o;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lh2/F;-><init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;ILy7/k;)V

    return-object v0
.end method
