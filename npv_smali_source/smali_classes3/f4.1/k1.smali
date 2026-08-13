.class public final synthetic Lf4/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/p1;

.field public final synthetic D:LL4/c$b;

.field public final synthetic E:Lf4/u1;


# direct methods
.method public synthetic constructor <init>(Lf4/p1;LL4/c$b;Lf4/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/k1;->C:Lf4/p1;

    iput-object p2, p0, Lf4/k1;->D:LL4/c$b;

    iput-object p3, p0, Lf4/k1;->E:Lf4/u1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf4/k1;->C:Lf4/p1;

    iget-object v1, p0, Lf4/k1;->D:LL4/c$b;

    iget-object v2, p0, Lf4/k1;->E:Lf4/u1;

    invoke-virtual {v0, v1, v2}, Lf4/p1;->a(LL4/c$b;Lf4/u1;)V

    return-void
.end method
