.class public Lv5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw5/a;


# instance fields
.field private final a:LF5/a;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(LF5/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/d;->a:LF5/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lv5/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lv5/c;

    invoke-direct {v0, p0}, Lv5/c;-><init>(Lv5/d;)V

    invoke-interface {p1, v0}, LF5/a;->a(LF5/a$a;)V

    return-void
.end method

.method public static synthetic a(Lv5/d;LF5/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lv5/d;->b(LF5/b;)V

    return-void
.end method

.method private synthetic b(LF5/b;)V
    .locals 1

    iget-object v0, p0, Lv5/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-interface {p1}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
