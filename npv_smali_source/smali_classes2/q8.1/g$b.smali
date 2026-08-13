.class public final Lq8/g$b;
.super LB7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/g;->n0(Ljava/lang/Object;)LB7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lq8/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq8/g;)V
    .locals 0

    iput-object p2, p0, Lq8/g$b;->b:Lq8/g;

    invoke-direct {p0, p1}, LB7/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected d(LF7/k;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .prologue
    const-string p2, "property"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lq8/g$b;->b:Lq8/g;

    invoke-virtual {p1}, Lq8/g;->l0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot modify readonly DescriptorRendererOptions"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
