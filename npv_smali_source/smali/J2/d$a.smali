.class LJ2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private C:LJ2/b;

.field private D:Ljava/lang/String;

.field private E:LP4/d;


# direct methods
.method constructor <init>(LJ2/b;Ljava/lang/String;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/d$a;->C:LJ2/b;

    iput-object p2, p0, LJ2/d$a;->D:Ljava/lang/String;

    iput-object p3, p0, LJ2/d$a;->E:LP4/d;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LJ2/d$a;->E:LP4/d;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, LJ2/d$a;->C:LJ2/b;

    iget-object v2, p0, LJ2/d$a;->D:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, LJ2/b;->c(Ljava/lang/String;Z)V

    return-void
.end method
