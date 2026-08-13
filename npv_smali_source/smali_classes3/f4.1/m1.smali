.class public final synthetic Lf4/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LL4/c$a;

.field public final synthetic D:Lf4/Z0;


# direct methods
.method public synthetic constructor <init>(LL4/c$a;Lf4/Z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/m1;->C:LL4/c$a;

    iput-object p2, p0, Lf4/m1;->D:Lf4/Z0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/m1;->C:LL4/c$a;

    iget-object v1, p0, Lf4/m1;->D:Lf4/Z0;

    invoke-virtual {v1}, Lf4/Z0;->a()LL4/e;

    move-result-object v1

    invoke-interface {v0, v1}, LL4/c$a;->a(LL4/e;)V

    return-void
.end method
