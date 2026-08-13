.class public final synthetic Lr5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lr5/e;

.field public final synthetic D:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lr5/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/d;->C:Lr5/e;

    iput-object p2, p0, Lr5/d;->D:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr5/d;->C:Lr5/e;

    iget-object v1, p0, Lr5/d;->D:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lr5/e;->b(Lr5/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
