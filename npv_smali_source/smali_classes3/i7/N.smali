.class public final Li7/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/n;
.implements Ljava/io/Serializable;


# instance fields
.field private C:Lx7/a;

.field private D:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx7/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/N;->C:Lx7/a;

    sget-object p1, Li7/I;->a:Li7/I;

    iput-object p1, p0, Li7/N;->D:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 2

    .prologue
    iget-object v0, p0, Li7/N;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Li7/N;->D:Ljava/lang/Object;

    sget-object v1, Li7/I;->a:Li7/I;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li7/N;->C:Lx7/a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Li7/N;->D:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Li7/N;->C:Lx7/a;

    :cond_0
    iget-object v0, p0, Li7/N;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, Li7/N;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li7/N;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
