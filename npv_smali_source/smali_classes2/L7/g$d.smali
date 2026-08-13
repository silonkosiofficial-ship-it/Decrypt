.class LL7/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/g;->E0(LR7/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/x;

.field final synthetic D:LL7/g;


# direct methods
.method constructor <init>(LL7/g;LR7/x;)V
    .locals 0

    iput-object p1, p0, LL7/g$d;->D:LL7/g;

    iput-object p2, p0, LL7/g$d;->C:LR7/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3

    .prologue
    iget-object v0, p0, LL7/g$d;->D:LL7/g;

    invoke-static {v0}, LL7/g;->c(LL7/g;)LR7/x;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LL7/g$d;->D:LL7/g;

    iget-object v1, p0, LL7/g$d;->C:LR7/x;

    invoke-static {v0, v1}, LL7/g;->d(LL7/g;LR7/x;)LR7/x;

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Built-ins module is already set: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LL7/g$d;->D:LL7/g;

    invoke-static {v2}, LL7/g;->c(LL7/g;)LR7/x;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (attempting to reset to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LL7/g$d;->C:LR7/x;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/g$d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
