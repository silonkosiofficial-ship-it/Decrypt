.class LR7/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/e$b;->a()LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/e$b;


# direct methods
.method constructor <init>(LR7/e$b;)V
    .locals 0

    iput-object p1, p0, LR7/e$b$a;->C:LR7/e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ly8/h;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope for type parameter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR7/e$b$a;->C:LR7/e$b;

    iget-object v1, v1, LR7/e$b;->C:Ln8/f;

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LR7/e$b$a;->C:LR7/e$b;

    iget-object v1, v1, LR7/e$b;->D:LR7/e;

    invoke-virtual {v1}, LR7/e;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ly8/n;->j(Ljava/lang/String;Ljava/util/Collection;)Ly8/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/e$b$a;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
