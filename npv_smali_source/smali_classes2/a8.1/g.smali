.class public final La8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:La8/b;

.field private final b:La8/k;

.field private final c:Li7/n;

.field private final d:Li7/n;

.field private final e:Lc8/d;


# direct methods
.method public constructor <init>(La8/b;La8/k;Li7/n;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegateForDefaultTypeQualifiers"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/g;->a:La8/b;

    iput-object p2, p0, La8/g;->b:La8/k;

    iput-object p3, p0, La8/g;->c:Li7/n;

    iput-object p3, p0, La8/g;->d:Li7/n;

    new-instance p1, Lc8/d;

    invoke-direct {p1, p0, p2}, Lc8/d;-><init>(La8/g;La8/k;)V

    iput-object p1, p0, La8/g;->e:Lc8/d;

    return-void
.end method


# virtual methods
.method public final a()La8/b;
    .locals 1

    iget-object v0, p0, La8/g;->a:La8/b;

    return-object v0
.end method

.method public final b()LX7/y;
    .locals 1

    iget-object v0, p0, La8/g;->d:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX7/y;

    return-object v0
.end method

.method public final c()Li7/n;
    .locals 1

    iget-object v0, p0, La8/g;->c:Li7/n;

    return-object v0
.end method

.method public final d()LO7/G;
    .locals 1

    iget-object v0, p0, La8/g;->a:La8/b;

    invoke-virtual {v0}, La8/b;->m()LO7/G;

    move-result-object v0

    return-object v0
.end method

.method public final e()LE8/n;
    .locals 1

    iget-object v0, p0, La8/g;->a:La8/b;

    invoke-virtual {v0}, La8/b;->u()LE8/n;

    move-result-object v0

    return-object v0
.end method

.method public final f()La8/k;
    .locals 1

    iget-object v0, p0, La8/g;->b:La8/k;

    return-object v0
.end method

.method public final g()Lc8/d;
    .locals 1

    iget-object v0, p0, La8/g;->e:Lc8/d;

    return-object v0
.end method
