.class LK2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK2/a;->a(LQ2/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LQ2/p;

.field final synthetic D:LK2/a;


# direct methods
.method constructor <init>(LK2/a;LQ2/p;)V
    .locals 0

    iput-object p1, p0, LK2/a$a;->D:LK2/a;

    iput-object p2, p0, LK2/a$a;->C:LQ2/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v0

    sget-object v1, LK2/a;->d:Ljava/lang/String;

    iget-object v2, p0, LK2/a$a;->C:LQ2/p;

    iget-object v2, v2, LQ2/p;->a:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v2, "Scheduling work %s"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v4}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LK2/a$a;->D:LK2/a;

    iget-object v0, v0, LK2/a;->a:LK2/b;

    iget-object v1, p0, LK2/a$a;->C:LQ2/p;

    new-array v2, v3, [LQ2/p;

    aput-object v1, v2, v5

    invoke-virtual {v0, v2}, LK2/b;->e([LQ2/p;)V

    return-void
.end method
