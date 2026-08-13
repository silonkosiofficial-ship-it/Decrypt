.class public final LZ8/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/i;->d(Ljava/lang/Object;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LZ8/i$b;->C:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LZ8/i$b;->C:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
