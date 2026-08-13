.class final Lq2/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/A;
.implements Lq2/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lq2/i;


# direct methods
.method public constructor <init>(Lq2/i;)V
    .locals 0

    iput-object p1, p0, Lq2/i$b;->a:Lq2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq2/i$b;->a:Lq2/i;

    invoke-virtual {v0, p1, p2, p3}, Lq2/i;->b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ly2/b;
    .locals 1

    iget-object v0, p0, Lq2/i$b;->a:Lq2/i;

    invoke-virtual {v0}, Lq2/i;->d()Ly2/b;

    move-result-object v0

    return-object v0
.end method
