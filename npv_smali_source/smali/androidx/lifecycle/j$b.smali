.class public final Landroidx/lifecycle/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/j;->c(Lx2/d;Landroidx/lifecycle/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/lifecycle/k;

.field final synthetic D:Lx2/d;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Lx2/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/j$b;->C:Landroidx/lifecycle/k;

    iput-object p2, p0, Landroidx/lifecycle/j$b;->D:Lx2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/j$b;->C:Landroidx/lifecycle/k;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    iget-object p1, p0, Landroidx/lifecycle/j$b;->D:Lx2/d;

    const-class p2, Landroidx/lifecycle/j$a;

    invoke-virtual {p1, p2}, Lx2/d;->i(Ljava/lang/Class;)V

    :cond_0
    return-void
.end method
