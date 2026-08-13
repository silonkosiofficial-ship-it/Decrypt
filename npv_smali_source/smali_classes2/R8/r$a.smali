.class public final LR8/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR8/r;->g(Ljava/util/Iterator;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    iput-object p1, p0, LR8/r$a;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LR8/r$a;->a:Ljava/util/Iterator;

    return-object v0
.end method
