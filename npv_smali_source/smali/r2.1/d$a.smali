.class final Lr2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/A;
.implements Lq2/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lr2/d;


# direct methods
.method public constructor <init>(Lr2/d;)V
    .locals 0

    iput-object p1, p0, Lr2/d$a;->a:Lr2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr2/d$a;->a:Lr2/d;

    invoke-virtual {v0, p1, p2, p3}, Lr2/d;->b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ly2/b;
    .locals 1

    iget-object v0, p0, Lr2/d$a;->a:Lr2/d;

    invoke-virtual {v0}, Lr2/d;->d()Ly2/b;

    move-result-object v0

    return-object v0
.end method
