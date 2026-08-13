.class public final LR8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR8/l;->b(Lx7/p;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;)V
    .locals 0

    iput-object p1, p0, LR8/l$a;->a:Lx7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LR8/l$a;->a:Lx7/p;

    invoke-static {v0}, LR8/k;->a(Lx7/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
