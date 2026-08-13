.class final Lv3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lv3/B;


# direct methods
.method constructor <init>(Lv3/B;)V
    .locals 0

    iput-object p1, p0, Lv3/a;->C:Lv3/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/a;->C:Lv3/B;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lv3/B;->c(Lv3/B;Ljava/lang/Thread;)V

    iget-object v0, p0, Lv3/a;->C:Lv3/B;

    invoke-virtual {v0}, Lv3/B;->a()V

    return-void
.end method
