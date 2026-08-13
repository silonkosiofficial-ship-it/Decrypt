.class final Lo2/a$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/a$b;->a(Ljava/lang/String;)Ly2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo2/a;

.field final synthetic E:Lo2/a$b;

.field final synthetic F:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo2/a;Lo2/a$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo2/a$b$a;->D:Lo2/a;

    iput-object p2, p0, Lo2/a$b$a;->E:Lo2/a$b;

    iput-object p3, p0, Lo2/a$b$a;->F:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly2/b;
    .locals 4

    .prologue
    iget-object v0, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v0}, Lo2/a;->d(Lo2/a;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo2/a$b$a;->E:Lo2/a$b;

    invoke-static {v0}, Lo2/a$b;->b(Lo2/a$b;)Ly2/c;

    move-result-object v0

    iget-object v2, p0, Lo2/a$b$a;->F:Ljava/lang/String;

    invoke-interface {v0, v2}, Ly2/c;->a(Ljava/lang/String;)Ly2/b;

    move-result-object v0

    iget-object v2, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v2}, Lo2/a;->c(Lo2/a;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v3, v1}, Lo2/a;->e(Lo2/a;Z)V

    iget-object v1, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v1, v0}, Lo2/a;->b(Lo2/a;Ly2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v1, v2}, Lo2/a;->e(Lo2/a;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v1, v2}, Lo2/a;->e(Lo2/a;Z)V

    throw v0

    :cond_0
    iget-object v1, p0, Lo2/a$b$a;->D:Lo2/a;

    invoke-static {v1, v0}, Lo2/a;->a(Lo2/a;Ly2/b;)V

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo2/a$b$a;->a()Ly2/b;

    move-result-object v0

    return-object v0
.end method
