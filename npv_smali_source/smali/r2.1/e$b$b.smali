.class public final Lr2/e$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/e$b;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Lr2/e$b;


# direct methods
.method constructor <init>(Lr2/e$b;)V
    .locals 0

    iput-object p1, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-virtual {v0}, Lr2/e;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Lz2/f;)V
    .locals 6

    .prologue
    const-string v0, "statement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v0}, Lr2/e$b;->g(Lr2/e$b;)[I

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    iget-object v3, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v3}, Lr2/e$b;->g(Lr2/e$b;)[I

    move-result-object v3

    aget v3, v3, v2

    if-eq v3, v1, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v2}, Lz2/f;->M0(I)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v3}, Lr2/e$b;->h(Lr2/e$b;)[[B

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lz2/f;->p0(I[B)V

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v3}, Lr2/e$b;->k(Lr2/e$b;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lz2/f;->C(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v3}, Lr2/e$b;->i(Lr2/e$b;)[D

    move-result-object v3

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->P(ID)V

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lr2/e$b$b;->C:Lr2/e$b;

    invoke-static {v3}, Lr2/e$b;->j(Lr2/e$b;)[J

    move-result-object v3

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->l(IJ)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method
