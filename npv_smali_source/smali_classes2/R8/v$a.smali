.class public final LR8/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR8/v;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final C:Ljava/util/Iterator;

.field private D:I

.field private E:Ljava/lang/Object;

.field final synthetic F:LR8/v;


# direct methods
.method constructor <init>(LR8/v;)V
    .locals 0

    iput-object p1, p0, LR8/v$a;->F:LR8/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LR8/v;->c(LR8/v;)LR8/h;

    move-result-object p1

    invoke-interface {p1}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LR8/v$a;->C:Ljava/util/Iterator;

    const/4 p1, -0x1

    iput p1, p0, LR8/v$a;->D:I

    return-void
.end method

.method private final b()V
    .locals 2

    .prologue
    iget-object v0, p0, LR8/v$a;->C:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LR8/v$a;->C:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LR8/v$a;->F:LR8/v;

    invoke-static {v1}, LR8/v;->b(LR8/v;)Lx7/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput v1, p0, LR8/v$a;->D:I

    iput-object v0, p0, LR8/v$a;->E:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, LR8/v$a;->D:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, LR8/v$a;->D:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LR8/v$a;->b()V

    :cond_0
    iget v0, p0, LR8/v$a;->D:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .prologue
    iget v0, p0, LR8/v$a;->D:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LR8/v$a;->b()V

    :cond_0
    iget v0, p0, LR8/v$a;->D:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LR8/v$a;->E:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, LR8/v$a;->E:Ljava/lang/Object;

    iput v1, p0, LR8/v$a;->D:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
