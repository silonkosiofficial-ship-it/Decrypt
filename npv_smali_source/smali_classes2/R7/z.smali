.class public abstract LR7/z;
.super LR7/k;
.source "SourceFile"

# interfaces
.implements LO7/K;


# instance fields
.field private final G:Ln8/c;

.field private final H:Ljava/lang/String;


# direct methods
.method public constructor <init>(LO7/G;Ln8/c;)V
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    invoke-virtual {p2}, Ln8/c;->h()Ln8/f;

    move-result-object v1

    sget-object v2, LO7/a0;->a:LO7/a0;

    invoke-direct {p0, p1, v0, v1, v2}, LR7/k;-><init>(LO7/m;LP7/g;Ln8/f;LO7/a0;)V

    iput-object p2, p0, LR7/z;->G:Ln8/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "package "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LR7/z;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()LO7/G;
    .locals 2

    invoke-super {p0}, LR7/k;->b()LO7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/G;

    return-object v0
.end method

.method public bridge synthetic b()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/z;->b()LO7/G;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ln8/c;
    .locals 1

    iget-object v0, p0, LR7/z;->G:Ln8/c;

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 2

    sget-object v0, LO7/a0;->a:LO7/a0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LO7/o;->j(LO7/K;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR7/z;->H:Ljava/lang/String;

    return-object v0
.end method
