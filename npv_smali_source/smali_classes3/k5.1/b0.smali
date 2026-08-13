.class public final synthetic Lk5/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/b0;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk5/b0;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, p1}, Lk5/c0;->a(Ljava/util/concurrent/CountDownLatch;Ll4/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
