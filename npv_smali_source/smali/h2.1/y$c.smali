.class public final Lh2/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:Lh2/h;

.field final synthetic b:Lh2/y;


# direct methods
.method public constructor <init>(Lh2/y;Lh2/h;)V
    .locals 1

    const-string v0, "retryEventBus"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh2/y$c;->b:Lh2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh2/y$c;->a:Lh2/h;

    return-void
.end method
