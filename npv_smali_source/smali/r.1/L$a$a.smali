.class public final Lr/L$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/L$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private C:I

.field private final D:Ljava/util/Iterator;

.field final synthetic E:Lr/L;


# direct methods
.method constructor <init>(Lr/L;)V
    .locals 2

    iput-object p1, p0, Lr/L$a$a;->E:Lr/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lr/L$a$a;->C:I

    new-instance v0, Lr/L$a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lr/L$a$a$a;-><init>(Lr/L;Lr/L$a$a;Lm7/e;)V

    invoke-static {v0}, LR8/k;->a(Lx7/p;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lr/L$a$a;->D:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 0

    iput p1, p0, Lr/L$a$a;->C:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lr/L$a$a;->D:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/L$a$a;->D:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    iget v0, p0, Lr/L$a$a;->C:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lr/L$a$a;->E:Lr/L;

    invoke-virtual {v2, v0}, Lr/L;->y(I)V

    iput v1, p0, Lr/L$a$a;->C:I

    :cond_0
    return-void
.end method
