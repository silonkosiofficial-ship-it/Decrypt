.class public final Landroidx/lifecycle/Q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final C:Landroidx/lifecycle/t;

.field private final D:Landroidx/lifecycle/k$a;

.field private E:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/t;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/Q$a;->C:Landroidx/lifecycle/t;

    iput-object p2, p0, Landroidx/lifecycle/Q$a;->D:Landroidx/lifecycle/k$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/lifecycle/Q$a;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/Q$a;->C:Landroidx/lifecycle/t;

    iget-object v1, p0, Landroidx/lifecycle/Q$a;->D:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/Q$a;->E:Z

    :cond_0
    return-void
.end method
