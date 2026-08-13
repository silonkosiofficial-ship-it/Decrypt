.class public final synthetic Lo2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ljava/lang/Runnable;

.field public final synthetic D:Lo2/z;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lo2/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/y;->C:Ljava/lang/Runnable;

    iput-object p2, p0, Lo2/y;->D:Lo2/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo2/y;->C:Ljava/lang/Runnable;

    iget-object v1, p0, Lo2/y;->D:Lo2/z;

    invoke-static {v0, v1}, Lo2/z;->b(Ljava/lang/Runnable;Lo2/z;)V

    return-void
.end method
