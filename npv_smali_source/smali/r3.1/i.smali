.class public final synthetic Lr3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lr3/k;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Lr3/k;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/i;->C:Lr3/k;

    iput-boolean p2, p0, Lr3/i;->D:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr3/i;->C:Lr3/k;

    iget-boolean v1, p0, Lr3/i;->D:Z

    invoke-virtual {v0, v1}, Lr3/k;->l(Z)V

    return-void
.end method
