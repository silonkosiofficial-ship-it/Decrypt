.class final LS5/x$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/x$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LS5/x;


# direct methods
.method constructor <init>(LS5/x;)V
    .locals 0

    iput-object p1, p0, LS5/x$a$a;->C:LS5/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS5/l;

    invoke-virtual {p0, p1, p2}, LS5/x$a$a;->b(LS5/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LS5/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LS5/x$a$a;->C:LS5/x;

    invoke-static {p2}, LS5/x;->e(LS5/x;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
