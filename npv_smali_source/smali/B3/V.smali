.class public final synthetic LB3/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/a;

.field public final synthetic D:Landroid/os/Bundle;

.field public final synthetic E:LD3/b;


# direct methods
.method public synthetic constructor <init>(LB3/a;Landroid/os/Bundle;LD3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/V;->C:LB3/a;

    iput-object p2, p0, LB3/V;->D:Landroid/os/Bundle;

    iput-object p3, p0, LB3/V;->E:LD3/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LB3/V;->C:LB3/a;

    iget-object v1, p0, LB3/V;->D:Landroid/os/Bundle;

    iget-object v2, p0, LB3/V;->E:LD3/b;

    invoke-virtual {v0, v1, v2}, LB3/a;->e(Landroid/os/Bundle;LD3/b;)V

    return-void
.end method
