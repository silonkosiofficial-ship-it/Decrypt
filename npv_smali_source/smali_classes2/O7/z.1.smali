.class public final LO7/z;
.super LO7/h0;
.source "SourceFile"


# instance fields
.field private final a:Ln8/f;

.field private final b:LJ8/j;


# direct methods
.method public constructor <init>(Ln8/f;LJ8/j;)V
    .locals 1

    const-string v0, "underlyingPropertyName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "underlyingType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO7/h0;-><init>(Ly7/k;)V

    iput-object p1, p0, LO7/z;->a:Ln8/f;

    iput-object p2, p0, LO7/z;->b:LJ8/j;

    return-void
.end method


# virtual methods
.method public a(Ln8/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO7/z;->a:Ln8/f;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LO7/z;->a:Ln8/f;

    iget-object v1, p0, LO7/z;->b:LJ8/j;

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ln8/f;
    .locals 1

    iget-object v0, p0, LO7/z;->a:Ln8/f;

    return-object v0
.end method

.method public final e()LJ8/j;
    .locals 1

    iget-object v0, p0, LO7/z;->b:LJ8/j;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InlineClassRepresentation(underlyingPropertyName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LO7/z;->a:Ln8/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", underlyingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LO7/z;->b:LJ8/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
