.class final Le/x$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Le/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field private final C:Landroidx/lifecycle/k;

.field private final D:Le/w;

.field private E:Le/c;

.field final synthetic F:Le/x;


# direct methods
.method public constructor <init>(Le/x;Landroidx/lifecycle/k;Le/w;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le/x$h;->F:Le/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le/x$h;->C:Landroidx/lifecycle/k;

    iput-object p3, p0, Le/x$h;->D:Le/w;

    invoke-virtual {p2, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    iget-object v0, p0, Le/x$h;->C:Landroidx/lifecycle/k;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    iget-object v0, p0, Le/x$h;->D:Le/w;

    invoke-virtual {v0, p0}, Le/w;->i(Le/c;)V

    iget-object v0, p0, Le/x$h;->E:Le/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le/c;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Le/x$h;->E:Le/c;

    return-void
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Le/x$h;->F:Le/x;

    iget-object p2, p0, Le/x$h;->D:Le/w;

    invoke-virtual {p1, p2}, Le/x;->j(Le/w;)Le/c;

    move-result-object p1

    iput-object p1, p0, Le/x$h;->E:Le/c;

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Le/x$h;->E:Le/c;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Le/c;->cancel()V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, Le/x$h;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method
