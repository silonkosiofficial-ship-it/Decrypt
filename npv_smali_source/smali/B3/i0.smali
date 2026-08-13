.class public final synthetic LB3/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/l0;

.field public final synthetic D:Z

.field public final synthetic E:Z


# direct methods
.method public synthetic constructor <init>(LB3/l0;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/i0;->C:LB3/l0;

    iput-boolean p2, p0, LB3/i0;->D:Z

    iput-boolean p3, p0, LB3/i0;->E:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LB3/i0;->C:LB3/l0;

    iget-boolean v1, p0, LB3/i0;->D:Z

    iget-boolean v2, p0, LB3/i0;->E:Z

    invoke-virtual {v0, v1, v2}, LB3/l0;->d(ZZ)V

    return-void
.end method
