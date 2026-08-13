.class Landroidx/fragment/app/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/d;->f(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/util/List;

.field final synthetic D:Landroidx/fragment/app/A$e;

.field final synthetic E:Landroidx/fragment/app/d;


# direct methods
.method constructor <init>(Landroidx/fragment/app/d;Ljava/util/List;Landroidx/fragment/app/A$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/d$b;->E:Landroidx/fragment/app/d;

    iput-object p2, p0, Landroidx/fragment/app/d$b;->C:Ljava/util/List;

    iput-object p3, p0, Landroidx/fragment/app/d$b;->D:Landroidx/fragment/app/A$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/d$b;->C:Ljava/util/List;

    iget-object v1, p0, Landroidx/fragment/app/d$b;->D:Landroidx/fragment/app/A$e;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d$b;->C:Ljava/util/List;

    iget-object v1, p0, Landroidx/fragment/app/d$b;->D:Landroidx/fragment/app/A$e;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/fragment/app/d$b;->E:Landroidx/fragment/app/d;

    iget-object v1, p0, Landroidx/fragment/app/d$b;->D:Landroidx/fragment/app/A$e;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/d;->s(Landroidx/fragment/app/A$e;)V

    :cond_0
    return-void
.end method
