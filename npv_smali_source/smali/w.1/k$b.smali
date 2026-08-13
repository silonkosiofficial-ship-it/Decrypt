.class final Lw/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/k;->b(Ljava/lang/String;ZLw/b;Landroidx/compose/ui/d;Lx7/q;Lx7/a;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lx7/a;


# direct methods
.method constructor <init>(ZLx7/a;)V
    .locals 0

    iput-boolean p1, p0, Lw/k$b;->D:Z

    iput-object p2, p0, Lw/k$b;->E:Lx7/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lw/k$b;->D:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw/k$b;->E:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw/k$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
