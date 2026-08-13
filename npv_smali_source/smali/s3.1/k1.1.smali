.class public final synthetic Ls3/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ls3/o1;

.field public final synthetic D:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ls3/o1;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/k1;->C:Ls3/o1;

    iput-object p2, p0, Ls3/k1;->D:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls3/k1;->C:Ls3/o1;

    iget-object v1, p0, Ls3/k1;->D:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ls3/o1;->n(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
