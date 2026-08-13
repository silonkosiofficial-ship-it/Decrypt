.class final LK/w0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/w0;->performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LK/w0;


# direct methods
.method constructor <init>(LK/w0;)V
    .locals 0

    iput-object p1, p0, LK/w0$a;->D:LK/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/i;)V
    .locals 1

    iget-object v0, p0, LK/w0$a;->D:LK/w0;

    invoke-static {v0, p1}, LK/w0;->b(LK/w0;LS0/i;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/i;

    invoke-virtual {p0, p1}, LK/w0$a;->a(LS0/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
