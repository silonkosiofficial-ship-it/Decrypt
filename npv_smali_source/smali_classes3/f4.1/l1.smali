.class public final synthetic Lf4/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/p1;

.field public final synthetic D:Landroid/app/Activity;

.field public final synthetic E:LL4/d;

.field public final synthetic F:LL4/c$b;

.field public final synthetic G:LL4/c$a;


# direct methods
.method public synthetic constructor <init>(Lf4/p1;Landroid/app/Activity;LL4/d;LL4/c$b;LL4/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/l1;->C:Lf4/p1;

    iput-object p2, p0, Lf4/l1;->D:Landroid/app/Activity;

    iput-object p3, p0, Lf4/l1;->E:LL4/d;

    iput-object p4, p0, Lf4/l1;->F:LL4/c$b;

    iput-object p5, p0, Lf4/l1;->G:LL4/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lf4/l1;->C:Lf4/p1;

    iget-object v1, p0, Lf4/l1;->D:Landroid/app/Activity;

    iget-object v2, p0, Lf4/l1;->E:LL4/d;

    iget-object v3, p0, Lf4/l1;->F:LL4/c$b;

    iget-object v4, p0, Lf4/l1;->G:LL4/c$a;

    invoke-virtual {v0, v1, v2, v3, v4}, Lf4/p1;->b(Landroid/app/Activity;LL4/d;LL4/c$b;LL4/c$a;)V

    return-void
.end method
