.class public final synthetic Lu3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lu3/x;


# direct methods
.method public synthetic constructor <init>(Lu3/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/m;->C:Lu3/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu3/m;->C:Lu3/x;

    invoke-virtual {v0}, Lu3/x;->c()V

    return-void
.end method
