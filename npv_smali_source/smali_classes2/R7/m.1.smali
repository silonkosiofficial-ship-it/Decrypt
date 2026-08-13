.class public final LR7/m;
.super LR7/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(LO7/G;Ln8/c;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LR7/z;-><init>(LO7/G;Ln8/c;)V

    return-void
.end method


# virtual methods
.method public O0()Ly8/h$b;
    .locals 1

    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    return-object v0
.end method

.method public bridge synthetic u()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LR7/m;->O0()Ly8/h$b;

    move-result-object v0

    return-object v0
.end method
