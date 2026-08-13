.class public final synthetic LB3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/l0;

.field public final synthetic D:Ljava/lang/Object;

.field public final synthetic E:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(LB3/l0;Ljava/lang/Object;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/h0;->C:LB3/l0;

    iput-object p2, p0, LB3/h0;->D:Ljava/lang/Object;

    iput-object p3, p0, LB3/h0;->E:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LB3/h0;->C:LB3/l0;

    iget-object v1, p0, LB3/h0;->D:Ljava/lang/Object;

    iget-object v2, p0, LB3/h0;->E:Landroid/util/Pair;

    invoke-virtual {v0, v1, v2}, LB3/l0;->e(Ljava/lang/Object;Landroid/util/Pair;)V

    return-void
.end method
